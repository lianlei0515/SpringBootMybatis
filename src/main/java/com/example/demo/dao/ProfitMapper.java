package com.example.demo.dao;

import com.example.demo.bean.Profit;
import com.example.demo.bean.ProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    long countByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int deleteByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int insert(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int insertSelective(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    List<Profit> selectByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    Profit selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Profit record, @Param("example") ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Profit record, @Param("example") ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Profit record);
}