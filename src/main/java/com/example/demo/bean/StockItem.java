package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table stock_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class StockItem {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   item_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   项目状态（是否拟投资）： 0 拟投资项目；1 已投资项目
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.item_status
     *
     * @mbg.generated
     */
    private Integer itemStatus;

    /**
     * Database Column Remarks:
     *   拟退出方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.Proposed_approach
     *
     * @mbg.generated
     */
    private String proposedApproach;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志：0 未删除；1 已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   关联投前项目 已废弃
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_item.einvest_id
     *
     * @mbg.generated
     */
    private String einvestId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.id
     *
     * @return the value of stock_item.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.id
     *
     * @param id the value for stock_item.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.item_id
     *
     * @return the value of stock_item.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.item_id
     *
     * @param itemId the value for stock_item.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.item_status
     *
     * @return the value of stock_item.item_status
     *
     * @mbg.generated
     */
    public Integer getItemStatus() {
        return itemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.item_status
     *
     * @param itemStatus the value for stock_item.item_status
     *
     * @mbg.generated
     */
    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.Proposed_approach
     *
     * @return the value of stock_item.Proposed_approach
     *
     * @mbg.generated
     */
    public String getProposedApproach() {
        return proposedApproach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.Proposed_approach
     *
     * @param proposedApproach the value for stock_item.Proposed_approach
     *
     * @mbg.generated
     */
    public void setProposedApproach(String proposedApproach) {
        this.proposedApproach = proposedApproach == null ? null : proposedApproach.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.create_date
     *
     * @return the value of stock_item.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.create_date
     *
     * @param createDate the value for stock_item.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.create_user
     *
     * @return the value of stock_item.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.create_user
     *
     * @param createUser the value for stock_item.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.update_date
     *
     * @return the value of stock_item.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.update_date
     *
     * @param updateDate the value for stock_item.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.deteledstatus
     *
     * @return the value of stock_item.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.deteledstatus
     *
     * @param deteledstatus the value for stock_item.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_item.einvest_id
     *
     * @return the value of stock_item.einvest_id
     *
     * @mbg.generated
     */
    public String getEinvestId() {
        return einvestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_item.einvest_id
     *
     * @param einvestId the value for stock_item.einvest_id
     *
     * @mbg.generated
     */
    public void setEinvestId(String einvestId) {
        this.einvestId = einvestId == null ? null : einvestId.trim();
    }
}