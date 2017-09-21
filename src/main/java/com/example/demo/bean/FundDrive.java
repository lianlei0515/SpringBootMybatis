package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_drive
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundDrive {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   带动资金投入时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.input_time
     *
     * @mbg.generated
     */
    private Date inputTime;

    /**
     * Database Column Remarks:
     *   带动基金名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.drive_name
     *
     * @mbg.generated
     */
    private String driveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.drive_allname
     *
     * @mbg.generated
     */
    private String driveAllname;

    /**
     * Database Column Remarks:
     *   负责人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.head
     *
     * @mbg.generated
     */
    private String head;

    /**
     * Database Column Remarks:
     *   规模
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.scale
     *
     * @mbg.generated
     */
    private String scale;

    /**
     * Database Column Remarks:
     *   管理类型：0 自有管理； 1 财务顾问； 2 共同管理
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.management_type
     *
     * @mbg.generated
     */
    private String managementType;

    /**
     * Database Column Remarks:
     *   基金类型：0 新三板基金； 1 成长基金； 2 专项基金； 3 并购基金； 4 产业基金； 5 房地产基金； 6 债权基金； 7 其它基金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.fund_type
     *
     * @mbg.generated
     */
    private String fundType;

    /**
     * Database Column Remarks:
     *   金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.money
     *
     * @mbg.generated
     */
    private String money;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   服务时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.sertime
     *
     * @mbg.generated
     */
    private Date sertime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_drive.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.id
     *
     * @return the value of fund_drive.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.id
     *
     * @param id the value for fund_drive.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.input_time
     *
     * @return the value of fund_drive.input_time
     *
     * @mbg.generated
     */
    public Date getInputTime() {
        return inputTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.input_time
     *
     * @param inputTime the value for fund_drive.input_time
     *
     * @mbg.generated
     */
    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.drive_name
     *
     * @return the value of fund_drive.drive_name
     *
     * @mbg.generated
     */
    public String getDriveName() {
        return driveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.drive_name
     *
     * @param driveName the value for fund_drive.drive_name
     *
     * @mbg.generated
     */
    public void setDriveName(String driveName) {
        this.driveName = driveName == null ? null : driveName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.drive_allname
     *
     * @return the value of fund_drive.drive_allname
     *
     * @mbg.generated
     */
    public String getDriveAllname() {
        return driveAllname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.drive_allname
     *
     * @param driveAllname the value for fund_drive.drive_allname
     *
     * @mbg.generated
     */
    public void setDriveAllname(String driveAllname) {
        this.driveAllname = driveAllname == null ? null : driveAllname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.head
     *
     * @return the value of fund_drive.head
     *
     * @mbg.generated
     */
    public String getHead() {
        return head;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.head
     *
     * @param head the value for fund_drive.head
     *
     * @mbg.generated
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.scale
     *
     * @return the value of fund_drive.scale
     *
     * @mbg.generated
     */
    public String getScale() {
        return scale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.scale
     *
     * @param scale the value for fund_drive.scale
     *
     * @mbg.generated
     */
    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.management_type
     *
     * @return the value of fund_drive.management_type
     *
     * @mbg.generated
     */
    public String getManagementType() {
        return managementType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.management_type
     *
     * @param managementType the value for fund_drive.management_type
     *
     * @mbg.generated
     */
    public void setManagementType(String managementType) {
        this.managementType = managementType == null ? null : managementType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.fund_type
     *
     * @return the value of fund_drive.fund_type
     *
     * @mbg.generated
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.fund_type
     *
     * @param fundType the value for fund_drive.fund_type
     *
     * @mbg.generated
     */
    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.money
     *
     * @return the value of fund_drive.money
     *
     * @mbg.generated
     */
    public String getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.money
     *
     * @param money the value for fund_drive.money
     *
     * @mbg.generated
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.remarks
     *
     * @return the value of fund_drive.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.remarks
     *
     * @param remarks the value for fund_drive.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.create_date
     *
     * @return the value of fund_drive.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.create_date
     *
     * @param createDate the value for fund_drive.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.create_user
     *
     * @return the value of fund_drive.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.create_user
     *
     * @param createUser the value for fund_drive.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.sertime
     *
     * @return the value of fund_drive.sertime
     *
     * @mbg.generated
     */
    public Date getSertime() {
        return sertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.sertime
     *
     * @param sertime the value for fund_drive.sertime
     *
     * @mbg.generated
     */
    public void setSertime(Date sertime) {
        this.sertime = sertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.update_date
     *
     * @return the value of fund_drive.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.update_date
     *
     * @param updateDate the value for fund_drive.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_drive.deteledstatus
     *
     * @return the value of fund_drive.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_drive.deteledstatus
     *
     * @param deteledstatus the value for fund_drive.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}