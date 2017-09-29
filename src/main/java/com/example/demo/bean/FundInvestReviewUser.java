package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_invest_review_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundInvestReviewUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.fund_id
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   人员类型：1：评委；2：专家；3：第三方机构专家；4：合投人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.user_type
     *
     * @mbg.generated
     */
    private Integer userType;

    /**
     * Database Column Remarks:
     *   评审人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   评审人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   评审时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.review_time
     *
     * @mbg.generated
     */
    private Date reviewTime;

    /**
     * Database Column Remarks:
     *   删除状态；0：删除；1：存在
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_invest_review_user.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.id
     *
     * @return the value of fund_invest_review_user.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.id
     *
     * @param id the value for fund_invest_review_user.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.fund_id
     *
     * @return the value of fund_invest_review_user.fund_id
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.fund_id
     *
     * @param fundId the value for fund_invest_review_user.fund_id
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.user_type
     *
     * @return the value of fund_invest_review_user.user_type
     *
     * @mbg.generated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.user_type
     *
     * @param userType the value for fund_invest_review_user.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.user_id
     *
     * @return the value of fund_invest_review_user.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.user_id
     *
     * @param userId the value for fund_invest_review_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.user_name
     *
     * @return the value of fund_invest_review_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.user_name
     *
     * @param userName the value for fund_invest_review_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.review_time
     *
     * @return the value of fund_invest_review_user.review_time
     *
     * @mbg.generated
     */
    public Date getReviewTime() {
        return reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.review_time
     *
     * @param reviewTime the value for fund_invest_review_user.review_time
     *
     * @mbg.generated
     */
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_invest_review_user.deteledstatus
     *
     * @return the value of fund_invest_review_user.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_invest_review_user.deteledstatus
     *
     * @param deteledstatus the value for fund_invest_review_user.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }
}