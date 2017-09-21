package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table manage_file
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ManageFile {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   文档编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.fund_code
     *
     * @mbg.generated
     */
    private String fundCode;

    /**
     * Database Column Remarks:
     *   文件名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.file_name
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     * Database Column Remarks:
     *   文件类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.file_lx
     *
     * @mbg.generated
     */
    private String fileLx;

    /**
     * Database Column Remarks:
     *   文档路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.fund_type
     *
     * @mbg.generated
     */
    private String fundType;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage_file.deletestatus
     *
     * @mbg.generated
     */
    private Integer deletestatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.id
     *
     * @return the value of manage_file.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.id
     *
     * @param id the value for manage_file.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.fund_code
     *
     * @return the value of manage_file.fund_code
     *
     * @mbg.generated
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.fund_code
     *
     * @param fundCode the value for manage_file.fund_code
     *
     * @mbg.generated
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.file_name
     *
     * @return the value of manage_file.file_name
     *
     * @mbg.generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.file_name
     *
     * @param fileName the value for manage_file.file_name
     *
     * @mbg.generated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.file_lx
     *
     * @return the value of manage_file.file_lx
     *
     * @mbg.generated
     */
    public String getFileLx() {
        return fileLx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.file_lx
     *
     * @param fileLx the value for manage_file.file_lx
     *
     * @mbg.generated
     */
    public void setFileLx(String fileLx) {
        this.fileLx = fileLx == null ? null : fileLx.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.fund_type
     *
     * @return the value of manage_file.fund_type
     *
     * @mbg.generated
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.fund_type
     *
     * @param fundType the value for manage_file.fund_type
     *
     * @mbg.generated
     */
    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.createtime
     *
     * @return the value of manage_file.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.createtime
     *
     * @param createtime the value for manage_file.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.update_time
     *
     * @return the value of manage_file.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.update_time
     *
     * @param updateTime the value for manage_file.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage_file.deletestatus
     *
     * @return the value of manage_file.deletestatus
     *
     * @mbg.generated
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage_file.deletestatus
     *
     * @param deletestatus the value for manage_file.deletestatus
     *
     * @mbg.generated
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }
}