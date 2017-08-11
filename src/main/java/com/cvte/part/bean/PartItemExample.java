package com.cvte.part.bean;

import java.util.ArrayList;
import java.util.List;

public class PartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartItemExample() {
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

        public Criteria andPartItemIdIsNull() {
            addCriterion("part_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPartItemIdIsNotNull() {
            addCriterion("part_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartItemIdEqualTo(String value) {
            addCriterion("part_item_id =", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdNotEqualTo(String value) {
            addCriterion("part_item_id <>", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdGreaterThan(String value) {
            addCriterion("part_item_id >", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("part_item_id >=", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdLessThan(String value) {
            addCriterion("part_item_id <", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdLessThanOrEqualTo(String value) {
            addCriterion("part_item_id <=", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdLike(String value) {
            addCriterion("part_item_id like", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdNotLike(String value) {
            addCriterion("part_item_id not like", value, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdIn(List<String> values) {
            addCriterion("part_item_id in", values, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdNotIn(List<String> values) {
            addCriterion("part_item_id not in", values, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdBetween(String value1, String value2) {
            addCriterion("part_item_id between", value1, value2, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemIdNotBetween(String value1, String value2) {
            addCriterion("part_item_id not between", value1, value2, "partItemId");
            return (Criteria) this;
        }

        public Criteria andPartItemNameIsNull() {
            addCriterion("part_item_name is null");
            return (Criteria) this;
        }

        public Criteria andPartItemNameIsNotNull() {
            addCriterion("part_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartItemNameEqualTo(String value) {
            addCriterion("part_item_name =", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameNotEqualTo(String value) {
            addCriterion("part_item_name <>", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameGreaterThan(String value) {
            addCriterion("part_item_name >", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_item_name >=", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameLessThan(String value) {
            addCriterion("part_item_name <", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameLessThanOrEqualTo(String value) {
            addCriterion("part_item_name <=", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameLike(String value) {
            addCriterion("part_item_name like", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameNotLike(String value) {
            addCriterion("part_item_name not like", value, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameIn(List<String> values) {
            addCriterion("part_item_name in", values, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameNotIn(List<String> values) {
            addCriterion("part_item_name not in", values, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameBetween(String value1, String value2) {
            addCriterion("part_item_name between", value1, value2, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartItemNameNotBetween(String value1, String value2) {
            addCriterion("part_item_name not between", value1, value2, "partItemName");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIsNull() {
            addCriterion("part_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIsNotNull() {
            addCriterion("part_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartClassIdEqualTo(String value) {
            addCriterion("part_class_id =", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotEqualTo(String value) {
            addCriterion("part_class_id <>", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdGreaterThan(String value) {
            addCriterion("part_class_id >", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("part_class_id >=", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdLessThan(String value) {
            addCriterion("part_class_id <", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdLessThanOrEqualTo(String value) {
            addCriterion("part_class_id <=", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdLike(String value) {
            addCriterion("part_class_id like", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotLike(String value) {
            addCriterion("part_class_id not like", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIn(List<String> values) {
            addCriterion("part_class_id in", values, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotIn(List<String> values) {
            addCriterion("part_class_id not in", values, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdBetween(String value1, String value2) {
            addCriterion("part_class_id between", value1, value2, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotBetween(String value1, String value2) {
            addCriterion("part_class_id not between", value1, value2, "partClassId");
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