package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LmsProductImportItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsProductImportItemExample() {
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

        public Criteria andExpectCountIsNull() {
            addCriterion("expect_count is null");
            return (Criteria) this;
        }

        public Criteria andExpectCountIsNotNull() {
            addCriterion("expect_count is not null");
            return (Criteria) this;
        }

        public Criteria andExpectCountEqualTo(BigDecimal value) {
            addCriterion("expect_count =", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountNotEqualTo(BigDecimal value) {
            addCriterion("expect_count <>", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountGreaterThan(BigDecimal value) {
            addCriterion("expect_count >", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_count >=", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountLessThan(BigDecimal value) {
            addCriterion("expect_count <", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_count <=", value, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountIn(List<BigDecimal> values) {
            addCriterion("expect_count in", values, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountNotIn(List<BigDecimal> values) {
            addCriterion("expect_count not in", values, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_count between", value1, value2, "expectCount");
            return (Criteria) this;
        }

        public Criteria andExpectCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_count not between", value1, value2, "expectCount");
            return (Criteria) this;
        }

        public Criteria andFactCountIsNull() {
            addCriterion("fact_count is null");
            return (Criteria) this;
        }

        public Criteria andFactCountIsNotNull() {
            addCriterion("fact_count is not null");
            return (Criteria) this;
        }

        public Criteria andFactCountEqualTo(BigDecimal value) {
            addCriterion("fact_count =", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountNotEqualTo(BigDecimal value) {
            addCriterion("fact_count <>", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountGreaterThan(BigDecimal value) {
            addCriterion("fact_count >", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_count >=", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountLessThan(BigDecimal value) {
            addCriterion("fact_count <", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_count <=", value, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountIn(List<BigDecimal> values) {
            addCriterion("fact_count in", values, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountNotIn(List<BigDecimal> values) {
            addCriterion("fact_count not in", values, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_count between", value1, value2, "factCount");
            return (Criteria) this;
        }

        public Criteria andFactCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_count not between", value1, value2, "factCount");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andLmsProductImportIdIsNull() {
            addCriterion("LMS_Product_Import_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdIsNotNull() {
            addCriterion("LMS_Product_Import_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Import_id =", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Import_id <>", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Product_Import_id >", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Import_id >=", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdLessThan(BigDecimal value) {
            addCriterion("LMS_Product_Import_id <", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Import_id <=", value, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_Import_id in", values, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_Import_id not in", values, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_Import_id between", value1, value2, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_Import_id not between", value1, value2, "lmsProductImportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolIsNull() {
            addCriterion("LMS_Product_Import_Itemcol is null");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolIsNotNull() {
            addCriterion("LMS_Product_Import_Itemcol is not null");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolEqualTo(String value) {
            addCriterion("LMS_Product_Import_Itemcol =", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolNotEqualTo(String value) {
            addCriterion("LMS_Product_Import_Itemcol <>", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolGreaterThan(String value) {
            addCriterion("LMS_Product_Import_Itemcol >", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolGreaterThanOrEqualTo(String value) {
            addCriterion("LMS_Product_Import_Itemcol >=", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolLessThan(String value) {
            addCriterion("LMS_Product_Import_Itemcol <", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolLessThanOrEqualTo(String value) {
            addCriterion("LMS_Product_Import_Itemcol <=", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolLike(String value) {
            addCriterion("LMS_Product_Import_Itemcol like", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolNotLike(String value) {
            addCriterion("LMS_Product_Import_Itemcol not like", value, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolIn(List<String> values) {
            addCriterion("LMS_Product_Import_Itemcol in", values, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolNotIn(List<String> values) {
            addCriterion("LMS_Product_Import_Itemcol not in", values, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolBetween(String value1, String value2) {
            addCriterion("LMS_Product_Import_Itemcol between", value1, value2, "lmsProductImportItemcol");
            return (Criteria) this;
        }

        public Criteria andLmsProductImportItemcolNotBetween(String value1, String value2) {
            addCriterion("LMS_Product_Import_Itemcol not between", value1, value2, "lmsProductImportItemcol");
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