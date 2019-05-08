package com.scut.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/25 10:22
 * @description:
 */
public interface AdminUserDao extends JpaRepository {
    /**
     * 根据id查管理者
     */
    AdminUserDao findAdminUserById(Integer id);

    /**
     * 根据用户名与密码查询
     */
    AdminUserDao findByUserNameAndPassword(String userName, String Password);

    /**
     * 根据用户名查询
     */
    List<AdminUserDao> findAdminUserByUserName(String userName);
}
