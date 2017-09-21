package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public FundExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundLengthenIsNull() {
            addCriterion("fund_lengthen is null");
            return (Criteria) this;
        }

        public Criteria andFundLengthenIsNotNull() {
            addCriterion("fund_lengthen is not null");
            return (Criteria) this;
        }

        public Criteria andFundLengthenEqualTo(String value) {
            addCriterion("fund_lengthen =", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenNotEqualTo(String value) {
            addCriterion("fund_lengthen <>", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenGreaterThan(String value) {
            addCriterion("fund_lengthen >", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenGreaterThanOrEqualTo(String value) {
            addCriterion("fund_lengthen >=", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenLessThan(String value) {
            addCriterion("fund_lengthen <", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenLessThanOrEqualTo(String value) {
            addCriterion("fund_lengthen <=", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenLike(String value) {
            addCriterion("fund_lengthen like", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenNotLike(String value) {
            addCriterion("fund_lengthen not like", value, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenIn(List<String> values) {
            addCriterion("fund_lengthen in", values, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenNotIn(List<String> values) {
            addCriterion("fund_lengthen not in", values, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenBetween(String value1, String value2) {
            addCriterion("fund_lengthen between", value1, value2, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andFundLengthenNotBetween(String value1, String value2) {
            addCriterion("fund_lengthen not between", value1, value2, "fundLengthen");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andFundAllnameIsNull() {
            addCriterion("fund_allname is null");
            return (Criteria) this;
        }

        public Criteria andFundAllnameIsNotNull() {
            addCriterion("fund_allname is not null");
            return (Criteria) this;
        }

        public Criteria andFundAllnameEqualTo(String value) {
            addCriterion("fund_allname =", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameNotEqualTo(String value) {
            addCriterion("fund_allname <>", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameGreaterThan(String value) {
            addCriterion("fund_allname >", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_allname >=", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameLessThan(String value) {
            addCriterion("fund_allname <", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameLessThanOrEqualTo(String value) {
            addCriterion("fund_allname <=", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameLike(String value) {
            addCriterion("fund_allname like", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameNotLike(String value) {
            addCriterion("fund_allname not like", value, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameIn(List<String> values) {
            addCriterion("fund_allname in", values, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameNotIn(List<String> values) {
            addCriterion("fund_allname not in", values, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameBetween(String value1, String value2) {
            addCriterion("fund_allname between", value1, value2, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundAllnameNotBetween(String value1, String value2) {
            addCriterion("fund_allname not between", value1, value2, "fundAllname");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("fund_name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("fund_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("fund_name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("fund_name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("fund_name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("fund_name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("fund_name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("fund_name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("fund_name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("fund_name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("fund_name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("fund_name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("fund_name not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("fund_type is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("fund_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("fund_type =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("fund_type <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("fund_type >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_type >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("fund_type <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_type <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("fund_type like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("fund_type not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("fund_type in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("fund_type not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("fund_type between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("fund_type not between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNull() {
            addCriterion("deletestatus is null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNotNull() {
            addCriterion("deletestatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusEqualTo(Integer value) {
            addCriterion("deletestatus =", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotEqualTo(Integer value) {
            addCriterion("deletestatus <>", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThan(Integer value) {
            addCriterion("deletestatus >", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deletestatus >=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThan(Integer value) {
            addCriterion("deletestatus <", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThanOrEqualTo(Integer value) {
            addCriterion("deletestatus <=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIn(List<Integer> values) {
            addCriterion("deletestatus in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotIn(List<Integer> values) {
            addCriterion("deletestatus not in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusBetween(Integer value1, Integer value2) {
            addCriterion("deletestatus between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deletestatus not between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andRundimensionIsNull() {
            addCriterion("rundimension is null");
            return (Criteria) this;
        }

        public Criteria andRundimensionIsNotNull() {
            addCriterion("rundimension is not null");
            return (Criteria) this;
        }

        public Criteria andRundimensionEqualTo(Integer value) {
            addCriterion("rundimension =", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionNotEqualTo(Integer value) {
            addCriterion("rundimension <>", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionGreaterThan(Integer value) {
            addCriterion("rundimension >", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rundimension >=", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionLessThan(Integer value) {
            addCriterion("rundimension <", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionLessThanOrEqualTo(Integer value) {
            addCriterion("rundimension <=", value, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionIn(List<Integer> values) {
            addCriterion("rundimension in", values, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionNotIn(List<Integer> values) {
            addCriterion("rundimension not in", values, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionBetween(Integer value1, Integer value2) {
            addCriterion("rundimension between", value1, value2, "rundimension");
            return (Criteria) this;
        }

        public Criteria andRundimensionNotBetween(Integer value1, Integer value2) {
            addCriterion("rundimension not between", value1, value2, "rundimension");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionIsNull() {
            addCriterion("investment_direction is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionIsNotNull() {
            addCriterion("investment_direction is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionEqualTo(String value) {
            addCriterion("investment_direction =", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionNotEqualTo(String value) {
            addCriterion("investment_direction <>", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionGreaterThan(String value) {
            addCriterion("investment_direction >", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("investment_direction >=", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionLessThan(String value) {
            addCriterion("investment_direction <", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionLessThanOrEqualTo(String value) {
            addCriterion("investment_direction <=", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionLike(String value) {
            addCriterion("investment_direction like", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionNotLike(String value) {
            addCriterion("investment_direction not like", value, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionIn(List<String> values) {
            addCriterion("investment_direction in", values, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionNotIn(List<String> values) {
            addCriterion("investment_direction not in", values, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionBetween(String value1, String value2) {
            addCriterion("investment_direction between", value1, value2, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andInvestmentDirectionNotBetween(String value1, String value2) {
            addCriterion("investment_direction not between", value1, value2, "investmentDirection");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andIsContectIsNull() {
            addCriterion("is_contect is null");
            return (Criteria) this;
        }

        public Criteria andIsContectIsNotNull() {
            addCriterion("is_contect is not null");
            return (Criteria) this;
        }

        public Criteria andIsContectEqualTo(String value) {
            addCriterion("is_contect =", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectNotEqualTo(String value) {
            addCriterion("is_contect <>", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectGreaterThan(String value) {
            addCriterion("is_contect >", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectGreaterThanOrEqualTo(String value) {
            addCriterion("is_contect >=", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectLessThan(String value) {
            addCriterion("is_contect <", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectLessThanOrEqualTo(String value) {
            addCriterion("is_contect <=", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectLike(String value) {
            addCriterion("is_contect like", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectNotLike(String value) {
            addCriterion("is_contect not like", value, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectIn(List<String> values) {
            addCriterion("is_contect in", values, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectNotIn(List<String> values) {
            addCriterion("is_contect not in", values, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectBetween(String value1, String value2) {
            addCriterion("is_contect between", value1, value2, "isContect");
            return (Criteria) this;
        }

        public Criteria andIsContectNotBetween(String value1, String value2) {
            addCriterion("is_contect not between", value1, value2, "isContect");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}