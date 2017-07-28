package com.huitu.api.hnsl.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FbBrrealRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbBrrealRExample() {
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

        public Criteria andBrtpIsNull() {
            addCriterion("BRTP is null");
            return (Criteria) this;
        }

        public Criteria andBrtpIsNotNull() {
            addCriterion("BRTP is not null");
            return (Criteria) this;
        }

        public Criteria andBrtpEqualTo(String value) {
            addCriterion("BRTP =", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpNotEqualTo(String value) {
            addCriterion("BRTP <>", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpGreaterThan(String value) {
            addCriterion("BRTP >", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpGreaterThanOrEqualTo(String value) {
            addCriterion("BRTP >=", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpLessThan(String value) {
            addCriterion("BRTP <", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpLessThanOrEqualTo(String value) {
            addCriterion("BRTP <=", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpLike(String value) {
            addCriterion("BRTP like", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpNotLike(String value) {
            addCriterion("BRTP not like", value, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpIn(List<String> values) {
            addCriterion("BRTP in", values, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpNotIn(List<String> values) {
            addCriterion("BRTP not in", values, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpBetween(String value1, String value2) {
            addCriterion("BRTP between", value1, value2, "brtp");
            return (Criteria) this;
        }

        public Criteria andBrtpNotBetween(String value1, String value2) {
            addCriterion("BRTP not between", value1, value2, "brtp");
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

        public Criteria andTmIsNull() {
            addCriterion("TM is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("TM is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(Date value) {
            addCriterion("TM =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(Date value) {
            addCriterion("TM <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(Date value) {
            addCriterion("TM >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(Date value) {
            addCriterion("TM >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(Date value) {
            addCriterion("TM <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(Date value) {
            addCriterion("TM <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<Date> values) {
            addCriterion("TM in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<Date> values) {
            addCriterion("TM not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(Date value1, Date value2) {
            addCriterion("TM between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(Date value1, Date value2) {
            addCriterion("TM not between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andZIsNull() {
            addCriterion("Z is null");
            return (Criteria) this;
        }

        public Criteria andZIsNotNull() {
            addCriterion("Z is not null");
            return (Criteria) this;
        }

        public Criteria andZEqualTo(BigDecimal value) {
            addCriterion("Z =", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotEqualTo(BigDecimal value) {
            addCriterion("Z <>", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThan(BigDecimal value) {
            addCriterion("Z >", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Z >=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThan(BigDecimal value) {
            addCriterion("Z <", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Z <=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZIn(List<BigDecimal> values) {
            addCriterion("Z in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZNotIn(List<BigDecimal> values) {
            addCriterion("Z not in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z not between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andWzIsNull() {
            addCriterion("WZ is null");
            return (Criteria) this;
        }

        public Criteria andWzIsNotNull() {
            addCriterion("WZ is not null");
            return (Criteria) this;
        }

        public Criteria andWzEqualTo(BigDecimal value) {
            addCriterion("WZ =", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotEqualTo(BigDecimal value) {
            addCriterion("WZ <>", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThan(BigDecimal value) {
            addCriterion("WZ >", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WZ >=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThan(BigDecimal value) {
            addCriterion("WZ <", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WZ <=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzIn(List<BigDecimal> values) {
            addCriterion("WZ in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotIn(List<BigDecimal> values) {
            addCriterion("WZ not in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WZ between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WZ not between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andDvlIsNull() {
            addCriterion("DVL is null");
            return (Criteria) this;
        }

        public Criteria andDvlIsNotNull() {
            addCriterion("DVL is not null");
            return (Criteria) this;
        }

        public Criteria andDvlEqualTo(BigDecimal value) {
            addCriterion("DVL =", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlNotEqualTo(BigDecimal value) {
            addCriterion("DVL <>", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlGreaterThan(BigDecimal value) {
            addCriterion("DVL >", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DVL >=", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlLessThan(BigDecimal value) {
            addCriterion("DVL <", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DVL <=", value, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlIn(List<BigDecimal> values) {
            addCriterion("DVL in", values, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlNotIn(List<BigDecimal> values) {
            addCriterion("DVL not in", values, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DVL between", value1, value2, "dvl");
            return (Criteria) this;
        }

        public Criteria andDvlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DVL not between", value1, value2, "dvl");
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