package com.xiaozhuai.service.impl;

import com.xiaozhuai.dao.UserDao;
import com.xiaozhuai.dao.impl.UserDaoImpl;
import com.xiaozhuai.dao.impl.UserDaoMysqlImpl;
import com.xiaozhuai.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoMysqlImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
