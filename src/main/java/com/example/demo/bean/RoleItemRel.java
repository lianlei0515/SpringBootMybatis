package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_item_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class RoleItemRel {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   用户角色关联表id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.user_role_id
     *
     * @mbg.generated
     */
    private String userRoleId;

    /**
     * Database Column Remarks:
     *   项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.itemid
     *
     * @mbg.generated
     */
    private String itemid;

    /**
     * Database Column Remarks:
     *   带动基金id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.drivefundid
     *
     * @mbg.generated
     */
    private String drivefundid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.fundid
     *
     * @mbg.generated
     */
    private String fundid;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   删除标志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   0:没有更新1：更新
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_item_rel.isupdatae
     *
     * @mbg.generated
     */
    private Integer isupdatae;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.id
     *
     * @return the value of role_item_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.id
     *
     * @param id the value for role_item_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.user_role_id
     *
     * @return the value of role_item_rel.user_role_id
     *
     * @mbg.generated
     */
    public String getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.user_role_id
     *
     * @param userRoleId the value for role_item_rel.user_role_id
     *
     * @mbg.generated
     */
    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId == null ? null : userRoleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.itemid
     *
     * @return the value of role_item_rel.itemid
     *
     * @mbg.generated
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.itemid
     *
     * @param itemid the value for role_item_rel.itemid
     *
     * @mbg.generated
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.drivefundid
     *
     * @return the value of role_item_rel.drivefundid
     *
     * @mbg.generated
     */
    public String getDrivefundid() {
        return drivefundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.drivefundid
     *
     * @param drivefundid the value for role_item_rel.drivefundid
     *
     * @mbg.generated
     */
    public void setDrivefundid(String drivefundid) {
        this.drivefundid = drivefundid == null ? null : drivefundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.fundid
     *
     * @return the value of role_item_rel.fundid
     *
     * @mbg.generated
     */
    public String getFundid() {
        return fundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.fundid
     *
     * @param fundid the value for role_item_rel.fundid
     *
     * @mbg.generated
     */
    public void setFundid(String fundid) {
        this.fundid = fundid == null ? null : fundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.create_date
     *
     * @return the value of role_item_rel.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.create_date
     *
     * @param createDate the value for role_item_rel.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.update_date
     *
     * @return the value of role_item_rel.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.update_date
     *
     * @param updateDate the value for role_item_rel.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.deteledstatus
     *
     * @return the value of role_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.deteledstatus
     *
     * @param deteledstatus the value for role_item_rel.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_item_rel.isupdatae
     *
     * @return the value of role_item_rel.isupdatae
     *
     * @mbg.generated
     */
    public Integer getIsupdatae() {
        return isupdatae;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_item_rel.isupdatae
     *
     * @param isupdatae the value for role_item_rel.isupdatae
     *
     * @mbg.generated
     */
    public void setIsupdatae(Integer isupdatae) {
        this.isupdatae = isupdatae;
    }
}