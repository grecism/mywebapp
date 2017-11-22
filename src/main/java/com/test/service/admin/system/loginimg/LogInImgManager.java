package com.test.service.admin.system.loginimg;

import java.util.List;
import com.test.common.base.admin.page.Page;
import util.admin.PageData;

/**
 * 
 *<p>Title	: LogInImgManager</p>
 * @Description	: 登录页面背景图片接口
 * @author	: admin
 * @date	: 2017年11月21日下午7:31:17
 */
public interface LogInImgManager{

	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	public void save(PageData pd)throws Throwable;
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	public void delete(PageData pd)throws Throwable;
	
	/**修改
	 * @param pd
	 * @throws Throwable
	 */
	public void edit(PageData pd)throws Throwable;
	
	/**列表
	 * @param page
	 * @throws Throwable
	 */
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

