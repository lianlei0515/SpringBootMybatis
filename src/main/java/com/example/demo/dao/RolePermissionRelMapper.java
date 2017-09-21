package com.example.demo.dao;

import com.example.demo.bean.RolePermissionRel;
import com.example.demo.bean.RolePermissionRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    long countByExample(RolePermissionRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int deleteByExample(RolePermissionRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int insert(RolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int insertSelective(RolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    List<RolePermissionRel> selectByExample(RolePermissionRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    RolePermissionRel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RolePermissionRel record, @Param("example") RolePermissionRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RolePermissionRel record, @Param("example") RolePermissionRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RolePermissionRel record);
}