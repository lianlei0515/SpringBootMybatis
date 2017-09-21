package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table guest_type
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GuestType {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_type.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   客户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_type.guest_id
     *
     * @mbg.generated
     */
    private String guestId;

    /**
     * Database Column Remarks:
     *   字典表中客户关系类型的value值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest_type.d_value
     *
     * @mbg.generated
     */
    private String dValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_type.id
     *
     * @return the value of guest_type.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_type.id
     *
     * @param id the value for guest_type.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_type.guest_id
     *
     * @return the value of guest_type.guest_id
     *
     * @mbg.generated
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_type.guest_id
     *
     * @param guestId the value for guest_type.guest_id
     *
     * @mbg.generated
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId == null ? null : guestId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest_type.d_value
     *
     * @return the value of guest_type.d_value
     *
     * @mbg.generated
     */
    public String getdValue() {
        return dValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest_type.d_value
     *
     * @param dValue the value for guest_type.d_value
     *
     * @mbg.generated
     */
    public void setdValue(String dValue) {
        this.dValue = dValue == null ? null : dValue.trim();
    }
}