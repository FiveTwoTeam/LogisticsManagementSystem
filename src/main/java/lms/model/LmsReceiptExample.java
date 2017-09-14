package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LmsReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsReceiptExample() {
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

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andGainDateIsNull() {
            addCriterion("gain_date is null");
            return (Criteria) this;
        }

        public Criteria andGainDateIsNotNull() {
            addCriterion("gain_date is not null");
            return (Criteria) this;
        }

        public Criteria andGainDateEqualTo(Date value) {
            addCriterionForJDBCDate("gain_date =", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gain_date <>", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateGreaterThan(Date value) {
            addCriterionForJDBCDate("gain_date >", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gain_date >=", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateLessThan(Date value) {
            addCriterionForJDBCDate("gain_date <", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gain_date <=", value, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateIn(List<Date> values) {
            addCriterionForJDBCDate("gain_date in", values, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gain_date not in", values, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gain_date between", value1, value2, "gainDate");
            return (Criteria) this;
        }

        public Criteria andGainDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gain_date not between", value1, value2, "gainDate");
            return (Criteria) this;
        }

        public Criteria andMissDateIsNull() {
            addCriterion("miss_date is null");
            return (Criteria) this;
        }

        public Criteria andMissDateIsNotNull() {
            addCriterion("miss_date is not null");
            return (Criteria) this;
        }

        public Criteria andMissDateEqualTo(Date value) {
            addCriterionForJDBCDate("miss_date =", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("miss_date <>", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateGreaterThan(Date value) {
            addCriterionForJDBCDate("miss_date >", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("miss_date >=", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateLessThan(Date value) {
            addCriterionForJDBCDate("miss_date <", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("miss_date <=", value, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateIn(List<Date> values) {
            addCriterionForJDBCDate("miss_date in", values, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("miss_date not in", values, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("miss_date between", value1, value2, "missDate");
            return (Criteria) this;
        }

        public Criteria andMissDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("miss_date not between", value1, value2, "missDate");
            return (Criteria) this;
        }

        public Criteria andGainManIsNull() {
            addCriterion("gain_man is null");
            return (Criteria) this;
        }

        public Criteria andGainManIsNotNull() {
            addCriterion("gain_man is not null");
            return (Criteria) this;
        }

        public Criteria andGainManEqualTo(String value) {
            addCriterion("gain_man =", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManNotEqualTo(String value) {
            addCriterion("gain_man <>", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManGreaterThan(String value) {
            addCriterion("gain_man >", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManGreaterThanOrEqualTo(String value) {
            addCriterion("gain_man >=", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManLessThan(String value) {
            addCriterion("gain_man <", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManLessThanOrEqualTo(String value) {
            addCriterion("gain_man <=", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManLike(String value) {
            addCriterion("gain_man like", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManNotLike(String value) {
            addCriterion("gain_man not like", value, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManIn(List<String> values) {
            addCriterion("gain_man in", values, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManNotIn(List<String> values) {
            addCriterion("gain_man not in", values, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManBetween(String value1, String value2) {
            addCriterion("gain_man between", value1, value2, "gainMan");
            return (Criteria) this;
        }

        public Criteria andGainManNotBetween(String value1, String value2) {
            addCriterion("gain_man not between", value1, value2, "gainMan");
            return (Criteria) this;
        }

        public Criteria andMissManIsNull() {
            addCriterion("miss_man is null");
            return (Criteria) this;
        }

        public Criteria andMissManIsNotNull() {
            addCriterion("miss_man is not null");
            return (Criteria) this;
        }

        public Criteria andMissManEqualTo(String value) {
            addCriterion("miss_man =", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManNotEqualTo(String value) {
            addCriterion("miss_man <>", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManGreaterThan(String value) {
            addCriterion("miss_man >", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManGreaterThanOrEqualTo(String value) {
            addCriterion("miss_man >=", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManLessThan(String value) {
            addCriterion("miss_man <", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManLessThanOrEqualTo(String value) {
            addCriterion("miss_man <=", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManLike(String value) {
            addCriterion("miss_man like", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManNotLike(String value) {
            addCriterion("miss_man not like", value, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManIn(List<String> values) {
            addCriterion("miss_man in", values, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManNotIn(List<String> values) {
            addCriterion("miss_man not in", values, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManBetween(String value1, String value2) {
            addCriterion("miss_man between", value1, value2, "missMan");
            return (Criteria) this;
        }

        public Criteria andMissManNotBetween(String value1, String value2) {
            addCriterion("miss_man not between", value1, value2, "missMan");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
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