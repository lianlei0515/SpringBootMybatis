package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tz_user_schedule_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TzUserScheduleRel {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     * Database Column Remarks:
     *   日程表id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.schedule_id
     *
     * @mbg.generated
     */
    private String scheduleId;

    /**
     * Database Column Remarks:
     *   部门id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.departid
     *
     * @mbg.generated
     */
    private String departid;

    /**
     * Database Column Remarks:
     *   完成状态 0 未完成 1 完成 2 挂起
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.finish_status
     *
     * @mbg.generated
     */
    private Integer finishStatus;

    /**
     * Database Column Remarks:
     *   完成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.finish_time
     *
     * @mbg.generated
     */
    private Date finishTime;

    /**
     * Database Column Remarks:
     *   是否是发起人0-发起人，1-参与人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.Promoter
     *
     * @mbg.generated
     */
    private Integer promoter;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_schedule_rel.create_name
     *
     * @mbg.generated
     */
    private String createName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.id
     *
     * @return the value of tz_user_schedule_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.id
     *
     * @param id the value for tz_user_schedule_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.userid
     *
     * @return the value of tz_user_schedule_rel.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.userid
     *
     * @param userid the value for tz_user_schedule_rel.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.schedule_id
     *
     * @return the value of tz_user_schedule_rel.schedule_id
     *
     * @mbg.generated
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.schedule_id
     *
     * @param scheduleId the value for tz_user_schedule_rel.schedule_id
     *
     * @mbg.generated
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId == null ? null : scheduleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.departid
     *
     * @return the value of tz_user_schedule_rel.departid
     *
     * @mbg.generated
     */
    public String getDepartid() {
        return departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.departid
     *
     * @param departid the value for tz_user_schedule_rel.departid
     *
     * @mbg.generated
     */
    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.finish_status
     *
     * @return the value of tz_user_schedule_rel.finish_status
     *
     * @mbg.generated
     */
    public Integer getFinishStatus() {
        return finishStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.finish_status
     *
     * @param finishStatus the value for tz_user_schedule_rel.finish_status
     *
     * @mbg.generated
     */
    public void setFinishStatus(Integer finishStatus) {
        this.finishStatus = finishStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.finish_time
     *
     * @return the value of tz_user_schedule_rel.finish_time
     *
     * @mbg.generated
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.finish_time
     *
     * @param finishTime the value for tz_user_schedule_rel.finish_time
     *
     * @mbg.generated
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.Promoter
     *
     * @return the value of tz_user_schedule_rel.Promoter
     *
     * @mbg.generated
     */
    public Integer getPromoter() {
        return promoter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.Promoter
     *
     * @param promoter the value for tz_user_schedule_rel.Promoter
     *
     * @mbg.generated
     */
    public void setPromoter(Integer promoter) {
        this.promoter = promoter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.create_date
     *
     * @return the value of tz_user_schedule_rel.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.create_date
     *
     * @param createDate the value for tz_user_schedule_rel.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.update_date
     *
     * @return the value of tz_user_schedule_rel.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.update_date
     *
     * @param updateDate the value for tz_user_schedule_rel.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.deteledstatus
     *
     * @return the value of tz_user_schedule_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.deteledstatus
     *
     * @param deteledstatus the value for tz_user_schedule_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_schedule_rel.create_name
     *
     * @return the value of tz_user_schedule_rel.create_name
     *
     * @mbg.generated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_schedule_rel.create_name
     *
     * @param createName the value for tz_user_schedule_rel.create_name
     *
     * @mbg.generated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }
}