package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table itemtuic
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Itemtuic {
    /**
     * Database Column Remarks:
     *   拟退出方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itemtuic.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itemtuic.itemid
     *
     * @mbg.generated
     */
    private String itemid;

    /**
     * Database Column Remarks:
     *   退出方式 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itemtuic.tuic_value
     *
     * @mbg.generated
     */
    private String tuicValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itemtuic.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itemtuic.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itemtuic.id
     *
     * @return the value of itemtuic.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itemtuic.id
     *
     * @param id the value for itemtuic.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itemtuic.itemid
     *
     * @return the value of itemtuic.itemid
     *
     * @mbg.generated
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itemtuic.itemid
     *
     * @param itemid the value for itemtuic.itemid
     *
     * @mbg.generated
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itemtuic.tuic_value
     *
     * @return the value of itemtuic.tuic_value
     *
     * @mbg.generated
     */
    public String getTuicValue() {
        return tuicValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itemtuic.tuic_value
     *
     * @param tuicValue the value for itemtuic.tuic_value
     *
     * @mbg.generated
     */
    public void setTuicValue(String tuicValue) {
        this.tuicValue = tuicValue == null ? null : tuicValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itemtuic.deletestatus
     *
     * @return the value of itemtuic.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itemtuic.deletestatus
     *
     * @param deletestatus the value for itemtuic.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itemtuic.update_time
     *
     * @return the value of itemtuic.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itemtuic.update_time
     *
     * @param updateTime the value for itemtuic.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}