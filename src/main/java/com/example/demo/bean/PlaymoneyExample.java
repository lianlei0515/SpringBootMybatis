package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaymoneyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public PlaymoneyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
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
     * This method corresponds to the database table playmoney
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
     * This method corresponds to the database table playmoney
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playmoney
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
     * This class corresponds to the database table playmoney
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

        public Criteria andPlaymoneyDateIsNull() {
            addCriterion("playmoney_date is null");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateIsNotNull() {
            addCriterion("playmoney_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateEqualTo(Date value) {
            addCriterion("playmoney_date =", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateNotEqualTo(Date value) {
            addCriterion("playmoney_date <>", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateGreaterThan(Date value) {
            addCriterion("playmoney_date >", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("playmoney_date >=", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateLessThan(Date value) {
            addCriterion("playmoney_date <", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateLessThanOrEqualTo(Date value) {
            addCriterion("playmoney_date <=", value, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateIn(List<Date> values) {
            addCriterion("playmoney_date in", values, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateNotIn(List<Date> values) {
            addCriterion("playmoney_date not in", values, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateBetween(Date value1, Date value2) {
            addCriterion("playmoney_date between", value1, value2, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyDateNotBetween(Date value1, Date value2) {
            addCriterion("playmoney_date not between", value1, value2, "playmoneyDate");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserIsNull() {
            addCriterion("playmoney_user is null");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserIsNotNull() {
            addCriterion("playmoney_user is not null");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserEqualTo(String value) {
            addCriterion("playmoney_user =", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserNotEqualTo(String value) {
            addCriterion("playmoney_user <>", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserGreaterThan(String value) {
            addCriterion("playmoney_user >", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserGreaterThanOrEqualTo(String value) {
            addCriterion("playmoney_user >=", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserLessThan(String value) {
            addCriterion("playmoney_user <", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserLessThanOrEqualTo(String value) {
            addCriterion("playmoney_user <=", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserLike(String value) {
            addCriterion("playmoney_user like", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserNotLike(String value) {
            addCriterion("playmoney_user not like", value, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserIn(List<String> values) {
            addCriterion("playmoney_user in", values, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserNotIn(List<String> values) {
            addCriterion("playmoney_user not in", values, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserBetween(String value1, String value2) {
            addCriterion("playmoney_user between", value1, value2, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andPlaymoneyUserNotBetween(String value1, String value2) {
            addCriterion("playmoney_user not between", value1, value2, "playmoneyUser");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctIsNull() {
            addCriterion("receiver_acct is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctIsNotNull() {
            addCriterion("receiver_acct is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctEqualTo(String value) {
            addCriterion("receiver_acct =", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctNotEqualTo(String value) {
            addCriterion("receiver_acct <>", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctGreaterThan(String value) {
            addCriterion("receiver_acct >", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_acct >=", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctLessThan(String value) {
            addCriterion("receiver_acct <", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctLessThanOrEqualTo(String value) {
            addCriterion("receiver_acct <=", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctLike(String value) {
            addCriterion("receiver_acct like", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctNotLike(String value) {
            addCriterion("receiver_acct not like", value, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctIn(List<String> values) {
            addCriterion("receiver_acct in", values, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctNotIn(List<String> values) {
            addCriterion("receiver_acct not in", values, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctBetween(String value1, String value2) {
            addCriterion("receiver_acct between", value1, value2, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverAcctNotBetween(String value1, String value2) {
            addCriterion("receiver_acct not between", value1, value2, "receiverAcct");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIsNull() {
            addCriterion("receiver_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIsNotNull() {
            addCriterion("receiver_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserEqualTo(String value) {
            addCriterion("receiver_user =", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotEqualTo(String value) {
            addCriterion("receiver_user <>", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserGreaterThan(String value) {
            addCriterion("receiver_user >", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_user >=", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLessThan(String value) {
            addCriterion("receiver_user <", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLessThanOrEqualTo(String value) {
            addCriterion("receiver_user <=", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLike(String value) {
            addCriterion("receiver_user like", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotLike(String value) {
            addCriterion("receiver_user not like", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIn(List<String> values) {
            addCriterion("receiver_user in", values, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotIn(List<String> values) {
            addCriterion("receiver_user not in", values, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserBetween(String value1, String value2) {
            addCriterion("receiver_user between", value1, value2, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotBetween(String value1, String value2) {
            addCriterion("receiver_user not between", value1, value2, "receiverUser");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table playmoney
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
     * This class corresponds to the database table playmoney
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