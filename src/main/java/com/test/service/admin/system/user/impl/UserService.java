package com.test.service.admin.system.user.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.test.mapper.admin.system.UserMapper;
import com.test.common.base.admin.page.Page;
import com.test.entity.admin.system.User;
import com.test.service.admin.system.user.UserManager;

/**
 * 
 *<p>Title	: UserService</p>
 * @Description	: 系统用户 
 * @author	: admin
 * @date	: 2017年11月21日下午7:32:14
 */
@Service("userService")
@Transactional
public class UserService implements UserManager{
	
	@Autowired
	private UserMapper userMapper;
	/**登录判断
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData getUserByNameAndPwd(PageData pd)throws Throwable{
		PageData userInfo = userMapper.getUserInfo(pd);
		
		return userInfo;
	}
	
	/**更新登录时间
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void updateLastLogin(PageData pd)throws Throwable{
		userMapper.updateLastLogin(pd);
		
	}
	
	/**通过用户ID获取用户信息和角色信息
	 * @param USER_ID
	 * @return
	 * @throws Throwable
	 */
	public User getUserAndRoleById(String USER_ID) throws Throwable {
		return userMapper.getUserAndRoleById(USER_ID);
		
	}
	
	/**通过USERNAEME获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUsername(PageData pd)throws Throwable{
		return userMapper.findByUsername(pd);
	}
	
	/**列出某角色下的所有用户
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listAllUserByRoldId(PageData pd) throws Throwable {
		return userMapper.listAllUserByRoldId(pd);
	}
	
	/**保存用户IP
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void saveIP(PageData pd)throws Throwable{
		userMapper.saveIP(pd);
	}
	
	/**用户列表
	 * @param page
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listUsers(Page page)throws Throwable{
		return userMapper.userlistPage(page);
	}
	
	/**用户列表(弹窗选择用)
	 * @param page
	 * @return
	 * @throws Throwable
	 */
	public List<PageData> listUsersBystaff(Page page)throws Throwable{
		return userMapper.userBystafflistPage(page);
	}
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUE(PageData pd)throws Throwable{
		return userMapper.findByUE(pd);
	}
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findByUN(PageData pd)throws Throwable{
		return userMapper.findByUN(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable{
		return userMapper.findById(pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void saveU(PageData pd)throws Throwable{
		userMapper.saveU(pd);
	}
	 
	/**修改用户
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void editU(PageData pd)throws Throwable{
		userMapper.editU(pd);
	}
	
	/**删除用户
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteU(PageData pd)throws Throwable{
		userMapper.deleteU(pd);
	}
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteAllU(String[] USER_IDS)throws Throwable{
		userMapper.deleteAllU(USER_IDS);
	}
	
	/**用户列表(全部)
	 * @param USER_IDS
	 * @throws Throwable
	 */
	public List<PageData> listAllUser(PageData pd)throws Throwable{
		return userMapper.listAllUser(pd);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Throwable
	 */
	public PageData getUserCount(String value)throws Throwable{
		return userMapper.getUserCount(value);
	}
	
}
