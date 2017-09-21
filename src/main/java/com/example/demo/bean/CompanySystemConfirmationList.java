package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table company_system_confirmation_list
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CompanySystemConfirmationList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_system_confirmation_list.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_system_confirmation_list.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   确认文件id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_system_confirmation_list.file_id
     *
     * @mbg.generated
     */
    private Long fileId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_system_confirmation_list.id
     *
     * @return the value of company_system_confirmation_list.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_system_confirmation_list.id
     *
     * @param id the value for company_system_confirmation_list.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_system_confirmation_list.user_id
     *
     * @return the value of company_system_confirmation_list.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_system_confirmation_list.user_id
     *
     * @param userId the value for company_system_confirmation_list.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_system_confirmation_list.file_id
     *
     * @return the value of company_system_confirmation_list.file_id
     *
     * @mbg.generated
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_system_confirmation_list.file_id
     *
     * @param fileId the value for company_system_confirmation_list.file_id
     *
     * @mbg.generated
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}