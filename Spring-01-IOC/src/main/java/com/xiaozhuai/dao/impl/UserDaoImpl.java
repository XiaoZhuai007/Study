package com.xiaozhuai.dao.impl;

import com.xiaozhuai.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据");
    }
}
