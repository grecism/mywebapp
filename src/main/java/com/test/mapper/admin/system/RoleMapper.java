package com.test.mapper.admin.system;

import java.util.List;
import util.admin.PageData;
import com.test.entity.admin.system.Role;

public interface RoleMapper{
	/**
	 * 
	* @Title: listAllRolesByPId 
	* @Description: 列出此组下的角色
	* @param @return    
	* @return Map    返回类型 
	* @throws
	 */
	List<Role> listAllRolesByPId(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: findObjectById 
	* @Description: 通过id查找
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findObjectById(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: insert 
	* @Description: 添加角色
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void insert(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: edit 
	* @Description: 保存修改角色 
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void edit(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: deleteRoleById 
	* @Description: 删除角色
	* @param @param ROLE_ID    
	* @return void    返回类型 
	* @throws
	 */
	void deleteRoleById(String ROLE_ID) throws Throwable;
	/**
	 * 
	* @Title: updateRoleRights 
	* @Description: 给当前角色附加菜单权限
	* @param @param role    
	* @return void    返回类型 
	* @throws
	 */
	void updateRoleRights(Role role) throws Throwable;
	/**
	 * 
	* @Title: getRoleById 
	* @Description: 通过id查找角色
	* @param @param ROLE_ID
	* @param @return    
	* @return Map    返回类型 
	* @throws
	 */
	Role getRoleById(String ROLE_ID) throws Throwable;
	
	/**
	 * 
	* @Title: setAllRights 
	* @Description: 给全部子角色加菜单权限
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void setAllRights(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: add_qx 
	* @Description: 新增权限
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void add_qx(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: del_qx 
	* @Description:删除权限 
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void del_qx(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: edit_qx 
	* @Description: 修改权限 
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void edit_qx(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: cha_qx 
	* @Description: 查看权限 
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void cha_qx(PageData pd) throws Throwable;
}

	