/**   
* @Title: MyMapWrapper.java 
* @Package com.hello.controller.admin.base 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fanjianmin@xiangshang360.com   
* @date 2017年9月26日 下午8:55:57 
* @version V1.0   
*/
package com.test.common.base.admin;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.BeanWrapper;
import util.StringUtil;

/**
 * 
 *<p>Title	: MyBeanWrapper</p>
 * @Description	: 驼峰处理
 * @author	: admin
 * @date	: 2017年11月21日下午7:22:32
 */
public class MyBeanWrapper extends BeanWrapper {

	private Object object;

	public MyBeanWrapper(MetaObject metaObject, Object bean) {
		super(metaObject, bean);
		this.object = bean;
	}


	@Override
	public String findProperty(String name, boolean useCamelCaseMapping) {
		String packageName = this.object.getClass().getPackage().getName();
		if (StringUtil.containsAnyOtherStr(packageName, "com.hello.model.admin.system")) {
			return super.findProperty(name, false);
		}
		return super.findProperty(name, useCamelCaseMapping);
	}
}
