package com.example.demo.dao;

import com.example.demo.bean.FundExpenditure;
import com.example.demo.bean.FundExpenditureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundExpenditureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    long countByExample(FundExpenditureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int deleteByExample(FundExpenditureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int insert(FundExpenditure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int insertSelective(FundExpenditure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    List<FundExpenditure> selectByExample(FundExpenditureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    FundExpenditure selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundExpenditure record, @Param("example") FundExpenditureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundExpenditure record, @Param("example") FundExpenditureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundExpenditure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_expenditure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundExpenditure record);
}