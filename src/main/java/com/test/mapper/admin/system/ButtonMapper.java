package com.test.mapper.admin.system;

import java.util.List;

import util.admin.PageData;
import com.test.common.base.admin.page.Page;

public interface ButtonMapper{
	/**
	 * 
	 * <B>方法名称：save</B><BR>
	 * <B>概要说明：新增按钮</B><BR>
	 * @param pageData
	 */
	void save(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：delete</B><BR>
	 * <B>概要说明：删除按钮</B><BR>
	 * @param pageData
	 */
	void delete(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：edit</B><BR>
	 * <B>概要说明：编辑按钮</B><BR>
	 * @param pageData
	 */
	void edit(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：findById</B><BR>
	 * <B>概要说明：通过ID获取数据</B><BR>
	 * @param pageData
	 * @return
	 */
	PageData findById(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：datalistPage</B><BR>
	 * <B>概要说明：列表显示</B><BR>
	 * @param page
	 * @return
	 */
	List<PageData> datalistPage(Page page) throws Throwable;
	
	/**
	 * 
	 * <B>方法名称：listAll</B><BR>
	 * <B>概要说明：</B><BR>
	 * @param pageData
	 * @return
	 */
	List<PageData> listAll(PageData pd) throws Throwable;
	/**
	 * 
	 * <B>方法名称：deleteAll</B><BR>
	 * <B>概要说明：删除所有</B><BR>
	 * @param item
	 */
	void deleteAll(String[] item) throws Throwable;
}

