package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table debt_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DebtItem {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   是否有股权投资  0没有股权投资  1有股权投资
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Containing_equity
     *
     * @mbg.generated
     */
    private Integer containingEquity;

    /**
     * Database Column Remarks:
     *   违约状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Default_state
     *
     * @mbg.generated
     */
    private String defaultState;

    /**
     * Database Column Remarks:
     *   违约原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.default_reason
     *
     * @mbg.generated
     */
    private String defaultReason;

    /**
     * Database Column Remarks:
     *   打款时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Playing_time
     *
     * @mbg.generated
     */
    private Date playingTime;

    /**
     * Database Column Remarks:
     *   投资方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Investment_way
     *
     * @mbg.generated
     */
    private String investmentWay;

    /**
     * Database Column Remarks:
     *   投资主体
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Investment_subject
     *
     * @mbg.generated
     */
    private String investmentSubject;

    /**
     * Database Column Remarks:
     *   借款人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Borrower
     *
     * @mbg.generated
     */
    private String borrower;

    /**
     * Database Column Remarks:
     *   借款金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Loan_amount
     *
     * @mbg.generated
     */
    private BigDecimal loanAmount;

    /**
     * Database Column Remarks:
     *   借款期限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.loan_Term
     *
     * @mbg.generated
     */
    private Date loanTerm;

    /**
     * Database Column Remarks:
     *   利率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.interest_rate
     *
     * @mbg.generated
     */
    private Double interestRate;

    /**
     * Database Column Remarks:
     *   增信方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.increase_trust
     *
     * @mbg.generated
     */
    private String increaseTrust;

    /**
     * Database Column Remarks:
     *   利息支付方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Interest_method
     *
     * @mbg.generated
     */
    private String interestMethod;

    /**
     * Database Column Remarks:
     *   是否债转股
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.isdebt_equity
     *
     * @mbg.generated
     */
    private Integer isdebtEquity;

    /**
     * Database Column Remarks:
     *   债转股条件
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.equity_conditions
     *
     * @mbg.generated
     */
    private String equityConditions;

    /**
     * Database Column Remarks:
     *   其他约定
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.Other_conventions
     *
     * @mbg.generated
     */
    private String otherConventions;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.deteled_status
     *
     * @mbg.generated
     */
    private Integer deteledStatus;

    /**
     * Database Column Remarks:
     *   关联拟投资项目
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column debt_item.einvest_id
     *
     * @mbg.generated
     */
    private String einvestId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.id
     *
     * @return the value of debt_item.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.id
     *
     * @param id the value for debt_item.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.item_id
     *
     * @return the value of debt_item.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.item_id
     *
     * @param itemId the value for debt_item.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Containing_equity
     *
     * @return the value of debt_item.Containing_equity
     *
     * @mbg.generated
     */
    public Integer getContainingEquity() {
        return containingEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Containing_equity
     *
     * @param containingEquity the value for debt_item.Containing_equity
     *
     * @mbg.generated
     */
    public void setContainingEquity(Integer containingEquity) {
        this.containingEquity = containingEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Default_state
     *
     * @return the value of debt_item.Default_state
     *
     * @mbg.generated
     */
    public String getDefaultState() {
        return defaultState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Default_state
     *
     * @param defaultState the value for debt_item.Default_state
     *
     * @mbg.generated
     */
    public void setDefaultState(String defaultState) {
        this.defaultState = defaultState == null ? null : defaultState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.default_reason
     *
     * @return the value of debt_item.default_reason
     *
     * @mbg.generated
     */
    public String getDefaultReason() {
        return defaultReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.default_reason
     *
     * @param defaultReason the value for debt_item.default_reason
     *
     * @mbg.generated
     */
    public void setDefaultReason(String defaultReason) {
        this.defaultReason = defaultReason == null ? null : defaultReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Playing_time
     *
     * @return the value of debt_item.Playing_time
     *
     * @mbg.generated
     */
    public Date getPlayingTime() {
        return playingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Playing_time
     *
     * @param playingTime the value for debt_item.Playing_time
     *
     * @mbg.generated
     */
    public void setPlayingTime(Date playingTime) {
        this.playingTime = playingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Investment_way
     *
     * @return the value of debt_item.Investment_way
     *
     * @mbg.generated
     */
    public String getInvestmentWay() {
        return investmentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Investment_way
     *
     * @param investmentWay the value for debt_item.Investment_way
     *
     * @mbg.generated
     */
    public void setInvestmentWay(String investmentWay) {
        this.investmentWay = investmentWay == null ? null : investmentWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Investment_subject
     *
     * @return the value of debt_item.Investment_subject
     *
     * @mbg.generated
     */
    public String getInvestmentSubject() {
        return investmentSubject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Investment_subject
     *
     * @param investmentSubject the value for debt_item.Investment_subject
     *
     * @mbg.generated
     */
    public void setInvestmentSubject(String investmentSubject) {
        this.investmentSubject = investmentSubject == null ? null : investmentSubject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Borrower
     *
     * @return the value of debt_item.Borrower
     *
     * @mbg.generated
     */
    public String getBorrower() {
        return borrower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Borrower
     *
     * @param borrower the value for debt_item.Borrower
     *
     * @mbg.generated
     */
    public void setBorrower(String borrower) {
        this.borrower = borrower == null ? null : borrower.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Loan_amount
     *
     * @return the value of debt_item.Loan_amount
     *
     * @mbg.generated
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Loan_amount
     *
     * @param loanAmount the value for debt_item.Loan_amount
     *
     * @mbg.generated
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.loan_Term
     *
     * @return the value of debt_item.loan_Term
     *
     * @mbg.generated
     */
    public Date getLoanTerm() {
        return loanTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.loan_Term
     *
     * @param loanTerm the value for debt_item.loan_Term
     *
     * @mbg.generated
     */
    public void setLoanTerm(Date loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.interest_rate
     *
     * @return the value of debt_item.interest_rate
     *
     * @mbg.generated
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.interest_rate
     *
     * @param interestRate the value for debt_item.interest_rate
     *
     * @mbg.generated
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.increase_trust
     *
     * @return the value of debt_item.increase_trust
     *
     * @mbg.generated
     */
    public String getIncreaseTrust() {
        return increaseTrust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.increase_trust
     *
     * @param increaseTrust the value for debt_item.increase_trust
     *
     * @mbg.generated
     */
    public void setIncreaseTrust(String increaseTrust) {
        this.increaseTrust = increaseTrust == null ? null : increaseTrust.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Interest_method
     *
     * @return the value of debt_item.Interest_method
     *
     * @mbg.generated
     */
    public String getInterestMethod() {
        return interestMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Interest_method
     *
     * @param interestMethod the value for debt_item.Interest_method
     *
     * @mbg.generated
     */
    public void setInterestMethod(String interestMethod) {
        this.interestMethod = interestMethod == null ? null : interestMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.isdebt_equity
     *
     * @return the value of debt_item.isdebt_equity
     *
     * @mbg.generated
     */
    public Integer getIsdebtEquity() {
        return isdebtEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.isdebt_equity
     *
     * @param isdebtEquity the value for debt_item.isdebt_equity
     *
     * @mbg.generated
     */
    public void setIsdebtEquity(Integer isdebtEquity) {
        this.isdebtEquity = isdebtEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.equity_conditions
     *
     * @return the value of debt_item.equity_conditions
     *
     * @mbg.generated
     */
    public String getEquityConditions() {
        return equityConditions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.equity_conditions
     *
     * @param equityConditions the value for debt_item.equity_conditions
     *
     * @mbg.generated
     */
    public void setEquityConditions(String equityConditions) {
        this.equityConditions = equityConditions == null ? null : equityConditions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.Other_conventions
     *
     * @return the value of debt_item.Other_conventions
     *
     * @mbg.generated
     */
    public String getOtherConventions() {
        return otherConventions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.Other_conventions
     *
     * @param otherConventions the value for debt_item.Other_conventions
     *
     * @mbg.generated
     */
    public void setOtherConventions(String otherConventions) {
        this.otherConventions = otherConventions == null ? null : otherConventions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.create_date
     *
     * @return the value of debt_item.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.create_date
     *
     * @param createDate the value for debt_item.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.create_user
     *
     * @return the value of debt_item.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.create_user
     *
     * @param createUser the value for debt_item.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.update_date
     *
     * @return the value of debt_item.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.update_date
     *
     * @param updateDate the value for debt_item.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.deteled_status
     *
     * @return the value of debt_item.deteled_status
     *
     * @mbg.generated
     */
    public Integer getDeteledStatus() {
        return deteledStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.deteled_status
     *
     * @param deteledStatus the value for debt_item.deteled_status
     *
     * @mbg.generated
     */
    public void setDeteledStatus(Integer deteledStatus) {
        this.deteledStatus = deteledStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column debt_item.einvest_id
     *
     * @return the value of debt_item.einvest_id
     *
     * @mbg.generated
     */
    public String getEinvestId() {
        return einvestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column debt_item.einvest_id
     *
     * @param einvestId the value for debt_item.einvest_id
     *
     * @mbg.generated
     */
    public void setEinvestId(String einvestId) {
        this.einvestId = einvestId == null ? null : einvestId.trim();
    }
}