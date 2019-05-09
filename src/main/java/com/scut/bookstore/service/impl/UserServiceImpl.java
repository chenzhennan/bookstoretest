package com.scut.bookstore.service.impl;

import com.scut.bookstore.dao.UserDao;
import com.scut.bookstore.entity.User;
import com.scut.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/25 15:20
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.getOne(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    @Override
    public List<User> findAllExample(Example<User> example) {
        return userDao.findAll(example);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public int create(User user) {
        return userDao.save(user).getId();
    }

    @Override
    public List<User> findByUsername(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public void delById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public User checkLogin(String username, String password) {
        return userDao.findByUserNameAndPassword(username, password);
    }
}
