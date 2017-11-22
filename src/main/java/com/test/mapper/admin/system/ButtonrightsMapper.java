package com.test.mapper.admin.system;

import java.util.List;

import util.admin.PageData;

public interface ButtonrightsMapper{
	
	/**
	 * 
	 * <B>方法名称：save</B><BR>
	 * <B>概要说明：新增按钮权限</B><BR>
	 * @param pageData
	 */
	void save(PageData pd) throws Throwable;
	
	/**
	 * 
	 * <B>方法名称：findById</B><BR>
	 * <B>概要说明：通过(角色ID和按钮ID)获取数据</B><BR>
	 * @param pageData
	 * @return
	 */
	PageData findById(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：delete</B><BR>
	 * <B>概要说明：删除按钮权限</B><BR>
	 * @param pageData
	 */
	void delete(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：listAll</B><BR>
	 * <B>概要说明：列表(全部)</B><BR>
	 * @param pageData
	 * @return
	 */
	List<PageData> listAll(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：listAllBrAndQxname</B><BR>
	 * <B>概要说明：列表(全部)左连接按钮表,查出安全权限标识</B><BR>
	 * @param pageData
	 * @return
	 */
	List<PageData> listAllBrAndQxname(PageData pd) throws Throwable;
}