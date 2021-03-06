package com.example.demo.dao;

import com.example.demo.bean.BalanceSheet;
import com.example.demo.bean.BalanceSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceSheetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    long countByExample(BalanceSheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int deleteByExample(BalanceSheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int insert(BalanceSheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int insertSelective(BalanceSheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    List<BalanceSheet> selectByExample(BalanceSheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    BalanceSheet selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BalanceSheet record, @Param("example") BalanceSheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BalanceSheet record, @Param("example") BalanceSheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BalanceSheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_sheet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BalanceSheet record);
}