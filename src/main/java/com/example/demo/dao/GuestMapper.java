package com.example.demo.dao;

import com.example.demo.bean.Guest;
import com.example.demo.bean.GuestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    long countByExample(GuestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int deleteByExample(GuestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int insert(Guest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int insertSelective(Guest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    List<Guest> selectByExample(GuestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    Guest selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Guest record, @Param("example") GuestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Guest record, @Param("example") GuestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Guest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Guest record);
}