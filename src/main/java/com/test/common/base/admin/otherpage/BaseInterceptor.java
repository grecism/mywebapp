package com.test.common.base.admin.otherpage;

import java.io.Serializable;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.plugin.Interceptor;
import util.Reflections;

/**
 * 
 *<p>Title	: BaseInterceptor</p>
 * @Description	: MyBatis分页拦截基类
 * @author	: admin
 * @date	: 2017年11月21日下午7:14:20
 */
public abstract class BaseInterceptor implements Interceptor, Serializable {
	private static final long serialVersionUID = 1L;
	protected static final String PAGE = "page";
	protected static final String DELEGATE = "delegate";
	protected static final String MAPPED_STATEMENT = "mappedStatement";
	protected Log log = LogFactory.getLog(this.getClass());

	/**
	 * 对参数进行转换和检查
	 * @param parameterObject 参数对象
	 * @param page            分页对象
	 * @return 分页对象
	 * @throws NoSuchFieldException 无法找到参数
	 */
	@SuppressWarnings("unchecked")
	protected static Page<Object> convertParameter(Object parameterObject, Page<Object> page) {
		try {
			if (parameterObject instanceof Page) {
				return (Page<Object>) parameterObject;
			} else {
				return (Page<Object>) Reflections.getFieldValue(parameterObject, PAGE);
			}
		} catch (Exception e) {
			return null;
		}
	}

}
