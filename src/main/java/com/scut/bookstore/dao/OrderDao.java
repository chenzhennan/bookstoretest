package com.scut.bookstore.dao;

import com.scut.bookstore.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/25 10:31
 * @description:
 */
public interface OrderDao extends JpaRepository {
    /**
     * 根据订单id查询订单
     */
    Order findOrderById(Integer id);

    /**
     * 根据用户id查询订单
     */
    List<Order> findOrderByUserId(Integer userId);

    /**
     *
     */
}
