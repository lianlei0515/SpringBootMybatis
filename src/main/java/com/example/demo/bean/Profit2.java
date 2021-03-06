package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table profit2
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Profit2 {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   管理项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.manage_item
     *
     * @mbg.generated
     */
    private String manageItem;

    /**
     * Database Column Remarks:
     *   投资净收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Net_investment_income
     *
     * @mbg.generated
     */
    private BigDecimal netInvestmentIncome;

    /**
     * Database Column Remarks:
     *   其中：对联营企业和合营企业的投资收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.investment_income
     *
     * @mbg.generated
     */
    private BigDecimal investmentIncome;

    /**
     * Database Column Remarks:
     *   汇兑净收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.exchange_net_income
     *
     * @mbg.generated
     */
    private BigDecimal exchangeNetIncome;

    /**
     * Database Column Remarks:
     *   营业利润差额(特殊报表科目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Operating_profit_margin
     *
     * @mbg.generated
     */
    private BigDecimal operatingProfitMargin;

    /**
     * Database Column Remarks:
     *   营业利润差额(合计平衡项目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.profit_margin_total
     *
     * @mbg.generated
     */
    private BigDecimal profitMarginTotal;

    /**
     * Database Column Remarks:
     *   减：少数股东损益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Minority_nterest
     *
     * @mbg.generated
     */
    private BigDecimal minorityNterest;

    /**
     * Database Column Remarks:
     *   其中：非流动资产处置净损失
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.net_loss
     *
     * @mbg.generated
     */
    private BigDecimal netLoss;

    /**
     * Database Column Remarks:
     *   加：营业外收入
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.nonbusiness_income
     *
     * @mbg.generated
     */
    private BigDecimal nonbusinessIncome;

    /**
     * Database Column Remarks:
     *   减：营业外支出
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.on_business_expenditure
     *
     * @mbg.generated
     */
    private BigDecimal onBusinessExpenditure;

    /**
     * Database Column Remarks:
     *   加：利润总额差额(特殊报表科目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Total_profit_margin
     *
     * @mbg.generated
     */
    private BigDecimal totalProfitMargin;

    /**
     * Database Column Remarks:
     *   利润总额差额(合计平衡项目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Total_profit_margin_total
     *
     * @mbg.generated
     */
    private BigDecimal totalProfitMarginTotal;

    /**
     * Database Column Remarks:
     *   利润总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.total_profit
     *
     * @mbg.generated
     */
    private BigDecimal totalProfit;

    /**
     * Database Column Remarks:
     *   减：所得税
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.income_tax
     *
     * @mbg.generated
     */
    private BigDecimal incomeTax;

    /**
     * Database Column Remarks:
     *   加：未确认的投资损失
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.unrecognized_losses
     *
     * @mbg.generated
     */
    private BigDecimal unrecognizedLosses;

    /**
     * Database Column Remarks:
     *   加：净利润差额(特殊报表科目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Net_profit_margin
     *
     * @mbg.generated
     */
    private BigDecimal netProfitMargin;

    /**
     * Database Column Remarks:
     *   净利润差额(合计平衡项目)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Net_profit_margin_total
     *
     * @mbg.generated
     */
    private BigDecimal netProfitMarginTotal;

    /**
     * Database Column Remarks:
     *   净利润
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.net_margin
     *
     * @mbg.generated
     */
    private BigDecimal netMargin;

    /**
     * Database Column Remarks:
     *   营业利润
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.operating_profit
     *
     * @mbg.generated
     */
    private BigDecimal operatingProfit;

    /**
     * Database Column Remarks:
     *   归属于母公司所有者的净利润
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Owners_net_profit
     *
     * @mbg.generated
     */
    private BigDecimal ownersNetProfit;

    /**
     * Database Column Remarks:
     *   加 其他综合收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Other_comprehensive_income
     *
     * @mbg.generated
     */
    private BigDecimal otherComprehensiveIncome;

    /**
     * Database Column Remarks:
     *   综合收益总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Total_comprehensive_income
     *
     * @mbg.generated
     */
    private BigDecimal totalComprehensiveIncome;

    /**
     * Database Column Remarks:
     *   减：归属于少数股东的综合收益总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.minority_shareholders_income
     *
     * @mbg.generated
     */
    private BigDecimal minorityShareholdersIncome;

    /**
     * Database Column Remarks:
     *   归属于母公司普通股东综合收益总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.parent_company_income
     *
     * @mbg.generated
     */
    private BigDecimal parentCompanyIncome;

    /**
     * Database Column Remarks:
     *   每股收益：
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.earnings_per_share
     *
     * @mbg.generated
     */
    private BigDecimal earningsPerShare;

    /**
     * Database Column Remarks:
     *   基本每股收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.Basicearnings_per_share
     *
     * @mbg.generated
     */
    private BigDecimal basicearningsPerShare;

    /**
     * Database Column Remarks:
     *   稀释每股收益
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.diluted_earnings_per_share
     *
     * @mbg.generated
     */
    private BigDecimal dilutedEarningsPerShare;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit2.profit_id
     *
     * @mbg.generated
     */
    private String profitId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.id
     *
     * @return the value of profit2.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.id
     *
     * @param id the value for profit2.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.manage_item
     *
     * @return the value of profit2.manage_item
     *
     * @mbg.generated
     */
    public String getManageItem() {
        return manageItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.manage_item
     *
     * @param manageItem the value for profit2.manage_item
     *
     * @mbg.generated
     */
    public void setManageItem(String manageItem) {
        this.manageItem = manageItem == null ? null : manageItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Net_investment_income
     *
     * @return the value of profit2.Net_investment_income
     *
     * @mbg.generated
     */
    public BigDecimal getNetInvestmentIncome() {
        return netInvestmentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Net_investment_income
     *
     * @param netInvestmentIncome the value for profit2.Net_investment_income
     *
     * @mbg.generated
     */
    public void setNetInvestmentIncome(BigDecimal netInvestmentIncome) {
        this.netInvestmentIncome = netInvestmentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.investment_income
     *
     * @return the value of profit2.investment_income
     *
     * @mbg.generated
     */
    public BigDecimal getInvestmentIncome() {
        return investmentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.investment_income
     *
     * @param investmentIncome the value for profit2.investment_income
     *
     * @mbg.generated
     */
    public void setInvestmentIncome(BigDecimal investmentIncome) {
        this.investmentIncome = investmentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.exchange_net_income
     *
     * @return the value of profit2.exchange_net_income
     *
     * @mbg.generated
     */
    public BigDecimal getExchangeNetIncome() {
        return exchangeNetIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.exchange_net_income
     *
     * @param exchangeNetIncome the value for profit2.exchange_net_income
     *
     * @mbg.generated
     */
    public void setExchangeNetIncome(BigDecimal exchangeNetIncome) {
        this.exchangeNetIncome = exchangeNetIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Operating_profit_margin
     *
     * @return the value of profit2.Operating_profit_margin
     *
     * @mbg.generated
     */
    public BigDecimal getOperatingProfitMargin() {
        return operatingProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Operating_profit_margin
     *
     * @param operatingProfitMargin the value for profit2.Operating_profit_margin
     *
     * @mbg.generated
     */
    public void setOperatingProfitMargin(BigDecimal operatingProfitMargin) {
        this.operatingProfitMargin = operatingProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.profit_margin_total
     *
     * @return the value of profit2.profit_margin_total
     *
     * @mbg.generated
     */
    public BigDecimal getProfitMarginTotal() {
        return profitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.profit_margin_total
     *
     * @param profitMarginTotal the value for profit2.profit_margin_total
     *
     * @mbg.generated
     */
    public void setProfitMarginTotal(BigDecimal profitMarginTotal) {
        this.profitMarginTotal = profitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Minority_nterest
     *
     * @return the value of profit2.Minority_nterest
     *
     * @mbg.generated
     */
    public BigDecimal getMinorityNterest() {
        return minorityNterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Minority_nterest
     *
     * @param minorityNterest the value for profit2.Minority_nterest
     *
     * @mbg.generated
     */
    public void setMinorityNterest(BigDecimal minorityNterest) {
        this.minorityNterest = minorityNterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.net_loss
     *
     * @return the value of profit2.net_loss
     *
     * @mbg.generated
     */
    public BigDecimal getNetLoss() {
        return netLoss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.net_loss
     *
     * @param netLoss the value for profit2.net_loss
     *
     * @mbg.generated
     */
    public void setNetLoss(BigDecimal netLoss) {
        this.netLoss = netLoss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.nonbusiness_income
     *
     * @return the value of profit2.nonbusiness_income
     *
     * @mbg.generated
     */
    public BigDecimal getNonbusinessIncome() {
        return nonbusinessIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.nonbusiness_income
     *
     * @param nonbusinessIncome the value for profit2.nonbusiness_income
     *
     * @mbg.generated
     */
    public void setNonbusinessIncome(BigDecimal nonbusinessIncome) {
        this.nonbusinessIncome = nonbusinessIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.on_business_expenditure
     *
     * @return the value of profit2.on_business_expenditure
     *
     * @mbg.generated
     */
    public BigDecimal getOnBusinessExpenditure() {
        return onBusinessExpenditure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.on_business_expenditure
     *
     * @param onBusinessExpenditure the value for profit2.on_business_expenditure
     *
     * @mbg.generated
     */
    public void setOnBusinessExpenditure(BigDecimal onBusinessExpenditure) {
        this.onBusinessExpenditure = onBusinessExpenditure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Total_profit_margin
     *
     * @return the value of profit2.Total_profit_margin
     *
     * @mbg.generated
     */
    public BigDecimal getTotalProfitMargin() {
        return totalProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Total_profit_margin
     *
     * @param totalProfitMargin the value for profit2.Total_profit_margin
     *
     * @mbg.generated
     */
    public void setTotalProfitMargin(BigDecimal totalProfitMargin) {
        this.totalProfitMargin = totalProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Total_profit_margin_total
     *
     * @return the value of profit2.Total_profit_margin_total
     *
     * @mbg.generated
     */
    public BigDecimal getTotalProfitMarginTotal() {
        return totalProfitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Total_profit_margin_total
     *
     * @param totalProfitMarginTotal the value for profit2.Total_profit_margin_total
     *
     * @mbg.generated
     */
    public void setTotalProfitMarginTotal(BigDecimal totalProfitMarginTotal) {
        this.totalProfitMarginTotal = totalProfitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.total_profit
     *
     * @return the value of profit2.total_profit
     *
     * @mbg.generated
     */
    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.total_profit
     *
     * @param totalProfit the value for profit2.total_profit
     *
     * @mbg.generated
     */
    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.income_tax
     *
     * @return the value of profit2.income_tax
     *
     * @mbg.generated
     */
    public BigDecimal getIncomeTax() {
        return incomeTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.income_tax
     *
     * @param incomeTax the value for profit2.income_tax
     *
     * @mbg.generated
     */
    public void setIncomeTax(BigDecimal incomeTax) {
        this.incomeTax = incomeTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.unrecognized_losses
     *
     * @return the value of profit2.unrecognized_losses
     *
     * @mbg.generated
     */
    public BigDecimal getUnrecognizedLosses() {
        return unrecognizedLosses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.unrecognized_losses
     *
     * @param unrecognizedLosses the value for profit2.unrecognized_losses
     *
     * @mbg.generated
     */
    public void setUnrecognizedLosses(BigDecimal unrecognizedLosses) {
        this.unrecognizedLosses = unrecognizedLosses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Net_profit_margin
     *
     * @return the value of profit2.Net_profit_margin
     *
     * @mbg.generated
     */
    public BigDecimal getNetProfitMargin() {
        return netProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Net_profit_margin
     *
     * @param netProfitMargin the value for profit2.Net_profit_margin
     *
     * @mbg.generated
     */
    public void setNetProfitMargin(BigDecimal netProfitMargin) {
        this.netProfitMargin = netProfitMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Net_profit_margin_total
     *
     * @return the value of profit2.Net_profit_margin_total
     *
     * @mbg.generated
     */
    public BigDecimal getNetProfitMarginTotal() {
        return netProfitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Net_profit_margin_total
     *
     * @param netProfitMarginTotal the value for profit2.Net_profit_margin_total
     *
     * @mbg.generated
     */
    public void setNetProfitMarginTotal(BigDecimal netProfitMarginTotal) {
        this.netProfitMarginTotal = netProfitMarginTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.net_margin
     *
     * @return the value of profit2.net_margin
     *
     * @mbg.generated
     */
    public BigDecimal getNetMargin() {
        return netMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.net_margin
     *
     * @param netMargin the value for profit2.net_margin
     *
     * @mbg.generated
     */
    public void setNetMargin(BigDecimal netMargin) {
        this.netMargin = netMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.operating_profit
     *
     * @return the value of profit2.operating_profit
     *
     * @mbg.generated
     */
    public BigDecimal getOperatingProfit() {
        return operatingProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.operating_profit
     *
     * @param operatingProfit the value for profit2.operating_profit
     *
     * @mbg.generated
     */
    public void setOperatingProfit(BigDecimal operatingProfit) {
        this.operatingProfit = operatingProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Owners_net_profit
     *
     * @return the value of profit2.Owners_net_profit
     *
     * @mbg.generated
     */
    public BigDecimal getOwnersNetProfit() {
        return ownersNetProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Owners_net_profit
     *
     * @param ownersNetProfit the value for profit2.Owners_net_profit
     *
     * @mbg.generated
     */
    public void setOwnersNetProfit(BigDecimal ownersNetProfit) {
        this.ownersNetProfit = ownersNetProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Other_comprehensive_income
     *
     * @return the value of profit2.Other_comprehensive_income
     *
     * @mbg.generated
     */
    public BigDecimal getOtherComprehensiveIncome() {
        return otherComprehensiveIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Other_comprehensive_income
     *
     * @param otherComprehensiveIncome the value for profit2.Other_comprehensive_income
     *
     * @mbg.generated
     */
    public void setOtherComprehensiveIncome(BigDecimal otherComprehensiveIncome) {
        this.otherComprehensiveIncome = otherComprehensiveIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Total_comprehensive_income
     *
     * @return the value of profit2.Total_comprehensive_income
     *
     * @mbg.generated
     */
    public BigDecimal getTotalComprehensiveIncome() {
        return totalComprehensiveIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Total_comprehensive_income
     *
     * @param totalComprehensiveIncome the value for profit2.Total_comprehensive_income
     *
     * @mbg.generated
     */
    public void setTotalComprehensiveIncome(BigDecimal totalComprehensiveIncome) {
        this.totalComprehensiveIncome = totalComprehensiveIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.minority_shareholders_income
     *
     * @return the value of profit2.minority_shareholders_income
     *
     * @mbg.generated
     */
    public BigDecimal getMinorityShareholdersIncome() {
        return minorityShareholdersIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.minority_shareholders_income
     *
     * @param minorityShareholdersIncome the value for profit2.minority_shareholders_income
     *
     * @mbg.generated
     */
    public void setMinorityShareholdersIncome(BigDecimal minorityShareholdersIncome) {
        this.minorityShareholdersIncome = minorityShareholdersIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.parent_company_income
     *
     * @return the value of profit2.parent_company_income
     *
     * @mbg.generated
     */
    public BigDecimal getParentCompanyIncome() {
        return parentCompanyIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.parent_company_income
     *
     * @param parentCompanyIncome the value for profit2.parent_company_income
     *
     * @mbg.generated
     */
    public void setParentCompanyIncome(BigDecimal parentCompanyIncome) {
        this.parentCompanyIncome = parentCompanyIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.earnings_per_share
     *
     * @return the value of profit2.earnings_per_share
     *
     * @mbg.generated
     */
    public BigDecimal getEarningsPerShare() {
        return earningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.earnings_per_share
     *
     * @param earningsPerShare the value for profit2.earnings_per_share
     *
     * @mbg.generated
     */
    public void setEarningsPerShare(BigDecimal earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.Basicearnings_per_share
     *
     * @return the value of profit2.Basicearnings_per_share
     *
     * @mbg.generated
     */
    public BigDecimal getBasicearningsPerShare() {
        return basicearningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.Basicearnings_per_share
     *
     * @param basicearningsPerShare the value for profit2.Basicearnings_per_share
     *
     * @mbg.generated
     */
    public void setBasicearningsPerShare(BigDecimal basicearningsPerShare) {
        this.basicearningsPerShare = basicearningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.diluted_earnings_per_share
     *
     * @return the value of profit2.diluted_earnings_per_share
     *
     * @mbg.generated
     */
    public BigDecimal getDilutedEarningsPerShare() {
        return dilutedEarningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.diluted_earnings_per_share
     *
     * @param dilutedEarningsPerShare the value for profit2.diluted_earnings_per_share
     *
     * @mbg.generated
     */
    public void setDilutedEarningsPerShare(BigDecimal dilutedEarningsPerShare) {
        this.dilutedEarningsPerShare = dilutedEarningsPerShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.create_date
     *
     * @return the value of profit2.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.create_date
     *
     * @param createDate the value for profit2.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.update_date
     *
     * @return the value of profit2.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.update_date
     *
     * @param updateDate the value for profit2.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.deteledstatus
     *
     * @return the value of profit2.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.deteledstatus
     *
     * @param deteledstatus the value for profit2.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit2.profit_id
     *
     * @return the value of profit2.profit_id
     *
     * @mbg.generated
     */
    public String getProfitId() {
        return profitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit2.profit_id
     *
     * @param profitId the value for profit2.profit_id
     *
     * @mbg.generated
     */
    public void setProfitId(String profitId) {
        this.profitId = profitId == null ? null : profitId.trim();
    }
}