package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_distribution
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundDistribution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   分配原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.reason
     *
     * @mbg.generated
     */
    private String reason;

    /**
     * Database Column Remarks:
     *   分配事件
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.distribution_time
     *
     * @mbg.generated
     */
    private Date distributionTime;

    /**
     * Database Column Remarks:
     *   分配金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.distribution_amount
     *
     * @mbg.generated
     */
    private String distributionAmount;

    /**
     * Database Column Remarks:
     *   分配次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.distribution_count
     *
     * @mbg.generated
     */
    private String distributionCount;

    /**
     * Database Column Remarks:
     *   基金Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.fundId
     *
     * @mbg.generated
     */
    private String fundid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.updatetime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_distribution.deletestatus
     *
     * @mbg.generated
     */
    private String deletestatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.id
     *
     * @return the value of fund_distribution.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.id
     *
     * @param id the value for fund_distribution.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.reason
     *
     * @return the value of fund_distribution.reason
     *
     * @mbg.generated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.reason
     *
     * @param reason the value for fund_distribution.reason
     *
     * @mbg.generated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.distribution_time
     *
     * @return the value of fund_distribution.distribution_time
     *
     * @mbg.generated
     */
    public Date getDistributionTime() {
        return distributionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.distribution_time
     *
     * @param distributionTime the value for fund_distribution.distribution_time
     *
     * @mbg.generated
     */
    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.distribution_amount
     *
     * @return the value of fund_distribution.distribution_amount
     *
     * @mbg.generated
     */
    public String getDistributionAmount() {
        return distributionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.distribution_amount
     *
     * @param distributionAmount the value for fund_distribution.distribution_amount
     *
     * @mbg.generated
     */
    public void setDistributionAmount(String distributionAmount) {
        this.distributionAmount = distributionAmount == null ? null : distributionAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.distribution_count
     *
     * @return the value of fund_distribution.distribution_count
     *
     * @mbg.generated
     */
    public String getDistributionCount() {
        return distributionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.distribution_count
     *
     * @param distributionCount the value for fund_distribution.distribution_count
     *
     * @mbg.generated
     */
    public void setDistributionCount(String distributionCount) {
        this.distributionCount = distributionCount == null ? null : distributionCount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.fundId
     *
     * @return the value of fund_distribution.fundId
     *
     * @mbg.generated
     */
    public String getFundid() {
        return fundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.fundId
     *
     * @param fundid the value for fund_distribution.fundId
     *
     * @mbg.generated
     */
    public void setFundid(String fundid) {
        this.fundid = fundid == null ? null : fundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.createtime
     *
     * @return the value of fund_distribution.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.createtime
     *
     * @param createtime the value for fund_distribution.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.updatetime
     *
     * @return the value of fund_distribution.updatetime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.updatetime
     *
     * @param updatetime the value for fund_distribution.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_distribution.deletestatus
     *
     * @return the value of fund_distribution.deletestatus
     *
     * @mbg.generated
     */
    public String getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_distribution.deletestatus
     *
     * @param deletestatus the value for fund_distribution.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(String deletestatus) {
        this.deletestatus = deletestatus == null ? null : deletestatus.trim();
    }
}