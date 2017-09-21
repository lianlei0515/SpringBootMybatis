package com.example.demo.dao;

import com.example.demo.bean.Formula;
import com.example.demo.bean.FormulaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormulaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    long countByExample(FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int deleteByExample(FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int insert(Formula record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int insertSelective(Formula record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    List<Formula> selectByExampleWithBLOBs(FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    List<Formula> selectByExample(FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    Formula selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Formula record, @Param("example") FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Formula record, @Param("example") FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Formula record, @Param("example") FormulaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Formula record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Formula record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table formula
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Formula record);
}