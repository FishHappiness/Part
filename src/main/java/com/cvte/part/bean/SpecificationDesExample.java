package com.cvte.part.bean;

import java.util.ArrayList;
import java.util.List;

public class SpecificationDesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecificationDesExample() {
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

        public Criteria andSpecDesIdIsNull() {
            addCriterion("spec_des_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdIsNotNull() {
            addCriterion("spec_des_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdEqualTo(String value) {
            addCriterion("spec_des_id =", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdNotEqualTo(String value) {
            addCriterion("spec_des_id <>", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdGreaterThan(String value) {
            addCriterion("spec_des_id >", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdGreaterThanOrEqualTo(String value) {
            addCriterion("spec_des_id >=", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdLessThan(String value) {
            addCriterion("spec_des_id <", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdLessThanOrEqualTo(String value) {
            addCriterion("spec_des_id <=", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdLike(String value) {
            addCriterion("spec_des_id like", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdNotLike(String value) {
            addCriterion("spec_des_id not like", value, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdIn(List<String> values) {
            addCriterion("spec_des_id in", values, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdNotIn(List<String> values) {
            addCriterion("spec_des_id not in", values, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdBetween(String value1, String value2) {
            addCriterion("spec_des_id between", value1, value2, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesIdNotBetween(String value1, String value2) {
            addCriterion("spec_des_id not between", value1, value2, "specDesId");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameIsNull() {
            addCriterion("spec_des_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameIsNotNull() {
            addCriterion("spec_des_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameEqualTo(String value) {
            addCriterion("spec_des_name =", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameNotEqualTo(String value) {
            addCriterion("spec_des_name <>", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameGreaterThan(String value) {
            addCriterion("spec_des_name >", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_des_name >=", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameLessThan(String value) {
            addCriterion("spec_des_name <", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameLessThanOrEqualTo(String value) {
            addCriterion("spec_des_name <=", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameLike(String value) {
            addCriterion("spec_des_name like", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameNotLike(String value) {
            addCriterion("spec_des_name not like", value, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameIn(List<String> values) {
            addCriterion("spec_des_name in", values, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameNotIn(List<String> values) {
            addCriterion("spec_des_name not in", values, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameBetween(String value1, String value2) {
            addCriterion("spec_des_name between", value1, value2, "specDesName");
            return (Criteria) this;
        }

        public Criteria andSpecDesNameNotBetween(String value1, String value2) {
            addCriterion("spec_des_name not between", value1, value2, "specDesName");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(String value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(String value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(String value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(String value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(String value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLike(String value) {
            addCriterion("rule_id like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotLike(String value) {
            addCriterion("rule_id not like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<String> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<String> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(String value1, String value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(String value1, String value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
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