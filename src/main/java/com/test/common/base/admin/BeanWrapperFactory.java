package com.test.common.base.admin;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import com.test.common.base.admin.MyBeanWrapper;
import util.StringUtil;

/**
 * 
 *<p>Title	: BeanWrapperFactory</p>
 * @Description	: 实现自定义数据库表字段与实体属性转换
 * @author	: admin
 * @date	: 2017年11月21日下午7:16:45
 */
public class BeanWrapperFactory  implements ObjectWrapperFactory{
	
	@Override
	public boolean hasWrapperFor(Object object) {
		if(object!=null){
			String packageName = object.getClass().getPackage().getName();
			if(StringUtil.containsAnyOtherStr(packageName, "com.hello.model.admin.system")){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	
	@Override
	public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
		return new MyBeanWrapper(metaObject, object);
	}

}



