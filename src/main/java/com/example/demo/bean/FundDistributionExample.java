package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundDistributionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public FundDistributionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
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
     * This method corresponds to the database table fund_distribution
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
     * This method corresponds to the database table fund_distribution
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution
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
     * This class corresponds to the database table fund_distribution
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

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNull() {
            addCriterion("distribution_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNotNull() {
            addCriterion("distribution_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeEqualTo(Date value) {
            addCriterion("distribution_time =", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotEqualTo(Date value) {
            addCriterion("distribution_time <>", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThan(Date value) {
            addCriterion("distribution_time >", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_time >=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThan(Date value) {
            addCriterion("distribution_time <", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_time <=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIn(List<Date> values) {
            addCriterion("distribution_time in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotIn(List<Date> values) {
            addCriterion("distribution_time not in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_time between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_time not between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNull() {
            addCriterion("distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNotNull() {
            addCriterion("distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountEqualTo(String value) {
            addCriterion("distribution_amount =", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotEqualTo(String value) {
            addCriterion("distribution_amount <>", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThan(String value) {
            addCriterion("distribution_amount >", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_amount >=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThan(String value) {
            addCriterion("distribution_amount <", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThanOrEqualTo(String value) {
            addCriterion("distribution_amount <=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLike(String value) {
            addCriterion("distribution_amount like", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotLike(String value) {
            addCriterion("distribution_amount not like", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIn(List<String> values) {
            addCriterion("distribution_amount in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotIn(List<String> values) {
            addCriterion("distribution_amount not in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountBetween(String value1, String value2) {
            addCriterion("distribution_amount between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotBetween(String value1, String value2) {
            addCriterion("distribution_amount not between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountIsNull() {
            addCriterion("distribution_count is null");
            return (Criteria) this;
        }

        public Criteria andDistributionCountIsNotNull() {
            addCriterion("distribution_count is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionCountEqualTo(String value) {
            addCriterion("distribution_count =", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountNotEqualTo(String value) {
            addCriterion("distribution_count <>", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountGreaterThan(String value) {
            addCriterion("distribution_count >", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_count >=", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountLessThan(String value) {
            addCriterion("distribution_count <", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountLessThanOrEqualTo(String value) {
            addCriterion("distribution_count <=", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountLike(String value) {
            addCriterion("distribution_count like", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountNotLike(String value) {
            addCriterion("distribution_count not like", value, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountIn(List<String> values) {
            addCriterion("distribution_count in", values, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountNotIn(List<String> values) {
            addCriterion("distribution_count not in", values, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountBetween(String value1, String value2) {
            addCriterion("distribution_count between", value1, value2, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andDistributionCountNotBetween(String value1, String value2) {
            addCriterion("distribution_count not between", value1, value2, "distributionCount");
            return (Criteria) this;
        }

        public Criteria andFundidIsNull() {
            addCriterion("fundId is null");
            return (Criteria) this;
        }

        public Criteria andFundidIsNotNull() {
            addCriterion("fundId is not null");
            return (Criteria) this;
        }

        public Criteria andFundidEqualTo(String value) {
            addCriterion("fundId =", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotEqualTo(String value) {
            addCriterion("fundId <>", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThan(String value) {
            addCriterion("fundId >", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThanOrEqualTo(String value) {
            addCriterion("fundId >=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThan(String value) {
            addCriterion("fundId <", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThanOrEqualTo(String value) {
            addCriterion("fundId <=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLike(String value) {
            addCriterion("fundId like", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotLike(String value) {
            addCriterion("fundId not like", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidIn(List<String> values) {
            addCriterion("fundId in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotIn(List<String> values) {
            addCriterion("fundId not in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidBetween(String value1, String value2) {
            addCriterion("fundId between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotBetween(String value1, String value2) {
            addCriterion("fundId not between", value1, value2, "fundid");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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

        public Criteria andDeletestatusEqualTo(String value) {
            addCriterion("deletestatus =", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotEqualTo(String value) {
            addCriterion("deletestatus <>", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThan(String value) {
            addCriterion("deletestatus >", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThanOrEqualTo(String value) {
            addCriterion("deletestatus >=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThan(String value) {
            addCriterion("deletestatus <", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThanOrEqualTo(String value) {
            addCriterion("deletestatus <=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLike(String value) {
            addCriterion("deletestatus like", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotLike(String value) {
            addCriterion("deletestatus not like", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIn(List<String> values) {
            addCriterion("deletestatus in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotIn(List<String> values) {
            addCriterion("deletestatus not in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusBetween(String value1, String value2) {
            addCriterion("deletestatus between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotBetween(String value1, String value2) {
            addCriterion("deletestatus not between", value1, value2, "deletestatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_distribution
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
     * This class corresponds to the database table fund_distribution
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