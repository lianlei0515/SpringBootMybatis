package com.example.demo.dao;

import com.example.demo.bean.EstDebt;
import com.example.demo.bean.EstDebtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstDebtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    long countByExample(EstDebtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int deleteByExample(EstDebtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int insert(EstDebt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int insertSelective(EstDebt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    List<EstDebt> selectByExample(EstDebtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    EstDebt selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EstDebt record, @Param("example") EstDebtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EstDebt record, @Param("example") EstDebtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EstDebt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table est_debt
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EstDebt record);
}