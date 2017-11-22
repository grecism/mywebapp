package com.test.service.admin.system.role;

import java.util.List;
import com.test.entity.admin.system.Role;
import util.admin.PageData;

/**
 * 
 *<p>Title	: RoleManager</p>
 * @Description	: 角色接口类
 * @author	: admin
 * @date	: 2017年11月21日下午7:32:00
 */
public interface RoleManager {
	
	/**列出此组下级角色
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public List<Role> listAllRolesByPId(PageData pd) throws Throwable;
	
	/**通过id查找
	 * @param pd
	 * @return
	 * @throws Throwable
	 */
	public PageData findObjectById(PageData pd) throws Throwable;
	
	/**添加
	 * @param pd
	 * @throws Throwable
	 */
	public void add(PageData pd) throws Throwable;
	
	/**保存修改
	 * @param pd
	 * @throws Throwable
	 */
	public void edit(PageData pd) throws Throwable;
	
	/**删除角色
	 * @param ROLE_ID
	 * @throws Throwable
	 */
	public void deleteRoleById(String ROLE_ID) throws Throwable;
	
	/**给当前角色附加菜单权限
	 * @param role
	 * @throws Throwable
	 */
	public void updateRoleRights(Role role) throws Throwable;
	
	/**通过id查找
	 * @param roleId
	 * @return
	 * @throws Throwable
	 */
	public Role getRoleById(String ROLE_ID) throws Throwable;
	
	/**给全部子角色加菜单权限
	 * @param pd
	 * @throws Throwable
	 */
	public void setAllRights(PageData pd) throws Throwable;
	
	/**权限(增删改查)
	 * @param msg 区分增删改查
	 * @param pd
	 * @throws Throwable
	 */
	public void saveB4Button(String msg,PageData pd) throws Throwable;

}
