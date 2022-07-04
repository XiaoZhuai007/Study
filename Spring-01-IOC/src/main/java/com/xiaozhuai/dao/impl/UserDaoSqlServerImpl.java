package com.xiaozhuai.dao.impl;

import com.xiaozhuai.dao.UserDao;

public class UserDaoSqlServerImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("通过SQLServer获取用户的数据");
    }
}
