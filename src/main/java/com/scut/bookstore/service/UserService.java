package com.scut.bookstore.service;

import com.scut.bookstore.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/25 15:09
 * @description:
 */
public interface UserService {
    /**
     * 根据用户id查询
     */
    User findById(Integer id);

    /**
     * 分页查询所有用户
     */
    Page<User> findAll(Pageable pageable);

    /**
     * 按条件查询
     */
    List<User> findAllExample(Example<User> example);

    /**
     * 更新
     */
    void update(User user);

    /**
     * 创建
     */
    int create(User user);

    /**
     * 通过username查找
     */
    List<User> findByUsername(String userName);

    /**
     * 根据id删除
     */
    void delById(int id);

    /**
     * 检查登录
     */
    User checkLogin(String username, String password);
}
