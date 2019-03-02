package com.lm.model.plan.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEntityIndustryCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEntityIndustryCertificateExample() {
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

        public Criteria andIndustryCertificateIdIsNull() {
            addCriterion("industry_certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdIsNotNull() {
            addCriterion("industry_certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdEqualTo(Integer value) {
            addCriterion("industry_certificate_id =", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdNotEqualTo(Integer value) {
            addCriterion("industry_certificate_id <>", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdGreaterThan(Integer value) {
            addCriterion("industry_certificate_id >", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_id >=", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdLessThan(Integer value) {
            addCriterion("industry_certificate_id <", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_id <=", value, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdIn(List<Integer> values) {
            addCriterion("industry_certificate_id in", values, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdNotIn(List<Integer> values) {
            addCriterion("industry_certificate_id not in", values, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_id between", value1, value2, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_id not between", value1, value2, "industryCertificateId");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameIsNull() {
            addCriterion("industry_certificate_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameIsNotNull() {
            addCriterion("industry_certificate_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameEqualTo(String value) {
            addCriterion("industry_certificate_name =", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameNotEqualTo(String value) {
            addCriterion("industry_certificate_name <>", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameGreaterThan(String value) {
            addCriterion("industry_certificate_name >", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_name >=", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameLessThan(String value) {
            addCriterion("industry_certificate_name <", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_name <=", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameLike(String value) {
            addCriterion("industry_certificate_name like", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameNotLike(String value) {
            addCriterion("industry_certificate_name not like", value, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameIn(List<String> values) {
            addCriterion("industry_certificate_name in", values, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameNotIn(List<String> values) {
            addCriterion("industry_certificate_name not in", values, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameBetween(String value1, String value2) {
            addCriterion("industry_certificate_name between", value1, value2, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateNameNotBetween(String value1, String value2) {
            addCriterion("industry_certificate_name not between", value1, value2, "industryCertificateName");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseIsNull() {
            addCriterion("industry_certificate_course is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseIsNotNull() {
            addCriterion("industry_certificate_course is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseEqualTo(String value) {
            addCriterion("industry_certificate_course =", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseNotEqualTo(String value) {
            addCriterion("industry_certificate_course <>", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseGreaterThan(String value) {
            addCriterion("industry_certificate_course >", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseGreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_course >=", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseLessThan(String value) {
            addCriterion("industry_certificate_course <", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseLessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_course <=", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseLike(String value) {
            addCriterion("industry_certificate_course like", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseNotLike(String value) {
            addCriterion("industry_certificate_course not like", value, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseIn(List<String> values) {
            addCriterion("industry_certificate_course in", values, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseNotIn(List<String> values) {
            addCriterion("industry_certificate_course not in", values, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseBetween(String value1, String value2) {
            addCriterion("industry_certificate_course between", value1, value2, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCourseNotBetween(String value1, String value2) {
            addCriterion("industry_certificate_course not between", value1, value2, "industryCertificateCourse");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignIsNull() {
            addCriterion("industry_certificate_sign is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignIsNotNull() {
            addCriterion("industry_certificate_sign is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignEqualTo(String value) {
            addCriterion("industry_certificate_sign =", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignNotEqualTo(String value) {
            addCriterion("industry_certificate_sign <>", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignGreaterThan(String value) {
            addCriterion("industry_certificate_sign >", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignGreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_sign >=", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignLessThan(String value) {
            addCriterion("industry_certificate_sign <", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignLessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_sign <=", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignLike(String value) {
            addCriterion("industry_certificate_sign like", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignNotLike(String value) {
            addCriterion("industry_certificate_sign not like", value, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignIn(List<String> values) {
            addCriterion("industry_certificate_sign in", values, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignNotIn(List<String> values) {
            addCriterion("industry_certificate_sign not in", values, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignBetween(String value1, String value2) {
            addCriterion("industry_certificate_sign between", value1, value2, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateSignNotBetween(String value1, String value2) {
            addCriterion("industry_certificate_sign not between", value1, value2, "industryCertificateSign");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptIsNull() {
            addCriterion("industry_certificate_dept is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptIsNotNull() {
            addCriterion("industry_certificate_dept is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptEqualTo(Integer value) {
            addCriterion("industry_certificate_dept =", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptNotEqualTo(Integer value) {
            addCriterion("industry_certificate_dept <>", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptGreaterThan(Integer value) {
            addCriterion("industry_certificate_dept >", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_dept >=", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptLessThan(Integer value) {
            addCriterion("industry_certificate_dept <", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_dept <=", value, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptIn(List<Integer> values) {
            addCriterion("industry_certificate_dept in", values, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptNotIn(List<Integer> values) {
            addCriterion("industry_certificate_dept not in", values, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_dept between", value1, value2, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_dept not between", value1, value2, "industryCertificateDept");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionIsNull() {
            addCriterion("industry_certificate_profession is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionIsNotNull() {
            addCriterion("industry_certificate_profession is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionEqualTo(Integer value) {
            addCriterion("industry_certificate_profession =", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionNotEqualTo(Integer value) {
            addCriterion("industry_certificate_profession <>", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionGreaterThan(Integer value) {
            addCriterion("industry_certificate_profession >", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_profession >=", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionLessThan(Integer value) {
            addCriterion("industry_certificate_profession <", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_profession <=", value, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionIn(List<Integer> values) {
            addCriterion("industry_certificate_profession in", values, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionNotIn(List<Integer> values) {
            addCriterion("industry_certificate_profession not in", values, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_profession between", value1, value2, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateProfessionNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_profession not between", value1, value2, "industryCertificateProfession");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeIsNull() {
            addCriterion("industry_certificate_authentication_type is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeIsNotNull() {
            addCriterion("industry_certificate_authentication_type is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeEqualTo(Integer value) {
            addCriterion("industry_certificate_authentication_type =", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeNotEqualTo(Integer value) {
            addCriterion("industry_certificate_authentication_type <>", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeGreaterThan(Integer value) {
            addCriterion("industry_certificate_authentication_type >", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_authentication_type >=", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeLessThan(Integer value) {
            addCriterion("industry_certificate_authentication_type <", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_authentication_type <=", value, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeIn(List<Integer> values) {
            addCriterion("industry_certificate_authentication_type in", values, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeNotIn(List<Integer> values) {
            addCriterion("industry_certificate_authentication_type not in", values, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_authentication_type between", value1, value2, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateAuthenticationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_authentication_type not between", value1, value2, "industryCertificateAuthenticationType");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleIsNull() {
            addCriterion("industry_certificate_module is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleIsNotNull() {
            addCriterion("industry_certificate_module is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleEqualTo(String value) {
            addCriterion("industry_certificate_module =", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleNotEqualTo(String value) {
            addCriterion("industry_certificate_module <>", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleGreaterThan(String value) {
            addCriterion("industry_certificate_module >", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleGreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_module >=", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleLessThan(String value) {
            addCriterion("industry_certificate_module <", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleLessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_module <=", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleLike(String value) {
            addCriterion("industry_certificate_module like", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleNotLike(String value) {
            addCriterion("industry_certificate_module not like", value, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleIn(List<String> values) {
            addCriterion("industry_certificate_module in", values, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleNotIn(List<String> values) {
            addCriterion("industry_certificate_module not in", values, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleBetween(String value1, String value2) {
            addCriterion("industry_certificate_module between", value1, value2, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateModuleNotBetween(String value1, String value2) {
            addCriterion("industry_certificate_module not between", value1, value2, "industryCertificateModule");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteIsNull() {
            addCriterion("industry_certificate_identification_site is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteIsNotNull() {
            addCriterion("industry_certificate_identification_site is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteEqualTo(Integer value) {
            addCriterion("industry_certificate_identification_site =", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteNotEqualTo(Integer value) {
            addCriterion("industry_certificate_identification_site <>", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteGreaterThan(Integer value) {
            addCriterion("industry_certificate_identification_site >", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_identification_site >=", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteLessThan(Integer value) {
            addCriterion("industry_certificate_identification_site <", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_identification_site <=", value, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteIn(List<Integer> values) {
            addCriterion("industry_certificate_identification_site in", values, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteNotIn(List<Integer> values) {
            addCriterion("industry_certificate_identification_site not in", values, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_identification_site between", value1, value2, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateIdentificationSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_identification_site not between", value1, value2, "industryCertificateIdentificationSite");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationIsNull() {
            addCriterion("industry_certificate_organization is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationIsNotNull() {
            addCriterion("industry_certificate_organization is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationEqualTo(Integer value) {
            addCriterion("industry_certificate_organization =", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationNotEqualTo(Integer value) {
            addCriterion("industry_certificate_organization <>", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationGreaterThan(Integer value) {
            addCriterion("industry_certificate_organization >", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_organization >=", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationLessThan(Integer value) {
            addCriterion("industry_certificate_organization <", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_organization <=", value, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationIn(List<Integer> values) {
            addCriterion("industry_certificate_organization in", values, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationNotIn(List<Integer> values) {
            addCriterion("industry_certificate_organization not in", values, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_organization between", value1, value2, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateOrganizationNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_organization not between", value1, value2, "industryCertificateOrganization");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlIsNull() {
            addCriterion("industry_certificate_url is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlIsNotNull() {
            addCriterion("industry_certificate_url is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlEqualTo(String value) {
            addCriterion("industry_certificate_url =", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlNotEqualTo(String value) {
            addCriterion("industry_certificate_url <>", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlGreaterThan(String value) {
            addCriterion("industry_certificate_url >", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_url >=", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlLessThan(String value) {
            addCriterion("industry_certificate_url <", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlLessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_url <=", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlLike(String value) {
            addCriterion("industry_certificate_url like", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlNotLike(String value) {
            addCriterion("industry_certificate_url not like", value, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlIn(List<String> values) {
            addCriterion("industry_certificate_url in", values, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlNotIn(List<String> values) {
            addCriterion("industry_certificate_url not in", values, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlBetween(String value1, String value2) {
            addCriterion("industry_certificate_url between", value1, value2, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUrlNotBetween(String value1, String value2) {
            addCriterion("industry_certificate_url not between", value1, value2, "industryCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusIsNull() {
            addCriterion("industry_certificate_status is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusIsNotNull() {
            addCriterion("industry_certificate_status is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusEqualTo(Integer value) {
            addCriterion("industry_certificate_status =", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusNotEqualTo(Integer value) {
            addCriterion("industry_certificate_status <>", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusGreaterThan(Integer value) {
            addCriterion("industry_certificate_status >", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_status >=", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusLessThan(Integer value) {
            addCriterion("industry_certificate_status <", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("industry_certificate_status <=", value, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusIn(List<Integer> values) {
            addCriterion("industry_certificate_status in", values, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusNotIn(List<Integer> values) {
            addCriterion("industry_certificate_status not in", values, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_status between", value1, value2, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_certificate_status not between", value1, value2, "industryCertificateStatus");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedIsNull() {
            addCriterion("industry_certificate_created is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedIsNotNull() {
            addCriterion("industry_certificate_created is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedEqualTo(Date value) {
            addCriterion("industry_certificate_created =", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedNotEqualTo(Date value) {
            addCriterion("industry_certificate_created <>", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedGreaterThan(Date value) {
            addCriterion("industry_certificate_created >", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("industry_certificate_created >=", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedLessThan(Date value) {
            addCriterion("industry_certificate_created <", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("industry_certificate_created <=", value, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedIn(List<Date> values) {
            addCriterion("industry_certificate_created in", values, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedNotIn(List<Date> values) {
            addCriterion("industry_certificate_created not in", values, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedBetween(Date value1, Date value2) {
            addCriterion("industry_certificate_created between", value1, value2, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("industry_certificate_created not between", value1, value2, "industryCertificateCreated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedIsNull() {
            addCriterion("industry_certificate_updated is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedIsNotNull() {
            addCriterion("industry_certificate_updated is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedEqualTo(Date value) {
            addCriterion("industry_certificate_updated =", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedNotEqualTo(Date value) {
            addCriterion("industry_certificate_updated <>", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedGreaterThan(Date value) {
            addCriterion("industry_certificate_updated >", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("industry_certificate_updated >=", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedLessThan(Date value) {
            addCriterion("industry_certificate_updated <", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("industry_certificate_updated <=", value, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedIn(List<Date> values) {
            addCriterion("industry_certificate_updated in", values, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedNotIn(List<Date> values) {
            addCriterion("industry_certificate_updated not in", values, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedBetween(Date value1, Date value2) {
            addCriterion("industry_certificate_updated between", value1, value2, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("industry_certificate_updated not between", value1, value2, "industryCertificateUpdated");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1IsNull() {
            addCriterion("industry_certificate_backup1 is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1IsNotNull() {
            addCriterion("industry_certificate_backup1 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1EqualTo(String value) {
            addCriterion("industry_certificate_backup1 =", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1NotEqualTo(String value) {
            addCriterion("industry_certificate_backup1 <>", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1GreaterThan(String value) {
            addCriterion("industry_certificate_backup1 >", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1GreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_backup1 >=", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1LessThan(String value) {
            addCriterion("industry_certificate_backup1 <", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1LessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_backup1 <=", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1Like(String value) {
            addCriterion("industry_certificate_backup1 like", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1NotLike(String value) {
            addCriterion("industry_certificate_backup1 not like", value, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1In(List<String> values) {
            addCriterion("industry_certificate_backup1 in", values, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1NotIn(List<String> values) {
            addCriterion("industry_certificate_backup1 not in", values, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1Between(String value1, String value2) {
            addCriterion("industry_certificate_backup1 between", value1, value2, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup1NotBetween(String value1, String value2) {
            addCriterion("industry_certificate_backup1 not between", value1, value2, "industryCertificateBackup1");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2IsNull() {
            addCriterion("industry_certificate_backup2 is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2IsNotNull() {
            addCriterion("industry_certificate_backup2 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2EqualTo(String value) {
            addCriterion("industry_certificate_backup2 =", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2NotEqualTo(String value) {
            addCriterion("industry_certificate_backup2 <>", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2GreaterThan(String value) {
            addCriterion("industry_certificate_backup2 >", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2GreaterThanOrEqualTo(String value) {
            addCriterion("industry_certificate_backup2 >=", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2LessThan(String value) {
            addCriterion("industry_certificate_backup2 <", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2LessThanOrEqualTo(String value) {
            addCriterion("industry_certificate_backup2 <=", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2Like(String value) {
            addCriterion("industry_certificate_backup2 like", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2NotLike(String value) {
            addCriterion("industry_certificate_backup2 not like", value, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2In(List<String> values) {
            addCriterion("industry_certificate_backup2 in", values, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2NotIn(List<String> values) {
            addCriterion("industry_certificate_backup2 not in", values, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2Between(String value1, String value2) {
            addCriterion("industry_certificate_backup2 between", value1, value2, "industryCertificateBackup2");
            return (Criteria) this;
        }

        public Criteria andIndustryCertificateBackup2NotBetween(String value1, String value2) {
            addCriterion("industry_certificate_backup2 not between", value1, value2, "industryCertificateBackup2");
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