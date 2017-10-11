package com.example.demo.bean.publiclasss;

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
    @Column(length = 35)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private Date createTime;


    private Date updateTime;


    private Integer deletedState;

    @Temporal(TemporalType.TIMESTAMP) //时间类型
    @Column(name = "create_time" ,  columnDefinition = "datetime NULL COMMENT '创建时间'")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Temporal(TemporalType.TIMESTAMP) //时间类型
    @Column(name = "update_time" , columnDefinition = "datetime NULL COMMENT '修改时间'")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Column(name="deleted_state",columnDefinition="tinyint default 1 COMMENT '删除状态:1：存在；0：已删除；2：冻结/关闭/废弃/禁止/停用'" , length = 2)
    public Integer getDeletedState() {
        return deletedState;
    }

    public void setDeletedState(Integer deletedState) {
        this.deletedState = deletedState == null ? 1 : deletedState;
    }
}
