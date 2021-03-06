package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tz_user_item_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TzUserItemRel {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     * Database Column Remarks:
     *   项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.itemid
     *
     * @mbg.generated
     */
    private String itemid;

    /**
     * Database Column Remarks:
     *   用户在该项目中管理角色
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.management_role
     *
     * @mbg.generated
     */
    private String managementRole;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tz_user_item_rel.create_name
     *
     * @mbg.generated
     */
    private String createName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.id
     *
     * @return the value of tz_user_item_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.id
     *
     * @param id the value for tz_user_item_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.userid
     *
     * @return the value of tz_user_item_rel.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.userid
     *
     * @param userid the value for tz_user_item_rel.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.itemid
     *
     * @return the value of tz_user_item_rel.itemid
     *
     * @mbg.generated
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.itemid
     *
     * @param itemid the value for tz_user_item_rel.itemid
     *
     * @mbg.generated
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.management_role
     *
     * @return the value of tz_user_item_rel.management_role
     *
     * @mbg.generated
     */
    public String getManagementRole() {
        return managementRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.management_role
     *
     * @param managementRole the value for tz_user_item_rel.management_role
     *
     * @mbg.generated
     */
    public void setManagementRole(String managementRole) {
        this.managementRole = managementRole == null ? null : managementRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.update_date
     *
     * @return the value of tz_user_item_rel.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.update_date
     *
     * @param updateDate the value for tz_user_item_rel.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.deteledstatus
     *
     * @return the value of tz_user_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.deteledstatus
     *
     * @param deteledstatus the value for tz_user_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tz_user_item_rel.create_name
     *
     * @return the value of tz_user_item_rel.create_name
     *
     * @mbg.generated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tz_user_item_rel.create_name
     *
     * @param createName the value for tz_user_item_rel.create_name
     *
     * @mbg.generated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }
}