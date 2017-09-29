package com.example.demo.dao;

import com.example.demo.bean.Profit2;
import com.example.demo.bean.Profit2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Profit2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    long countByExample(Profit2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int deleteByExample(Profit2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int insert(Profit2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int insertSelective(Profit2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    List<Profit2> selectByExample(Profit2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    Profit2 selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Profit2 record, @Param("example") Profit2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Profit2 record, @Param("example") Profit2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Profit2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit2
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Profit2 record);
}