package com.example.demo.bean.publiclasss;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tony on 2017/10/10.
 * com.example.demo.bean.SpringBootMybatis
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserPublic extends PublicClass {

    private String userName;//用户姓名

    private int sex;//用户性别

    private int age;//用户年龄

    private Date birthday;//用户生日

    private String cellPhoneNumber;//用户手机号

    private String realName;//用户真实姓名

    private String idNumber;

    private String mailbox;

    @Column(name = "user_name" , columnDefinition = "VARCHAR(35) NULL COMMENT '用户姓名/登录账号'")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(length = 2 , columnDefinition = "tinyint(2) NULL COMMENT '用户性别，1：男；2：女'")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Column(length = 3 , columnDefinition = "tinyint(4) NULL COMMENT '用户年龄'")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Temporal(TemporalType.TIMESTAMP)//生成时间
    @Column(columnDefinition = "datetime NULL COMMENT '用户生日'")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Column(name = "cell_phone_number" , columnDefinition = "VARCHAR(11) NULL COMMENT '用户手机号'")
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }
    @Column(name = "real_name" , columnDefinition = "VARCHAR(35) NULL COMMENT '用户真实姓名'")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Column(name = "id_number" , columnDefinition = "VARCHAR(18) NULL COMMENT '用户身份证'")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Column(columnDefinition = "VARCHAR(30) NULL COMMENT '用户邮箱'")
    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }
}
