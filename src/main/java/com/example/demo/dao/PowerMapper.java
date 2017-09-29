package com.example.demo.dao;

import com.example.demo.bean.Power;
import com.example.demo.bean.PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    long countByExample(PowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int deleteByExample(PowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int insert(Power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int insertSelective(Power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    List<Power> selectByExample(PowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    Power selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Power record);
}