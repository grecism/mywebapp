package com.test.mapper.admin;

import java.util.Map;

import com.test.common.base.admin.BaseMapper;
import com.test.entity.admin.UserAdmin;

public interface UserAdminMapper extends BaseMapper<UserAdmin>{
    int deleteByPrimaryKey(Integer id);

    int insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    UserAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);
    
    UserAdmin login(Map<String, Object> map);

	UserAdmin selectByUserAdmin(UserAdmin userAdmin);
}