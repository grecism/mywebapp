package com.test.mapper.admin.system;

import java.util.List;

import util.admin.PageData;
import com.test.common.base.admin.page.Page;

public interface LogMapper{
	/**
	 * 
	* @Title: save 
	* @Description: 保存日志 
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void save(PageData pd) throws Throwable;
	
	/**
	 * 
	* @Title: delete 
	* @Description: 删除日志
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	void delete(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: findById 
	* @Description: 根据ID获取数据
	* @param @param pageData    
	* @return void    返回类型 
	* @throws
	 */
	PageData findById(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: datalistPage 
	* @Description: 分页获取列表数据
	* @param @param page
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> datalistPage(Page page) throws Throwable;
	/**
	 * 
	* @Title: listAll 
	* @Description: 列出所有
	* @param @param pageData
	* @param @return    
	* @return PageData    返回类型 
	* @throws
	 */
	List<PageData> listAll(PageData pd) throws Throwable;
	/**
	 * 
	* @Title: deleteAll 
	* @Description: 删除所有
	* @param @param item    
	* @return void    返回类型 
	* @throws
	 */
	void deleteAll(String[] item) throws Throwable;
}