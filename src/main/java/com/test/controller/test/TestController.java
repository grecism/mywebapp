package com.test.controller.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 *<p>Title	: TestController</p>
 * @Description	:
 * @author	: admin
 * @date	: 2017年11月21日下午7:13:36
 */
@Controller
@RequestMapping("/user")
public class TestController {
	private static final Log logger = LogFactory.getLog(TestController.class);
	
	@RequestMapping("/index")
	public String index(){
		logger.info("user index");
		logger.info("user index");
		logger.info("user index");
		
		return "index";
	}
}
