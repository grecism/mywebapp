package com.test.service.admin.system.log;

import java.util.List;
import com.test.common.base.admin.page.Page;
import util.admin.PageData;

/**
 * 
 *<p>Title	: LogManager</p>
 * @Description	: 操作日志记录接口
 * @author	: admin
 * @date	: 2017年11月21日下午7:30:57
 */
public interface LogManager{

	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	public void save(PageData pd)throws Throwable;
	
	public void save(String USERNAME, String CONTENT)throws Throwable;
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	public void delete(PageData pd)throws Throwable;
	
	/**列表
	 * @param page
	 * @throws Throwable
	 */
	public List<PageData> datalistPage(Page page)throws Throwable;
	
	public List<PageData> list(Page page)throws Throwable;
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	public List<PageData> listAll(PageData pd)throws Throwable;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Throwable
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Throwable;
	
}

