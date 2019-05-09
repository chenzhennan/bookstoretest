package com.scut.bookstore.entity.pojo;

import java.io.Serializable;

/**
 * @author: kevin
 * @data: 2019/5/8 23:41
 * @description:
 */
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = -6248298306422072592L;

    /**
     * 接口调用成功
     */
    public static final int SUCCESS = 0;

    /**
     * 接口调用失败
     */
    public static final int FAIL = 1;

    /**
     * 表示没有调用该接口的权限
     */
    public static final int NOPERMISSION = 2;

    public static final String NOLOGINMSG = "未登录";
    public static final String NOPERMISSIONMSG = "没有权限";
    public static final String SUCCESSMSG = "成功";
    public static final String FAILMSG = "失败";

    private String message = SUCCESSMSG;
    private int state = SUCCESS;

    /**
     * 返回的数据
     */
    private T data;
    public ResultBean(){
        super();
    }
    public ResultBean(T data){
        this.data = data;
    }

    /**
     * 包装异常信息
     */
    public ResultBean(Throwable e){
        super();
        this.message = e.getMessage();
        this.state = FAIL;
    }
    public ResultBean(String message){
        super();
        this.message = message;
        this.state = FAIL;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "ResultBean{"+
                "message = "+message+'\''
                +", state = "+state+'\''
                +", data = "+data
                +"}";
    }
}
