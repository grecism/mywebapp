package com.test.common.springjdbc.helper;

import com.test.common.springjdbc.MysqlSpringJdbcDao;

public class DaoHelper {
	
	private static MysqlSpringJdbcDao mysqlSpringJdbcDao;
	
	public static MysqlSpringJdbcDao getMysqlSpringJdbcDao(){
		if(mysqlSpringJdbcDao == null ){
			mysqlSpringJdbcDao = (MysqlSpringJdbcDao) SpringApplicationContextHolder.getBean("mysqlSpringJdbcDao");
		}
		return mysqlSpringJdbcDao;
	}
	
}
