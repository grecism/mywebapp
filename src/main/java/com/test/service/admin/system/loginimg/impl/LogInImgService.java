package com.test.service.admin.system.loginimg.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.test.mapper.admin.system.LogInImgMapper;
import com.test.common.base.admin.page.Page;
import com.test.service.admin.system.loginimg.LogInImgManager;

/**
 * 
 *<p>Title	: LogInImgService</p>
 * @Description	:  登录页面背景图片
 * @author	: admin
 * @date	: 2017年11月21日下午7:31:08
 */
@Service("loginimgService")
@Transactional
public class LogInImgService implements LogInImgManager{
	
	@Autowired
	private LogInImgMapper logInImgMapper;
	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void save(PageData pd)throws Throwable{
		logInImgMapper.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void delete(PageData pd)throws Throwable{
		logInImgMapper.delete(pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void edit(PageData pd)throws Throwable{
		logInImgMapper.edit(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Throwable{
		return logInImgMapper.datalistPage(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	public List<PageData> listAll(PageData pd) throws Throwable{
		return logInImgMapper.listAll(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable{
		return logInImgMapper.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteAll(String[] ArrayDATA_IDS)throws Throwable{
		logInImgMapper.deleteAll(ArrayDATA_IDS);
	}
	
}

