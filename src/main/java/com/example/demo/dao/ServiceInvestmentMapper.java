package com.example.demo.dao;

import com.example.demo.bean.ServiceInvestment;
import com.example.demo.bean.ServiceInvestmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceInvestmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    long countByExample(ServiceInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int deleteByExample(ServiceInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int insert(ServiceInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int insertSelective(ServiceInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    List<ServiceInvestment> selectByExample(ServiceInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    ServiceInvestment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ServiceInvestment record, @Param("example") ServiceInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ServiceInvestment record, @Param("example") ServiceInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ServiceInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ServiceInvestment record);
}