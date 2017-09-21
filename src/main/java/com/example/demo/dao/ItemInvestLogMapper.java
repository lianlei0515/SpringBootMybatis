package com.example.demo.dao;

import com.example.demo.bean.ItemInvestLog;
import com.example.demo.bean.ItemInvestLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemInvestLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    long countByExample(ItemInvestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int deleteByExample(ItemInvestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int insert(ItemInvestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int insertSelective(ItemInvestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    List<ItemInvestLog> selectByExample(ItemInvestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    ItemInvestLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ItemInvestLog record, @Param("example") ItemInvestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ItemInvestLog record, @Param("example") ItemInvestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ItemInvestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ItemInvestLog record);
}