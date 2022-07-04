package com.xiaozhuai.dao.impl;

import com.xiaozhuai.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("通过Oracle获取用户的数据");
    }
}
