package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table playmoney
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Playmoney {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   关联项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   打款时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.playmoney_date
     *
     * @mbg.generated
     */
    private Date playmoneyDate;

    /**
     * Database Column Remarks:
     *   打款人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.playmoney_user
     *
     * @mbg.generated
     */
    private String playmoneyUser;

    /**
     * Database Column Remarks:
     *   打款金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.amount
     *
     * @mbg.generated
     */
    private String amount;

    /**
     * Database Column Remarks:
     *   收款账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.receiver_acct
     *
     * @mbg.generated
     */
    private String receiverAcct;

    /**
     * Database Column Remarks:
     *   收款人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.receiver_user
     *
     * @mbg.generated
     */
    private String receiverUser;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标记： 1未删除； 0 已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playmoney.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.id
     *
     * @return the value of playmoney.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.id
     *
     * @param id the value for playmoney.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.item_id
     *
     * @return the value of playmoney.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.item_id
     *
     * @param itemId the value for playmoney.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.playmoney_date
     *
     * @return the value of playmoney.playmoney_date
     *
     * @mbg.generated
     */
    public Date getPlaymoneyDate() {
        return playmoneyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.playmoney_date
     *
     * @param playmoneyDate the value for playmoney.playmoney_date
     *
     * @mbg.generated
     */
    public void setPlaymoneyDate(Date playmoneyDate) {
        this.playmoneyDate = playmoneyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.playmoney_user
     *
     * @return the value of playmoney.playmoney_user
     *
     * @mbg.generated
     */
    public String getPlaymoneyUser() {
        return playmoneyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.playmoney_user
     *
     * @param playmoneyUser the value for playmoney.playmoney_user
     *
     * @mbg.generated
     */
    public void setPlaymoneyUser(String playmoneyUser) {
        this.playmoneyUser = playmoneyUser == null ? null : playmoneyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.amount
     *
     * @return the value of playmoney.amount
     *
     * @mbg.generated
     */
    public String getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.amount
     *
     * @param amount the value for playmoney.amount
     *
     * @mbg.generated
     */
    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.receiver_acct
     *
     * @return the value of playmoney.receiver_acct
     *
     * @mbg.generated
     */
    public String getReceiverAcct() {
        return receiverAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.receiver_acct
     *
     * @param receiverAcct the value for playmoney.receiver_acct
     *
     * @mbg.generated
     */
    public void setReceiverAcct(String receiverAcct) {
        this.receiverAcct = receiverAcct == null ? null : receiverAcct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.receiver_user
     *
     * @return the value of playmoney.receiver_user
     *
     * @mbg.generated
     */
    public String getReceiverUser() {
        return receiverUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.receiver_user
     *
     * @param receiverUser the value for playmoney.receiver_user
     *
     * @mbg.generated
     */
    public void setReceiverUser(String receiverUser) {
        this.receiverUser = receiverUser == null ? null : receiverUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.create_date
     *
     * @return the value of playmoney.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.create_date
     *
     * @param createDate the value for playmoney.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.create_user
     *
     * @return the value of playmoney.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.create_user
     *
     * @param createUser the value for playmoney.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.update_date
     *
     * @return the value of playmoney.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.update_date
     *
     * @param updateDate the value for playmoney.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.deletestatus
     *
     * @return the value of playmoney.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.deletestatus
     *
     * @param deletestatus the value for playmoney.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playmoney.state
     *
     * @return the value of playmoney.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playmoney.state
     *
     * @param state the value for playmoney.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}