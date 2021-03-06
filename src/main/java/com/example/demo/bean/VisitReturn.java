package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table visit_return
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class VisitReturn {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   记录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.Record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * Database Column Remarks:
     *   回访时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.R_Visit_time
     *
     * @mbg.generated
     */
    private Date rVisitTime;

    /**
     * Database Column Remarks:
     *   回访人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.R_Visit_people
     *
     * @mbg.generated
     */
    private String rVisitPeople;

    /**
     * Database Column Remarks:
     *   文档
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.File
     *
     * @mbg.generated
     */
    private String file;

    /**
     * Database Column Remarks:
     *   客户关联id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.guest_id
     *
     * @mbg.generated
     */
    private String guestId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志，0已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_return.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.id
     *
     * @return the value of visit_return.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.id
     *
     * @param id the value for visit_return.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.Record_time
     *
     * @return the value of visit_return.Record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.Record_time
     *
     * @param recordTime the value for visit_return.Record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.R_Visit_time
     *
     * @return the value of visit_return.R_Visit_time
     *
     * @mbg.generated
     */
    public Date getrVisitTime() {
        return rVisitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.R_Visit_time
     *
     * @param rVisitTime the value for visit_return.R_Visit_time
     *
     * @mbg.generated
     */
    public void setrVisitTime(Date rVisitTime) {
        this.rVisitTime = rVisitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.R_Visit_people
     *
     * @return the value of visit_return.R_Visit_people
     *
     * @mbg.generated
     */
    public String getrVisitPeople() {
        return rVisitPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.R_Visit_people
     *
     * @param rVisitPeople the value for visit_return.R_Visit_people
     *
     * @mbg.generated
     */
    public void setrVisitPeople(String rVisitPeople) {
        this.rVisitPeople = rVisitPeople == null ? null : rVisitPeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.File
     *
     * @return the value of visit_return.File
     *
     * @mbg.generated
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.File
     *
     * @param file the value for visit_return.File
     *
     * @mbg.generated
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.guest_id
     *
     * @return the value of visit_return.guest_id
     *
     * @mbg.generated
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.guest_id
     *
     * @param guestId the value for visit_return.guest_id
     *
     * @mbg.generated
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId == null ? null : guestId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.create_date
     *
     * @return the value of visit_return.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.create_date
     *
     * @param createDate the value for visit_return.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.update_date
     *
     * @return the value of visit_return.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.update_date
     *
     * @param updateDate the value for visit_return.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_return.deteledstatus
     *
     * @return the value of visit_return.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_return.deteledstatus
     *
     * @param deteledstatus the value for visit_return.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}