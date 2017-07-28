package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.List;

public class StStcntSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StStcntSExample() {
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

        public Criteria andStcntIsNull() {
            addCriterion("STCNT is null");
            return (Criteria) this;
        }

        public Criteria andStcntIsNotNull() {
            addCriterion("STCNT is not null");
            return (Criteria) this;
        }

        public Criteria andStcntEqualTo(Integer value) {
            addCriterion("STCNT =", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntNotEqualTo(Integer value) {
            addCriterion("STCNT <>", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntGreaterThan(Integer value) {
            addCriterion("STCNT >", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("STCNT >=", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntLessThan(Integer value) {
            addCriterion("STCNT <", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntLessThanOrEqualTo(Integer value) {
            addCriterion("STCNT <=", value, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntIn(List<Integer> values) {
            addCriterion("STCNT in", values, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntNotIn(List<Integer> values) {
            addCriterion("STCNT not in", values, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntBetween(Integer value1, Integer value2) {
            addCriterion("STCNT between", value1, value2, "stcnt");
            return (Criteria) this;
        }

        public Criteria andStcntNotBetween(Integer value1, Integer value2) {
            addCriterion("STCNT not between", value1, value2, "stcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntIsNull() {
            addCriterion("TSTCNT is null");
            return (Criteria) this;
        }

        public Criteria andTstcntIsNotNull() {
            addCriterion("TSTCNT is not null");
            return (Criteria) this;
        }

        public Criteria andTstcntEqualTo(Integer value) {
            addCriterion("TSTCNT =", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntNotEqualTo(Integer value) {
            addCriterion("TSTCNT <>", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntGreaterThan(Integer value) {
            addCriterion("TSTCNT >", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TSTCNT >=", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntLessThan(Integer value) {
            addCriterion("TSTCNT <", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntLessThanOrEqualTo(Integer value) {
            addCriterion("TSTCNT <=", value, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntIn(List<Integer> values) {
            addCriterion("TSTCNT in", values, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntNotIn(List<Integer> values) {
            addCriterion("TSTCNT not in", values, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntBetween(Integer value1, Integer value2) {
            addCriterion("TSTCNT between", value1, value2, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andTstcntNotBetween(Integer value1, Integer value2) {
            addCriterion("TSTCNT not between", value1, value2, "tstcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntIsNull() {
            addCriterion("YSTCNT is null");
            return (Criteria) this;
        }

        public Criteria andYstcntIsNotNull() {
            addCriterion("YSTCNT is not null");
            return (Criteria) this;
        }

        public Criteria andYstcntEqualTo(Integer value) {
            addCriterion("YSTCNT =", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntNotEqualTo(Integer value) {
            addCriterion("YSTCNT <>", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntGreaterThan(Integer value) {
            addCriterion("YSTCNT >", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("YSTCNT >=", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntLessThan(Integer value) {
            addCriterion("YSTCNT <", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntLessThanOrEqualTo(Integer value) {
            addCriterion("YSTCNT <=", value, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntIn(List<Integer> values) {
            addCriterion("YSTCNT in", values, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntNotIn(List<Integer> values) {
            addCriterion("YSTCNT not in", values, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntBetween(Integer value1, Integer value2) {
            addCriterion("YSTCNT between", value1, value2, "ystcnt");
            return (Criteria) this;
        }

        public Criteria andYstcntNotBetween(Integer value1, Integer value2) {
            addCriterion("YSTCNT not between", value1, value2, "ystcnt");
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