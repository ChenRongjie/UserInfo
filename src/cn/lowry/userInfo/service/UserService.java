package cn.lowry.userInfo.service;

import cn.lowry.userInfo.domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<User> findAll();
}