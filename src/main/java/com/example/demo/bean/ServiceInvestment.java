package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table service_investment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ServiceInvestment {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   服务人员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   服务类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.Service_type
     *
     * @mbg.generated
     */
    private String serviceType;

    /**
     * Database Column Remarks:
     *   服务内容记录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.service_record
     *
     * @mbg.generated
     */
    private String serviceRecord;

    /**
     * Database Column Remarks:
     *   访谈内容记录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.interview_record
     *
     * @mbg.generated
     */
    private String interviewRecord;

    /**
     * Database Column Remarks:
     *   关联项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   服务时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.sercer_time
     *
     * @mbg.generated
     */
    private Date sercerTime;

    /**
     * Database Column Remarks:
     *   创建时间（记录时间）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_investment.serverTop
     *
     * @mbg.generated
     */
    private String servertop;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.id
     *
     * @return the value of service_investment.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.id
     *
     * @param id the value for service_investment.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.user_id
     *
     * @return the value of service_investment.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.user_id
     *
     * @param userId the value for service_investment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.Service_type
     *
     * @return the value of service_investment.Service_type
     *
     * @mbg.generated
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.Service_type
     *
     * @param serviceType the value for service_investment.Service_type
     *
     * @mbg.generated
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.service_record
     *
     * @return the value of service_investment.service_record
     *
     * @mbg.generated
     */
    public String getServiceRecord() {
        return serviceRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.service_record
     *
     * @param serviceRecord the value for service_investment.service_record
     *
     * @mbg.generated
     */
    public void setServiceRecord(String serviceRecord) {
        this.serviceRecord = serviceRecord == null ? null : serviceRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.interview_record
     *
     * @return the value of service_investment.interview_record
     *
     * @mbg.generated
     */
    public String getInterviewRecord() {
        return interviewRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.interview_record
     *
     * @param interviewRecord the value for service_investment.interview_record
     *
     * @mbg.generated
     */
    public void setInterviewRecord(String interviewRecord) {
        this.interviewRecord = interviewRecord == null ? null : interviewRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.item_id
     *
     * @return the value of service_investment.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.item_id
     *
     * @param itemId the value for service_investment.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.sercer_time
     *
     * @return the value of service_investment.sercer_time
     *
     * @mbg.generated
     */
    public Date getSercerTime() {
        return sercerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.sercer_time
     *
     * @param sercerTime the value for service_investment.sercer_time
     *
     * @mbg.generated
     */
    public void setSercerTime(Date sercerTime) {
        this.sercerTime = sercerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.create_date
     *
     * @return the value of service_investment.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.create_date
     *
     * @param createDate the value for service_investment.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.update_date
     *
     * @return the value of service_investment.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.update_date
     *
     * @param updateDate the value for service_investment.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.deletestatus
     *
     * @return the value of service_investment.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.deletestatus
     *
     * @param deletestatus the value for service_investment.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_investment.serverTop
     *
     * @return the value of service_investment.serverTop
     *
     * @mbg.generated
     */
    public String getServertop() {
        return servertop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_investment.serverTop
     *
     * @param servertop the value for service_investment.serverTop
     *
     * @mbg.generated
     */
    public void setServertop(String servertop) {
        this.servertop = servertop == null ? null : servertop.trim();
    }
}