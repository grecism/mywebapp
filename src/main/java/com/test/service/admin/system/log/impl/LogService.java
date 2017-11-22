package com.test.service.admin.system.log.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import util.admin.Tools;
import util.admin.UuidUtil;
import com.test.mapper.admin.system.LogMapper;
import com.test.common.base.admin.page.Page;
import com.test.service.admin.system.log.LogManager;

/**
 * 
 *<p>Title	: LogService</p>
 * @Description	: 操作日志记录
 * @author	: admin
 * @date	: 2017年11月21日下午7:30:46
 */
@Service("logService")
@Transactional
public class LogService implements LogManager{

	@Autowired
	private LogMapper logMapper;
	
	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void save(String USERNAME, String CONTENT)throws Throwable{
		PageData pd = new PageData();
		pd.put("USERNAME", USERNAME);					//用户名
		pd.put("CONTENT", CONTENT);						//事件
		pd.put("LOG_ID", UuidUtil.get32UUID());		//主键
		pd.put("CZTIME", Tools.date2Str(new Date()));	//操作时间
		logMapper.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void delete(PageData pd)throws Throwable{
		logMapper.delete(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Throwable{
		return logMapper.datalistPage(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Throwable{
		return logMapper.listAll(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable{
		return logMapper.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteAll(String[] ArrayDATA_IDS)throws Throwable{
		logMapper.deleteAll(ArrayDATA_IDS);
	}

	@Transactional(readOnly=false)
	@Override
	public void save(PageData pd) throws Throwable {
		logMapper.save(pd);
	}

	
	@Override
	public List<PageData> datalistPage(Page page) throws Throwable {
		return logMapper.datalistPage(page);
	}
	
}

