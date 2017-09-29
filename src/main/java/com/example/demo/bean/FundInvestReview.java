package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_invest_review
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundInvestReview {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review.fund_id
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   评审意见类型：1：评委；2：专家；3：第三方机构专家；4：合投人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review.review_type
     *
     * @mbg.generated
     */
    private Integer reviewType;

    /**
     * Database Column Remarks:
     *   评审人意见
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * Database Column Remarks:
     *   删除状态；0：删除；1：存在
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review.id
     *
     * @return the value of fund_invest_review.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review.id
     *
     * @param id the value for fund_invest_review.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review.fund_id
     *
     * @return the value of fund_invest_review.fund_id
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review.fund_id
     *
     * @param fundId the value for fund_invest_review.fund_id
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review.review_type
     *
     * @return the value of fund_invest_review.review_type
     *
     * @mbg.generated
     */
    public Integer getReviewType() {
        return reviewType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review.review_type
     *
     * @param reviewType the value for fund_invest_review.review_type
     *
     * @mbg.generated
     */
    public void setReviewType(Integer reviewType) {
        this.reviewType = reviewType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review.remarks
     *
     * @return the value of fund_invest_review.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review.remarks
     *
     * @param remarks the value for fund_invest_review.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review.deteledstatus
     *
     * @return the value of fund_invest_review.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review.deteledstatus
     *
     * @param deteledstatus the value for fund_invest_review.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}