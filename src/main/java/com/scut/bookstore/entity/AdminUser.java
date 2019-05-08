package com.scut.bookstore.entity;

import org.springframework.validation.ObjectError;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: kevin
 * @data: 2019/4/22 16:26
 * @description:
 */
@Entity
public class AdminUser implements Serializable {
    /**
     * 管理员id
     */
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    /**
     * 是否是销售员
     */
    @Column
    private Integer isSaleMan = 1;

    /**
     * 密码
     */
    @Column
    private String password;

    /**
     * 用户名
     */
    @Column
    private String userName;

    private static final long serialVersionUID = 1L;

    public AdminUser(Integer id, String userName, String password, Integer isSaleMan){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isSaleMan = isSaleMan;
    }
    public AdminUser(){super();}

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

    public Integer getIsSaleMan() {
        return isSaleMan;
    }

    public void setIsSaleMan(Integer isSaleMan) {
        this.isSaleMan = isSaleMan;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that){
        if(that == that){
            return true;
        }
        if(that == null){
            return false;
        }
        if(getClass() != that.getClass()){
            return false;
        }
        AdminUser other = (AdminUser) that;
        return (this.getId() == null? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getIsSaleMan() == null ? other.getIsSaleMan() == null : this.getIsSaleMan().equals(other.getIsSaleMan()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()));

    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsSaleMan() == null) ? 0 : getIsSaleMan().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder ts = new StringBuilder();
        ts.append(getClass().getSimpleName());
        ts.append(" [");
        ts.append("Hash = ").append(hashCode());
        ts.append(", id = ").append(hashCode());
        ts.append(", isSaleMan = ").append(hashCode());
        ts.append(", password = ").append(hashCode());
        ts.append(", userName = ").append(hashCode());
        ts.append(", serialVersionUID = ").append(serialVersionUID);
        ts.append("]");
        return ts.toString();
    }
}
