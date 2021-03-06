package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table committee_fund
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CommitteeFund {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.fundid
     *
     * @mbg.generated
     */
    private String fundid;

    /**
     * Database Column Remarks:
     *   决策委员会id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.Committee_id
     *
     * @mbg.generated
     */
    private String committeeId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column committee_fund.deteled_status
     *
     * @mbg.generated
     */
    private Integer deteledStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.id
     *
     * @return the value of committee_fund.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.id
     *
     * @param id the value for committee_fund.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.fundid
     *
     * @return the value of committee_fund.fundid
     *
     * @mbg.generated
     */
    public String getFundid() {
        return fundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.fundid
     *
     * @param fundid the value for committee_fund.fundid
     *
     * @mbg.generated
     */
    public void setFundid(String fundid) {
        this.fundid = fundid == null ? null : fundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.Committee_id
     *
     * @return the value of committee_fund.Committee_id
     *
     * @mbg.generated
     */
    public String getCommitteeId() {
        return committeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.Committee_id
     *
     * @param committeeId the value for committee_fund.Committee_id
     *
     * @mbg.generated
     */
    public void setCommitteeId(String committeeId) {
        this.committeeId = committeeId == null ? null : committeeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.create_date
     *
     * @return the value of committee_fund.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.create_date
     *
     * @param createDate the value for committee_fund.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.update_date
     *
     * @return the value of committee_fund.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.update_date
     *
     * @param updateDate the value for committee_fund.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column committee_fund.deteled_status
     *
     * @return the value of committee_fund.deteled_status
     *
     * @mbg.generated
     */
    public Integer getDeteledStatus() {
        return deteledStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column committee_fund.deteled_status
     *
     * @param deteledStatus the value for committee_fund.deteled_status
     *
     * @mbg.generated
     */
    public void setDeteledStatus(Integer deteledStatus) {
        this.deteledStatus = deteledStatus;
    }
}