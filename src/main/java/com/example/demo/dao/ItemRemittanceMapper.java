package com.example.demo.dao;

import com.example.demo.bean.ItemRemittance;
import com.example.demo.bean.ItemRemittanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemRemittanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    long countByExample(ItemRemittanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int deleteByExample(ItemRemittanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int insert(ItemRemittance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int insertSelective(ItemRemittance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    List<ItemRemittance> selectByExample(ItemRemittanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    ItemRemittance selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ItemRemittance record, @Param("example") ItemRemittanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ItemRemittance record, @Param("example") ItemRemittanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ItemRemittance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_remittance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ItemRemittance record);
}