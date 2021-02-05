package com.csrcbank.mbiserver.dao;

import com.csrcbank.mbiserver.core.bean.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理Mapper
 * @author : Admin
 * @addTime : 11:14
 */
@Mapper
public interface UserDao {
    List<SysUser> getAllUsers();
}
