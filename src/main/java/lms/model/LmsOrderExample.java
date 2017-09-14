package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LmsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(BigDecimal value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(BigDecimal value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(BigDecimal value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(BigDecimal value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<BigDecimal> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<BigDecimal> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdIsNull() {
            addCriterion("LMS_Customer_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdIsNotNull() {
            addCriterion("LMS_Customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Customer_id =", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Customer_id <>", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Customer_id >", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Customer_id >=", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdLessThan(BigDecimal value) {
            addCriterion("LMS_Customer_id <", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Customer_id <=", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Customer_id in", values, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Customer_id not in", values, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Customer_id between", value1, value2, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Customer_id not between", value1, value2, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerAddressIsNull() {
            addCriterion("payer_address is null");
            return (Criteria) this;
        }

        public Criteria andPayerAddressIsNotNull() {
            addCriterion("payer_address is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAddressEqualTo(String value) {
            addCriterion("payer_address =", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressNotEqualTo(String value) {
            addCriterion("payer_address <>", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressGreaterThan(String value) {
            addCriterion("payer_address >", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("payer_address >=", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressLessThan(String value) {
            addCriterion("payer_address <", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressLessThanOrEqualTo(String value) {
            addCriterion("payer_address <=", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressLike(String value) {
            addCriterion("payer_address like", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressNotLike(String value) {
            addCriterion("payer_address not like", value, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressIn(List<String> values) {
            addCriterion("payer_address in", values, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressNotIn(List<String> values) {
            addCriterion("payer_address not in", values, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressBetween(String value1, String value2) {
            addCriterion("payer_address between", value1, value2, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerAddressNotBetween(String value1, String value2) {
            addCriterion("payer_address not between", value1, value2, "payerAddress");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneIsNull() {
            addCriterion("payer_phone is null");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneIsNotNull() {
            addCriterion("payer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneEqualTo(BigDecimal value) {
            addCriterion("payer_phone =", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneNotEqualTo(BigDecimal value) {
            addCriterion("payer_phone <>", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneGreaterThan(BigDecimal value) {
            addCriterion("payer_phone >", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_phone >=", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneLessThan(BigDecimal value) {
            addCriterion("payer_phone <", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_phone <=", value, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneIn(List<BigDecimal> values) {
            addCriterion("payer_phone in", values, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneNotIn(List<BigDecimal> values) {
            addCriterion("payer_phone not in", values, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_phone between", value1, value2, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPhoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_phone not between", value1, value2, "payerPhone");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeIsNull() {
            addCriterion("payer_post_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeIsNotNull() {
            addCriterion("payer_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeEqualTo(BigDecimal value) {
            addCriterion("payer_post_code =", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeNotEqualTo(BigDecimal value) {
            addCriterion("payer_post_code <>", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeGreaterThan(BigDecimal value) {
            addCriterion("payer_post_code >", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_post_code >=", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeLessThan(BigDecimal value) {
            addCriterion("payer_post_code <", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_post_code <=", value, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeIn(List<BigDecimal> values) {
            addCriterion("payer_post_code in", values, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeNotIn(List<BigDecimal> values) {
            addCriterion("payer_post_code not in", values, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_post_code between", value1, value2, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andPayerPostCodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_post_code not between", value1, value2, "payerPostCode");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterionForJDBCDate("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdIsNull() {
            addCriterion("LMS_Admin_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdIsNotNull() {
            addCriterion("LMS_Admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Admin_id =", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Admin_id <>", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Admin_id >", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Admin_id >=", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdLessThan(BigDecimal value) {
            addCriterion("LMS_Admin_id <", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Admin_id <=", value, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Admin_id in", values, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Admin_id not in", values, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Admin_id between", value1, value2, "lmsAdminId");
            return (Criteria) this;
        }

        public Criteria andLmsAdminIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Admin_id not between", value1, value2, "lmsAdminId");
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