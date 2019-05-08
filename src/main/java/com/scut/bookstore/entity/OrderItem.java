package com.scut.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: kevin
 * @data: 2019/4/22 21:09
 * @description:
 */
@Entity
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    /**
     * 订单数量
     */
    @Column
    private Integer count;

    /**
     * 订单id
     */
    @Column
    private Integer orderId;

    /**
     *商品id
     */
    @Column
    private Integer productId;

    /**
     * 积分
     */
    @Column
    private Integer subIntegral;

    /**
     * 总价
     */
    @Column
    private Double subTotal;

    private static final long serialVersionUID = 1L;

    public OrderItem(Integer orderId, Integer productId, Integer count, Double subTotal, Integer subIntegral) {
        this.orderId = orderId;
        this.productId = productId;
        this.count = count;
        this.subTotal = subTotal;
        this.subIntegral = subIntegral;
    }

    public OrderItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSubIntegral() {
        return subIntegral;
    }

    public void setSubIntegral(Integer subIntegral) {
        this.subIntegral = subIntegral;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
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
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
                && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
                && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
                && (this.getSubTotal() == null ? other.getSubTotal() == null : this.getSubTotal().equals(other.getSubTotal()))
                && (this.getSubIntegral() == null ? other.getSubIntegral() == null : this.getSubIntegral().equals(other.getSubIntegral()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getSubIntegral() == null) ? 0 : getSubIntegral().hashCode());
        result = prime * result + ((getSubTotal() == null) ? 0 : getSubTotal().hashCode());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder ts = new StringBuilder();
        ts.append(getClass().getSimpleName());
        ts.append("[");
        ts.append("Hash = ").append(hashCode());
        ts.append(", id = ").append(id);
        ts.append(", count = ").append(count);
        ts.append(", orderId = ").append(orderId);
        ts.append(", productId = ").append(productId);
        ts.append(", subIntegral = ").append(subIntegral);
        ts.append(", subTotal = ").append(subTotal);
        ts.append(", serialVersionUID = ").append(serialVersionUID);
        ts.append("]");
        return ts.toString();
    }
}
