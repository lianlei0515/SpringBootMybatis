package com.example.demo.utils.restMessage;

import java.io.Serializable;

/**
 * 作者:   Tony
 * 时间:   2017/9/30 10:24
 * 描述  :
 */
public class ResultMsg<T> implements Serializable {

    //返回编码
    private int code = RestCode.SUCCESSCODE;
    //提示消息
    private String m = RestCode.QUERYWASSUCCESSFUL_CN;
    //数据对象
    private T d;



    public ResultMsg() {
    }

    public final static <T> ResultMsg<T> getNew(){
        ResultMsg<T> rm = new ResultMsg<T>();
        return rm;
    }

    public final static <T> ResultMsg<T> getFailed(){
        ResultMsg<T> rm = new ResultMsg<T>();
        rm.setCode(RestCode.SUCCESSCODE);
        return rm;
    }

    public ResultMsg(int code, String m, T d) {
        this.code = code;
        this.m = m;
        this.d = d;
    }

    public ResultMsg(int code, T d) {
        this.code = code;
        this.d = d;
    }

    public ResultMsg(int code, String m) {
        this.code = code;
        this.m = m;
    }


    public int getCode() {
        return code;
    }

    public ResultMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getM() {
        return m;
    }

    public ResultMsg setM(String m)
    {
        this.m = m;
        return this;
    }

    public T getD() {
        return d;
    }

    public ResultMsg setD(T d) {
        this.d = d;
        return this;
    }
}
