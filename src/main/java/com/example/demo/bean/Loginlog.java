package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table LOGINLOG
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Loginlog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOGINLOG.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOGINLOG.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOGINLOG.logintime
     *
     * @mbg.generated
     */
    private String logintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOGINLOG.outlogintime
     *
     * @mbg.generated
     */
    private String outlogintime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOGINLOG.id
     *
     * @return the value of LOGINLOG.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOGINLOG.id
     *
     * @param id the value for LOGINLOG.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOGINLOG.userid
     *
     * @return the value of LOGINLOG.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOGINLOG.userid
     *
     * @param userid the value for LOGINLOG.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOGINLOG.logintime
     *
     * @return the value of LOGINLOG.logintime
     *
     * @mbg.generated
     */
    public String getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOGINLOG.logintime
     *
     * @param logintime the value for LOGINLOG.logintime
     *
     * @mbg.generated
     */
    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOGINLOG.outlogintime
     *
     * @return the value of LOGINLOG.outlogintime
     *
     * @mbg.generated
     */
    public String getOutlogintime() {
        return outlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOGINLOG.outlogintime
     *
     * @param outlogintime the value for LOGINLOG.outlogintime
     *
     * @mbg.generated
     */
    public void setOutlogintime(String outlogintime) {
        this.outlogintime = outlogintime == null ? null : outlogintime.trim();
    }
}