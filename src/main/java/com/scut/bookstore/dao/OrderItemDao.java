package com.scut.bookstore.dao;

import com.scut.bookstore.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: kevin
 * @data: 2019/4/25 14:42
 * @description:
 */
public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
    /**
     * 根据id查询
     */
    OrderItem findOrderItemById(Integer id);

    /**
     * 通过orderId查询
     */
    OrderItem findByOrderId(Integer orderId);

    /**
     * 根据产品id
     */

}
