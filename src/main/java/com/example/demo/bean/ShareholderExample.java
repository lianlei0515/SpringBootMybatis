package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShareholderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public ShareholderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
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
     * This method corresponds to the database table shareholder
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
     * This method corresponds to the database table shareholder
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareholder
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
     * This class corresponds to the database table shareholder
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNull() {
            addCriterion("shareholder is null");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNotNull() {
            addCriterion("shareholder is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderEqualTo(String value) {
            addCriterion("shareholder =", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotEqualTo(String value) {
            addCriterion("shareholder <>", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThan(String value) {
            addCriterion("shareholder >", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder >=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThan(String value) {
            addCriterion("shareholder <", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThanOrEqualTo(String value) {
            addCriterion("shareholder <=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLike(String value) {
            addCriterion("shareholder like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotLike(String value) {
            addCriterion("shareholder not like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderIn(List<String> values) {
            addCriterion("shareholder in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotIn(List<String> values) {
            addCriterion("shareholder not in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderBetween(String value1, String value2) {
            addCriterion("shareholder between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotBetween(String value1, String value2) {
            addCriterion("shareholder not between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIsNull() {
            addCriterion("hold_number is null");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIsNotNull() {
            addCriterion("hold_number is not null");
            return (Criteria) this;
        }

        public Criteria andHoldNumberEqualTo(BigDecimal value) {
            addCriterion("hold_number =", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotEqualTo(BigDecimal value) {
            addCriterion("hold_number <>", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberGreaterThan(BigDecimal value) {
            addCriterion("hold_number >", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_number >=", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberLessThan(BigDecimal value) {
            addCriterion("hold_number <", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_number <=", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIn(List<BigDecimal> values) {
            addCriterion("hold_number in", values, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotIn(List<BigDecimal> values) {
            addCriterion("hold_number not in", values, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_number between", value1, value2, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_number not between", value1, value2, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldScaleIsNull() {
            addCriterion("hold_scale is null");
            return (Criteria) this;
        }

        public Criteria andHoldScaleIsNotNull() {
            addCriterion("hold_scale is not null");
            return (Criteria) this;
        }

        public Criteria andHoldScaleEqualTo(BigDecimal value) {
            addCriterion("hold_scale =", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleNotEqualTo(BigDecimal value) {
            addCriterion("hold_scale <>", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleGreaterThan(BigDecimal value) {
            addCriterion("hold_scale >", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_scale >=", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleLessThan(BigDecimal value) {
            addCriterion("hold_scale <", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_scale <=", value, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleIn(List<BigDecimal> values) {
            addCriterion("hold_scale in", values, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleNotIn(List<BigDecimal> values) {
            addCriterion("hold_scale not in", values, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_scale between", value1, value2, "holdScale");
            return (Criteria) this;
        }

        public Criteria andHoldScaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_scale not between", value1, value2, "holdScale");
            return (Criteria) this;
        }

        public Criteria andChangedIsNull() {
            addCriterion("changed is null");
            return (Criteria) this;
        }

        public Criteria andChangedIsNotNull() {
            addCriterion("changed is not null");
            return (Criteria) this;
        }

        public Criteria andChangedEqualTo(String value) {
            addCriterion("changed =", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotEqualTo(String value) {
            addCriterion("changed <>", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThan(String value) {
            addCriterion("changed >", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThanOrEqualTo(String value) {
            addCriterion("changed >=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThan(String value) {
            addCriterion("changed <", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThanOrEqualTo(String value) {
            addCriterion("changed <=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLike(String value) {
            addCriterion("changed like", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotLike(String value) {
            addCriterion("changed not like", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedIn(List<String> values) {
            addCriterion("changed in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotIn(List<String> values) {
            addCriterion("changed not in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedBetween(String value1, String value2) {
            addCriterion("changed between", value1, value2, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotBetween(String value1, String value2) {
            addCriterion("changed not between", value1, value2, "changed");
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

        public Criteria andDeteledstatusIsNull() {
            addCriterion("deteledstatus is null");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusIsNotNull() {
            addCriterion("deteledstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusEqualTo(Integer value) {
            addCriterion("deteledstatus =", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusNotEqualTo(Integer value) {
            addCriterion("deteledstatus <>", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusGreaterThan(Integer value) {
            addCriterion("deteledstatus >", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deteledstatus >=", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusLessThan(Integer value) {
            addCriterion("deteledstatus <", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusLessThanOrEqualTo(Integer value) {
            addCriterion("deteledstatus <=", value, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusIn(List<Integer> values) {
            addCriterion("deteledstatus in", values, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusNotIn(List<Integer> values) {
            addCriterion("deteledstatus not in", values, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusBetween(Integer value1, Integer value2) {
            addCriterion("deteledstatus between", value1, value2, "deteledstatus");
            return (Criteria) this;
        }

        public Criteria andDeteledstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deteledstatus not between", value1, value2, "deteledstatus");
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

        public Criteria andStateProportionIsNull() {
            addCriterion("state_proportion is null");
            return (Criteria) this;
        }

        public Criteria andStateProportionIsNotNull() {
            addCriterion("state_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andStateProportionEqualTo(String value) {
            addCriterion("state_proportion =", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionNotEqualTo(String value) {
            addCriterion("state_proportion <>", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionGreaterThan(String value) {
            addCriterion("state_proportion >", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionGreaterThanOrEqualTo(String value) {
            addCriterion("state_proportion >=", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionLessThan(String value) {
            addCriterion("state_proportion <", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionLessThanOrEqualTo(String value) {
            addCriterion("state_proportion <=", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionLike(String value) {
            addCriterion("state_proportion like", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionNotLike(String value) {
            addCriterion("state_proportion not like", value, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionIn(List<String> values) {
            addCriterion("state_proportion in", values, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionNotIn(List<String> values) {
            addCriterion("state_proportion not in", values, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionBetween(String value1, String value2) {
            addCriterion("state_proportion between", value1, value2, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andStateProportionNotBetween(String value1, String value2) {
            addCriterion("state_proportion not between", value1, value2, "stateProportion");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shareholder
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
     * This class corresponds to the database table shareholder
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