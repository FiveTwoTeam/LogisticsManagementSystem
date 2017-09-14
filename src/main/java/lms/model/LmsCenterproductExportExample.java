package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LmsCenterproductExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsCenterproductExportExample() {
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

        public Criteria andExportNoIsNull() {
            addCriterion("export_no is null");
            return (Criteria) this;
        }

        public Criteria andExportNoIsNotNull() {
            addCriterion("export_no is not null");
            return (Criteria) this;
        }

        public Criteria andExportNoEqualTo(BigDecimal value) {
            addCriterion("export_no =", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoNotEqualTo(BigDecimal value) {
            addCriterion("export_no <>", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoGreaterThan(BigDecimal value) {
            addCriterion("export_no >", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("export_no >=", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoLessThan(BigDecimal value) {
            addCriterion("export_no <", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("export_no <=", value, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoIn(List<BigDecimal> values) {
            addCriterion("export_no in", values, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoNotIn(List<BigDecimal> values) {
            addCriterion("export_no not in", values, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_no between", value1, value2, "exportNo");
            return (Criteria) this;
        }

        public Criteria andExportNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_no not between", value1, value2, "exportNo");
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

        public Criteria andLmsSupplierIdIsNull() {
            addCriterion("LMS_Supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdIsNotNull() {
            addCriterion("LMS_Supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdEqualTo(Long value) {
            addCriterion("LMS_Supplier_id =", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotEqualTo(Long value) {
            addCriterion("LMS_Supplier_id <>", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdGreaterThan(Long value) {
            addCriterion("LMS_Supplier_id >", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Supplier_id >=", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdLessThan(Long value) {
            addCriterion("LMS_Supplier_id <", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Supplier_id <=", value, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdIn(List<Long> values) {
            addCriterion("LMS_Supplier_id in", values, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotIn(List<Long> values) {
            addCriterion("LMS_Supplier_id not in", values, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Supplier_id between", value1, value2, "lmsSupplierId");
            return (Criteria) this;
        }

        public Criteria andLmsSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Supplier_id not between", value1, value2, "lmsSupplierId");
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