package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_company_file
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundCompanyFile {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   基金Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.fund_id
     *
     * @mbg.generated
     */
    private String fundId;

    /**
     * Database Column Remarks:
     *   文档分类1董事会，2监事会，3股东大会
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.file_type
     *
     * @mbg.generated
     */
    private String fileType;

    /**
     * Database Column Remarks:
     *   文件名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.file_name
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     * Database Column Remarks:
     *   文档路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.file_src
     *
     * @mbg.generated
     */
    private String fileSrc;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.deteledstatus
     *
     * @mbg.generated
     */
    private Integer deteledstatus;

    /**
     * Database Column Remarks:
     *   上传人Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_company_file.upload_user_id
     *
     * @mbg.generated
     */
    private String uploadUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.id
     *
     * @return the value of fund_company_file.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.id
     *
     * @param id the value for fund_company_file.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.fund_id
     *
     * @return the value of fund_company_file.fund_id
     *
     * @mbg.generated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.fund_id
     *
     * @param fundId the value for fund_company_file.fund_id
     *
     * @mbg.generated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.file_type
     *
     * @return the value of fund_company_file.file_type
     *
     * @mbg.generated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.file_type
     *
     * @param fileType the value for fund_company_file.file_type
     *
     * @mbg.generated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.file_name
     *
     * @return the value of fund_company_file.file_name
     *
     * @mbg.generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.file_name
     *
     * @param fileName the value for fund_company_file.file_name
     *
     * @mbg.generated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.file_src
     *
     * @return the value of fund_company_file.file_src
     *
     * @mbg.generated
     */
    public String getFileSrc() {
        return fileSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.file_src
     *
     * @param fileSrc the value for fund_company_file.file_src
     *
     * @mbg.generated
     */
    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc == null ? null : fileSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.createtime
     *
     * @return the value of fund_company_file.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.createtime
     *
     * @param createtime the value for fund_company_file.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.update_time
     *
     * @return the value of fund_company_file.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.update_time
     *
     * @param updateTime the value for fund_company_file.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.deteledstatus
     *
     * @return the value of fund_company_file.deteledstatus
     *
     * @mbg.generated
     */
    public Integer getDeteledstatus() {
        return deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.deteledstatus
     *
     * @param deteledstatus the value for fund_company_file.deteledstatus
     *
     * @mbg.generated
     */
    public void setDeteledstatus(Integer deteledstatus) {
        this.deteledstatus = deteledstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_company_file.upload_user_id
     *
     * @return the value of fund_company_file.upload_user_id
     *
     * @mbg.generated
     */
    public String getUploadUserId() {
        return uploadUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_company_file.upload_user_id
     *
     * @param uploadUserId the value for fund_company_file.upload_user_id
     *
     * @mbg.generated
     */
    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId == null ? null : uploadUserId.trim();
    }
}