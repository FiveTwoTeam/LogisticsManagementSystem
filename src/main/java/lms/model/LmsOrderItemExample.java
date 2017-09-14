package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LmsOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsOrderItemExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdIsNull() {
            addCriterion("LMS_Order_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdIsNotNull() {
            addCriterion("LMS_Order_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Order_id =", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Order_id <>", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Order_id >", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Order_id >=", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdLessThan(BigDecimal value) {
            addCriterion("LMS_Order_id <", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Order_id <=", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Order_id in", values, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Order_id not in", values, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Order_id between", value1, value2, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Order_id not between", value1, value2, "lmsOrderId");
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

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(BigDecimal value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(BigDecimal value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(BigDecimal value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(BigDecimal value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<BigDecimal> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<BigDecimal> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSubpriceIsNull() {
            addCriterion("subprice is null");
            return (Criteria) this;
        }

        public Criteria andSubpriceIsNotNull() {
            addCriterion("subprice is not null");
            return (Criteria) this;
        }

        public Criteria andSubpriceEqualTo(BigDecimal value) {
            addCriterion("subprice =", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotEqualTo(BigDecimal value) {
            addCriterion("subprice <>", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceGreaterThan(BigDecimal value) {
            addCriterion("subprice >", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subprice >=", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceLessThan(BigDecimal value) {
            addCriterion("subprice <", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subprice <=", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceIn(List<BigDecimal> values) {
            addCriterion("subprice in", values, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotIn(List<BigDecimal> values) {
            addCriterion("subprice not in", values, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subprice between", value1, value2, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subprice not between", value1, value2, "subprice");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
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