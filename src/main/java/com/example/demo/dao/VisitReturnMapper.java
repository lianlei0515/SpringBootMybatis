package com.example.demo.dao;

import com.example.demo.bean.VisitReturn;
import com.example.demo.bean.VisitReturnExample;
import com.example.demo.bean.VisitReturnWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitReturnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    long countByExample(VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int deleteByExample(VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int insert(VisitReturnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int insertSelective(VisitReturnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    List<VisitReturnWithBLOBs> selectByExampleWithBLOBs(VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    List<VisitReturn> selectByExample(VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    VisitReturnWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VisitReturnWithBLOBs record, @Param("example") VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") VisitReturnWithBLOBs record, @Param("example") VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VisitReturn record, @Param("example") VisitReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VisitReturnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(VisitReturnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_return
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VisitReturn record);
}