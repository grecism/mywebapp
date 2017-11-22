package com.test.mapper.admin.system;

import java.util.List;

import util.admin.PageData;
import com.test.entity.admin.system.Menu;

public interface MenuMapper{
	/**
	 * 
	* @Title: listSubMenuByParentId 
	* @Description: 通过ID获取其子一级菜单
	* @param @param parentId
	* @return Map    返回类型 
	* @throws
	 */
	List<Menu> listSubMenuByParentId(String parentId) throws Throwable;
	
	/**
	 * 
	* @Title: getMenuById 
	* @Description: 通过菜单ID获取数据
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData getMenuById(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: insertMenu 
	* @Description:  新增菜单
	* @param @param map    
	* @return void    返回类型 
	* @throws
	 */
	void insertMenu(Menu menu) throws Throwable;
	/**
	 * 
	* @Title: findMaxId 
	* @Description: 取最大ID 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findMaxId(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: deleteMenuById 
	* @Description: 删除菜单 
	* @param @param MENU_ID    
	* @return void    返回类型 
	* @throws
	 */
	void deleteMenuById(String MENU_ID) throws Throwable;
	/**
	 * 
	* @Title: updateMenu 
	* @Description: 编辑菜单
	* @param @param map    
	* @return void    返回类型 
	* @throws
	 */
	void updateMenu(Menu menu) throws Throwable;
	/**
	 * 
	* @Title: editicon 
	* @Description: 保存菜单图标
	* @param @param map    
	* @return void    返回类型 
	* @throws
	 */
	void editicon(PageData pd) throws Throwable;
}
