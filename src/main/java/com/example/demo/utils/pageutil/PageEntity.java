package com.example.demo.utils.pageutil;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * Created by Tony on 2017/10/11.
 * com.example.demo.utils.pageutil.springbootmybatis
 * 描述：分页实体类
 */
public class PageEntity {

    private Integer currentPage = 1;

    public static final int PAGESIZE = 5;

    private Integer totalPage;

    private List<?> list;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
