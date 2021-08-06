package com.wyy.dao;

import com.wyy.pojo.User;

import java.util.List;

/**
 * @Author WYY
 * @Description
 * @Date 2021/8/5 14:36
 * @InterfaceName UserDao
 */
public interface UserDao {

    public List<User> selectUser();
}
