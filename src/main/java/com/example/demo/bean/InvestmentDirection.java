package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table investment_direction
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class InvestmentDirection {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.value
     *
     * @mbg.generated
     */
    private Integer value;

    /**
     * Database Column Remarks:
     *   投资方向
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.investment_direction_name
     *
     * @mbg.generated
     */
    private String investmentDirectionName;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column investment_direction.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.id
     *
     * @return the value of investment_direction.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.id
     *
     * @param id the value for investment_direction.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.value
     *
     * @return the value of investment_direction.value
     *
     * @mbg.generated
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.value
     *
     * @param value the value for investment_direction.value
     *
     * @mbg.generated
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.investment_direction_name
     *
     * @return the value of investment_direction.investment_direction_name
     *
     * @mbg.generated
     */
    public String getInvestmentDirectionName() {
        return investmentDirectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.investment_direction_name
     *
     * @param investmentDirectionName the value for investment_direction.investment_direction_name
     *
     * @mbg.generated
     */
    public void setInvestmentDirectionName(String investmentDirectionName) {
        this.investmentDirectionName = investmentDirectionName == null ? null : investmentDirectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.createtime
     *
     * @return the value of investment_direction.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.createtime
     *
     * @param createtime the value for investment_direction.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.update_time
     *
     * @return the value of investment_direction.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.update_time
     *
     * @param updateTime the value for investment_direction.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column investment_direction.deletestatus
     *
     * @return the value of investment_direction.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column investment_direction.deletestatus
     *
     * @param deletestatus the value for investment_direction.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }
}