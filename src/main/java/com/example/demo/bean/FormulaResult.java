package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table formula_result
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FormulaResult {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   formula_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.formula_id
     *
     * @mbg.generated
     */
    private String formulaId;

    /**
     * Database Column Remarks:
     *   项目id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.project_id
     *
     * @mbg.generated
     */
    private String projectId;

    /**
     * Database Column Remarks:
     *   项目名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.project_name
     *
     * @mbg.generated
     */
    private String projectName;

    /**
     * Database Column Remarks:
     *   告警类型   正常:1  关注:2 预警:3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.warn_type
     *
     * @mbg.generated
     */
    private String warnType;

    /**
     * Database Column Remarks:
     *   告警条件
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.warn_info
     *
     * @mbg.generated
     */
    private String warnInfo;

    /**
     * Database Column Remarks:
     *   评级时间  现在含义：最后更新时间，也是由前端选择输入
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.change_rating_date
     *
     * @mbg.generated
     */
    private Date changeRatingDate;

    /**
     * Database Column Remarks:
     *   项目组建议持有策略
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.project_group_advice
     *
     * @mbg.generated
     */
    private String projectGroupAdvice;

    /**
     * Database Column Remarks:
     *   投后建议持有策略
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.investment_mgt_advice
     *
     * @mbg.generated
     */
    private String investmentMgtAdvice;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   处置方式：0:未处理 1:已处理 2:处理中 3:挂起
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column formula_result.checkStatus
     *
     * @mbg.generated
     */
    private String checkstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.id
     *
     * @return the value of formula_result.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.id
     *
     * @param id the value for formula_result.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.formula_id
     *
     * @return the value of formula_result.formula_id
     *
     * @mbg.generated
     */
    public String getFormulaId() {
        return formulaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.formula_id
     *
     * @param formulaId the value for formula_result.formula_id
     *
     * @mbg.generated
     */
    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId == null ? null : formulaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.project_id
     *
     * @return the value of formula_result.project_id
     *
     * @mbg.generated
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.project_id
     *
     * @param projectId the value for formula_result.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.project_name
     *
     * @return the value of formula_result.project_name
     *
     * @mbg.generated
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.project_name
     *
     * @param projectName the value for formula_result.project_name
     *
     * @mbg.generated
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.warn_type
     *
     * @return the value of formula_result.warn_type
     *
     * @mbg.generated
     */
    public String getWarnType() {
        return warnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.warn_type
     *
     * @param warnType the value for formula_result.warn_type
     *
     * @mbg.generated
     */
    public void setWarnType(String warnType) {
        this.warnType = warnType == null ? null : warnType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.warn_info
     *
     * @return the value of formula_result.warn_info
     *
     * @mbg.generated
     */
    public String getWarnInfo() {
        return warnInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.warn_info
     *
     * @param warnInfo the value for formula_result.warn_info
     *
     * @mbg.generated
     */
    public void setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo == null ? null : warnInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.change_rating_date
     *
     * @return the value of formula_result.change_rating_date
     *
     * @mbg.generated
     */
    public Date getChangeRatingDate() {
        return changeRatingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.change_rating_date
     *
     * @param changeRatingDate the value for formula_result.change_rating_date
     *
     * @mbg.generated
     */
    public void setChangeRatingDate(Date changeRatingDate) {
        this.changeRatingDate = changeRatingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.project_group_advice
     *
     * @return the value of formula_result.project_group_advice
     *
     * @mbg.generated
     */
    public String getProjectGroupAdvice() {
        return projectGroupAdvice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.project_group_advice
     *
     * @param projectGroupAdvice the value for formula_result.project_group_advice
     *
     * @mbg.generated
     */
    public void setProjectGroupAdvice(String projectGroupAdvice) {
        this.projectGroupAdvice = projectGroupAdvice == null ? null : projectGroupAdvice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.investment_mgt_advice
     *
     * @return the value of formula_result.investment_mgt_advice
     *
     * @mbg.generated
     */
    public String getInvestmentMgtAdvice() {
        return investmentMgtAdvice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.investment_mgt_advice
     *
     * @param investmentMgtAdvice the value for formula_result.investment_mgt_advice
     *
     * @mbg.generated
     */
    public void setInvestmentMgtAdvice(String investmentMgtAdvice) {
        this.investmentMgtAdvice = investmentMgtAdvice == null ? null : investmentMgtAdvice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.note
     *
     * @return the value of formula_result.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.note
     *
     * @param note the value for formula_result.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.create_date
     *
     * @return the value of formula_result.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.create_date
     *
     * @param createDate the value for formula_result.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column formula_result.checkStatus
     *
     * @return the value of formula_result.checkStatus
     *
     * @mbg.generated
     */
    public String getCheckstatus() {
        return checkstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column formula_result.checkStatus
     *
     * @param checkstatus the value for formula_result.checkStatus
     *
     * @mbg.generated
     */
    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }
}