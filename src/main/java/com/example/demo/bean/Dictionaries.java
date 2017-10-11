package com.example.demo.bean;

import com.example.demo.bean.publiclasss.PublicClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Created by Tony on 2017/10/11.
 * com.example.demo.bean.SpringBootMybatis
 */
@Entity
@Table(name = "dictionaries")
public class Dictionaries extends PublicClass {

    private String name;

    private int orders;

    private int values;

    private String type;

    @Column(name = "name" , columnDefinition = "VARCHAR(255) NULL COMMENT '字典名称'")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "orders" , columnDefinition = "tinyint(6) NULL COMMENT '排序'")
    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    @Column(name = "figure" , columnDefinition = "tinyint(6) NULL COMMENT '参数值'")
    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }
    @Column(name = "type" , columnDefinition = "VARCHAR(255) NULL COMMENT '参数类型'")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
