package com.example.demo.dao;

import com.example.demo.bean.FundMoney;
import com.example.demo.bean.FundMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundMoneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    long countByExample(FundMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int deleteByExample(FundMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int insert(FundMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int insertSelective(FundMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    List<FundMoney> selectByExample(FundMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    FundMoney selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundMoney record, @Param("example") FundMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundMoney record, @Param("example") FundMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_money
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundMoney record);
}