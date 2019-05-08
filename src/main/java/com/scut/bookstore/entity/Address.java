package com.scut.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: kevin
 * @data: 2019/4/22 16:37
 * @description:
 */
@Entity
public class Address implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    /**
     * 用户id
     */
    @Column
    private Integer userId;

    /**
     * 省
     */
    @Column
    private String province;

    /**
     * 城市
     */
    @Column
    private String city;

    /**
     * 区
     */
    @Column
    private String district;

    /**
     * 详细地址
     */
    @Column
    private String detail;

    /**
     * 收件人
     */
    @Column
    private String receiver;

    /**
     * 收件手机号
     */
    @Column
    private String phone;

    private static final long serialVersionUID = 1L;

    public Address(Integer userId, String province, String city, String district, String detail, String receiver, String phone) {
        this.userId = userId;
        this.province = province;
        this.city = city;
        this.district = district;
        this.detail = detail;
        this.receiver = receiver;
        this.phone = phone;
    }

    public Address(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that){
        if(this == that){
            return true;
        }
        if(that == null){
            return false;
        }
        if(getClass() != that.getClass()){
            return false;
        }

        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
                && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
                && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
                && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((getId() == null)? 0 : getId().hashCode());
        result = prime*result+((getCity() == null)? 0 : getCity().hashCode());
        result = prime*result+((getDetail() == null)? 0 : getDetail().hashCode());
        result = prime*result+((getDistrict() == null)? 0 : getDistrict().hashCode());
        result = prime*result+((getPhone() == null)? 0 : getPhone().hashCode());
        result = prime*result+((getProvince() == null)? 0 : getProvince().hashCode());
        result = prime*result+((getReceiver() == null)? 0 : getReceiver().hashCode());
        result = prime*result+((getUserId() == null)? 0 : getUserId());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder ts = new StringBuilder();
        ts.append(getClass().getSimpleName());
        ts.append("[");
        ts.append("Hash = ").append(hashCode());
        ts.append(", id = ").append(getId());
        ts.append(", city").append(getCity());
        ts.append(", detail = ").append(getDetail());
        ts.append(", District = ").append(getDistrict());
        ts.append(", phone = ").append(getPhone());
        ts.append(", province = ").append(getProvince());
        ts.append(", receive = ").append(getReceiver());
        ts.append(", userId = ").append(getUserId());
        ts.append(", serialVersionUID=").append(serialVersionUID);
        ts.append("]");
        return ts.toString();
    }
}
