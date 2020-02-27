package com.zd.blog.dao;

import com.zd.blog.po.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author 张东
 * @create 2020-02-23 15:53
 * @desc
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
