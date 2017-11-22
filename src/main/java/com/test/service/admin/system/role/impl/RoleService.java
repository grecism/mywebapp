package com.test.service.admin.system.role.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.test.mapper.admin.system.RoleMapper;
import com.test.entity.admin.system.Role;
import com.test.service.admin.system.role.RoleManager;

/**
 * 
 *<p>Title	: RoleService</p>
 * @Description	: 角色
 * @author	: admin
 * @date	: 2017年11月21日下午7:31:51
 */
@Service("adminRoleService")
@Transactional
public class RoleService implements RoleManager{

	@Autowired
	private RoleMapper roleMapper;
	
	/**列出此组下级角色
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<Role> listAllRolesByPId(PageData pd) throws Throwable {
		return roleMapper.listAllRolesByPId(pd);
	}
	
	/**通过id查找
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findObjectById(PageData pd) throws Throwable {
		return roleMapper.findObjectById(pd);
	}
	
	/**添加
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void add(PageData pd) throws Throwable {
		roleMapper.insert(pd);
	}
	
	/**保存修改
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void edit(PageData pd) throws Throwable {
		roleMapper.edit(pd);
	}
	
	/**删除角色
	 * @param ROLE_ID
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteRoleById(String ROLE_ID) throws Throwable {
		roleMapper.deleteRoleById(ROLE_ID);
	}
	
	/**给当前角色附加菜单权限
	 * @param role
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void updateRoleRights(Role role) throws Throwable {
		roleMapper.updateRoleRights(role);
	}
	
	/**通过id查找
	 * @param roleId
	 * @return
	 * @throws Throwable
	 */
	public Role getRoleById(String ROLE_ID) throws Throwable {
		return roleMapper.getRoleById(ROLE_ID);
	}
	
	/**给全部子角色加菜单权限
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void setAllRights(PageData pd) throws Throwable {
		roleMapper.setAllRights(pd);
	}
	
	/**权限(增删改查)
	 * @param msg 区分增删改查
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void saveB4Button(String msg,PageData pd) throws Throwable {
		//反射动态执行方法
		(roleMapper.getClass().getInterfaces())[0].getMethod(msg, PageData.class).invoke(roleMapper, pd);
	}

}
