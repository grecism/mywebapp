package com.test.service.admin.system.menu;

import java.util.List;
import com.test.entity.admin.system.Menu;
import util.admin.PageData;

/**
 * 
 *<p>Title	: MenuManager</p>
 * @Description	: 菜单处理接口 
 * @author	: admin
 * @date	: 2017年11月21日下午7:31:39
 */
public interface MenuManager {

	/**
	 * @param parentId
	 * @return
	 * @throws Throwable
	 */
	public List<Menu> listSubMenuByParentId(String parentId)throws Throwable;
	
	/**
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData getMenuById(PageData pd) throws Throwable;
	
	/**
	 * @param menu
	 * @throws Throwable
	 */
	public void saveMenu(Menu menu) throws Throwable;
	
	/**
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findMaxId(PageData pd) throws Throwable;
	
	/**
	 * @param MENU_ID
	 * @throws Throwable
	 */
	public void deleteMenuById(String MENU_ID) throws Throwable;
	
	/**
	 * @param menu
	 * @throws Throwable
	 */
	public void edit(Menu menu) throws Throwable;
	
	/**
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData editicon(PageData pageData) throws Throwable;
	
	/**
	 * @param MENU_ID
	 * @return
	 * @throws Throwable
	 */
	public List<Menu> listAllMenu(String MENU_ID) throws Throwable;
	
	/**
	 * @param MENU_ID
	 * @return
	 * @throws Throwable
	 */
	public List<Menu> listAllMenuQx(String MENU_ID) throws Throwable;
}
