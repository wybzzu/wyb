package com.huitu.api.hnsl.entity;

import java.util.ArrayList;
import java.util.List;

public class FbSeecardBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbSeecardBExample() {
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

        public Criteria andTownIsNull() {
            addCriterion("TOWN is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("TOWN is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("TOWN =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("TOWN <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("TOWN >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("TOWN >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("TOWN <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("TOWN <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("TOWN like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("TOWN not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("TOWN in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("TOWN not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("TOWN between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("TOWN not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andVillageIsNull() {
            addCriterion("VILLAGE is null");
            return (Criteria) this;
        }

        public Criteria andVillageIsNotNull() {
            addCriterion("VILLAGE is not null");
            return (Criteria) this;
        }

        public Criteria andVillageEqualTo(String value) {
            addCriterion("VILLAGE =", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotEqualTo(String value) {
            addCriterion("VILLAGE <>", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThan(String value) {
            addCriterion("VILLAGE >", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE >=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThan(String value) {
            addCriterion("VILLAGE <", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE <=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLike(String value) {
            addCriterion("VILLAGE like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotLike(String value) {
            addCriterion("VILLAGE not like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageIn(List<String> values) {
            addCriterion("VILLAGE in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotIn(List<String> values) {
            addCriterion("VILLAGE not in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageBetween(String value1, String value2) {
            addCriterion("VILLAGE between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotBetween(String value1, String value2) {
            addCriterion("VILLAGE not between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andHostnmIsNull() {
            addCriterion("HOSTNM is null");
            return (Criteria) this;
        }

        public Criteria andHostnmIsNotNull() {
            addCriterion("HOSTNM is not null");
            return (Criteria) this;
        }

        public Criteria andHostnmEqualTo(String value) {
            addCriterion("HOSTNM =", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmNotEqualTo(String value) {
            addCriterion("HOSTNM <>", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmGreaterThan(String value) {
            addCriterion("HOSTNM >", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmGreaterThanOrEqualTo(String value) {
            addCriterion("HOSTNM >=", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmLessThan(String value) {
            addCriterion("HOSTNM <", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmLessThanOrEqualTo(String value) {
            addCriterion("HOSTNM <=", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmLike(String value) {
            addCriterion("HOSTNM like", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmNotLike(String value) {
            addCriterion("HOSTNM not like", value, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmIn(List<String> values) {
            addCriterion("HOSTNM in", values, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmNotIn(List<String> values) {
            addCriterion("HOSTNM not in", values, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmBetween(String value1, String value2) {
            addCriterion("HOSTNM between", value1, value2, "hostnm");
            return (Criteria) this;
        }

        public Criteria andHostnmNotBetween(String value1, String value2) {
            addCriterion("HOSTNM not between", value1, value2, "hostnm");
            return (Criteria) this;
        }

        public Criteria andMobilepheIsNull() {
            addCriterion("MOBILEPHE is null");
            return (Criteria) this;
        }

        public Criteria andMobilepheIsNotNull() {
            addCriterion("MOBILEPHE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilepheEqualTo(String value) {
            addCriterion("MOBILEPHE =", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheNotEqualTo(String value) {
            addCriterion("MOBILEPHE <>", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheGreaterThan(String value) {
            addCriterion("MOBILEPHE >", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHE >=", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheLessThan(String value) {
            addCriterion("MOBILEPHE <", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHE <=", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheLike(String value) {
            addCriterion("MOBILEPHE like", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheNotLike(String value) {
            addCriterion("MOBILEPHE not like", value, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheIn(List<String> values) {
            addCriterion("MOBILEPHE in", values, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheNotIn(List<String> values) {
            addCriterion("MOBILEPHE not in", values, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheBetween(String value1, String value2) {
            addCriterion("MOBILEPHE between", value1, value2, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andMobilepheNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHE not between", value1, value2, "mobilephe");
            return (Criteria) this;
        }

        public Criteria andPeoplesIsNull() {
            addCriterion("PEOPLES is null");
            return (Criteria) this;
        }

        public Criteria andPeoplesIsNotNull() {
            addCriterion("PEOPLES is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplesEqualTo(Short value) {
            addCriterion("PEOPLES =", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesNotEqualTo(Short value) {
            addCriterion("PEOPLES <>", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesGreaterThan(Short value) {
            addCriterion("PEOPLES >", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesGreaterThanOrEqualTo(Short value) {
            addCriterion("PEOPLES >=", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesLessThan(Short value) {
            addCriterion("PEOPLES <", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesLessThanOrEqualTo(Short value) {
            addCriterion("PEOPLES <=", value, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesIn(List<Short> values) {
            addCriterion("PEOPLES in", values, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesNotIn(List<Short> values) {
            addCriterion("PEOPLES not in", values, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesBetween(Short value1, Short value2) {
            addCriterion("PEOPLES between", value1, value2, "peoples");
            return (Criteria) this;
        }

        public Criteria andPeoplesNotBetween(Short value1, Short value2) {
            addCriterion("PEOPLES not between", value1, value2, "peoples");
            return (Criteria) this;
        }

        public Criteria andTrferpointIsNull() {
            addCriterion("TRFERPOINT is null");
            return (Criteria) this;
        }

        public Criteria andTrferpointIsNotNull() {
            addCriterion("TRFERPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andTrferpointEqualTo(String value) {
            addCriterion("TRFERPOINT =", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointNotEqualTo(String value) {
            addCriterion("TRFERPOINT <>", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointGreaterThan(String value) {
            addCriterion("TRFERPOINT >", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointGreaterThanOrEqualTo(String value) {
            addCriterion("TRFERPOINT >=", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointLessThan(String value) {
            addCriterion("TRFERPOINT <", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointLessThanOrEqualTo(String value) {
            addCriterion("TRFERPOINT <=", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointLike(String value) {
            addCriterion("TRFERPOINT like", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointNotLike(String value) {
            addCriterion("TRFERPOINT not like", value, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointIn(List<String> values) {
            addCriterion("TRFERPOINT in", values, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointNotIn(List<String> values) {
            addCriterion("TRFERPOINT not in", values, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointBetween(String value1, String value2) {
            addCriterion("TRFERPOINT between", value1, value2, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andTrferpointNotBetween(String value1, String value2) {
            addCriterion("TRFERPOINT not between", value1, value2, "trferpoint");
            return (Criteria) this;
        }

        public Criteria andMgrnmIsNull() {
            addCriterion("MGRNM is null");
            return (Criteria) this;
        }

        public Criteria andMgrnmIsNotNull() {
            addCriterion("MGRNM is not null");
            return (Criteria) this;
        }

        public Criteria andMgrnmEqualTo(String value) {
            addCriterion("MGRNM =", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmNotEqualTo(String value) {
            addCriterion("MGRNM <>", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmGreaterThan(String value) {
            addCriterion("MGRNM >", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmGreaterThanOrEqualTo(String value) {
            addCriterion("MGRNM >=", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmLessThan(String value) {
            addCriterion("MGRNM <", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmLessThanOrEqualTo(String value) {
            addCriterion("MGRNM <=", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmLike(String value) {
            addCriterion("MGRNM like", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmNotLike(String value) {
            addCriterion("MGRNM not like", value, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmIn(List<String> values) {
            addCriterion("MGRNM in", values, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmNotIn(List<String> values) {
            addCriterion("MGRNM not in", values, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmBetween(String value1, String value2) {
            addCriterion("MGRNM between", value1, value2, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrnmNotBetween(String value1, String value2) {
            addCriterion("MGRNM not between", value1, value2, "mgrnm");
            return (Criteria) this;
        }

        public Criteria andMgrpheIsNull() {
            addCriterion("MGRPHE is null");
            return (Criteria) this;
        }

        public Criteria andMgrpheIsNotNull() {
            addCriterion("MGRPHE is not null");
            return (Criteria) this;
        }

        public Criteria andMgrpheEqualTo(String value) {
            addCriterion("MGRPHE =", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheNotEqualTo(String value) {
            addCriterion("MGRPHE <>", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheGreaterThan(String value) {
            addCriterion("MGRPHE >", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheGreaterThanOrEqualTo(String value) {
            addCriterion("MGRPHE >=", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheLessThan(String value) {
            addCriterion("MGRPHE <", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheLessThanOrEqualTo(String value) {
            addCriterion("MGRPHE <=", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheLike(String value) {
            addCriterion("MGRPHE like", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheNotLike(String value) {
            addCriterion("MGRPHE not like", value, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheIn(List<String> values) {
            addCriterion("MGRPHE in", values, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheNotIn(List<String> values) {
            addCriterion("MGRPHE not in", values, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheBetween(String value1, String value2) {
            addCriterion("MGRPHE between", value1, value2, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andMgrpheNotBetween(String value1, String value2) {
            addCriterion("MGRPHE not between", value1, value2, "mgrphe");
            return (Criteria) this;
        }

        public Criteria andWarningsigIsNull() {
            addCriterion("WARNINGSIG is null");
            return (Criteria) this;
        }

        public Criteria andWarningsigIsNotNull() {
            addCriterion("WARNINGSIG is not null");
            return (Criteria) this;
        }

        public Criteria andWarningsigEqualTo(String value) {
            addCriterion("WARNINGSIG =", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigNotEqualTo(String value) {
            addCriterion("WARNINGSIG <>", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigGreaterThan(String value) {
            addCriterion("WARNINGSIG >", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigGreaterThanOrEqualTo(String value) {
            addCriterion("WARNINGSIG >=", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigLessThan(String value) {
            addCriterion("WARNINGSIG <", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigLessThanOrEqualTo(String value) {
            addCriterion("WARNINGSIG <=", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigLike(String value) {
            addCriterion("WARNINGSIG like", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigNotLike(String value) {
            addCriterion("WARNINGSIG not like", value, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigIn(List<String> values) {
            addCriterion("WARNINGSIG in", values, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigNotIn(List<String> values) {
            addCriterion("WARNINGSIG not in", values, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigBetween(String value1, String value2) {
            addCriterion("WARNINGSIG between", value1, value2, "warningsig");
            return (Criteria) this;
        }

        public Criteria andWarningsigNotBetween(String value1, String value2) {
            addCriterion("WARNINGSIG not between", value1, value2, "warningsig");
            return (Criteria) this;
        }

        public Criteria andAdcdIsNull() {
            addCriterion("adcd is null");
            return (Criteria) this;
        }

        public Criteria andAdcdIsNotNull() {
            addCriterion("adcd is not null");
            return (Criteria) this;
        }

        public Criteria andAdcdEqualTo(String value) {
            addCriterion("adcd =", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotEqualTo(String value) {
            addCriterion("adcd <>", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdGreaterThan(String value) {
            addCriterion("adcd >", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdGreaterThanOrEqualTo(String value) {
            addCriterion("adcd >=", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLessThan(String value) {
            addCriterion("adcd <", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLessThanOrEqualTo(String value) {
            addCriterion("adcd <=", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdLike(String value) {
            addCriterion("adcd like", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotLike(String value) {
            addCriterion("adcd not like", value, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdIn(List<String> values) {
            addCriterion("adcd in", values, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotIn(List<String> values) {
            addCriterion("adcd not in", values, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdBetween(String value1, String value2) {
            addCriterion("adcd between", value1, value2, "adcd");
            return (Criteria) this;
        }

        public Criteria andAdcdNotBetween(String value1, String value2) {
            addCriterion("adcd not between", value1, value2, "adcd");
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