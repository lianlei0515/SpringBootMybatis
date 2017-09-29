package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceInvestmentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public ServiceInvestmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
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
     * This method corresponds to the database table service_investment
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
     * This method corresponds to the database table service_investment
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service_investment
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
     * This class corresponds to the database table service_investment
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("Service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("Service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("Service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("Service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("Service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("Service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("Service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("Service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("Service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("Service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("Service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("Service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("Service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceRecordIsNull() {
            addCriterion("service_record is null");
            return (Criteria) this;
        }

        public Criteria andServiceRecordIsNotNull() {
            addCriterion("service_record is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRecordEqualTo(String value) {
            addCriterion("service_record =", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordNotEqualTo(String value) {
            addCriterion("service_record <>", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordGreaterThan(String value) {
            addCriterion("service_record >", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordGreaterThanOrEqualTo(String value) {
            addCriterion("service_record >=", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordLessThan(String value) {
            addCriterion("service_record <", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordLessThanOrEqualTo(String value) {
            addCriterion("service_record <=", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordLike(String value) {
            addCriterion("service_record like", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordNotLike(String value) {
            addCriterion("service_record not like", value, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordIn(List<String> values) {
            addCriterion("service_record in", values, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordNotIn(List<String> values) {
            addCriterion("service_record not in", values, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordBetween(String value1, String value2) {
            addCriterion("service_record between", value1, value2, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andServiceRecordNotBetween(String value1, String value2) {
            addCriterion("service_record not between", value1, value2, "serviceRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIsNull() {
            addCriterion("interview_record is null");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIsNotNull() {
            addCriterion("interview_record is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordEqualTo(String value) {
            addCriterion("interview_record =", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordNotEqualTo(String value) {
            addCriterion("interview_record <>", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordGreaterThan(String value) {
            addCriterion("interview_record >", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordGreaterThanOrEqualTo(String value) {
            addCriterion("interview_record >=", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordLessThan(String value) {
            addCriterion("interview_record <", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordLessThanOrEqualTo(String value) {
            addCriterion("interview_record <=", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordLike(String value) {
            addCriterion("interview_record like", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordNotLike(String value) {
            addCriterion("interview_record not like", value, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIn(List<String> values) {
            addCriterion("interview_record in", values, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordNotIn(List<String> values) {
            addCriterion("interview_record not in", values, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordBetween(String value1, String value2) {
            addCriterion("interview_record between", value1, value2, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordNotBetween(String value1, String value2) {
            addCriterion("interview_record not between", value1, value2, "interviewRecord");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andSercerTimeIsNull() {
            addCriterion("sercer_time is null");
            return (Criteria) this;
        }

        public Criteria andSercerTimeIsNotNull() {
            addCriterion("sercer_time is not null");
            return (Criteria) this;
        }

        public Criteria andSercerTimeEqualTo(Date value) {
            addCriterion("sercer_time =", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeNotEqualTo(Date value) {
            addCriterion("sercer_time <>", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeGreaterThan(Date value) {
            addCriterion("sercer_time >", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sercer_time >=", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeLessThan(Date value) {
            addCriterion("sercer_time <", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeLessThanOrEqualTo(Date value) {
            addCriterion("sercer_time <=", value, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeIn(List<Date> values) {
            addCriterion("sercer_time in", values, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeNotIn(List<Date> values) {
            addCriterion("sercer_time not in", values, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeBetween(Date value1, Date value2) {
            addCriterion("sercer_time between", value1, value2, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andSercerTimeNotBetween(Date value1, Date value2) {
            addCriterion("sercer_time not between", value1, value2, "sercerTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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

        public Criteria andServertopIsNull() {
            addCriterion("serverTop is null");
            return (Criteria) this;
        }

        public Criteria andServertopIsNotNull() {
            addCriterion("serverTop is not null");
            return (Criteria) this;
        }

        public Criteria andServertopEqualTo(String value) {
            addCriterion("serverTop =", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopNotEqualTo(String value) {
            addCriterion("serverTop <>", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopGreaterThan(String value) {
            addCriterion("serverTop >", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopGreaterThanOrEqualTo(String value) {
            addCriterion("serverTop >=", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopLessThan(String value) {
            addCriterion("serverTop <", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopLessThanOrEqualTo(String value) {
            addCriterion("serverTop <=", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopLike(String value) {
            addCriterion("serverTop like", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopNotLike(String value) {
            addCriterion("serverTop not like", value, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopIn(List<String> values) {
            addCriterion("serverTop in", values, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopNotIn(List<String> values) {
            addCriterion("serverTop not in", values, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopBetween(String value1, String value2) {
            addCriterion("serverTop between", value1, value2, "servertop");
            return (Criteria) this;
        }

        public Criteria andServertopNotBetween(String value1, String value2) {
            addCriterion("serverTop not between", value1, value2, "servertop");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table service_investment
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
     * This class corresponds to the database table service_investment
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