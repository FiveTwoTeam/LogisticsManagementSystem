package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LmsRepertoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsRepertoryInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaxIsNull() {
            addCriterion("max is null");
            return (Criteria) this;
        }

        public Criteria andMaxIsNotNull() {
            addCriterion("max is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEqualTo(BigDecimal value) {
            addCriterion("max =", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotEqualTo(BigDecimal value) {
            addCriterion("max <>", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThan(BigDecimal value) {
            addCriterion("max >", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max >=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThan(BigDecimal value) {
            addCriterion("max <", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max <=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxIn(List<BigDecimal> values) {
            addCriterion("max in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotIn(List<BigDecimal> values) {
            addCriterion("max not in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max not between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andGuardIsNull() {
            addCriterion("guard is null");
            return (Criteria) this;
        }

        public Criteria andGuardIsNotNull() {
            addCriterion("guard is not null");
            return (Criteria) this;
        }

        public Criteria andGuardEqualTo(BigDecimal value) {
            addCriterion("guard =", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardNotEqualTo(BigDecimal value) {
            addCriterion("guard <>", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardGreaterThan(BigDecimal value) {
            addCriterion("guard >", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guard >=", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardLessThan(BigDecimal value) {
            addCriterion("guard <", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guard <=", value, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardIn(List<BigDecimal> values) {
            addCriterion("guard in", values, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardNotIn(List<BigDecimal> values) {
            addCriterion("guard not in", values, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guard between", value1, value2, "guard");
            return (Criteria) this;
        }

        public Criteria andGuardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guard not between", value1, value2, "guard");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdIsNull() {
            addCriterion("LMS_Repertory_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdIsNotNull() {
            addCriterion("LMS_Repertory_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Repertory_id =", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Repertory_id <>", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Repertory_id >", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Repertory_id >=", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdLessThan(BigDecimal value) {
            addCriterion("LMS_Repertory_id <", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Repertory_id <=", value, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Repertory_id in", values, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Repertory_id not in", values, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Repertory_id between", value1, value2, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsRepertoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Repertory_id not between", value1, value2, "lmsRepertoryId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIsNull() {
            addCriterion("LMS_Product_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIsNotNull() {
            addCriterion("LMS_Product_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id =", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id <>", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Product_id >", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id >=", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdLessThan(BigDecimal value) {
            addCriterion("LMS_Product_id <", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id <=", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_id in", values, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_id not in", values, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_id between", value1, value2, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_id not between", value1, value2, "lmsProductId");
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