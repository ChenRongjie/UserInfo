package cn.lowry.userInfo.service.impl;

import cn.lowry.userInfo.dao.UserDao;
import cn.lowry.userInfo.dao.impl.UserDaoImpl;
import cn.lowry.userInfo.domain.User;
import cn.lowry.userInfo.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
