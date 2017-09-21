package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundDistributionFileExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public FundDistributionFileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
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
     * This method corresponds to the database table fund_distribution_file
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
     * This method corresponds to the database table fund_distribution_file
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_distribution_file
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
     * This class corresponds to the database table fund_distribution_file
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

        public Criteria andFundDistributionIdIsNull() {
            addCriterion("fund_distribution_id is null");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdIsNotNull() {
            addCriterion("fund_distribution_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdEqualTo(String value) {
            addCriterion("fund_distribution_id =", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdNotEqualTo(String value) {
            addCriterion("fund_distribution_id <>", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdGreaterThan(String value) {
            addCriterion("fund_distribution_id >", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_distribution_id >=", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdLessThan(String value) {
            addCriterion("fund_distribution_id <", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdLessThanOrEqualTo(String value) {
            addCriterion("fund_distribution_id <=", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdLike(String value) {
            addCriterion("fund_distribution_id like", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdNotLike(String value) {
            addCriterion("fund_distribution_id not like", value, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdIn(List<String> values) {
            addCriterion("fund_distribution_id in", values, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdNotIn(List<String> values) {
            addCriterion("fund_distribution_id not in", values, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdBetween(String value1, String value2) {
            addCriterion("fund_distribution_id between", value1, value2, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFundDistributionIdNotBetween(String value1, String value2) {
            addCriterion("fund_distribution_id not between", value1, value2, "fundDistributionId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileSrcIsNull() {
            addCriterion("file_src is null");
            return (Criteria) this;
        }

        public Criteria andFileSrcIsNotNull() {
            addCriterion("file_src is not null");
            return (Criteria) this;
        }

        public Criteria andFileSrcEqualTo(String value) {
            addCriterion("file_src =", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcNotEqualTo(String value) {
            addCriterion("file_src <>", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcGreaterThan(String value) {
            addCriterion("file_src >", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcGreaterThanOrEqualTo(String value) {
            addCriterion("file_src >=", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcLessThan(String value) {
            addCriterion("file_src <", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcLessThanOrEqualTo(String value) {
            addCriterion("file_src <=", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcLike(String value) {
            addCriterion("file_src like", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcNotLike(String value) {
            addCriterion("file_src not like", value, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcIn(List<String> values) {
            addCriterion("file_src in", values, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcNotIn(List<String> values) {
            addCriterion("file_src not in", values, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcBetween(String value1, String value2) {
            addCriterion("file_src between", value1, value2, "fileSrc");
            return (Criteria) this;
        }

        public Criteria andFileSrcNotBetween(String value1, String value2) {
            addCriterion("file_src not between", value1, value2, "fileSrc");
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

        public Criteria andUploadUserIdIsNull() {
            addCriterion("upload_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("upload_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(String value) {
            addCriterion("upload_user_id =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(String value) {
            addCriterion("upload_user_id <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(String value) {
            addCriterion("upload_user_id >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("upload_user_id >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(String value) {
            addCriterion("upload_user_id <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(String value) {
            addCriterion("upload_user_id <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLike(String value) {
            addCriterion("upload_user_id like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotLike(String value) {
            addCriterion("upload_user_id not like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<String> values) {
            addCriterion("upload_user_id in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<String> values) {
            addCriterion("upload_user_id not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(String value1, String value2) {
            addCriterion("upload_user_id between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(String value1, String value2) {
            addCriterion("upload_user_id not between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_distribution_file
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
     * This class corresponds to the database table fund_distribution_file
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