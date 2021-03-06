package com.example.demo.dao;

import com.example.demo.bean.EstInvestment;
import com.example.demo.bean.EstInvestmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstInvestmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    long countByExample(EstInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int deleteByExample(EstInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int insert(EstInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int insertSelective(EstInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    List<EstInvestment> selectByExample(EstInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    EstInvestment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EstInvestment record, @Param("example") EstInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EstInvestment record, @Param("example") EstInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EstInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EstInvestment record);
}