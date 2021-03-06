package com.example.demo.dao;

import com.example.demo.bean.FundPartnerFile;
import com.example.demo.bean.FundPartnerFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundPartnerFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    long countByExample(FundPartnerFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int deleteByExample(FundPartnerFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int insert(FundPartnerFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int insertSelective(FundPartnerFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    List<FundPartnerFile> selectByExample(FundPartnerFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    FundPartnerFile selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundPartnerFile record, @Param("example") FundPartnerFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundPartnerFile record, @Param("example") FundPartnerFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundPartnerFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_partner_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundPartnerFile record);
}