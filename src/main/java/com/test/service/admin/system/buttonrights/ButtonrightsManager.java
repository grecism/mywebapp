package com.test.service.admin.system.buttonrights;

import java.util.List;
import util.admin.PageData;

/**
 * 
 *<p>Title	: ButtonrightsManager</p>
 * @Description	: 按钮权限 接口 
 * @author	: admin
 * @date	: 2017年11月21日下午7:30:35
 */
public interface ButtonrightsManager{

	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	public void save(PageData pd)throws Throwable;
	
	/**通过(角色ID和按钮ID)获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable;
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	public void delete(PageData pd)throws Throwable;
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	public List<PageData> listAll(PageData pd)throws Throwable;
	
	/**列表(全部)左连接按钮表,查出安全权限标识
	 * @param pd
	 * @throws Throwable
	 */
	public List<PageData> listAllBrAndQxname(PageData pd)throws Throwable;
	
}

