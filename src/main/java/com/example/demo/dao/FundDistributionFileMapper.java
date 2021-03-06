package com.example.demo.dao;

import com.example.demo.bean.FundDistributionFile;
import com.example.demo.bean.FundDistributionFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundDistributionFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    long countByExample(FundDistributionFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int deleteByExample(FundDistributionFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int insert(FundDistributionFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int insertSelective(FundDistributionFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    List<FundDistributionFile> selectByExample(FundDistributionFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    FundDistributionFile selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundDistributionFile record, @Param("example") FundDistributionFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundDistributionFile record, @Param("example") FundDistributionFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundDistributionFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundDistributionFile record);
}