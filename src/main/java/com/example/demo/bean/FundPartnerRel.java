package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_partner_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundPartnerRel {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   合伙人类型1客户2母基金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.business_type
     *
     * @mbg.generated
     */
    private String businessType;

    /**
     * Database Column Remarks:
     *   基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.fundid
     *
     * @mbg.generated
     */
    private String fundid;

    /**
     * Database Column Remarks:
     *   合伙人Id-可能是客户id或者基金Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.fpid
     *
     * @mbg.generated
     */
    private String fpid;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   认缴金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.subscribed_money
     *
     * @mbg.generated
     */
    private String subscribedMoney;

    /**
     * Database Column Remarks:
     *   实缴金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.paid_money
     *
     * @mbg.generated
     */
    private String paidMoney;

    /**
     * Database Column Remarks:
     *   出资分期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.periodization
     *
     * @mbg.generated
     */
    private String periodization;

    /**
     * Database Column Remarks:
     *   缴纳年限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.Paymentterm
     *
     * @mbg.generated
     */
    private String paymentterm;

    /**
     * Database Column Remarks:
     *   持有状态0增持，1减持，2新进、3持有未变，4退出
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.hold_state
     *
     * @mbg.generated
     */
    private String holdState;

    /**
     * Database Column Remarks:
     *   当前持有
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.hold_now
     *
     * @mbg.generated
     */
    private String holdNow;

    /**
     * Database Column Remarks:
     *   当前权益百分比
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.persent_now
     *
     * @mbg.generated
     */
    private String persentNow;

    /**
     * Database Column Remarks:
     *   原因Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.reason_id
     *
     * @mbg.generated
     */
    private String reasonId;

    /**
     * Database Column Remarks:
     *   合伙人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.partner_name
     *
     * @mbg.generated
     */
    private String partnerName;

    /**
     * Database Column Remarks:
     *   合伙人类型1LP 2GP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.partner_type
     *
     * @mbg.generated
     */
    private String partnerType;

    /**
     * Database Column Remarks:
     *   资金属性0:国企1：民企2：个人3：自有资金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_partner_rel.capital_property
     *
     * @mbg.generated
     */
    private String capitalProperty;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.id
     *
     * @return the value of fund_partner_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.id
     *
     * @param id the value for fund_partner_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.business_type
     *
     * @return the value of fund_partner_rel.business_type
     *
     * @mbg.generated
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.business_type
     *
     * @param businessType the value for fund_partner_rel.business_type
     *
     * @mbg.generated
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.fundid
     *
     * @return the value of fund_partner_rel.fundid
     *
     * @mbg.generated
     */
    public String getFundid() {
        return fundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.fundid
     *
     * @param fundid the value for fund_partner_rel.fundid
     *
     * @mbg.generated
     */
    public void setFundid(String fundid) {
        this.fundid = fundid == null ? null : fundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.fpid
     *
     * @return the value of fund_partner_rel.fpid
     *
     * @mbg.generated
     */
    public String getFpid() {
        return fpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.fpid
     *
     * @param fpid the value for fund_partner_rel.fpid
     *
     * @mbg.generated
     */
    public void setFpid(String fpid) {
        this.fpid = fpid == null ? null : fpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.createtime
     *
     * @return the value of fund_partner_rel.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.createtime
     *
     * @param createtime the value for fund_partner_rel.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.deteledstatus
     *
     * @return the value of fund_partner_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.deteledstatus
     *
     * @param deteledstatus the value for fund_partner_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.update_time
     *
     * @return the value of fund_partner_rel.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.update_time
     *
     * @param updateTime the value for fund_partner_rel.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.subscribed_money
     *
     * @return the value of fund_partner_rel.subscribed_money
     *
     * @mbg.generated
     */
    public String getSubscribedMoney() {
        return subscribedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.subscribed_money
     *
     * @param subscribedMoney the value for fund_partner_rel.subscribed_money
     *
     * @mbg.generated
     */
    public void setSubscribedMoney(String subscribedMoney) {
        this.subscribedMoney = subscribedMoney == null ? null : subscribedMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.paid_money
     *
     * @return the value of fund_partner_rel.paid_money
     *
     * @mbg.generated
     */
    public String getPaidMoney() {
        return paidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.paid_money
     *
     * @param paidMoney the value for fund_partner_rel.paid_money
     *
     * @mbg.generated
     */
    public void setPaidMoney(String paidMoney) {
        this.paidMoney = paidMoney == null ? null : paidMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.periodization
     *
     * @return the value of fund_partner_rel.periodization
     *
     * @mbg.generated
     */
    public String getPeriodization() {
        return periodization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.periodization
     *
     * @param periodization the value for fund_partner_rel.periodization
     *
     * @mbg.generated
     */
    public void setPeriodization(String periodization) {
        this.periodization = periodization == null ? null : periodization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.Paymentterm
     *
     * @return the value of fund_partner_rel.Paymentterm
     *
     * @mbg.generated
     */
    public String getPaymentterm() {
        return paymentterm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.Paymentterm
     *
     * @param paymentterm the value for fund_partner_rel.Paymentterm
     *
     * @mbg.generated
     */
    public void setPaymentterm(String paymentterm) {
        this.paymentterm = paymentterm == null ? null : paymentterm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.hold_state
     *
     * @return the value of fund_partner_rel.hold_state
     *
     * @mbg.generated
     */
    public String getHoldState() {
        return holdState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.hold_state
     *
     * @param holdState the value for fund_partner_rel.hold_state
     *
     * @mbg.generated
     */
    public void setHoldState(String holdState) {
        this.holdState = holdState == null ? null : holdState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.hold_now
     *
     * @return the value of fund_partner_rel.hold_now
     *
     * @mbg.generated
     */
    public String getHoldNow() {
        return holdNow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.hold_now
     *
     * @param holdNow the value for fund_partner_rel.hold_now
     *
     * @mbg.generated
     */
    public void setHoldNow(String holdNow) {
        this.holdNow = holdNow == null ? null : holdNow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.persent_now
     *
     * @return the value of fund_partner_rel.persent_now
     *
     * @mbg.generated
     */
    public String getPersentNow() {
        return persentNow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.persent_now
     *
     * @param persentNow the value for fund_partner_rel.persent_now
     *
     * @mbg.generated
     */
    public void setPersentNow(String persentNow) {
        this.persentNow = persentNow == null ? null : persentNow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.reason_id
     *
     * @return the value of fund_partner_rel.reason_id
     *
     * @mbg.generated
     */
    public String getReasonId() {
        return reasonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.reason_id
     *
     * @param reasonId the value for fund_partner_rel.reason_id
     *
     * @mbg.generated
     */
    public void setReasonId(String reasonId) {
        this.reasonId = reasonId == null ? null : reasonId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.partner_name
     *
     * @return the value of fund_partner_rel.partner_name
     *
     * @mbg.generated
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.partner_name
     *
     * @param partnerName the value for fund_partner_rel.partner_name
     *
     * @mbg.generated
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.partner_type
     *
     * @return the value of fund_partner_rel.partner_type
     *
     * @mbg.generated
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.partner_type
     *
     * @param partnerType the value for fund_partner_rel.partner_type
     *
     * @mbg.generated
     */
    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType == null ? null : partnerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_partner_rel.capital_property
     *
     * @return the value of fund_partner_rel.capital_property
     *
     * @mbg.generated
     */
    public String getCapitalProperty() {
        return capitalProperty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_partner_rel.capital_property
     *
     * @param capitalProperty the value for fund_partner_rel.capital_property
     *
     * @mbg.generated
     */
    public void setCapitalProperty(String capitalProperty) {
        this.capitalProperty = capitalProperty == null ? null : capitalProperty.trim();
    }
}