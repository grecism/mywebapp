package com.test.mapper.admin.system;

import java.util.List;

import util.admin.PageData;
import com.test.common.base.admin.page.Page;
import com.test.entity.admin.system.User;

public interface UserMapper{
	/**
	 * 
	* @Title: getUserInfo 
	* @Description: 判断用户名和密码 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData getUserInfo(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: updateLastLogin 
	* @Description: 更新登录时间
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void updateLastLogin(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: getUserAndRoleById 
	* @Description: 通过用户ID获取用户信息和角色信息 
	* @param @param USER_ID
	* @param @return    
	* @return Map    返回类型 
	* @throws
	 */
	User getUserAndRoleById(String USER_ID) throws Throwable;
	/**
	 * 
	* @Title: findByUsername 
	* @Description: 通过USERNAME获取数据 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findByUsername(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: saveIP 
	* @Description: 存入IP
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void saveIP(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: listAllUserByRoldId 
	* @Description: 列出某角色下的所有用户 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> listAllUserByRoldId(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: userlistPage 
	* @Description: 用户列表
	* @param @param page
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> userlistPage(Page page) throws Throwable;
	/**
	 * 
	* @Title: userBystafflistPage 
	* @Description: 用户列表(弹窗选择用)
	* @param @param page
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> userBystafflistPage(Page page) throws Throwable;
	/**
	 * 
	* @Title: findByUE 
	* @Description: 通过邮箱获取数据
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findByUE(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: findByUN 
	* @Description: 通过编号获取数据
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findByUN(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: findById 
	* @Description: 通过user_id获取数据 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData findById(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: saveU 
	* @Description:新增用户
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void saveU(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: editU 
	* @Description: 修改用户
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void editU(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: deleteU 
	* @Description: 删除用户
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void deleteU(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: deleteAllU 
	* @Description: 批量删除用户 
	* @param @param item    
	* @return void    返回类型 
	* @throws
	 */
	void deleteAllU(String[] item) throws Throwable;
	/**
	 * 
	* @Title: listAllUser 
	* @Description: 用户列表(全部) 
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> listAllUser(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: getUserCount 
	* @Description:获取总数
	* @param @param USER_ID
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	PageData getUserCount(String USER_ID) throws Throwable;
}

	