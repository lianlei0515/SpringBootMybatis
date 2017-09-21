package com.example.demo.dao;

import com.example.demo.bean.ItemInvest;
import com.example.demo.bean.ItemInvestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemInvestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    long countByExample(ItemInvestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int deleteByExample(ItemInvestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int insert(ItemInvest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int insertSelective(ItemInvest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    List<ItemInvest> selectByExample(ItemInvestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    ItemInvest selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ItemInvest record, @Param("example") ItemInvestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ItemInvest record, @Param("example") ItemInvestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ItemInvest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_invest
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ItemInvest record);
}