package com.test.service.admin.system.button.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.test.common.base.admin.page.Page;
import util.admin.PageData;
import com.test.mapper.admin.system.ButtonMapper;
import com.test.service.admin.system.button.ButtonManager;

/**
 * 
 *<p>Title	: ButtonService</p>
 * @Description	: 按钮管理 
 * @author	: admin
 * @date	: 2017年11月21日下午7:29:23
 */
@Service("buttonService")
@Transactional
public class ButtonService implements ButtonManager{

	@Autowired
	private ButtonMapper buttonMapper;
	
	
	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void save(PageData pd)throws Throwable{
		buttonMapper.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void delete(PageData pd)throws Throwable{
		buttonMapper.delete(pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void edit(PageData pd)throws Throwable{
		buttonMapper.edit(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Throwable{
		return buttonMapper.datalistPage(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Throwable{
		return buttonMapper.listAll(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd)throws Throwable{
		return buttonMapper.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void deleteAll(String[] ArrayDATA_IDS)throws Throwable{
		buttonMapper.deleteAll(ArrayDATA_IDS);
	}
	
}

