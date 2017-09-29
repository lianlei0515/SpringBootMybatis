package com.example.demo.dao;

import com.example.demo.bean.ItemMajorShareholder;
import com.example.demo.bean.ItemMajorShareholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMajorShareholderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    long countByExample(ItemMajorShareholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int deleteByExample(ItemMajorShareholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int insert(ItemMajorShareholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int insertSelective(ItemMajorShareholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    List<ItemMajorShareholder> selectByExample(ItemMajorShareholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    ItemMajorShareholder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ItemMajorShareholder record, @Param("example") ItemMajorShareholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ItemMajorShareholder record, @Param("example") ItemMajorShareholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ItemMajorShareholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_major_shareholder
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ItemMajorShareholder record);
}