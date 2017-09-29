package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table item_revenue
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ItemRevenue {
    /**
     * Database Column Remarks:
     *   拟投资项目 立项 财务数据表
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   日期标志 如：2016 或 2017
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.date_flag
     *
     * @mbg.generated
     */
    private String dateFlag;

    /**
     * Database Column Remarks:
     *   收入       单位：万元
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.revenue
     *
     * @mbg.generated
     */
    private Double revenue;

    /**
     * Database Column Remarks:
     *   利润       单位：万元
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.profit
     *
     * @mbg.generated
     */
    private Double profit;

    /**
     * Database Column Remarks:
     *   资产总额       单位：万元
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.total_assets
     *
     * @mbg.generated
     */
    private Double totalAssets;

    /**
     * Database Column Remarks:
     *   股东权益合计       单位：万元
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.shareholder_total_equity
     *
     * @mbg.generated
     */
    private Double shareholderTotalEquity;

    /**
     * Database Column Remarks:
     *   经营活动产生的现金流量净额       单位：万元
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.cash_flow
     *
     * @mbg.generated
     */
    private Double cashFlow;

    /**
     * Database Column Remarks:
     *   关联项目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   本记录创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   本记录创建人员 即：当前在线人员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   1:正常 0:删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.deletedstatus
     *
     * @mbg.generated
     */
    private String deletedstatus;

    /**
     * Database Column Remarks:
     *   批次：分组批次 一次性提交的 批次一样
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_revenue.group_batch
     *
     * @mbg.generated
     */
    private String groupBatch;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.id
     *
     * @return the value of item_revenue.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.id
     *
     * @param id the value for item_revenue.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.date_flag
     *
     * @return the value of item_revenue.date_flag
     *
     * @mbg.generated
     */
    public String getDateFlag() {
        return dateFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.date_flag
     *
     * @param dateFlag the value for item_revenue.date_flag
     *
     * @mbg.generated
     */
    public void setDateFlag(String dateFlag) {
        this.dateFlag = dateFlag == null ? null : dateFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.revenue
     *
     * @return the value of item_revenue.revenue
     *
     * @mbg.generated
     */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.revenue
     *
     * @param revenue the value for item_revenue.revenue
     *
     * @mbg.generated
     */
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.profit
     *
     * @return the value of item_revenue.profit
     *
     * @mbg.generated
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.profit
     *
     * @param profit the value for item_revenue.profit
     *
     * @mbg.generated
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.total_assets
     *
     * @return the value of item_revenue.total_assets
     *
     * @mbg.generated
     */
    public Double getTotalAssets() {
        return totalAssets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.total_assets
     *
     * @param totalAssets the value for item_revenue.total_assets
     *
     * @mbg.generated
     */
    public void setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.shareholder_total_equity
     *
     * @return the value of item_revenue.shareholder_total_equity
     *
     * @mbg.generated
     */
    public Double getShareholderTotalEquity() {
        return shareholderTotalEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.shareholder_total_equity
     *
     * @param shareholderTotalEquity the value for item_revenue.shareholder_total_equity
     *
     * @mbg.generated
     */
    public void setShareholderTotalEquity(Double shareholderTotalEquity) {
        this.shareholderTotalEquity = shareholderTotalEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.cash_flow
     *
     * @return the value of item_revenue.cash_flow
     *
     * @mbg.generated
     */
    public Double getCashFlow() {
        return cashFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.cash_flow
     *
     * @param cashFlow the value for item_revenue.cash_flow
     *
     * @mbg.generated
     */
    public void setCashFlow(Double cashFlow) {
        this.cashFlow = cashFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.item_id
     *
     * @return the value of item_revenue.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.item_id
     *
     * @param itemId the value for item_revenue.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.create_date
     *
     * @return the value of item_revenue.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.create_date
     *
     * @param createDate the value for item_revenue.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.create_user
     *
     * @return the value of item_revenue.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.create_user
     *
     * @param createUser the value for item_revenue.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.deletedstatus
     *
     * @return the value of item_revenue.deletedstatus
     *
     * @mbg.generated
     */
    public String getDeletedstatus() {
        return deletedstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.deletedstatus
     *
     * @param deletedstatus the value for item_revenue.deletedstatus
     *
     * @mbg.generated
     */
    public void setDeletedstatus(String deletedstatus) {
        this.deletedstatus = deletedstatus == null ? null : deletedstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_revenue.group_batch
     *
     * @return the value of item_revenue.group_batch
     *
     * @mbg.generated
     */
    public String getGroupBatch() {
        return groupBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_revenue.group_batch
     *
     * @param groupBatch the value for item_revenue.group_batch
     *
     * @mbg.generated
     */
    public void setGroupBatch(String groupBatch) {
        this.groupBatch = groupBatch == null ? null : groupBatch.trim();
    }
}