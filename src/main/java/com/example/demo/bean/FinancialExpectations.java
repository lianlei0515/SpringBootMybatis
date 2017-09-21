package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table financial_expectations
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FinancialExpectations {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   关联项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   预期时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     * Database Column Remarks:
     *   收入（万元)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.income
     *
     * @mbg.generated
     */
    private BigDecimal income;

    /**
     * Database Column Remarks:
     *   年份
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.year
     *
     * @mbg.generated
     */
    private String year;

    /**
     * Database Column Remarks:
     *   收入完成度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.Income_completion
     *
     * @mbg.generated
     */
    private BigDecimal incomeCompletion;

    /**
     * Database Column Remarks:
     *   利润（万元)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.profit
     *
     * @mbg.generated
     */
    private BigDecimal profit;

    /**
     * Database Column Remarks:
     *   利润完成度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.Profit_completion
     *
     * @mbg.generated
     */
    private BigDecimal profitCompletion;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_expectations.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.id
     *
     * @return the value of financial_expectations.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.id
     *
     * @param id the value for financial_expectations.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.item_id
     *
     * @return the value of financial_expectations.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.item_id
     *
     * @param itemId the value for financial_expectations.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.date
     *
     * @return the value of financial_expectations.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.date
     *
     * @param date the value for financial_expectations.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.income
     *
     * @return the value of financial_expectations.income
     *
     * @mbg.generated
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.income
     *
     * @param income the value for financial_expectations.income
     *
     * @mbg.generated
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.year
     *
     * @return the value of financial_expectations.year
     *
     * @mbg.generated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.year
     *
     * @param year the value for financial_expectations.year
     *
     * @mbg.generated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.Income_completion
     *
     * @return the value of financial_expectations.Income_completion
     *
     * @mbg.generated
     */
    public BigDecimal getIncomeCompletion() {
        return incomeCompletion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.Income_completion
     *
     * @param incomeCompletion the value for financial_expectations.Income_completion
     *
     * @mbg.generated
     */
    public void setIncomeCompletion(BigDecimal incomeCompletion) {
        this.incomeCompletion = incomeCompletion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.profit
     *
     * @return the value of financial_expectations.profit
     *
     * @mbg.generated
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.profit
     *
     * @param profit the value for financial_expectations.profit
     *
     * @mbg.generated
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.Profit_completion
     *
     * @return the value of financial_expectations.Profit_completion
     *
     * @mbg.generated
     */
    public BigDecimal getProfitCompletion() {
        return profitCompletion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.Profit_completion
     *
     * @param profitCompletion the value for financial_expectations.Profit_completion
     *
     * @mbg.generated
     */
    public void setProfitCompletion(BigDecimal profitCompletion) {
        this.profitCompletion = profitCompletion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.create_date
     *
     * @return the value of financial_expectations.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.create_date
     *
     * @param createDate the value for financial_expectations.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.update_date
     *
     * @return the value of financial_expectations.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.update_date
     *
     * @param updateDate the value for financial_expectations.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_expectations.deletestatus
     *
     * @return the value of financial_expectations.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_expectations.deletestatus
     *
     * @param deletestatus the value for financial_expectations.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }
}