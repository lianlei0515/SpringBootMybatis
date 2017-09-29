package com.example.demo.dao;

import com.example.demo.bean.TzUserReviewRel;
import com.example.demo.bean.TzUserReviewRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzUserReviewRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    long countByExample(TzUserReviewRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int deleteByExample(TzUserReviewRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int insert(TzUserReviewRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int insertSelective(TzUserReviewRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    List<TzUserReviewRel> selectByExample(TzUserReviewRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    TzUserReviewRel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TzUserReviewRel record, @Param("example") TzUserReviewRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TzUserReviewRel record, @Param("example") TzUserReviewRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TzUserReviewRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tz_user_review_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TzUserReviewRel record);
}