package com.test.service.admin.system.buttonrights.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.admin.PageData;
import com.test.mapper.admin.system.ButtonrightsMapper;
import com.test.service.admin.system.buttonrights.ButtonrightsManager;

/**
 * 
 *<p>Title	: ButtonrightsService</p>
 * @Description	: 按钮权限
 * @author	: admin
 * @date	: 2017年11月21日下午7:30:25
 */
@Service("buttonrightsService")
@Transactional
public class ButtonrightsService implements ButtonrightsManager{
	
	@Autowired
	private ButtonrightsMapper buttonrightsMapper;
	/**新增
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void save(PageData pd) throws Throwable{
		buttonrightsMapper.save(pd);
	}
	
	/**通过(角色ID和按钮ID)获取数据
	 * @param pd
	 * @throws Throwable
	 */
	public PageData findById(PageData pd) throws Throwable {
		return buttonrightsMapper.findById(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Throwable
	 */
	@Transactional(readOnly=false)
	public void delete(PageData pd)throws Throwable{
		buttonrightsMapper.delete(pd);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Throwable{
		return buttonrightsMapper.listAll(pd);
	}
	
	/**列表(全部)左连接按钮表,查出安全权限标识
	 * @param pd
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllBrAndQxname(PageData pd)throws Throwable{
		return buttonrightsMapper.listAllBrAndQxname(pd);
	}

}

