package com.scut.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: kevin
 * @data: 2019/4/22 15:33
 * @description:
 */

@Entity
public class User implements Serializable {

    /**
    * 用户id，作为主键
    */
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    /**
     * 用户名
     */
    @Column
    private String userName;

    /**
     * 密码
     */
    @Column
    private String password;

    /**
     * 手机
     */
    @Column
    private String phone;

    /**
     * 邮箱
     */
    @Column
    private String mailAddress;

    /**
     * 积分
     */
    @Column
    private Integer integration;

    /**
     * 执行序列化接口
     */

    private static final long serialVersionUID = 1L;

    public User(Integer id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.integration = 0;
    }
    public User(){ super();}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getMailAddress() == null? other.getMailAddress() == null : this.getMailAddress().equals(other.getMailAddress()))
                && (this.getIntegration() == null ? other.getIntegration() == null : this.getIntegration().equals(other.getIntegration()));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMailAddress()==null)? 0:getMailAddress().hashCode());
        result = prime * result + ((getIntegration() == null) ? 0 : getIntegration().hashCode());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder ts = new StringBuilder();
        ts.append(getClass().getSimpleName());
        ts.append("[");
        ts.append("Hash = ").append(hashCode());
        ts.append(", id = ").append(id);
        ts.append(", userName=").append(userName);
        ts.append(", password=").append(password);
        ts.append(", phone=").append(phone);
        ts.append(", mailAddress = ").append(mailAddress);
        ts.append(", Integration=").append(integration);
        ts.append(", serialVersionUID=").append(serialVersionUID);
        ts.append("]");
        return ts.toString();
    }

}
