package com.lm.model.plan.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEntityCompanyNeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEntityCompanyNeedExample() {
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

        public Criteria andCompanyNeedIdIsNull() {
            addCriterion("company_need_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdIsNotNull() {
            addCriterion("company_need_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdEqualTo(Integer value) {
            addCriterion("company_need_id =", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdNotEqualTo(Integer value) {
            addCriterion("company_need_id <>", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdGreaterThan(Integer value) {
            addCriterion("company_need_id >", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_need_id >=", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdLessThan(Integer value) {
            addCriterion("company_need_id <", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_need_id <=", value, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdIn(List<Integer> values) {
            addCriterion("company_need_id in", values, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdNotIn(List<Integer> values) {
            addCriterion("company_need_id not in", values, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdBetween(Integer value1, Integer value2) {
            addCriterion("company_need_id between", value1, value2, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_need_id not between", value1, value2, "companyNeedId");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameIsNull() {
            addCriterion("company_need_job_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameIsNotNull() {
            addCriterion("company_need_job_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameEqualTo(String value) {
            addCriterion("company_need_job_name =", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameNotEqualTo(String value) {
            addCriterion("company_need_job_name <>", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameGreaterThan(String value) {
            addCriterion("company_need_job_name >", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_job_name >=", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameLessThan(String value) {
            addCriterion("company_need_job_name <", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameLessThanOrEqualTo(String value) {
            addCriterion("company_need_job_name <=", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameLike(String value) {
            addCriterion("company_need_job_name like", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameNotLike(String value) {
            addCriterion("company_need_job_name not like", value, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameIn(List<String> values) {
            addCriterion("company_need_job_name in", values, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameNotIn(List<String> values) {
            addCriterion("company_need_job_name not in", values, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameBetween(String value1, String value2) {
            addCriterion("company_need_job_name between", value1, value2, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedJobNameNotBetween(String value1, String value2) {
            addCriterion("company_need_job_name not between", value1, value2, "companyNeedJobName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionIsNull() {
            addCriterion("company_need_description is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionIsNotNull() {
            addCriterion("company_need_description is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionEqualTo(String value) {
            addCriterion("company_need_description =", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionNotEqualTo(String value) {
            addCriterion("company_need_description <>", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionGreaterThan(String value) {
            addCriterion("company_need_description >", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_description >=", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionLessThan(String value) {
            addCriterion("company_need_description <", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionLessThanOrEqualTo(String value) {
            addCriterion("company_need_description <=", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionLike(String value) {
            addCriterion("company_need_description like", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionNotLike(String value) {
            addCriterion("company_need_description not like", value, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionIn(List<String> values) {
            addCriterion("company_need_description in", values, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionNotIn(List<String> values) {
            addCriterion("company_need_description not in", values, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionBetween(String value1, String value2) {
            addCriterion("company_need_description between", value1, value2, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedDescriptionNotBetween(String value1, String value2) {
            addCriterion("company_need_description not between", value1, value2, "companyNeedDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeIsNull() {
            addCriterion("company_need_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeIsNotNull() {
            addCriterion("company_need_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeEqualTo(Integer value) {
            addCriterion("company_need_type =", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeNotEqualTo(Integer value) {
            addCriterion("company_need_type <>", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeGreaterThan(Integer value) {
            addCriterion("company_need_type >", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_need_type >=", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeLessThan(Integer value) {
            addCriterion("company_need_type <", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_need_type <=", value, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeIn(List<Integer> values) {
            addCriterion("company_need_type in", values, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeNotIn(List<Integer> values) {
            addCriterion("company_need_type not in", values, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_need_type between", value1, value2, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_need_type not between", value1, value2, "companyNeedType");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionIsNull() {
            addCriterion("company_need_profession is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionIsNotNull() {
            addCriterion("company_need_profession is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionEqualTo(String value) {
            addCriterion("company_need_profession =", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionNotEqualTo(String value) {
            addCriterion("company_need_profession <>", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionGreaterThan(String value) {
            addCriterion("company_need_profession >", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_profession >=", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionLessThan(String value) {
            addCriterion("company_need_profession <", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionLessThanOrEqualTo(String value) {
            addCriterion("company_need_profession <=", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionLike(String value) {
            addCriterion("company_need_profession like", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionNotLike(String value) {
            addCriterion("company_need_profession not like", value, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionIn(List<String> values) {
            addCriterion("company_need_profession in", values, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionNotIn(List<String> values) {
            addCriterion("company_need_profession not in", values, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionBetween(String value1, String value2) {
            addCriterion("company_need_profession between", value1, value2, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedProfessionNotBetween(String value1, String value2) {
            addCriterion("company_need_profession not between", value1, value2, "companyNeedProfession");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameIsNull() {
            addCriterion("company_need_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameIsNotNull() {
            addCriterion("company_need_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameEqualTo(String value) {
            addCriterion("company_need_name =", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameNotEqualTo(String value) {
            addCriterion("company_need_name <>", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameGreaterThan(String value) {
            addCriterion("company_need_name >", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_name >=", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameLessThan(String value) {
            addCriterion("company_need_name <", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameLessThanOrEqualTo(String value) {
            addCriterion("company_need_name <=", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameLike(String value) {
            addCriterion("company_need_name like", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameNotLike(String value) {
            addCriterion("company_need_name not like", value, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameIn(List<String> values) {
            addCriterion("company_need_name in", values, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameNotIn(List<String> values) {
            addCriterion("company_need_name not in", values, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameBetween(String value1, String value2) {
            addCriterion("company_need_name between", value1, value2, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedNameNotBetween(String value1, String value2) {
            addCriterion("company_need_name not between", value1, value2, "companyNeedName");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionIsNull() {
            addCriterion("company_need_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionIsNotNull() {
            addCriterion("company_need_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionEqualTo(String value) {
            addCriterion("company_need_introduction =", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionNotEqualTo(String value) {
            addCriterion("company_need_introduction <>", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionGreaterThan(String value) {
            addCriterion("company_need_introduction >", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_introduction >=", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionLessThan(String value) {
            addCriterion("company_need_introduction <", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionLessThanOrEqualTo(String value) {
            addCriterion("company_need_introduction <=", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionLike(String value) {
            addCriterion("company_need_introduction like", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionNotLike(String value) {
            addCriterion("company_need_introduction not like", value, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionIn(List<String> values) {
            addCriterion("company_need_introduction in", values, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionNotIn(List<String> values) {
            addCriterion("company_need_introduction not in", values, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionBetween(String value1, String value2) {
            addCriterion("company_need_introduction between", value1, value2, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedIntroductionNotBetween(String value1, String value2) {
            addCriterion("company_need_introduction not between", value1, value2, "companyNeedIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementIsNull() {
            addCriterion("company_need_requirement is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementIsNotNull() {
            addCriterion("company_need_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementEqualTo(String value) {
            addCriterion("company_need_requirement =", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementNotEqualTo(String value) {
            addCriterion("company_need_requirement <>", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementGreaterThan(String value) {
            addCriterion("company_need_requirement >", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("company_need_requirement >=", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementLessThan(String value) {
            addCriterion("company_need_requirement <", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementLessThanOrEqualTo(String value) {
            addCriterion("company_need_requirement <=", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementLike(String value) {
            addCriterion("company_need_requirement like", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementNotLike(String value) {
            addCriterion("company_need_requirement not like", value, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementIn(List<String> values) {
            addCriterion("company_need_requirement in", values, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementNotIn(List<String> values) {
            addCriterion("company_need_requirement not in", values, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementBetween(String value1, String value2) {
            addCriterion("company_need_requirement between", value1, value2, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedRequirementNotBetween(String value1, String value2) {
            addCriterion("company_need_requirement not between", value1, value2, "companyNeedRequirement");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedIsNull() {
            addCriterion("company_need_created is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedIsNotNull() {
            addCriterion("company_need_created is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedEqualTo(Date value) {
            addCriterion("company_need_created =", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedNotEqualTo(Date value) {
            addCriterion("company_need_created <>", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedGreaterThan(Date value) {
            addCriterion("company_need_created >", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("company_need_created >=", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedLessThan(Date value) {
            addCriterion("company_need_created <", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedLessThanOrEqualTo(Date value) {
            addCriterion("company_need_created <=", value, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedIn(List<Date> values) {
            addCriterion("company_need_created in", values, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedNotIn(List<Date> values) {
            addCriterion("company_need_created not in", values, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedBetween(Date value1, Date value2) {
            addCriterion("company_need_created between", value1, value2, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedCreatedNotBetween(Date value1, Date value2) {
            addCriterion("company_need_created not between", value1, value2, "companyNeedCreated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedIsNull() {
            addCriterion("company_need_updated is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedIsNotNull() {
            addCriterion("company_need_updated is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedEqualTo(Date value) {
            addCriterion("company_need_updated =", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedNotEqualTo(Date value) {
            addCriterion("company_need_updated <>", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedGreaterThan(Date value) {
            addCriterion("company_need_updated >", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("company_need_updated >=", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedLessThan(Date value) {
            addCriterion("company_need_updated <", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("company_need_updated <=", value, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedIn(List<Date> values) {
            addCriterion("company_need_updated in", values, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedNotIn(List<Date> values) {
            addCriterion("company_need_updated not in", values, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedBetween(Date value1, Date value2) {
            addCriterion("company_need_updated between", value1, value2, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("company_need_updated not between", value1, value2, "companyNeedUpdated");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusIsNull() {
            addCriterion("company_need_status is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusIsNotNull() {
            addCriterion("company_need_status is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusEqualTo(Integer value) {
            addCriterion("company_need_status =", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusNotEqualTo(Integer value) {
            addCriterion("company_need_status <>", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusGreaterThan(Integer value) {
            addCriterion("company_need_status >", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_need_status >=", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusLessThan(Integer value) {
            addCriterion("company_need_status <", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("company_need_status <=", value, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusIn(List<Integer> values) {
            addCriterion("company_need_status in", values, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusNotIn(List<Integer> values) {
            addCriterion("company_need_status not in", values, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusBetween(Integer value1, Integer value2) {
            addCriterion("company_need_status between", value1, value2, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("company_need_status not between", value1, value2, "companyNeedStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1IsNull() {
            addCriterion("company_need_backup1 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1IsNotNull() {
            addCriterion("company_need_backup1 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1EqualTo(String value) {
            addCriterion("company_need_backup1 =", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1NotEqualTo(String value) {
            addCriterion("company_need_backup1 <>", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1GreaterThan(String value) {
            addCriterion("company_need_backup1 >", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1GreaterThanOrEqualTo(String value) {
            addCriterion("company_need_backup1 >=", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1LessThan(String value) {
            addCriterion("company_need_backup1 <", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1LessThanOrEqualTo(String value) {
            addCriterion("company_need_backup1 <=", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1Like(String value) {
            addCriterion("company_need_backup1 like", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1NotLike(String value) {
            addCriterion("company_need_backup1 not like", value, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1In(List<String> values) {
            addCriterion("company_need_backup1 in", values, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1NotIn(List<String> values) {
            addCriterion("company_need_backup1 not in", values, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1Between(String value1, String value2) {
            addCriterion("company_need_backup1 between", value1, value2, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup1NotBetween(String value1, String value2) {
            addCriterion("company_need_backup1 not between", value1, value2, "companyNeedBackup1");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2IsNull() {
            addCriterion("company_need_backup2 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2IsNotNull() {
            addCriterion("company_need_backup2 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2EqualTo(String value) {
            addCriterion("company_need_backup2 =", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2NotEqualTo(String value) {
            addCriterion("company_need_backup2 <>", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2GreaterThan(String value) {
            addCriterion("company_need_backup2 >", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2GreaterThanOrEqualTo(String value) {
            addCriterion("company_need_backup2 >=", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2LessThan(String value) {
            addCriterion("company_need_backup2 <", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2LessThanOrEqualTo(String value) {
            addCriterion("company_need_backup2 <=", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2Like(String value) {
            addCriterion("company_need_backup2 like", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2NotLike(String value) {
            addCriterion("company_need_backup2 not like", value, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2In(List<String> values) {
            addCriterion("company_need_backup2 in", values, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2NotIn(List<String> values) {
            addCriterion("company_need_backup2 not in", values, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2Between(String value1, String value2) {
            addCriterion("company_need_backup2 between", value1, value2, "companyNeedBackup2");
            return (Criteria) this;
        }

        public Criteria andCompanyNeedBackup2NotBetween(String value1, String value2) {
            addCriterion("company_need_backup2 not between", value1, value2, "companyNeedBackup2");
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