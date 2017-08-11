package com.cvte.part.bean;

import java.util.ArrayList;
import java.util.List;

public class SpecificationDesDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecificationDesDetailExample() {
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

        public Criteria andSpecDesDetailIdIsNull() {
            addCriterion("spec_des_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdIsNotNull() {
            addCriterion("spec_des_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdEqualTo(String value) {
            addCriterion("spec_des_detail_id =", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdNotEqualTo(String value) {
            addCriterion("spec_des_detail_id <>", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdGreaterThan(String value) {
            addCriterion("spec_des_detail_id >", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("spec_des_detail_id >=", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdLessThan(String value) {
            addCriterion("spec_des_detail_id <", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("spec_des_detail_id <=", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdLike(String value) {
            addCriterion("spec_des_detail_id like", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdNotLike(String value) {
            addCriterion("spec_des_detail_id not like", value, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdIn(List<String> values) {
            addCriterion("spec_des_detail_id in", values, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdNotIn(List<String> values) {
            addCriterion("spec_des_detail_id not in", values, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdBetween(String value1, String value2) {
            addCriterion("spec_des_detail_id between", value1, value2, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andSpecDesDetailIdNotBetween(String value1, String value2) {
            addCriterion("spec_des_detail_id not between", value1, value2, "specDesDetailId");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNull() {
            addCriterion("property_name is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNotNull() {
            addCriterion("property_name is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("property_name =", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("property_name <>", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("property_name >", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("property_name >=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("property_name <", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("property_name <=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLike(String value) {
            addCriterion("property_name like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotLike(String value) {
            addCriterion("property_name not like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIn(List<String> values) {
            addCriterion("property_name in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotIn(List<String> values) {
            addCriterion("property_name not in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("property_name between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("property_name not between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyValueIsNull() {
            addCriterion("property_value is null");
            return (Criteria) this;
        }

        public Criteria andPropertyValueIsNotNull() {
            addCriterion("property_value is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyValueEqualTo(String value) {
            addCriterion("property_value =", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueNotEqualTo(String value) {
            addCriterion("property_value <>", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueGreaterThan(String value) {
            addCriterion("property_value >", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueGreaterThanOrEqualTo(String value) {
            addCriterion("property_value >=", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueLessThan(String value) {
            addCriterion("property_value <", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueLessThanOrEqualTo(String value) {
            addCriterion("property_value <=", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueLike(String value) {
            addCriterion("property_value like", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueNotLike(String value) {
            addCriterion("property_value not like", value, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueIn(List<String> values) {
            addCriterion("property_value in", values, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueNotIn(List<String> values) {
            addCriterion("property_value not in", values, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueBetween(String value1, String value2) {
            addCriterion("property_value between", value1, value2, "propertyValue");
            return (Criteria) this;
        }

        public Criteria andPropertyValueNotBetween(String value1, String value2) {
            addCriterion("property_value not between", value1, value2, "propertyValue");
            return (Criteria) this;
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