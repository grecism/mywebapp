package com.test.common.base.admin;

import java.util.List;

import util.BankCardUtil;

/**
 * 
 *<p>Title	: BaseMapper</p>
 * @Description	: 基类Dao
 * @author	: admin
 * @date	: 2017年11月21日下午7:26:00
 * @param <T>
 */
public interface BaseMapper<T> {

	/**
	 * @Title: get 
	 * @Description:获取单条数据
	 * @param id 主键
	 * @return T
	 * @date 2017年8月12日 下午4:08:13
	 * @author liyanchao
	 */
	public T selectByPrimaryKey(Integer id);

	/**
	 * @Title: findList 
	 * @Description: 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
	 * @param id
	 * @date 2017年8月12日 下午4:08:13
	 * @author liyanchao
	 */
	public List<T> findList(T entity);

	/**
	 * @Title: insert
	 * @Description: 插入数据(不论字段是否为null或空,全部插入)
	 * @param record 插入数据实体
	 * @return int 成功条数
	 * @date 2017年8月12日 下午4:08:13
	 * @author liyanchao
	 */
	public int insert(T record);

	/**
	 * 
	 * @Title: insertSelective 
	 * @Description:  插入数据(只插入不为null不为空的字段)
	 * @param record  插入数据实体
	 * @return int 成功条数
	 * @date 2017年8月12日 下午4:20:39
	 * @author liyanchao
	 */
	int insertSelective(T record);

	/**
	 * @Title: updateByPrimaryKeySelective 
	 * @Description: 根据主键更新数据(只更新不为null不为空的字段)
	 * @param record 更新数据实体
	 * @return int   成功条数
	 * @date 2017年8月12日 下午4:21:33
	 * @author liyanchao
	 */
	int updateByPrimaryKeySelective(T record);

	/**
	 * 
	 * @Title: updateByPrimaryKey 
	 * @Description: 根据主键更新数据(不论是否字段为null或者空全部更新)
	 * @param record 更新数据实体
	 * @return int   成功条数
	 * @date 2017年8月12日 下午4:22:32
	 * @author liyanchao
	 */
	int updateByPrimaryKey(T record);

	/**
	 * 
	 * @Title: deleteByPrimaryKey 
	 * @Description: 根据主键删除数据
	 * @param id 主键
	 * @return int 成功条数
	 * @date 2017年8月12日 下午4:23:43
	 * @author liyanchao
	 */
	public int deleteByPrimaryKey(Integer id);

}