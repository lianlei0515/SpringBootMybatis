package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table quasiinvestment_fund_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class QuasiinvestmentFundRel {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   fund_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.fund_id
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   qv_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.qv_id
     *
     * @mbg.generated
     */
    private String qvId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quasiinvestment_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.id
     *
     * @return the value of quasiinvestment_fund_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.id
     *
     * @param id the value for quasiinvestment_fund_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.fund_id
     *
     * @return the value of quasiinvestment_fund_rel.fund_id
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.fund_id
     *
     * @param fundId the value for quasiinvestment_fund_rel.fund_id
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.qv_id
     *
     * @return the value of quasiinvestment_fund_rel.qv_id
     *
     * @mbg.generated
     */
    public String getQvId() {
        return qvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.qv_id
     *
     * @param qvId the value for quasiinvestment_fund_rel.qv_id
     *
     * @mbg.generated
     */
    public void setQvId(String qvId) {
        this.qvId = qvId == null ? null : qvId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.create_date
     *
     * @return the value of quasiinvestment_fund_rel.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.create_date
     *
     * @param createDate the value for quasiinvestment_fund_rel.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.update_date
     *
     * @return the value of quasiinvestment_fund_rel.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.update_date
     *
     * @param updateDate the value for quasiinvestment_fund_rel.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quasiinvestment_fund_rel.deteledstatus
     *
     * @return the value of quasiinvestment_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quasiinvestment_fund_rel.deteledstatus
     *
     * @param deteledstatus the value for quasiinvestment_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}