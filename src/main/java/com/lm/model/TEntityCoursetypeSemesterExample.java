package com.lm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEntityCoursetypeSemesterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEntityCoursetypeSemesterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCoursetypeIdIsNull() {
            addCriterion("coursetype_id is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdIsNotNull() {
            addCriterion("coursetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdEqualTo(String value) {
            addCriterion("coursetype_id =", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdNotEqualTo(String value) {
            addCriterion("coursetype_id <>", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdGreaterThan(String value) {
            addCriterion("coursetype_id >", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("coursetype_id >=", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdLessThan(String value) {
            addCriterion("coursetype_id <", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdLessThanOrEqualTo(String value) {
            addCriterion("coursetype_id <=", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdLike(String value) {
            addCriterion("coursetype_id like", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdNotLike(String value) {
            addCriterion("coursetype_id not like", value, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdIn(List<String> values) {
            addCriterion("coursetype_id in", values, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdNotIn(List<String> values) {
            addCriterion("coursetype_id not in", values, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdBetween(String value1, String value2) {
            addCriterion("coursetype_id between", value1, value2, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIdNotBetween(String value1, String value2) {
            addCriterion("coursetype_id not between", value1, value2, "coursetypeId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdIsNull() {
            addCriterion("semester_id is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIdIsNotNull() {
            addCriterion("semester_id is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterIdEqualTo(String value) {
            addCriterion("semester_id =", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdNotEqualTo(String value) {
            addCriterion("semester_id <>", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdGreaterThan(String value) {
            addCriterion("semester_id >", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdGreaterThanOrEqualTo(String value) {
            addCriterion("semester_id >=", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdLessThan(String value) {
            addCriterion("semester_id <", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdLessThanOrEqualTo(String value) {
            addCriterion("semester_id <=", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdLike(String value) {
            addCriterion("semester_id like", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdNotLike(String value) {
            addCriterion("semester_id not like", value, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdIn(List<String> values) {
            addCriterion("semester_id in", values, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdNotIn(List<String> values) {
            addCriterion("semester_id not in", values, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdBetween(String value1, String value2) {
            addCriterion("semester_id between", value1, value2, "semesterId");
            return (Criteria) this;
        }

        public Criteria andSemesterIdNotBetween(String value1, String value2) {
            addCriterion("semester_id not between", value1, value2, "semesterId");
            return (Criteria) this;
        }

        public Criteria andWeekCountIsNull() {
            addCriterion("week_count is null");
            return (Criteria) this;
        }

        public Criteria andWeekCountIsNotNull() {
            addCriterion("week_count is not null");
            return (Criteria) this;
        }

        public Criteria andWeekCountEqualTo(Integer value) {
            addCriterion("week_count =", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountNotEqualTo(Integer value) {
            addCriterion("week_count <>", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountGreaterThan(Integer value) {
            addCriterion("week_count >", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_count >=", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountLessThan(Integer value) {
            addCriterion("week_count <", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountLessThanOrEqualTo(Integer value) {
            addCriterion("week_count <=", value, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountIn(List<Integer> values) {
            addCriterion("week_count in", values, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountNotIn(List<Integer> values) {
            addCriterion("week_count not in", values, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountBetween(Integer value1, Integer value2) {
            addCriterion("week_count between", value1, value2, "weekCount");
            return (Criteria) this;
        }

        public Criteria andWeekCountNotBetween(Integer value1, Integer value2) {
            addCriterion("week_count not between", value1, value2, "weekCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountIsNull() {
            addCriterion("credit_count is null");
            return (Criteria) this;
        }

        public Criteria andCreditCountIsNotNull() {
            addCriterion("credit_count is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCountEqualTo(Integer value) {
            addCriterion("credit_count =", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotEqualTo(Integer value) {
            addCriterion("credit_count <>", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountGreaterThan(Integer value) {
            addCriterion("credit_count >", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_count >=", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountLessThan(Integer value) {
            addCriterion("credit_count <", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountLessThanOrEqualTo(Integer value) {
            addCriterion("credit_count <=", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountIn(List<Integer> values) {
            addCriterion("credit_count in", values, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotIn(List<Integer> values) {
            addCriterion("credit_count not in", values, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountBetween(Integer value1, Integer value2) {
            addCriterion("credit_count between", value1, value2, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_count not between", value1, value2, "creditCount");
            return (Criteria) this;
        }

        public Criteria andStatueIsNull() {
            addCriterion("statue is null");
            return (Criteria) this;
        }

        public Criteria andStatueIsNotNull() {
            addCriterion("statue is not null");
            return (Criteria) this;
        }

        public Criteria andStatueEqualTo(String value) {
            addCriterion("statue =", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotEqualTo(String value) {
            addCriterion("statue <>", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThan(String value) {
            addCriterion("statue >", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThanOrEqualTo(String value) {
            addCriterion("statue >=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThan(String value) {
            addCriterion("statue <", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThanOrEqualTo(String value) {
            addCriterion("statue <=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLike(String value) {
            addCriterion("statue like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotLike(String value) {
            addCriterion("statue not like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueIn(List<String> values) {
            addCriterion("statue in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotIn(List<String> values) {
            addCriterion("statue not in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueBetween(String value1, String value2) {
            addCriterion("statue between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotBetween(String value1, String value2) {
            addCriterion("statue not between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andEditbyIsNull() {
            addCriterion("editby is null");
            return (Criteria) this;
        }

        public Criteria andEditbyIsNotNull() {
            addCriterion("editby is not null");
            return (Criteria) this;
        }

        public Criteria andEditbyEqualTo(String value) {
            addCriterion("editby =", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyNotEqualTo(String value) {
            addCriterion("editby <>", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyGreaterThan(String value) {
            addCriterion("editby >", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyGreaterThanOrEqualTo(String value) {
            addCriterion("editby >=", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyLessThan(String value) {
            addCriterion("editby <", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyLessThanOrEqualTo(String value) {
            addCriterion("editby <=", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyLike(String value) {
            addCriterion("editby like", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyNotLike(String value) {
            addCriterion("editby not like", value, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyIn(List<String> values) {
            addCriterion("editby in", values, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyNotIn(List<String> values) {
            addCriterion("editby not in", values, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyBetween(String value1, String value2) {
            addCriterion("editby between", value1, value2, "editby");
            return (Criteria) this;
        }

        public Criteria andEditbyNotBetween(String value1, String value2) {
            addCriterion("editby not between", value1, value2, "editby");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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