package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table debt_item_water
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DebtItemWater {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.ID
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   债权项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.DEBTITEMID
     *
     * @mbg.generated
     */
    private String debtitemid;

    /**
     * Database Column Remarks:
     *   关联基金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.FUND_ID
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   投资时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.INVEST_DATE
     *
     * @mbg.generated
     */
    private Date investDate;

    /**
     * Database Column Remarks:
     *   变动类型(现在用于投资事件)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.CHANGED_TYPE
     *
     * @mbg.generated
     */
    private String changedType;

    /**
     * Database Column Remarks:
     *   投资金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.AMOUNT
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   投资事件
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.INVEST_TYPE
     *
     * @mbg.generated
     */
    private String investType;

    /**
     * Database Column Remarks:
     *   本轮收益（债权）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.CURRENT_ROUND2
     *
     * @mbg.generated
     */
    private BigDecimal currentRound2;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.REMARKS
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.outStatus
     *
     * @mbg.generated
     */
    private String outstatus;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item_water.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.ID
     *
     * @return the value of debt_item_water.ID
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.ID
     *
     * @param id the value for debt_item_water.ID
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.DEBTITEMID
     *
     * @return the value of debt_item_water.DEBTITEMID
     *
     * @mbg.generated
     */
    public String getDebtitemid() {
        return debtitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.DEBTITEMID
     *
     * @param debtitemid the value for debt_item_water.DEBTITEMID
     *
     * @mbg.generated
     */
    public void setDebtitemid(String debtitemid) {
        this.debtitemid = debtitemid == null ? null : debtitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.FUND_ID
     *
     * @return the value of debt_item_water.FUND_ID
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.FUND_ID
     *
     * @param fundId the value for debt_item_water.FUND_ID
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.INVEST_DATE
     *
     * @return the value of debt_item_water.INVEST_DATE
     *
     * @mbg.generated
     */
    public Date getInvestDate() {
        return investDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.INVEST_DATE
     *
     * @param investDate the value for debt_item_water.INVEST_DATE
     *
     * @mbg.generated
     */
    public void setInvestDate(Date investDate) {
        this.investDate = investDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.CHANGED_TYPE
     *
     * @return the value of debt_item_water.CHANGED_TYPE
     *
     * @mbg.generated
     */
    public String getChangedType() {
        return changedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.CHANGED_TYPE
     *
     * @param changedType the value for debt_item_water.CHANGED_TYPE
     *
     * @mbg.generated
     */
    public void setChangedType(String changedType) {
        this.changedType = changedType == null ? null : changedType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.AMOUNT
     *
     * @return the value of debt_item_water.AMOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.AMOUNT
     *
     * @param amount the value for debt_item_water.AMOUNT
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.INVEST_TYPE
     *
     * @return the value of debt_item_water.INVEST_TYPE
     *
     * @mbg.generated
     */
    public String getInvestType() {
        return investType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.INVEST_TYPE
     *
     * @param investType the value for debt_item_water.INVEST_TYPE
     *
     * @mbg.generated
     */
    public void setInvestType(String investType) {
        this.investType = investType == null ? null : investType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.CURRENT_ROUND2
     *
     * @return the value of debt_item_water.CURRENT_ROUND2
     *
     * @mbg.generated
     */
    public BigDecimal getCurrentRound2() {
        return currentRound2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.CURRENT_ROUND2
     *
     * @param currentRound2 the value for debt_item_water.CURRENT_ROUND2
     *
     * @mbg.generated
     */
    public void setCurrentRound2(BigDecimal currentRound2) {
        this.currentRound2 = currentRound2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.REMARKS
     *
     * @return the value of debt_item_water.REMARKS
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.REMARKS
     *
     * @param remarks the value for debt_item_water.REMARKS
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.create_date
     *
     * @return the value of debt_item_water.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.create_date
     *
     * @param createDate the value for debt_item_water.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.update_date
     *
     * @return the value of debt_item_water.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.update_date
     *
     * @param updateDate the value for debt_item_water.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.outStatus
     *
     * @return the value of debt_item_water.outStatus
     *
     * @mbg.generated
     */
    public String getOutstatus() {
        return outstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.outStatus
     *
     * @param outstatus the value for debt_item_water.outStatus
     *
     * @mbg.generated
     */
    public void setOutstatus(String outstatus) {
        this.outstatus = outstatus == null ? null : outstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item_water.deteledstatus
     *
     * @return the value of debt_item_water.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item_water.deteledstatus
     *
     * @param deteledstatus the value for debt_item_water.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}