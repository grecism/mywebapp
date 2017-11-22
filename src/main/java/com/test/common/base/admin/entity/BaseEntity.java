package com.test.common.base.admin.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlTransient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.common.base.admin.otherpage.Page;

/**
 * 
 *<p>Title	: BaseEntity</p>
 * @Description	: Entity 基类
 * @author	: admin
 * @date	: 2017年11月21日下午7:16:32
 * @param <T>
 */
public abstract class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 当前实体分页对象
	 */
	protected Page<T> page;

	public BaseEntity() {

	}

	@JsonIgnore
	@XmlTransient
	public Page<T> getPage() {
		if (page == null) {
			page = new Page<T>();
		}
		return page;
	}

	public Page<T> setPage(Page<T> page) {
		this.page = page;
		return page;
	}
}
