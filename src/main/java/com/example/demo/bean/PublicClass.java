package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tony on 2017/10/9.
 * com.example.demo.bean.SpringBootMybatis
 */
@Entity
//@Table(name = "EMP")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PublicClass implements Serializable {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private Date createTime;


    private Date updateTime;


    private int deletedState;

    @Temporal(TemporalType.TIMESTAMP) //时间类型
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Temporal(TemporalType.TIMESTAMP) //时间类型
    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Column(name="deleted_state",columnDefinition="tinyint default 1")
    public int getDeletedState() {
        return deletedState;
    }

    public void setDeletedState(int deletedState) {
        this.deletedState = deletedState;
    }
}
