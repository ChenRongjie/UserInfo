package cn.lowry.userInfo.dao;

import cn.lowry.userInfo.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {

    public List<User> findAll();
}