package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StStcntdtlRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StStcntdtlRExample() {
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

        public Criteria andStcdIsNull() {
            addCriterion("STCD is null");
            return (Criteria) this;
        }

        public Criteria andStcdIsNotNull() {
            addCriterion("STCD is not null");
            return (Criteria) this;
        }

        public Criteria andStcdEqualTo(String value) {
            addCriterion("STCD =", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdNotEqualTo(String value) {
            addCriterion("STCD <>", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdGreaterThan(String value) {
            addCriterion("STCD >", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdGreaterThanOrEqualTo(String value) {
            addCriterion("STCD >=", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdLessThan(String value) {
            addCriterion("STCD <", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdLessThanOrEqualTo(String value) {
            addCriterion("STCD <=", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdLike(String value) {
            addCriterion("STCD like", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdNotLike(String value) {
            addCriterion("STCD not like", value, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdIn(List<String> values) {
            addCriterion("STCD in", values, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdNotIn(List<String> values) {
            addCriterion("STCD not in", values, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdBetween(String value1, String value2) {
            addCriterion("STCD between", value1, value2, "stcd");
            return (Criteria) this;
        }

        public Criteria andStcdNotBetween(String value1, String value2) {
            addCriterion("STCD not between", value1, value2, "stcd");
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

        public Criteria andStnmIsNull() {
            addCriterion("STNM is null");
            return (Criteria) this;
        }

        public Criteria andStnmIsNotNull() {
            addCriterion("STNM is not null");
            return (Criteria) this;
        }

        public Criteria andStnmEqualTo(String value) {
            addCriterion("STNM =", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmNotEqualTo(String value) {
            addCriterion("STNM <>", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmGreaterThan(String value) {
            addCriterion("STNM >", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmGreaterThanOrEqualTo(String value) {
            addCriterion("STNM >=", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmLessThan(String value) {
            addCriterion("STNM <", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmLessThanOrEqualTo(String value) {
            addCriterion("STNM <=", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmLike(String value) {
            addCriterion("STNM like", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmNotLike(String value) {
            addCriterion("STNM not like", value, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmIn(List<String> values) {
            addCriterion("STNM in", values, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmNotIn(List<String> values) {
            addCriterion("STNM not in", values, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmBetween(String value1, String value2) {
            addCriterion("STNM between", value1, value2, "stnm");
            return (Criteria) this;
        }

        public Criteria andStnmNotBetween(String value1, String value2) {
            addCriterion("STNM not between", value1, value2, "stnm");
            return (Criteria) this;
        }

        public Criteria andTrctmIsNull() {
            addCriterion("TRCTM is null");
            return (Criteria) this;
        }

        public Criteria andTrctmIsNotNull() {
            addCriterion("TRCTM is not null");
            return (Criteria) this;
        }

        public Criteria andTrctmEqualTo(Date value) {
            addCriterion("TRCTM =", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmNotEqualTo(Date value) {
            addCriterion("TRCTM <>", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmGreaterThan(Date value) {
            addCriterion("TRCTM >", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmGreaterThanOrEqualTo(Date value) {
            addCriterion("TRCTM >=", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmLessThan(Date value) {
            addCriterion("TRCTM <", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmLessThanOrEqualTo(Date value) {
            addCriterion("TRCTM <=", value, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmIn(List<Date> values) {
            addCriterion("TRCTM in", values, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmNotIn(List<Date> values) {
            addCriterion("TRCTM not in", values, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmBetween(Date value1, Date value2) {
            addCriterion("TRCTM between", value1, value2, "trctm");
            return (Criteria) this;
        }

        public Criteria andTrctmNotBetween(Date value1, Date value2) {
            addCriterion("TRCTM not between", value1, value2, "trctm");
            return (Criteria) this;
        }

        public Criteria andYrctmIsNull() {
            addCriterion("YRCTM is null");
            return (Criteria) this;
        }

        public Criteria andYrctmIsNotNull() {
            addCriterion("YRCTM is not null");
            return (Criteria) this;
        }

        public Criteria andYrctmEqualTo(Date value) {
            addCriterion("YRCTM =", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmNotEqualTo(Date value) {
            addCriterion("YRCTM <>", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmGreaterThan(Date value) {
            addCriterion("YRCTM >", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmGreaterThanOrEqualTo(Date value) {
            addCriterion("YRCTM >=", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmLessThan(Date value) {
            addCriterion("YRCTM <", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmLessThanOrEqualTo(Date value) {
            addCriterion("YRCTM <=", value, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmIn(List<Date> values) {
            addCriterion("YRCTM in", values, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmNotIn(List<Date> values) {
            addCriterion("YRCTM not in", values, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmBetween(Date value1, Date value2) {
            addCriterion("YRCTM between", value1, value2, "yrctm");
            return (Criteria) this;
        }

        public Criteria andYrctmNotBetween(Date value1, Date value2) {
            addCriterion("YRCTM not between", value1, value2, "yrctm");
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