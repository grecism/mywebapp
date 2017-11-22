package com.test.common.base.admin;

import util.admin.Const;
import com.test.service.admin.system.menu.impl.MenuService;
import com.test.service.admin.system.role.impl.RoleService;
import com.test.service.admin.system.user.UserManager;

/**
 * 
 *<p>Title	: ServiceHelper</p>
 * @Description	: 获取Spring容器中的service bean 
 * @author	: admin
 * @date	: 2017年11月21日下午7:29:07
 */
public final class ServiceHelper {
	
	public static Object getService(String serviceName){
		//WebApplicationContextUtils.
		return Const.WEB_APP_CONTEXT.getBean(serviceName);
	}
	
	public static UserManager getUserService(){
		return (UserManager) getService("userService");
	}
	
	public static RoleService getRoleService(){
		return (RoleService) getService("roleService");
	}
	
	public static MenuService getMenuService(){
		return (MenuService) getService("menuService");
	}
}
