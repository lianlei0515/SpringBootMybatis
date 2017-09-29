package com.example.demo.dao;

import com.example.demo.bean.ServiceFile;
import com.example.demo.bean.ServiceFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    long countByExample(ServiceFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int deleteByExample(ServiceFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int insert(ServiceFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int insertSelective(ServiceFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    List<ServiceFile> selectByExample(ServiceFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    ServiceFile selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ServiceFile record, @Param("example") ServiceFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ServiceFile record, @Param("example") ServiceFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ServiceFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ServiceFile record);
}