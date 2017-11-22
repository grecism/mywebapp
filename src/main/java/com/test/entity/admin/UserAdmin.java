package com.test.entity.admin;

import java.util.Date;
import com.test.common.base.admin.entity.BaseEntity;

public class UserAdmin extends BaseEntity<UserAdmin>{
    /** (管理用户id)  id **/
    private Integer id;

    /** 用户名  username **/
    private String username;

    /** md5密码  password **/
    private String password;

    /** 手机号码  mobile **/
    private String mobile;

    /** 电子邮箱  email **/
    private String email;

    /** 是否停用(0:启用 1:停用)  seal_flag **/
    private Integer sealFlag;

    /** 登陆次数  current_review_count **/
    private Integer currentReviewCount;

    /** 最后登陆IP  last_login_ip **/
    private String lastLoginIp;

    /** 最后登陆时间  last_login_time **/
    private Date lastLoginTime;

    /** 创建时间  create_time **/
    private Date createTime;

    /** 修改时间  update_time **/
    private Date updateTime;
    
    public UserAdmin(){
    	
    }
    
    public UserAdmin(UserAdmin user) {
		super();
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.mobile = user.getMobile();
		this.email = user.getEmail();
		this.sealFlag = user.getSealFlag();
		this.currentReviewCount = user.getCurrentReviewCount();
		this.lastLoginIp = user.getLastLoginIp();
		this.lastLoginTime = user.getLastLoginTime();
		this.createTime = user.getCreateTime();
		this.updateTime = user.getUpdateTime();
	}

	/**   (管理用户id)  id   **/
    public Integer getId() {
        return id;
    }

    /**   (管理用户id)  id   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**   用户名  username   **/
    public String getUsername() {
        return username;
    }

    /**   用户名  username   **/
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**   md5密码  password   **/
    public String getPassword() {
        return password;
    }

    /**   md5密码  password   **/
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**   手机号码  mobile   **/
    public String getMobile() {
        return mobile;
    }

    /**   手机号码  mobile   **/
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**   电子邮箱  email   **/
    public String getEmail() {
        return email;
    }

    /**   电子邮箱  email   **/
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**   是否停用(0:启用 1:停用)  seal_flag   **/
    public Integer getSealFlag() {
        return sealFlag;
    }

    /**   是否停用(0:启用 1:停用)  seal_flag   **/
    public void setSealFlag(Integer sealFlag) {
        this.sealFlag = sealFlag;
    }

    /**   登陆次数  current_review_count   **/
    public Integer getCurrentReviewCount() {
        return currentReviewCount;
    }

    /**   登陆次数  current_review_count   **/
    public void setCurrentReviewCount(Integer currentReviewCount) {
        this.currentReviewCount = currentReviewCount;
    }

    /**   最后登陆IP  last_login_ip   **/
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**   最后登陆IP  last_login_ip   **/
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**   最后登陆时间  last_login_time   **/
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**   最后登陆时间  last_login_time   **/
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**   创建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   创建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   修改时间  update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**   修改时间  update_time   **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}