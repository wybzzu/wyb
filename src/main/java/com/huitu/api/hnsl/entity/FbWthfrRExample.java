package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.List;

public class FbWthfrRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbWthfrRExample() {
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

        public Criteria andWhtcityIsNull() {
            addCriterion("WHTCITY is null");
            return (Criteria) this;
        }

        public Criteria andWhtcityIsNotNull() {
            addCriterion("WHTCITY is not null");
            return (Criteria) this;
        }

        public Criteria andWhtcityEqualTo(String value) {
            addCriterion("WHTCITY =", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityNotEqualTo(String value) {
            addCriterion("WHTCITY <>", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityGreaterThan(String value) {
            addCriterion("WHTCITY >", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityGreaterThanOrEqualTo(String value) {
            addCriterion("WHTCITY >=", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityLessThan(String value) {
            addCriterion("WHTCITY <", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityLessThanOrEqualTo(String value) {
            addCriterion("WHTCITY <=", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityLike(String value) {
            addCriterion("WHTCITY like", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityNotLike(String value) {
            addCriterion("WHTCITY not like", value, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityIn(List<String> values) {
            addCriterion("WHTCITY in", values, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityNotIn(List<String> values) {
            addCriterion("WHTCITY not in", values, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityBetween(String value1, String value2) {
            addCriterion("WHTCITY between", value1, value2, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcityNotBetween(String value1, String value2) {
            addCriterion("WHTCITY not between", value1, value2, "whtcity");
            return (Criteria) this;
        }

        public Criteria andWhtcountyIsNull() {
            addCriterion("WHTCOUNTY is null");
            return (Criteria) this;
        }

        public Criteria andWhtcountyIsNotNull() {
            addCriterion("WHTCOUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andWhtcountyEqualTo(String value) {
            addCriterion("WHTCOUNTY =", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyNotEqualTo(String value) {
            addCriterion("WHTCOUNTY <>", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyGreaterThan(String value) {
            addCriterion("WHTCOUNTY >", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyGreaterThanOrEqualTo(String value) {
            addCriterion("WHTCOUNTY >=", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyLessThan(String value) {
            addCriterion("WHTCOUNTY <", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyLessThanOrEqualTo(String value) {
            addCriterion("WHTCOUNTY <=", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyLike(String value) {
            addCriterion("WHTCOUNTY like", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyNotLike(String value) {
            addCriterion("WHTCOUNTY not like", value, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyIn(List<String> values) {
            addCriterion("WHTCOUNTY in", values, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyNotIn(List<String> values) {
            addCriterion("WHTCOUNTY not in", values, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyBetween(String value1, String value2) {
            addCriterion("WHTCOUNTY between", value1, value2, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andWhtcountyNotBetween(String value1, String value2) {
            addCriterion("WHTCOUNTY not between", value1, value2, "whtcounty");
            return (Criteria) this;
        }

        public Criteria andMxtmpIsNull() {
            addCriterion("MXTMP is null");
            return (Criteria) this;
        }

        public Criteria andMxtmpIsNotNull() {
            addCriterion("MXTMP is not null");
            return (Criteria) this;
        }

        public Criteria andMxtmpEqualTo(String value) {
            addCriterion("MXTMP =", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpNotEqualTo(String value) {
            addCriterion("MXTMP <>", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpGreaterThan(String value) {
            addCriterion("MXTMP >", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpGreaterThanOrEqualTo(String value) {
            addCriterion("MXTMP >=", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpLessThan(String value) {
            addCriterion("MXTMP <", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpLessThanOrEqualTo(String value) {
            addCriterion("MXTMP <=", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpLike(String value) {
            addCriterion("MXTMP like", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpNotLike(String value) {
            addCriterion("MXTMP not like", value, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpIn(List<String> values) {
            addCriterion("MXTMP in", values, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpNotIn(List<String> values) {
            addCriterion("MXTMP not in", values, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpBetween(String value1, String value2) {
            addCriterion("MXTMP between", value1, value2, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMxtmpNotBetween(String value1, String value2) {
            addCriterion("MXTMP not between", value1, value2, "mxtmp");
            return (Criteria) this;
        }

        public Criteria andMntmpIsNull() {
            addCriterion("MNTMP is null");
            return (Criteria) this;
        }

        public Criteria andMntmpIsNotNull() {
            addCriterion("MNTMP is not null");
            return (Criteria) this;
        }

        public Criteria andMntmpEqualTo(String value) {
            addCriterion("MNTMP =", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpNotEqualTo(String value) {
            addCriterion("MNTMP <>", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpGreaterThan(String value) {
            addCriterion("MNTMP >", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpGreaterThanOrEqualTo(String value) {
            addCriterion("MNTMP >=", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpLessThan(String value) {
            addCriterion("MNTMP <", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpLessThanOrEqualTo(String value) {
            addCriterion("MNTMP <=", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpLike(String value) {
            addCriterion("MNTMP like", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpNotLike(String value) {
            addCriterion("MNTMP not like", value, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpIn(List<String> values) {
            addCriterion("MNTMP in", values, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpNotIn(List<String> values) {
            addCriterion("MNTMP not in", values, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpBetween(String value1, String value2) {
            addCriterion("MNTMP between", value1, value2, "mntmp");
            return (Criteria) this;
        }

        public Criteria andMntmpNotBetween(String value1, String value2) {
            addCriterion("MNTMP not between", value1, value2, "mntmp");
            return (Criteria) this;
        }

        public Criteria andWdirIsNull() {
            addCriterion("WDIR is null");
            return (Criteria) this;
        }

        public Criteria andWdirIsNotNull() {
            addCriterion("WDIR is not null");
            return (Criteria) this;
        }

        public Criteria andWdirEqualTo(String value) {
            addCriterion("WDIR =", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirNotEqualTo(String value) {
            addCriterion("WDIR <>", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirGreaterThan(String value) {
            addCriterion("WDIR >", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirGreaterThanOrEqualTo(String value) {
            addCriterion("WDIR >=", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirLessThan(String value) {
            addCriterion("WDIR <", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirLessThanOrEqualTo(String value) {
            addCriterion("WDIR <=", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirLike(String value) {
            addCriterion("WDIR like", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirNotLike(String value) {
            addCriterion("WDIR not like", value, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirIn(List<String> values) {
            addCriterion("WDIR in", values, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirNotIn(List<String> values) {
            addCriterion("WDIR not in", values, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirBetween(String value1, String value2) {
            addCriterion("WDIR between", value1, value2, "wdir");
            return (Criteria) this;
        }

        public Criteria andWdirNotBetween(String value1, String value2) {
            addCriterion("WDIR not between", value1, value2, "wdir");
            return (Criteria) this;
        }

        public Criteria andWthfrtpIsNull() {
            addCriterion("WTHFRTP is null");
            return (Criteria) this;
        }

        public Criteria andWthfrtpIsNotNull() {
            addCriterion("WTHFRTP is not null");
            return (Criteria) this;
        }

        public Criteria andWthfrtpEqualTo(String value) {
            addCriterion("WTHFRTP =", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpNotEqualTo(String value) {
            addCriterion("WTHFRTP <>", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpGreaterThan(String value) {
            addCriterion("WTHFRTP >", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpGreaterThanOrEqualTo(String value) {
            addCriterion("WTHFRTP >=", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpLessThan(String value) {
            addCriterion("WTHFRTP <", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpLessThanOrEqualTo(String value) {
            addCriterion("WTHFRTP <=", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpLike(String value) {
            addCriterion("WTHFRTP like", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpNotLike(String value) {
            addCriterion("WTHFRTP not like", value, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpIn(List<String> values) {
            addCriterion("WTHFRTP in", values, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpNotIn(List<String> values) {
            addCriterion("WTHFRTP not in", values, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpBetween(String value1, String value2) {
            addCriterion("WTHFRTP between", value1, value2, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthfrtpNotBetween(String value1, String value2) {
            addCriterion("WTHFRTP not between", value1, value2, "wthfrtp");
            return (Criteria) this;
        }

        public Criteria andWthdescIsNull() {
            addCriterion("WTHDESC is null");
            return (Criteria) this;
        }

        public Criteria andWthdescIsNotNull() {
            addCriterion("WTHDESC is not null");
            return (Criteria) this;
        }

        public Criteria andWthdescEqualTo(String value) {
            addCriterion("WTHDESC =", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescNotEqualTo(String value) {
            addCriterion("WTHDESC <>", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescGreaterThan(String value) {
            addCriterion("WTHDESC >", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescGreaterThanOrEqualTo(String value) {
            addCriterion("WTHDESC >=", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescLessThan(String value) {
            addCriterion("WTHDESC <", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescLessThanOrEqualTo(String value) {
            addCriterion("WTHDESC <=", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescLike(String value) {
            addCriterion("WTHDESC like", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescNotLike(String value) {
            addCriterion("WTHDESC not like", value, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescIn(List<String> values) {
            addCriterion("WTHDESC in", values, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescNotIn(List<String> values) {
            addCriterion("WTHDESC not in", values, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescBetween(String value1, String value2) {
            addCriterion("WTHDESC between", value1, value2, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWthdescNotBetween(String value1, String value2) {
            addCriterion("WTHDESC not between", value1, value2, "wthdesc");
            return (Criteria) this;
        }

        public Criteria andWhtadcdIsNull() {
            addCriterion("WHTADCD is null");
            return (Criteria) this;
        }

        public Criteria andWhtadcdIsNotNull() {
            addCriterion("WHTADCD is not null");
            return (Criteria) this;
        }

        public Criteria andWhtadcdEqualTo(String value) {
            addCriterion("WHTADCD =", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdNotEqualTo(String value) {
            addCriterion("WHTADCD <>", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdGreaterThan(String value) {
            addCriterion("WHTADCD >", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdGreaterThanOrEqualTo(String value) {
            addCriterion("WHTADCD >=", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdLessThan(String value) {
            addCriterion("WHTADCD <", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdLessThanOrEqualTo(String value) {
            addCriterion("WHTADCD <=", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdLike(String value) {
            addCriterion("WHTADCD like", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdNotLike(String value) {
            addCriterion("WHTADCD not like", value, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdIn(List<String> values) {
            addCriterion("WHTADCD in", values, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdNotIn(List<String> values) {
            addCriterion("WHTADCD not in", values, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdBetween(String value1, String value2) {
            addCriterion("WHTADCD between", value1, value2, "whtadcd");
            return (Criteria) this;
        }

        public Criteria andWhtadcdNotBetween(String value1, String value2) {
            addCriterion("WHTADCD not between", value1, value2, "whtadcd");
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