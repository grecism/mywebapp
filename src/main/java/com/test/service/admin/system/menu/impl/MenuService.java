package com.test.service.admin.system.menu.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.test.mapper.admin.system.MenuMapper;
import com.test.entity.admin.system.Menu;
import com.test.service.admin.system.menu.MenuManager;

/**
 * 
 *<p>Title	: MenuService</p>
 * @Description	: 菜单处理 
 * @author	: admin
 * @date	: 2017年11月21日下午7:31:30
 */
@Service("menuService")
@Transactional
public class MenuService implements MenuManager{

	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 通过ID获取其子一级菜单
	 * @param parentId
	 * @return
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<Menu> listSubMenuByParentId(String parentId) throws Throwable {
		return menuMapper.listSubMenuByParentId(parentId);
	}
	
	/**
	 * 通过菜单ID获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData getMenuById(PageData pd) throws Throwable {
		return menuMapper.getMenuById(pd);
	}
	
	/**
	 * 新增菜单
	 * @param menu
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void saveMenu(Menu menu) throws Throwable {
		menuMapper.insertMenu(menu);
	}
	
	/**
	 * 取最大ID
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findMaxId(PageData pd) throws Throwable {
		return menuMapper.findMaxId(pd);
	}
	
	/**
	 * 删除菜单
	 * @param MENU_ID
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteMenuById(String MENU_ID) throws Throwable {
		menuMapper.deleteMenuById(MENU_ID);
	}
	
	/**
	 * 编辑
	 * @param menu
	 * @return
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void edit(Menu menu) throws Throwable {
		 menuMapper.updateMenu(menu);
	}
	
	/**
	 * 保存菜单图标 
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public PageData editicon(PageData pd) throws Throwable {
		menuMapper.editicon(pd);
		return menuMapper.getMenuById(pd);
	}
	
	/**
	 * 获取所有菜单并填充每个菜单的子菜单列表(菜单管理)(递归处理)
	 * @param MENU_ID
	 * @return
	 * @throws Throwable
	 */
	public List<Menu> listAllMenu(String MENU_ID) throws Throwable {
		List<Menu> menuList = this.listSubMenuByParentId(MENU_ID);
		for(Menu menu : menuList){
			menu.setMENU_URL("menu/toEdit.do?MENU_ID="+menu.getMENU_ID());
			menu.setSubMenu(this.listAllMenu(menu.getMENU_ID()));
			menu.setTarget("treeFrame");
		}
		return menuList;
	}

	/**
	 * 获取所有菜单并填充每个菜单的子菜单列表(系统菜单列表)(递归处理)
	 * @param MENU_ID
	 * @return
	 * @throws Throwable
	 */
	public List<Menu> listAllMenuQx(String MENU_ID) throws Throwable {
		List<Menu> menuList = this.listSubMenuByParentId(MENU_ID);
		for(Menu menu : menuList){
			menu.setSubMenu(this.listAllMenuQx(menu.getMENU_ID()));
			menu.setTarget("treeFrame");
		}
		return menuList;
	}
	
}
