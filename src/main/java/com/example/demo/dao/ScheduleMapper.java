package com.example.demo.dao;

import com.example.demo.bean.Schedule;
import com.example.demo.bean.ScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    long countByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int deleteByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int insert(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int insertSelective(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    List<Schedule> selectByExampleWithBLOBs(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    List<Schedule> selectByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    Schedule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Schedule record);
}