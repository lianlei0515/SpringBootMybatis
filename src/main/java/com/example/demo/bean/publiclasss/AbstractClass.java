package com.example.demo.bean.publiclasss;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tony on 2017/10/9.
 * com.example.demo.bean.SpringBootMybatis
 *
 * 所有实体的超级类；
 * jpa注解：
 *  @Entity：定义该类是一个实体
 *  @Inheritance：属性指定继承策略，继承策略有SINGLE_TABLE、TABLE_PER_CLASS和JOINED三种
 *      TABLE_PER_CLASS：注入到超类中，子类不需要注解。若子类继承该类之后同样会继承该类的属性并将所有的属性生成到子类的表中
 *      SINGLE_TABLE：注入到超类中，子类不需要注解。若子类继承该类之后同样会继承该类的属性并将所有的属性生成到超类的表中
 *      JOINED：注入到超类中，子类不需要注解，是将父类、子类分别存放在不同的表中，并且建立相应的外键，以确定相互之间的关系
 *  @Transient：该注解时在创建表的时候忽略拥有此类注解的属性（就是不创建这个字段）
 *  @Temporal：时间注解，策略有3种：（TemporalType.DATE）；（TemporalType.TIME）；（TemporalType.TIMESTAMP）此处不多做解释
 *  @Column：对应数据据库中的字段
 *      属性：length：字段长度
 *            columnDefinition：设置默认属性值或注释
 *   @GeneratedValue(generator = "system-uuid")
 *   @GenericGenerator(name = "system-uuid",strategy = "uuid")
 *      这两个生成UUid
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractClass<T> implements Serializable {

    private String id;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    @Column(length = 50,name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private Date createTime;


    private Date updateTime;


    private Integer deletedState;

    private T object;

    @Transient
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

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
