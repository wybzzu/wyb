package com.huitu.api.hnsl.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FbWarncntdtlRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbWarncntdtlRExample() {
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

        public Criteria andWarnidIsNull() {
            addCriterion("WARNID is null");
            return (Criteria) this;
        }

        public Criteria andWarnidIsNotNull() {
            addCriterion("WARNID is not null");
            return (Criteria) this;
        }

        public Criteria andWarnidEqualTo(Integer value) {
            addCriterion("WARNID =", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotEqualTo(Integer value) {
            addCriterion("WARNID <>", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidGreaterThan(Integer value) {
            addCriterion("WARNID >", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WARNID >=", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidLessThan(Integer value) {
            addCriterion("WARNID <", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidLessThanOrEqualTo(Integer value) {
            addCriterion("WARNID <=", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidIn(List<Integer> values) {
            addCriterion("WARNID in", values, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotIn(List<Integer> values) {
            addCriterion("WARNID not in", values, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidBetween(Integer value1, Integer value2) {
            addCriterion("WARNID between", value1, value2, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotBetween(Integer value1, Integer value2) {
            addCriterion("WARNID not between", value1, value2, "warnid");
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

        public Criteria andLgtdIsNull() {
            addCriterion("LGTD is null");
            return (Criteria) this;
        }

        public Criteria andLgtdIsNotNull() {
            addCriterion("LGTD is not null");
            return (Criteria) this;
        }

        public Criteria andLgtdEqualTo(BigDecimal value) {
            addCriterion("LGTD =", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdNotEqualTo(BigDecimal value) {
            addCriterion("LGTD <>", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdGreaterThan(BigDecimal value) {
            addCriterion("LGTD >", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LGTD >=", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdLessThan(BigDecimal value) {
            addCriterion("LGTD <", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LGTD <=", value, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdIn(List<BigDecimal> values) {
            addCriterion("LGTD in", values, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdNotIn(List<BigDecimal> values) {
            addCriterion("LGTD not in", values, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LGTD between", value1, value2, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLgtdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LGTD not between", value1, value2, "lgtd");
            return (Criteria) this;
        }

        public Criteria andLttdIsNull() {
            addCriterion("LTTD is null");
            return (Criteria) this;
        }

        public Criteria andLttdIsNotNull() {
            addCriterion("LTTD is not null");
            return (Criteria) this;
        }

        public Criteria andLttdEqualTo(BigDecimal value) {
            addCriterion("LTTD =", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdNotEqualTo(BigDecimal value) {
            addCriterion("LTTD <>", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdGreaterThan(BigDecimal value) {
            addCriterion("LTTD >", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LTTD >=", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdLessThan(BigDecimal value) {
            addCriterion("LTTD <", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LTTD <=", value, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdIn(List<BigDecimal> values) {
            addCriterion("LTTD in", values, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdNotIn(List<BigDecimal> values) {
            addCriterion("LTTD not in", values, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LTTD between", value1, value2, "lttd");
            return (Criteria) this;
        }

        public Criteria andLttdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LTTD not between", value1, value2, "lttd");
            return (Criteria) this;
        }

        public Criteria andWarntypenmIsNull() {
            addCriterion("WARNTYPENM is null");
            return (Criteria) this;
        }

        public Criteria andWarntypenmIsNotNull() {
            addCriterion("WARNTYPENM is not null");
            return (Criteria) this;
        }

        public Criteria andWarntypenmEqualTo(String value) {
            addCriterion("WARNTYPENM =", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmNotEqualTo(String value) {
            addCriterion("WARNTYPENM <>", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmGreaterThan(String value) {
            addCriterion("WARNTYPENM >", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmGreaterThanOrEqualTo(String value) {
            addCriterion("WARNTYPENM >=", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmLessThan(String value) {
            addCriterion("WARNTYPENM <", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmLessThanOrEqualTo(String value) {
            addCriterion("WARNTYPENM <=", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmLike(String value) {
            addCriterion("WARNTYPENM like", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmNotLike(String value) {
            addCriterion("WARNTYPENM not like", value, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmIn(List<String> values) {
            addCriterion("WARNTYPENM in", values, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmNotIn(List<String> values) {
            addCriterion("WARNTYPENM not in", values, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmBetween(String value1, String value2) {
            addCriterion("WARNTYPENM between", value1, value2, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarntypenmNotBetween(String value1, String value2) {
            addCriterion("WARNTYPENM not between", value1, value2, "warntypenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmIsNull() {
            addCriterion("WARNGRADENM is null");
            return (Criteria) this;
        }

        public Criteria andWarngradenmIsNotNull() {
            addCriterion("WARNGRADENM is not null");
            return (Criteria) this;
        }

        public Criteria andWarngradenmEqualTo(String value) {
            addCriterion("WARNGRADENM =", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmNotEqualTo(String value) {
            addCriterion("WARNGRADENM <>", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmGreaterThan(String value) {
            addCriterion("WARNGRADENM >", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmGreaterThanOrEqualTo(String value) {
            addCriterion("WARNGRADENM >=", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmLessThan(String value) {
            addCriterion("WARNGRADENM <", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmLessThanOrEqualTo(String value) {
            addCriterion("WARNGRADENM <=", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmLike(String value) {
            addCriterion("WARNGRADENM like", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmNotLike(String value) {
            addCriterion("WARNGRADENM not like", value, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmIn(List<String> values) {
            addCriterion("WARNGRADENM in", values, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmNotIn(List<String> values) {
            addCriterion("WARNGRADENM not in", values, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmBetween(String value1, String value2) {
            addCriterion("WARNGRADENM between", value1, value2, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarngradenmNotBetween(String value1, String value2) {
            addCriterion("WARNGRADENM not between", value1, value2, "warngradenm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmIsNull() {
            addCriterion("WARNSTATUSNM is null");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmIsNotNull() {
            addCriterion("WARNSTATUSNM is not null");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmEqualTo(String value) {
            addCriterion("WARNSTATUSNM =", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmNotEqualTo(String value) {
            addCriterion("WARNSTATUSNM <>", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmGreaterThan(String value) {
            addCriterion("WARNSTATUSNM >", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmGreaterThanOrEqualTo(String value) {
            addCriterion("WARNSTATUSNM >=", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmLessThan(String value) {
            addCriterion("WARNSTATUSNM <", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmLessThanOrEqualTo(String value) {
            addCriterion("WARNSTATUSNM <=", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmLike(String value) {
            addCriterion("WARNSTATUSNM like", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmNotLike(String value) {
            addCriterion("WARNSTATUSNM not like", value, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmIn(List<String> values) {
            addCriterion("WARNSTATUSNM in", values, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmNotIn(List<String> values) {
            addCriterion("WARNSTATUSNM not in", values, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmBetween(String value1, String value2) {
            addCriterion("WARNSTATUSNM between", value1, value2, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstatusnmNotBetween(String value1, String value2) {
            addCriterion("WARNSTATUSNM not between", value1, value2, "warnstatusnm");
            return (Criteria) this;
        }

        public Criteria andWarnstmIsNull() {
            addCriterion("WARNSTM is null");
            return (Criteria) this;
        }

        public Criteria andWarnstmIsNotNull() {
            addCriterion("WARNSTM is not null");
            return (Criteria) this;
        }

        public Criteria andWarnstmEqualTo(Date value) {
            addCriterion("WARNSTM =", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmNotEqualTo(Date value) {
            addCriterion("WARNSTM <>", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmGreaterThan(Date value) {
            addCriterion("WARNSTM >", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmGreaterThanOrEqualTo(Date value) {
            addCriterion("WARNSTM >=", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmLessThan(Date value) {
            addCriterion("WARNSTM <", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmLessThanOrEqualTo(Date value) {
            addCriterion("WARNSTM <=", value, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmIn(List<Date> values) {
            addCriterion("WARNSTM in", values, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmNotIn(List<Date> values) {
            addCriterion("WARNSTM not in", values, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmBetween(Date value1, Date value2) {
            addCriterion("WARNSTM between", value1, value2, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnstmNotBetween(Date value1, Date value2) {
            addCriterion("WARNSTM not between", value1, value2, "warnstm");
            return (Criteria) this;
        }

        public Criteria andWarnetmIsNull() {
            addCriterion("WARNETM is null");
            return (Criteria) this;
        }

        public Criteria andWarnetmIsNotNull() {
            addCriterion("WARNETM is not null");
            return (Criteria) this;
        }

        public Criteria andWarnetmEqualTo(Date value) {
            addCriterion("WARNETM =", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmNotEqualTo(Date value) {
            addCriterion("WARNETM <>", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmGreaterThan(Date value) {
            addCriterion("WARNETM >", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmGreaterThanOrEqualTo(Date value) {
            addCriterion("WARNETM >=", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmLessThan(Date value) {
            addCriterion("WARNETM <", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmLessThanOrEqualTo(Date value) {
            addCriterion("WARNETM <=", value, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmIn(List<Date> values) {
            addCriterion("WARNETM in", values, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmNotIn(List<Date> values) {
            addCriterion("WARNETM not in", values, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmBetween(Date value1, Date value2) {
            addCriterion("WARNETM between", value1, value2, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnetmNotBetween(Date value1, Date value2) {
            addCriterion("WARNETM not between", value1, value2, "warnetm");
            return (Criteria) this;
        }

        public Criteria andWarnnmIsNull() {
            addCriterion("WARNNM is null");
            return (Criteria) this;
        }

        public Criteria andWarnnmIsNotNull() {
            addCriterion("WARNNM is not null");
            return (Criteria) this;
        }

        public Criteria andWarnnmEqualTo(String value) {
            addCriterion("WARNNM =", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmNotEqualTo(String value) {
            addCriterion("WARNNM <>", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmGreaterThan(String value) {
            addCriterion("WARNNM >", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmGreaterThanOrEqualTo(String value) {
            addCriterion("WARNNM >=", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmLessThan(String value) {
            addCriterion("WARNNM <", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmLessThanOrEqualTo(String value) {
            addCriterion("WARNNM <=", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmLike(String value) {
            addCriterion("WARNNM like", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmNotLike(String value) {
            addCriterion("WARNNM not like", value, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmIn(List<String> values) {
            addCriterion("WARNNM in", values, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmNotIn(List<String> values) {
            addCriterion("WARNNM not in", values, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmBetween(String value1, String value2) {
            addCriterion("WARNNM between", value1, value2, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarnnmNotBetween(String value1, String value2) {
            addCriterion("WARNNM not between", value1, value2, "warnnm");
            return (Criteria) this;
        }

        public Criteria andWarndescIsNull() {
            addCriterion("WARNDESC is null");
            return (Criteria) this;
        }

        public Criteria andWarndescIsNotNull() {
            addCriterion("WARNDESC is not null");
            return (Criteria) this;
        }

        public Criteria andWarndescEqualTo(String value) {
            addCriterion("WARNDESC =", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescNotEqualTo(String value) {
            addCriterion("WARNDESC <>", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescGreaterThan(String value) {
            addCriterion("WARNDESC >", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescGreaterThanOrEqualTo(String value) {
            addCriterion("WARNDESC >=", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescLessThan(String value) {
            addCriterion("WARNDESC <", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescLessThanOrEqualTo(String value) {
            addCriterion("WARNDESC <=", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescLike(String value) {
            addCriterion("WARNDESC like", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescNotLike(String value) {
            addCriterion("WARNDESC not like", value, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescIn(List<String> values) {
            addCriterion("WARNDESC in", values, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescNotIn(List<String> values) {
            addCriterion("WARNDESC not in", values, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescBetween(String value1, String value2) {
            addCriterion("WARNDESC between", value1, value2, "warndesc");
            return (Criteria) this;
        }

        public Criteria andWarndescNotBetween(String value1, String value2) {
            addCriterion("WARNDESC not between", value1, value2, "warndesc");
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

        public Criteria andPadnmIsNull() {
            addCriterion("PADNM is null");
            return (Criteria) this;
        }

        public Criteria andPadnmIsNotNull() {
            addCriterion("PADNM is not null");
            return (Criteria) this;
        }

        public Criteria andPadnmEqualTo(String value) {
            addCriterion("PADNM =", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmNotEqualTo(String value) {
            addCriterion("PADNM <>", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmGreaterThan(String value) {
            addCriterion("PADNM >", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmGreaterThanOrEqualTo(String value) {
            addCriterion("PADNM >=", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmLessThan(String value) {
            addCriterion("PADNM <", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmLessThanOrEqualTo(String value) {
            addCriterion("PADNM <=", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmLike(String value) {
            addCriterion("PADNM like", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmNotLike(String value) {
            addCriterion("PADNM not like", value, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmIn(List<String> values) {
            addCriterion("PADNM in", values, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmNotIn(List<String> values) {
            addCriterion("PADNM not in", values, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmBetween(String value1, String value2) {
            addCriterion("PADNM between", value1, value2, "padnm");
            return (Criteria) this;
        }

        public Criteria andPadnmNotBetween(String value1, String value2) {
            addCriterion("PADNM not between", value1, value2, "padnm");
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