package com.example.demo.dao;

import com.example.demo.bean.VisitFile;
import com.example.demo.bean.VisitFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    long countByExample(VisitFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int deleteByExample(VisitFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int insert(VisitFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int insertSelective(VisitFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    List<VisitFile> selectByExample(VisitFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    VisitFile selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VisitFile record, @Param("example") VisitFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VisitFile record, @Param("example") VisitFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VisitFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VisitFile record);
}