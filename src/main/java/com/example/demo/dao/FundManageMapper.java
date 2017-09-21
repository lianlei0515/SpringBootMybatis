package com.example.demo.dao;

import com.example.demo.bean.FundManage;
import com.example.demo.bean.FundManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundManageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    long countByExample(FundManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int deleteByExample(FundManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int insert(FundManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int insertSelective(FundManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    List<FundManage> selectByExample(FundManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    FundManage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundManage record, @Param("example") FundManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundManage record, @Param("example") FundManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundManage record);
}