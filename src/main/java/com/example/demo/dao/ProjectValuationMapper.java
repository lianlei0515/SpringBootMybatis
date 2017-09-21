package com.example.demo.dao;

import com.example.demo.bean.ProjectValuation;
import com.example.demo.bean.ProjectValuationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectValuationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    long countByExample(ProjectValuationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectValuationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int insert(ProjectValuation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int insertSelective(ProjectValuation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    List<ProjectValuation> selectByExample(ProjectValuationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    ProjectValuation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectValuation record, @Param("example") ProjectValuationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectValuation record, @Param("example") ProjectValuationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectValuation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_valuation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectValuation record);
}