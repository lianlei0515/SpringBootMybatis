package com.example.demo.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_menu
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysRoleMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     * Database Column Remarks:
     *   菜单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    private Long menuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.id
     *
     * @return the value of sys_role_menu.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.id
     *
     * @param id the value for sys_role_menu.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.role_id
     *
     * @return the value of sys_role_menu.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.role_id
     *
     * @param roleId the value for sys_role_menu.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.menu_id
     *
     * @return the value of sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.menu_id
     *
     * @param menuId the value for sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}