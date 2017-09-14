package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LmsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsProductExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdIsNull() {
            addCriterion("LMS_Second_Category_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdIsNotNull() {
            addCriterion("LMS_Second_Category_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Second_Category_id =", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Second_Category_id <>", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Second_Category_id >", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Second_Category_id >=", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdLessThan(BigDecimal value) {
            addCriterion("LMS_Second_Category_id <", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Second_Category_id <=", value, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Second_Category_id in", values, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Second_Category_id not in", values, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Second_Category_id between", value1, value2, "lmsSecondCategoryId");
            return (Criteria) this;
        }

        public Criteria andLmsSecondCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Second_Category_id not between", value1, value2, "lmsSecondCategoryId");
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

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdIsNull() {
            addCriterion("LMS_Supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdIsNotNull() {
            addCriterion("LMS_Supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Supplier_id =", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Supplier_id <>", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Supplier_id >", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Supplier_id >=", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdLessThan(BigDecimal value) {
            addCriterion("LMS_Supplier_id <", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Supplier_id <=", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Supplier_id in", values, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Supplier_id not in", values, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Supplier_id between", value1, value2, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Supplier_id not between", value1, value2, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodIsNull() {
            addCriterion("quality_period is null");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodIsNotNull() {
            addCriterion("quality_period is not null");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodEqualTo(String value) {
            addCriterion("quality_period =", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodNotEqualTo(String value) {
            addCriterion("quality_period <>", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodGreaterThan(String value) {
            addCriterion("quality_period >", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("quality_period >=", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodLessThan(String value) {
            addCriterion("quality_period <", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodLessThanOrEqualTo(String value) {
            addCriterion("quality_period <=", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodLike(String value) {
            addCriterion("quality_period like", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodNotLike(String value) {
            addCriterion("quality_period not like", value, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodIn(List<String> values) {
            addCriterion("quality_period in", values, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodNotIn(List<String> values) {
            addCriterion("quality_period not in", values, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodBetween(String value1, String value2) {
            addCriterion("quality_period between", value1, value2, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andQualityPeriodNotBetween(String value1, String value2) {
            addCriterion("quality_period not between", value1, value2, "qualityPeriod");
            return (Criteria) this;
        }

        public Criteria andIfBackIsNull() {
            addCriterion("if_back is null");
            return (Criteria) this;
        }

        public Criteria andIfBackIsNotNull() {
            addCriterion("if_back is not null");
            return (Criteria) this;
        }

        public Criteria andIfBackEqualTo(BigDecimal value) {
            addCriterion("if_back =", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackNotEqualTo(BigDecimal value) {
            addCriterion("if_back <>", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackGreaterThan(BigDecimal value) {
            addCriterion("if_back >", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("if_back >=", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackLessThan(BigDecimal value) {
            addCriterion("if_back <", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("if_back <=", value, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackIn(List<BigDecimal> values) {
            addCriterion("if_back in", values, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackNotIn(List<BigDecimal> values) {
            addCriterion("if_back not in", values, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("if_back between", value1, value2, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfBackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("if_back not between", value1, value2, "ifBack");
            return (Criteria) this;
        }

        public Criteria andIfExchangeIsNull() {
            addCriterion("if_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIfExchangeIsNotNull() {
            addCriterion("if_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIfExchangeEqualTo(BigDecimal value) {
            addCriterion("if_exchange =", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeNotEqualTo(BigDecimal value) {
            addCriterion("if_exchange <>", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeGreaterThan(BigDecimal value) {
            addCriterion("if_exchange >", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("if_exchange >=", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeLessThan(BigDecimal value) {
            addCriterion("if_exchange <", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("if_exchange <=", value, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeIn(List<BigDecimal> values) {
            addCriterion("if_exchange in", values, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeNotIn(List<BigDecimal> values) {
            addCriterion("if_exchange not in", values, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("if_exchange between", value1, value2, "ifExchange");
            return (Criteria) this;
        }

        public Criteria andIfExchangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("if_exchange not between", value1, value2, "ifExchange");
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