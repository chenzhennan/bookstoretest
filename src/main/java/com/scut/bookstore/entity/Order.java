package com.scut.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: kevin
 * @data: 2019/4/22 20:43
 * @description:
 */
@Entity
public class Order implements Serializable {
    /**
     * 订单id
     */
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    /**
     * 地址id
     */
    @Column
    private Integer addressId;

    /**
     * 用户id
     */
    @Column
    private Integer userId;

    /**
     * 订单时间
     */
    @Column
    private Date orderTime;

    /**
     * 订单状态,
     */
    @Column
    private Integer state;

    /**
     * 订单总价  1:未付款 2:等待发货 3:等待收货 4:订单完成
     */
    @Column
    private Double total;

    /**
     * 积分
     */
    @Column
    private Integer totalIntegral;

    private static final long serialVersionUID = 1L;

    public Order(Double total, Integer state, Date orderTime, Integer addressId, Integer userId, Integer totalIntegral) {
        this.total = total;
        this.state = state;
        this.orderTime = orderTime;
        this.addressId = addressId;
        this.userId = userId;
        this.totalIntegral = totalIntegral;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getTotalIntegral() {
        return totalIntegral;
    }

    public void setTotalIntegral(Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
                && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
                && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getTotalIntegral() == null ? other.getTotalIntegral() == null : this.getTotalIntegral().equals(other.getTotalIntegral()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTotalIntegral() == null) ? 0 : getTotalIntegral().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id = ").append(id);
        sb.append(", total = ").append(total);
        sb.append(", state = ").append(state);
        sb.append(", orderTime = ").append(orderTime);
        sb.append(", addressId = ").append(addressId);
        sb.append(", userId = ").append(userId);
        sb.append(", totalIntegral = ").append(totalIntegral);
        sb.append(", serialVersionUID = ").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
