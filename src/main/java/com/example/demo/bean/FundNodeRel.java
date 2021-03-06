package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table fund_node_rel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class FundNodeRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_node_rel.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   节点id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_node_rel.node_id
     *
     * @mbg.generated
     */
    private String nodeId;

    /**
     * Database Column Remarks:
     *   部门名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_node_rel.dept_id
     *
     * @mbg.generated
     */
    private String deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_node_rel.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_node_rel.id
     *
     * @return the value of fund_node_rel.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_node_rel.id
     *
     * @param id the value for fund_node_rel.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_node_rel.node_id
     *
     * @return the value of fund_node_rel.node_id
     *
     * @mbg.generated
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_node_rel.node_id
     *
     * @param nodeId the value for fund_node_rel.node_id
     *
     * @mbg.generated
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_node_rel.dept_id
     *
     * @return the value of fund_node_rel.dept_id
     *
     * @mbg.generated
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_node_rel.dept_id
     *
     * @param deptId the value for fund_node_rel.dept_id
     *
     * @mbg.generated
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_node_rel.user_name
     *
     * @return the value of fund_node_rel.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_node_rel.user_name
     *
     * @param userName the value for fund_node_rel.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}