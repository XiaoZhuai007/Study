package com.xiaozhuai.dao.impl;

import com.xiaozhuai.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("通过MySQL获取用户的数据");
    }
}
