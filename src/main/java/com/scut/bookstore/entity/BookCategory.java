package com.scut.bookstore.entity;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: kevin
 * @data: 2019/4/23 22:21
 * @description:
 */
@Entity
public class BookCategory implements Serializable {
    /**
     * 书的类别id
     */
    @Id
    @GeneratedValue
    @Column
    private Integer cateId;

    /**
     * 上级分类id
     */
    @Column
    private Integer parentId;

    /**
     * 类别名称
     */
    private String name;

    /**
     *
     */
    @Column
    private Integer status;

    /**
     *
     */
    @Column
    private Integer isParent;

    /**
     *
     */
    @Column
    private Date created;

    /**
     *
     */
    @Column
    private Date updated;

    private static final long serialVersionUID = 1L;

    public BookCategory(){
        super();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
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

        BookCategory other = (BookCategory) that;
        return (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
                && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getIsParent() == null ? other.getIsParent() == null : this.getIsParent().equals(other.getIsParent()))
                && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
                && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));

    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((getCateId() == null)? 0 : getCateId().hashCode());
        result = prime*result+((getParentId() == null)? 0 : getParentId().hashCode());
        result = prime*result+((getName() == null)? 0 : getName().hashCode());
        result = prime*result+((getStatus() == null)? 0 : getStatus().hashCode());
        result = prime*result+((getIsParent() == null)? 0 : getIsParent());
        result = prime*result+((getCreated() == null)? 0: getCreated().hashCode());
        result = prime*result+((getUpdated() == null)? 0 : getUpdated().hashCode());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder ts = new StringBuilder();
        ts.append(getClass().getSimpleName());
        ts.append("[");
        ts.append("Hash = ").append(hashCode());
        ts.append(", cateId = ").append(this.cateId);
        ts.append(", parentId = ").append(this.parentId);
        ts.append(", name = ").append(this.name);
        ts.append(", status = ").append(this.status);
        ts.append(", isParent = ").append(this.isParent);
        ts.append(", created = ").append(this.created);
        ts.append(", updated = ").append(this.updated);
        return ts.toString();
    }
}
