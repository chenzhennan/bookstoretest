package com.scut.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/24 23:36
 * @description:
 */
public interface AddressDao extends JpaRepository<AddressDao, Integer> {

    /**
     * 根据用户id查询地址
     */
    List<AddressDao> findByUserId(Integer userId);

    /**
     * 根据id查询地址
     */
    AddressDao findAddressById(Integer id);

    /**
     * 根据userId和id查询地址
     */
    AddressDao findByIdAndUserId(Integer id, Integer userId);

    /**
     * 删除地址
     */
    @Override
    void deleteById(Integer id);
}
