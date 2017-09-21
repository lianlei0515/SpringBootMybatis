package com.example.demo.dao;

import com.example.demo.bean.Sitemap;
import com.example.demo.bean.SitemapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SitemapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    long countByExample(SitemapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int deleteByExample(SitemapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int insert(Sitemap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int insertSelective(Sitemap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    List<Sitemap> selectByExample(SitemapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    Sitemap selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Sitemap record, @Param("example") SitemapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Sitemap record, @Param("example") SitemapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sitemap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitemap
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sitemap record);
}