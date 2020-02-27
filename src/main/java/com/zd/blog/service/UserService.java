package com.zd.blog.service;

import com.zd.blog.po.User;

/**
 * @author 张东
 * @create 2020-02-23 15:47
 * @desc
 */
public interface UserService {

    User checkUser(String username, String password);
}
