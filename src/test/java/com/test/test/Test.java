package com.test.test;

import javax.annotation.Resource;
import jxl.common.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.alibaba.fastjson.JSON;
import com.test.mapper.admin.system.UserMapper;
import com.test.service.admin.system.user.UserManager;

@SuppressWarnings("deprecation")
@WebAppConfiguration  
//@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)  
@Transactional  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:spring.xml"}) // 要包括所有的spring配置文件哦~
public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
	
	@Resource(name="userService")
	private UserManager userService;
	@Autowired
	private UserMapper userMapper;
	
	@org.junit.Test
	public void testa() throws Throwable{
		logger.info("aaaaaaaaaaaa");
		PageData pd = new PageData();;
		pd.put("USERNAME", "admin");
		pd.put("PASSWORD", "1");
		
		pd = userService.getUserByNameAndPwd(pd);//根据用户名和密码去读取用户信息
		PageData userInfo = userMapper.getUserInfo(pd);
		logger.info(JSON.toJSONString(userInfo));
	}

}
