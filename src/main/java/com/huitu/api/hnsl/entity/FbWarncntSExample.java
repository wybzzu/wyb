package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.List;

public class FbWarncntSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbWarncntSExample() {
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

        public Criteria andNewcntIsNull() {
            addCriterion("NEWCNT is null");
            return (Criteria) this;
        }

        public Criteria andNewcntIsNotNull() {
            addCriterion("NEWCNT is not null");
            return (Criteria) this;
        }

        public Criteria andNewcntEqualTo(Integer value) {
            addCriterion("NEWCNT =", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntNotEqualTo(Integer value) {
            addCriterion("NEWCNT <>", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntGreaterThan(Integer value) {
            addCriterion("NEWCNT >", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEWCNT >=", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntLessThan(Integer value) {
            addCriterion("NEWCNT <", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntLessThanOrEqualTo(Integer value) {
            addCriterion("NEWCNT <=", value, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntIn(List<Integer> values) {
            addCriterion("NEWCNT in", values, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntNotIn(List<Integer> values) {
            addCriterion("NEWCNT not in", values, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntBetween(Integer value1, Integer value2) {
            addCriterion("NEWCNT between", value1, value2, "newcnt");
            return (Criteria) this;
        }

        public Criteria andNewcntNotBetween(Integer value1, Integer value2) {
            addCriterion("NEWCNT not between", value1, value2, "newcnt");
            return (Criteria) this;
        }

        public Criteria andIncntIsNull() {
            addCriterion("INCNT is null");
            return (Criteria) this;
        }

        public Criteria andIncntIsNotNull() {
            addCriterion("INCNT is not null");
            return (Criteria) this;
        }

        public Criteria andIncntEqualTo(Integer value) {
            addCriterion("INCNT =", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntNotEqualTo(Integer value) {
            addCriterion("INCNT <>", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntGreaterThan(Integer value) {
            addCriterion("INCNT >", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntGreaterThanOrEqualTo(Integer value) {
            addCriterion("INCNT >=", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntLessThan(Integer value) {
            addCriterion("INCNT <", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntLessThanOrEqualTo(Integer value) {
            addCriterion("INCNT <=", value, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntIn(List<Integer> values) {
            addCriterion("INCNT in", values, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntNotIn(List<Integer> values) {
            addCriterion("INCNT not in", values, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntBetween(Integer value1, Integer value2) {
            addCriterion("INCNT between", value1, value2, "incnt");
            return (Criteria) this;
        }

        public Criteria andIncntNotBetween(Integer value1, Integer value2) {
            addCriterion("INCNT not between", value1, value2, "incnt");
            return (Criteria) this;
        }

        public Criteria andOttcntIsNull() {
            addCriterion("OTTCNT is null");
            return (Criteria) this;
        }

        public Criteria andOttcntIsNotNull() {
            addCriterion("OTTCNT is not null");
            return (Criteria) this;
        }

        public Criteria andOttcntEqualTo(Integer value) {
            addCriterion("OTTCNT =", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntNotEqualTo(Integer value) {
            addCriterion("OTTCNT <>", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntGreaterThan(Integer value) {
            addCriterion("OTTCNT >", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("OTTCNT >=", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntLessThan(Integer value) {
            addCriterion("OTTCNT <", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntLessThanOrEqualTo(Integer value) {
            addCriterion("OTTCNT <=", value, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntIn(List<Integer> values) {
            addCriterion("OTTCNT in", values, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntNotIn(List<Integer> values) {
            addCriterion("OTTCNT not in", values, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntBetween(Integer value1, Integer value2) {
            addCriterion("OTTCNT between", value1, value2, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andOttcntNotBetween(Integer value1, Integer value2) {
            addCriterion("OTTCNT not between", value1, value2, "ottcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntIsNull() {
            addCriterion("CLTCNT is null");
            return (Criteria) this;
        }

        public Criteria andCltcntIsNotNull() {
            addCriterion("CLTCNT is not null");
            return (Criteria) this;
        }

        public Criteria andCltcntEqualTo(Integer value) {
            addCriterion("CLTCNT =", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntNotEqualTo(Integer value) {
            addCriterion("CLTCNT <>", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntGreaterThan(Integer value) {
            addCriterion("CLTCNT >", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLTCNT >=", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntLessThan(Integer value) {
            addCriterion("CLTCNT <", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntLessThanOrEqualTo(Integer value) {
            addCriterion("CLTCNT <=", value, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntIn(List<Integer> values) {
            addCriterion("CLTCNT in", values, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntNotIn(List<Integer> values) {
            addCriterion("CLTCNT not in", values, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntBetween(Integer value1, Integer value2) {
            addCriterion("CLTCNT between", value1, value2, "cltcnt");
            return (Criteria) this;
        }

        public Criteria andCltcntNotBetween(Integer value1, Integer value2) {
            addCriterion("CLTCNT not between", value1, value2, "cltcnt");
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