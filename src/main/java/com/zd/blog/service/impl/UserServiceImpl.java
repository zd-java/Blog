package com.zd.blog.service.impl;

import com.zd.blog.dao.UserRepository;
import com.zd.blog.po.User;
import com.zd.blog.service.UserService;
import com.zd.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张东
 * @create 2020-02-23 15:48
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
