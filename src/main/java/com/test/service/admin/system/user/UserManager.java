package com.test.service.admin.system.user;

import java.util.List;
import com.test.common.base.admin.page.Page;
import util.admin.PageData;

/**
 * 
 *<p>Title	: UserManager</p>
 * @Description	: 用户接口类
 * @author	: admin
 * @date	: 2017年11月21日下午7:32:27
 */
public interface UserManager {
	
	/**登录判断
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData getUserByNameAndPwd(PageData pd)throws Throwable;
	
	/**更新登录时间
	 * @param pd
	 * @throws Throwable
	 */
	public void updateLastLogin(PageData pd)throws Throwable;
	
	/**通过用户ID获取用户信息和角色信息
	 * @param USER_ID
	 * @return
	 * @throws Throwable
	 */
	public com.test.entity.admin.system.User getUserAndRoleById(String USER_ID) throws Throwable;
	
	/**通过USERNAEME获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUsername(PageData pd)throws Throwable;
	
	/**列出某角色下的所有用户
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listAllUserByRoldId(PageData pd) throws Throwable;
	
	/**保存用户IP
	 * @param pd
	 * @throws Throwable
	 */
	public void saveIP(PageData pd)throws Throwable;
	
	/**用户列表
	 * @param page
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listUsers(Page page)throws Throwable;
	
	/**用户列表(弹窗选择用)
	 * @param page
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listUsersBystaff(Page page)throws Throwable;
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUE(PageData pd)throws Throwable;
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUN(PageData pd)throws Throwable;
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable;
	
	/**修改用户
	 * @param pd
	 * @throws Throwable
	 */
	public void editU(PageData pd)throws Throwable;
	
	/**保存用户
	 * @param pd
	 * @throws Throwable
	 */
	public void saveU(PageData pd)throws Throwable;
	
	/**删除用户
	 * @param pd
	 * @throws Throwable
	 */
	public void deleteU(PageData pd)throws Throwable;
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Throwable
	 */
	public void deleteAllU(String[] USER_IDS)throws Throwable;
	
	/**用户列表(全部)
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listAllUser(PageData pd)throws Throwable;
	
	/**获取总数
	 * @param pd
	 * @throws Throwable
	 */
	public PageData getUserCount(String value)throws Throwable;
	
}
