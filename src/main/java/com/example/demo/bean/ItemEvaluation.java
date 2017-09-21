package com.example.demo.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table item_evaluation
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ItemEvaluation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   项目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.item_id
     *
     * @mbg.generated
     */
    private String itemId;

    /**
     * Database Column Remarks:
     *   评估方
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.evaluation_side
     *
     * @mbg.generated
     */
    private String evaluationSide;

    /**
     * Database Column Remarks:
     *   评估人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.evaluation_user
     *
     * @mbg.generated
     */
    private String evaluationUser;

    /**
     * Database Column Remarks:
     *   评估方法
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.evaluation_method
     *
     * @mbg.generated
     */
    private String evaluationMethod;

    /**
     * Database Column Remarks:
     *   评估值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.evaluation_value
     *
     * @mbg.generated
     */
    private String evaluationValue;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.deletedstatus
     *
     * @mbg.generated
     */
    private String deletedstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_evaluation.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.id
     *
     * @return the value of item_evaluation.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.id
     *
     * @param id the value for item_evaluation.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.item_id
     *
     * @return the value of item_evaluation.item_id
     *
     * @mbg.generated
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.item_id
     *
     * @param itemId the value for item_evaluation.item_id
     *
     * @mbg.generated
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.evaluation_side
     *
     * @return the value of item_evaluation.evaluation_side
     *
     * @mbg.generated
     */
    public String getEvaluationSide() {
        return evaluationSide;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.evaluation_side
     *
     * @param evaluationSide the value for item_evaluation.evaluation_side
     *
     * @mbg.generated
     */
    public void setEvaluationSide(String evaluationSide) {
        this.evaluationSide = evaluationSide == null ? null : evaluationSide.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.evaluation_user
     *
     * @return the value of item_evaluation.evaluation_user
     *
     * @mbg.generated
     */
    public String getEvaluationUser() {
        return evaluationUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.evaluation_user
     *
     * @param evaluationUser the value for item_evaluation.evaluation_user
     *
     * @mbg.generated
     */
    public void setEvaluationUser(String evaluationUser) {
        this.evaluationUser = evaluationUser == null ? null : evaluationUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.evaluation_method
     *
     * @return the value of item_evaluation.evaluation_method
     *
     * @mbg.generated
     */
    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.evaluation_method
     *
     * @param evaluationMethod the value for item_evaluation.evaluation_method
     *
     * @mbg.generated
     */
    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod == null ? null : evaluationMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.evaluation_value
     *
     * @return the value of item_evaluation.evaluation_value
     *
     * @mbg.generated
     */
    public String getEvaluationValue() {
        return evaluationValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.evaluation_value
     *
     * @param evaluationValue the value for item_evaluation.evaluation_value
     *
     * @mbg.generated
     */
    public void setEvaluationValue(String evaluationValue) {
        this.evaluationValue = evaluationValue == null ? null : evaluationValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.note
     *
     * @return the value of item_evaluation.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.note
     *
     * @param note the value for item_evaluation.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.deletedstatus
     *
     * @return the value of item_evaluation.deletedstatus
     *
     * @mbg.generated
     */
    public String getDeletedstatus() {
        return deletedstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.deletedstatus
     *
     * @param deletedstatus the value for item_evaluation.deletedstatus
     *
     * @mbg.generated
     */
    public void setDeletedstatus(String deletedstatus) {
        this.deletedstatus = deletedstatus == null ? null : deletedstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.create_date
     *
     * @return the value of item_evaluation.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.create_date
     *
     * @param createDate the value for item_evaluation.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_evaluation.create_user
     *
     * @return the value of item_evaluation.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_evaluation.create_user
     *
     * @param createUser the value for item_evaluation.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}