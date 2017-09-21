package com.example.demo.dao;

import com.example.demo.bean.MessageRemind;
import com.example.demo.bean.MessageRemindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageRemindMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    long countByExample(MessageRemindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int deleteByExample(MessageRemindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int insert(MessageRemind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int insertSelective(MessageRemind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    List<MessageRemind> selectByExample(MessageRemindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    MessageRemind selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MessageRemind record, @Param("example") MessageRemindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MessageRemind record, @Param("example") MessageRemindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MessageRemind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_remind
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MessageRemind record);
}