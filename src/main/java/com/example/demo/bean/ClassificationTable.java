package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table classification_table
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ClassificationTable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   关联项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   投资时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Investment_date
     *
     * @mbg.generated
     */
    private Date investmentDate;

    /**
     * Database Column Remarks:
     *   投资基金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.fund_id
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   目前投资金额     (万元)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Current_investment
     *
     * @mbg.generated
     */
    private Long currentInvestment;

    /**
     * Database Column Remarks:
     *   财务评级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Financial_Rating
     *
     * @mbg.generated
     */
    private String financialRating;

    /**
     * Database Column Remarks:
     *   业绩完成度评级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Completion_rating
     *
     * @mbg.generated
     */
    private String completionRating;

    /**
     * Database Column Remarks:
     *   资本市场评级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Market_rating
     *
     * @mbg.generated
     */
    private String marketRating;

    /**
     * Database Column Remarks:
     *   行业评级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Industry_rating
     *
     * @mbg.generated
     */
    private String industryRating;

    /**
     * Database Column Remarks:
     *   综合分级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.Comprehensive
     *
     * @mbg.generated
     */
    private String comprehensive;

    /**
     * Database Column Remarks:
     *   调整后评级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.adjustment
     *
     * @mbg.generated
     */
    private String adjustment;

    /**
     * Database Column Remarks:
     *   评级时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.rating_date
     *
     * @mbg.generated
     */
    private Date ratingDate;

    /**
     * Database Column Remarks:
     *   项目组建议持有策略
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.project_suggest
     *
     * @mbg.generated
     */
    private String projectSuggest;

    /**
     * Database Column Remarks:
     *   投后建议持有策略
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.vote_suggest
     *
     * @mbg.generated
     */
    private String voteSuggest;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_table.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.id
     *
     * @return the value of classification_table.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.id
     *
     * @param id the value for classification_table.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.item_id
     *
     * @return the value of classification_table.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.item_id
     *
     * @param itemId the value for classification_table.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.create_date
     *
     * @return the value of classification_table.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.create_date
     *
     * @param createDate the value for classification_table.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Investment_date
     *
     * @return the value of classification_table.Investment_date
     *
     * @mbg.generated
     */
    public Date getInvestmentDate() {
        return investmentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Investment_date
     *
     * @param investmentDate the value for classification_table.Investment_date
     *
     * @mbg.generated
     */
    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.fund_id
     *
     * @return the value of classification_table.fund_id
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.fund_id
     *
     * @param fundId the value for classification_table.fund_id
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Current_investment
     *
     * @return the value of classification_table.Current_investment
     *
     * @mbg.generated
     */
    public Long getCurrentInvestment() {
        return currentInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Current_investment
     *
     * @param currentInvestment the value for classification_table.Current_investment
     *
     * @mbg.generated
     */
    public void setCurrentInvestment(Long currentInvestment) {
        this.currentInvestment = currentInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Financial_Rating
     *
     * @return the value of classification_table.Financial_Rating
     *
     * @mbg.generated
     */
    public String getFinancialRating() {
        return financialRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Financial_Rating
     *
     * @param financialRating the value for classification_table.Financial_Rating
     *
     * @mbg.generated
     */
    public void setFinancialRating(String financialRating) {
        this.financialRating = financialRating == null ? null : financialRating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Completion_rating
     *
     * @return the value of classification_table.Completion_rating
     *
     * @mbg.generated
     */
    public String getCompletionRating() {
        return completionRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Completion_rating
     *
     * @param completionRating the value for classification_table.Completion_rating
     *
     * @mbg.generated
     */
    public void setCompletionRating(String completionRating) {
        this.completionRating = completionRating == null ? null : completionRating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Market_rating
     *
     * @return the value of classification_table.Market_rating
     *
     * @mbg.generated
     */
    public String getMarketRating() {
        return marketRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Market_rating
     *
     * @param marketRating the value for classification_table.Market_rating
     *
     * @mbg.generated
     */
    public void setMarketRating(String marketRating) {
        this.marketRating = marketRating == null ? null : marketRating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Industry_rating
     *
     * @return the value of classification_table.Industry_rating
     *
     * @mbg.generated
     */
    public String getIndustryRating() {
        return industryRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Industry_rating
     *
     * @param industryRating the value for classification_table.Industry_rating
     *
     * @mbg.generated
     */
    public void setIndustryRating(String industryRating) {
        this.industryRating = industryRating == null ? null : industryRating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.Comprehensive
     *
     * @return the value of classification_table.Comprehensive
     *
     * @mbg.generated
     */
    public String getComprehensive() {
        return comprehensive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.Comprehensive
     *
     * @param comprehensive the value for classification_table.Comprehensive
     *
     * @mbg.generated
     */
    public void setComprehensive(String comprehensive) {
        this.comprehensive = comprehensive == null ? null : comprehensive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.adjustment
     *
     * @return the value of classification_table.adjustment
     *
     * @mbg.generated
     */
    public String getAdjustment() {
        return adjustment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.adjustment
     *
     * @param adjustment the value for classification_table.adjustment
     *
     * @mbg.generated
     */
    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment == null ? null : adjustment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.rating_date
     *
     * @return the value of classification_table.rating_date
     *
     * @mbg.generated
     */
    public Date getRatingDate() {
        return ratingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.rating_date
     *
     * @param ratingDate the value for classification_table.rating_date
     *
     * @mbg.generated
     */
    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.project_suggest
     *
     * @return the value of classification_table.project_suggest
     *
     * @mbg.generated
     */
    public String getProjectSuggest() {
        return projectSuggest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.project_suggest
     *
     * @param projectSuggest the value for classification_table.project_suggest
     *
     * @mbg.generated
     */
    public void setProjectSuggest(String projectSuggest) {
        this.projectSuggest = projectSuggest == null ? null : projectSuggest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.vote_suggest
     *
     * @return the value of classification_table.vote_suggest
     *
     * @mbg.generated
     */
    public String getVoteSuggest() {
        return voteSuggest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.vote_suggest
     *
     * @param voteSuggest the value for classification_table.vote_suggest
     *
     * @mbg.generated
     */
    public void setVoteSuggest(String voteSuggest) {
        this.voteSuggest = voteSuggest == null ? null : voteSuggest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.remarks
     *
     * @return the value of classification_table.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.remarks
     *
     * @param remarks the value for classification_table.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.update_date
     *
     * @return the value of classification_table.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.update_date
     *
     * @param updateDate the value for classification_table.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_table.deteledstatus
     *
     * @return the value of classification_table.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_table.deteledstatus
     *
     * @param deteledstatus the value for classification_table.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}