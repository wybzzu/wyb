package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.List;

public class FbPersonBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbPersonBExample() {
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

        public Criteria andPersoncdIsNull() {
            addCriterion("PERSONCD is null");
            return (Criteria) this;
        }

        public Criteria andPersoncdIsNotNull() {
            addCriterion("PERSONCD is not null");
            return (Criteria) this;
        }

        public Criteria andPersoncdEqualTo(String value) {
            addCriterion("PERSONCD =", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdNotEqualTo(String value) {
            addCriterion("PERSONCD <>", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdGreaterThan(String value) {
            addCriterion("PERSONCD >", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONCD >=", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdLessThan(String value) {
            addCriterion("PERSONCD <", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdLessThanOrEqualTo(String value) {
            addCriterion("PERSONCD <=", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdLike(String value) {
            addCriterion("PERSONCD like", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdNotLike(String value) {
            addCriterion("PERSONCD not like", value, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdIn(List<String> values) {
            addCriterion("PERSONCD in", values, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdNotIn(List<String> values) {
            addCriterion("PERSONCD not in", values, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdBetween(String value1, String value2) {
            addCriterion("PERSONCD between", value1, value2, "personcd");
            return (Criteria) this;
        }

        public Criteria andPersoncdNotBetween(String value1, String value2) {
            addCriterion("PERSONCD not between", value1, value2, "personcd");
            return (Criteria) this;
        }

        public Criteria andAdcdIsNull() {
            addCriterion("ADCD is null");
            return (Criteria) this;
        }

        public Criteria andAdcdIsNotNull() {
            addCriterion("ADCD is not null");
            return (Criteria) this;
        }

        public Criteria andAdcdEqualTo(String value) {
            addCriterion("ADCD =", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotEqualTo(String value) {
            addCriterion("ADCD <>", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdGreaterThan(String value) {
            addCriterion("ADCD >", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdGreaterThanOrEqualTo(String value) {
            addCriterion("ADCD >=", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLessThan(String value) {
            addCriterion("ADCD <", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLessThanOrEqualTo(String value) {
            addCriterion("ADCD <=", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLike(String value) {
            addCriterion("ADCD like", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotLike(String value) {
            addCriterion("ADCD not like", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdIn(List<String> values) {
            addCriterion("ADCD in", values, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotIn(List<String> values) {
            addCriterion("ADCD not in", values, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdBetween(String value1, String value2) {
            addCriterion("ADCD between", value1, value2, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotBetween(String value1, String value2) {
            addCriterion("ADCD not between", value1, value2, "adcd");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDeptcdIsNull() {
            addCriterion("DEPTCD is null");
            return (Criteria) this;
        }

        public Criteria andDeptcdIsNotNull() {
            addCriterion("DEPTCD is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcdEqualTo(String value) {
            addCriterion("DEPTCD =", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdNotEqualTo(String value) {
            addCriterion("DEPTCD <>", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdGreaterThan(String value) {
            addCriterion("DEPTCD >", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCD >=", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdLessThan(String value) {
            addCriterion("DEPTCD <", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdLessThanOrEqualTo(String value) {
            addCriterion("DEPTCD <=", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdLike(String value) {
            addCriterion("DEPTCD like", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdNotLike(String value) {
            addCriterion("DEPTCD not like", value, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdIn(List<String> values) {
            addCriterion("DEPTCD in", values, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdNotIn(List<String> values) {
            addCriterion("DEPTCD not in", values, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdBetween(String value1, String value2) {
            addCriterion("DEPTCD between", value1, value2, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptcdNotBetween(String value1, String value2) {
            addCriterion("DEPTCD not between", value1, value2, "deptcd");
            return (Criteria) this;
        }

        public Criteria andDeptnmIsNull() {
            addCriterion("DEPTNM is null");
            return (Criteria) this;
        }

        public Criteria andDeptnmIsNotNull() {
            addCriterion("DEPTNM is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnmEqualTo(String value) {
            addCriterion("DEPTNM =", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmNotEqualTo(String value) {
            addCriterion("DEPTNM <>", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmGreaterThan(String value) {
            addCriterion("DEPTNM >", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNM >=", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmLessThan(String value) {
            addCriterion("DEPTNM <", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmLessThanOrEqualTo(String value) {
            addCriterion("DEPTNM <=", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmLike(String value) {
            addCriterion("DEPTNM like", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmNotLike(String value) {
            addCriterion("DEPTNM not like", value, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmIn(List<String> values) {
            addCriterion("DEPTNM in", values, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmNotIn(List<String> values) {
            addCriterion("DEPTNM not in", values, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmBetween(String value1, String value2) {
            addCriterion("DEPTNM between", value1, value2, "deptnm");
            return (Criteria) this;
        }

        public Criteria andDeptnmNotBetween(String value1, String value2) {
            addCriterion("DEPTNM not between", value1, value2, "deptnm");
            return (Criteria) this;
        }

        public Criteria andAdnmIsNull() {
            addCriterion("ADNM is null");
            return (Criteria) this;
        }

        public Criteria andAdnmIsNotNull() {
            addCriterion("ADNM is not null");
            return (Criteria) this;
        }

        public Criteria andAdnmEqualTo(String value) {
            addCriterion("ADNM =", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmNotEqualTo(String value) {
            addCriterion("ADNM <>", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmGreaterThan(String value) {
            addCriterion("ADNM >", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmGreaterThanOrEqualTo(String value) {
            addCriterion("ADNM >=", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmLessThan(String value) {
            addCriterion("ADNM <", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmLessThanOrEqualTo(String value) {
            addCriterion("ADNM <=", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmLike(String value) {
            addCriterion("ADNM like", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmNotLike(String value) {
            addCriterion("ADNM not like", value, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmIn(List<String> values) {
            addCriterion("ADNM in", values, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmNotIn(List<String> values) {
            addCriterion("ADNM not in", values, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmBetween(String value1, String value2) {
            addCriterion("ADNM between", value1, value2, "adnm");
            return (Criteria) this;
        }

        public Criteria andAdnmNotBetween(String value1, String value2) {
            addCriterion("ADNM not between", value1, value2, "adnm");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNull() {
            addCriterion("OFFICETEL is null");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNotNull() {
            addCriterion("OFFICETEL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficetelEqualTo(String value) {
            addCriterion("OFFICETEL =", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotEqualTo(String value) {
            addCriterion("OFFICETEL <>", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThan(String value) {
            addCriterion("OFFICETEL >", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICETEL >=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThan(String value) {
            addCriterion("OFFICETEL <", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThanOrEqualTo(String value) {
            addCriterion("OFFICETEL <=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLike(String value) {
            addCriterion("OFFICETEL like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotLike(String value) {
            addCriterion("OFFICETEL not like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelIn(List<String> values) {
            addCriterion("OFFICETEL in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotIn(List<String> values) {
            addCriterion("OFFICETEL not in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelBetween(String value1, String value2) {
            addCriterion("OFFICETEL between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotBetween(String value1, String value2) {
            addCriterion("OFFICETEL not between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andNtIsNull() {
            addCriterion("NT is null");
            return (Criteria) this;
        }

        public Criteria andNtIsNotNull() {
            addCriterion("NT is not null");
            return (Criteria) this;
        }

        public Criteria andNtEqualTo(String value) {
            addCriterion("NT =", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotEqualTo(String value) {
            addCriterion("NT <>", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtGreaterThan(String value) {
            addCriterion("NT >", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtGreaterThanOrEqualTo(String value) {
            addCriterion("NT >=", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLessThan(String value) {
            addCriterion("NT <", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLessThanOrEqualTo(String value) {
            addCriterion("NT <=", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLike(String value) {
            addCriterion("NT like", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotLike(String value) {
            addCriterion("NT not like", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtIn(List<String> values) {
            addCriterion("NT in", values, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotIn(List<String> values) {
            addCriterion("NT not in", values, "nt");
            return (Criteria) this;
        }

        public Criteria andNtBetween(String value1, String value2) {
            addCriterion("NT between", value1, value2, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotBetween(String value1, String value2) {
            addCriterion("NT not between", value1, value2, "nt");
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