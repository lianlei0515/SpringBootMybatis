package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table review
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Review {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   关联项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   见枚举
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.person_types
     *
     * @mbg.generated
     */
    private Integer personTypes;

    /**
     * Database Column Remarks:
     *   关联用户表id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   评审意见
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.create_username
     *
     * @mbg.generated
     */
    private String createUsername;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标记： 1未删除； 0 已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.id
     *
     * @return the value of review.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.id
     *
     * @param id the value for review.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.item_id
     *
     * @return the value of review.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.item_id
     *
     * @param itemId the value for review.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.person_types
     *
     * @return the value of review.person_types
     *
     * @mbg.generated
     */
    public Integer getPersonTypes() {
        return personTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.person_types
     *
     * @param personTypes the value for review.person_types
     *
     * @mbg.generated
     */
    public void setPersonTypes(Integer personTypes) {
        this.personTypes = personTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.user_id
     *
     * @return the value of review.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.user_id
     *
     * @param userId the value for review.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.remark
     *
     * @return the value of review.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.remark
     *
     * @param remark the value for review.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.create_date
     *
     * @return the value of review.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.create_date
     *
     * @param createDate the value for review.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.create_user
     *
     * @return the value of review.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.create_user
     *
     * @param createUser the value for review.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.create_username
     *
     * @return the value of review.create_username
     *
     * @mbg.generated
     */
    public String getCreateUsername() {
        return createUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.create_username
     *
     * @param createUsername the value for review.create_username
     *
     * @mbg.generated
     */
    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.update_date
     *
     * @return the value of review.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.update_date
     *
     * @param updateDate the value for review.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.deletestatus
     *
     * @return the value of review.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.deletestatus
     *
     * @param deletestatus the value for review.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review.state
     *
     * @return the value of review.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review.state
     *
     * @param state the value for review.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}