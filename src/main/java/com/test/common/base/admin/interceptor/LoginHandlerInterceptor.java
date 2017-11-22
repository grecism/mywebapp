package com.test.common.base.admin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.test.entity.admin.system.User;
import util.admin.Const;
import com.test.common.base.admin.shiro.Jurisdiction;

/**
 * 
 *<p>Title	: LoginHandlerInterceptor</p>
 * @Description	: 登录过滤，权限验证
 * @author	: admin
 * @date	: 2017年11月21日下午7:28:41
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter{
	
	private static final Log logger=LogFactory.getLog(LoginHandlerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String path = request.getServletPath();
		//logger.info(">>>进入拦截器，请求路径为:"+path);
		if(path.matches(Const.NO_INTERCEPTOR_PATH)){
			//logger.info(">>>进入拦截器，与不需要校验权限的路径匹配的结果为:"+path.matches(Const.NO_INTERCEPTOR_PATH));
			return true;
		}else{
			User user = (User)Jurisdiction.getSession().getAttribute(Const.SESSION_USER);
			if(user!=null){
				path = path.substring(1, path.length());
				boolean b = Jurisdiction.hasJurisdiction(path); //访问权限校验
				if(!b){
					response.sendRedirect(request.getContextPath() + Const.LOGIN);
				}
				return b;
			}else{
				//登陆过滤
				response.sendRedirect(request.getContextPath() + Const.LOGIN);
				return false;		
			}
		}
	}
	
}
