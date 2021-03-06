package com.example.demo.dao;

import com.example.demo.bean.BillFloat;
import com.example.demo.bean.BillFloatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillFloatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    long countByExample(BillFloatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int deleteByExample(BillFloatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String billId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int insert(BillFloat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int insertSelective(BillFloat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    List<BillFloat> selectByExample(BillFloatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    BillFloat selectByPrimaryKey(String billId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BillFloat record, @Param("example") BillFloatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BillFloat record, @Param("example") BillFloatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BillFloat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill_float
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BillFloat record);
}