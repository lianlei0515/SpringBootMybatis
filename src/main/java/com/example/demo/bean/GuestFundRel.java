package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table guest_fund_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GuestFundRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   客户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.guestid
     *
     * @mbg.generated
     */
    private String guestid;

    /**
     * Database Column Remarks:
     *   基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.fundid
     *
     * @mbg.generated
     */
    private String fundid;

    /**
     * Database Column Remarks:
     *   认缴金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.subscribed_money
     *
     * @mbg.generated
     */
    private Integer subscribedMoney;

    /**
     * Database Column Remarks:
     *   客户类型（LP/GP/潜在LP）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.guest_type
     *
     * @mbg.generated
     */
    private String guestType;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志1有效0 ：无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   实缴金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_fund_rel.count
     *
     * @mbg.generated
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.id
     *
     * @return the value of guest_fund_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.id
     *
     * @param id the value for guest_fund_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.guestid
     *
     * @return the value of guest_fund_rel.guestid
     *
     * @mbg.generated
     */
    public String getGuestid() {
        return guestid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.guestid
     *
     * @param guestid the value for guest_fund_rel.guestid
     *
     * @mbg.generated
     */
    public void setGuestid(String guestid) {
        this.guestid = guestid == null ? null : guestid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.fundid
     *
     * @return the value of guest_fund_rel.fundid
     *
     * @mbg.generated
     */
    public String getFundid() {
        return fundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.fundid
     *
     * @param fundid the value for guest_fund_rel.fundid
     *
     * @mbg.generated
     */
    public void setFundid(String fundid) {
        this.fundid = fundid == null ? null : fundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.subscribed_money
     *
     * @return the value of guest_fund_rel.subscribed_money
     *
     * @mbg.generated
     */
    public Integer getSubscribedMoney() {
        return subscribedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.subscribed_money
     *
     * @param subscribedMoney the value for guest_fund_rel.subscribed_money
     *
     * @mbg.generated
     */
    public void setSubscribedMoney(Integer subscribedMoney) {
        this.subscribedMoney = subscribedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.guest_type
     *
     * @return the value of guest_fund_rel.guest_type
     *
     * @mbg.generated
     */
    public String getGuestType() {
        return guestType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.guest_type
     *
     * @param guestType the value for guest_fund_rel.guest_type
     *
     * @mbg.generated
     */
    public void setGuestType(String guestType) {
        this.guestType = guestType == null ? null : guestType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.create_date
     *
     * @return the value of guest_fund_rel.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.create_date
     *
     * @param createDate the value for guest_fund_rel.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.update_date
     *
     * @return the value of guest_fund_rel.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.update_date
     *
     * @param updateDate the value for guest_fund_rel.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.deteledstatus
     *
     * @return the value of guest_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.deteledstatus
     *
     * @param deteledstatus the value for guest_fund_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_fund_rel.count
     *
     * @return the value of guest_fund_rel.count
     *
     * @mbg.generated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_fund_rel.count
     *
     * @param count the value for guest_fund_rel.count
     *
     * @mbg.generated
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}