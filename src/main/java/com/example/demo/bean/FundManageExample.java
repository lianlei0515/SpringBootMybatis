package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundManageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public FundManageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
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
     * This method corresponds to the database table fund_manage
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
     * This method corresponds to the database table fund_manage
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_manage
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
     * This class corresponds to the database table fund_manage
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

        public Criteria andFundidIsNull() {
            addCriterion("fundid is null");
            return (Criteria) this;
        }

        public Criteria andFundidIsNotNull() {
            addCriterion("fundid is not null");
            return (Criteria) this;
        }

        public Criteria andFundidEqualTo(String value) {
            addCriterion("fundid =", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotEqualTo(String value) {
            addCriterion("fundid <>", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThan(String value) {
            addCriterion("fundid >", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThanOrEqualTo(String value) {
            addCriterion("fundid >=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThan(String value) {
            addCriterion("fundid <", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThanOrEqualTo(String value) {
            addCriterion("fundid <=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLike(String value) {
            addCriterion("fundid like", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotLike(String value) {
            addCriterion("fundid not like", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidIn(List<String> values) {
            addCriterion("fundid in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotIn(List<String> values) {
            addCriterion("fundid not in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidBetween(String value1, String value2) {
            addCriterion("fundid between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotBetween(String value1, String value2) {
            addCriterion("fundid not between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeIsNull() {
            addCriterion("manage_time is null");
            return (Criteria) this;
        }

        public Criteria andManageTimeIsNotNull() {
            addCriterion("manage_time is not null");
            return (Criteria) this;
        }

        public Criteria andManageTimeEqualTo(Date value) {
            addCriterion("manage_time =", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeNotEqualTo(Date value) {
            addCriterion("manage_time <>", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeGreaterThan(Date value) {
            addCriterion("manage_time >", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_time >=", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeLessThan(Date value) {
            addCriterion("manage_time <", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_time <=", value, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeIn(List<Date> values) {
            addCriterion("manage_time in", values, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeNotIn(List<Date> values) {
            addCriterion("manage_time not in", values, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeBetween(Date value1, Date value2) {
            addCriterion("manage_time between", value1, value2, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManageTimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_time not between", value1, value2, "manageTime");
            return (Criteria) this;
        }

        public Criteria andManagersNameIsNull() {
            addCriterion("managers_name is null");
            return (Criteria) this;
        }

        public Criteria andManagersNameIsNotNull() {
            addCriterion("managers_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagersNameEqualTo(String value) {
            addCriterion("managers_name =", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameNotEqualTo(String value) {
            addCriterion("managers_name <>", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameGreaterThan(String value) {
            addCriterion("managers_name >", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameGreaterThanOrEqualTo(String value) {
            addCriterion("managers_name >=", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameLessThan(String value) {
            addCriterion("managers_name <", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameLessThanOrEqualTo(String value) {
            addCriterion("managers_name <=", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameLike(String value) {
            addCriterion("managers_name like", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameNotLike(String value) {
            addCriterion("managers_name not like", value, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameIn(List<String> values) {
            addCriterion("managers_name in", values, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameNotIn(List<String> values) {
            addCriterion("managers_name not in", values, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameBetween(String value1, String value2) {
            addCriterion("managers_name between", value1, value2, "managersName");
            return (Criteria) this;
        }

        public Criteria andManagersNameNotBetween(String value1, String value2) {
            addCriterion("managers_name not between", value1, value2, "managersName");
            return (Criteria) this;
        }

        public Criteria andManageRecordIsNull() {
            addCriterion("manage_record is null");
            return (Criteria) this;
        }

        public Criteria andManageRecordIsNotNull() {
            addCriterion("manage_record is not null");
            return (Criteria) this;
        }

        public Criteria andManageRecordEqualTo(String value) {
            addCriterion("manage_record =", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordNotEqualTo(String value) {
            addCriterion("manage_record <>", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordGreaterThan(String value) {
            addCriterion("manage_record >", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordGreaterThanOrEqualTo(String value) {
            addCriterion("manage_record >=", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordLessThan(String value) {
            addCriterion("manage_record <", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordLessThanOrEqualTo(String value) {
            addCriterion("manage_record <=", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordLike(String value) {
            addCriterion("manage_record like", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordNotLike(String value) {
            addCriterion("manage_record not like", value, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordIn(List<String> values) {
            addCriterion("manage_record in", values, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordNotIn(List<String> values) {
            addCriterion("manage_record not in", values, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordBetween(String value1, String value2) {
            addCriterion("manage_record between", value1, value2, "manageRecord");
            return (Criteria) this;
        }

        public Criteria andManageRecordNotBetween(String value1, String value2) {
            addCriterion("manage_record not between", value1, value2, "manageRecord");
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

        public Criteria andManageTopIsNull() {
            addCriterion("manage_top is null");
            return (Criteria) this;
        }

        public Criteria andManageTopIsNotNull() {
            addCriterion("manage_top is not null");
            return (Criteria) this;
        }

        public Criteria andManageTopEqualTo(String value) {
            addCriterion("manage_top =", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopNotEqualTo(String value) {
            addCriterion("manage_top <>", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopGreaterThan(String value) {
            addCriterion("manage_top >", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopGreaterThanOrEqualTo(String value) {
            addCriterion("manage_top >=", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopLessThan(String value) {
            addCriterion("manage_top <", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopLessThanOrEqualTo(String value) {
            addCriterion("manage_top <=", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopLike(String value) {
            addCriterion("manage_top like", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopNotLike(String value) {
            addCriterion("manage_top not like", value, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopIn(List<String> values) {
            addCriterion("manage_top in", values, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopNotIn(List<String> values) {
            addCriterion("manage_top not in", values, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopBetween(String value1, String value2) {
            addCriterion("manage_top between", value1, value2, "manageTop");
            return (Criteria) this;
        }

        public Criteria andManageTopNotBetween(String value1, String value2) {
            addCriterion("manage_top not between", value1, value2, "manageTop");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_manage
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
     * This class corresponds to the database table fund_manage
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