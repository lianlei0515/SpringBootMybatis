package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_est
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundEstWithBLOBs extends FundEst {
    /**
     * Database Column Remarks:
     *   营业执照
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_est.business_license
     *
     * @mbg.generated
     */
    private String businessLicense;

    /**
     * Database Column Remarks:
     *   退出方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_est.exit_mode
     *
     * @mbg.generated
     */
    private String exitMode;

    /**
     * Database Column Remarks:
     *   其他
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_est.other
     *
     * @mbg.generated
     */
    private String other;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_est.business_license
     *
     * @return the value of fund_est.business_license
     *
     * @mbg.generated
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_est.business_license
     *
     * @param businessLicense the value for fund_est.business_license
     *
     * @mbg.generated
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_est.exit_mode
     *
     * @return the value of fund_est.exit_mode
     *
     * @mbg.generated
     */
    public String getExitMode() {
        return exitMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_est.exit_mode
     *
     * @param exitMode the value for fund_est.exit_mode
     *
     * @mbg.generated
     */
    public void setExitMode(String exitMode) {
        this.exitMode = exitMode == null ? null : exitMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_est.other
     *
     * @return the value of fund_est.other
     *
     * @mbg.generated
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_est.other
     *
     * @param other the value for fund_est.other
     *
     * @mbg.generated
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}