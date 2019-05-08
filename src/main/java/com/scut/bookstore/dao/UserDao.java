package com.scut.bookstore.dao;

import com.scut.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/24 23:18
 * @description:
 */
public interface UserDao extends JpaRepository<User, Integer> {
    /**
     * 根据用户名，密码查询用户
     */
    User findByUserNameAndPassword(String userName, String password);

    /**
     * 根据用户名查询用户
     */
    List<User> findByUserName(String userName);

    /**
     * 根据id查询用户
     */
    User findUserById(Integer id);

    /**
     * 根据id删除user
     */
    @Override
    void deleteById(Integer id);
}
