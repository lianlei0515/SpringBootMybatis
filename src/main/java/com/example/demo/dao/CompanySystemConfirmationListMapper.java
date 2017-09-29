package com.example.demo.dao;

import com.example.demo.bean.CompanySystemConfirmationList;
import com.example.demo.bean.CompanySystemConfirmationListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanySystemConfirmationListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    long countByExample(CompanySystemConfirmationListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int deleteByExample(CompanySystemConfirmationListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int insert(CompanySystemConfirmationList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int insertSelective(CompanySystemConfirmationList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    List<CompanySystemConfirmationList> selectByExample(CompanySystemConfirmationListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    CompanySystemConfirmationList selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CompanySystemConfirmationList record, @Param("example") CompanySystemConfirmationListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CompanySystemConfirmationList record, @Param("example") CompanySystemConfirmationListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CompanySystemConfirmationList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_system_confirmation_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CompanySystemConfirmationList record);
}