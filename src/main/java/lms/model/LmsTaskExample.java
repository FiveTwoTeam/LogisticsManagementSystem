package lms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LmsTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsTaskExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andLmsOrderIdEqualTo(Long value) {
            addCriterion("\"LMS_Order_id\" =", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotEqualTo(Long value) {
            addCriterion("LMS_Order_id <>", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdGreaterThan(Long value) {
            addCriterion("LMS_Order_id >", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Order_id >=", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdLessThan(Long value) {
            addCriterion("LMS_Order_id <", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Order_id <=", value, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdIn(List<Long> values) {
            addCriterion("LMS_Order_id in", values, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotIn(List<Long> values) {
            addCriterion("LMS_Order_id not in", values, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Order_id between", value1, value2, "lmsOrderId");
            return (Criteria) this;
        }

        public Criteria andLmsOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Order_id not between", value1, value2, "lmsOrderId");
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

        public Criteria andLmsCustomerIdEqualTo(Long value) {
            addCriterion("LMS_Customer_id =", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotEqualTo(Long value) {
            addCriterion("LMS_Customer_id <>", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdGreaterThan(Long value) {
            addCriterion("LMS_Customer_id >", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Customer_id >=", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdLessThan(Long value) {
            addCriterion("LMS_Customer_id <", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Customer_id <=", value, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdIn(List<Long> values) {
            addCriterion("LMS_Customer_id in", values, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotIn(List<Long> values) {
            addCriterion("LMS_Customer_id not in", values, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Customer_id between", value1, value2, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Customer_id not between", value1, value2, "lmsCustomerId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdIsNull() {
            addCriterion("LMS_Station_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdIsNotNull() {
            addCriterion("LMS_Station_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdEqualTo(Long value) {
            addCriterion("LMS_Station_id =", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdNotEqualTo(Long value) {
            addCriterion("LMS_Station_id <>", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdGreaterThan(Long value) {
            addCriterion("LMS_Station_id >", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Station_id >=", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdLessThan(Long value) {
            addCriterion("LMS_Station_id <", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Station_id <=", value, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdIn(List<Long> values) {
            addCriterion("LMS_Station_id in", values, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdNotIn(List<Long> values) {
            addCriterion("LMS_Station_id not in", values, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Station_id between", value1, value2, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Station_id not between", value1, value2, "lmsStationId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdIsNull() {
            addCriterion("LMS_Station_Repetory_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdIsNotNull() {
            addCriterion("LMS_Station_Repetory_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdEqualTo(Long value) {
            addCriterion("LMS_Station_Repetory_id =", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdNotEqualTo(Long value) {
            addCriterion("LMS_Station_Repetory_id <>", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdGreaterThan(Long value) {
            addCriterion("LMS_Station_Repetory_id >", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Station_Repetory_id >=", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdLessThan(Long value) {
            addCriterion("LMS_Station_Repetory_id <", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Station_Repetory_id <=", value, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdIn(List<Long> values) {
            addCriterion("LMS_Station_Repetory_id in", values, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdNotIn(List<Long> values) {
            addCriterion("LMS_Station_Repetory_id not in", values, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Station_Repetory_id between", value1, value2, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsStationRepetoryIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Station_Repetory_id not between", value1, value2, "lmsStationRepetoryId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdIsNull() {
            addCriterion("LMS_Delivery_Staff__id is null");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdIsNotNull() {
            addCriterion("LMS_Delivery_Staff__id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdEqualTo(Long value) {
            addCriterion("LMS_Delivery_Staff__id =", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdNotEqualTo(Long value) {
            addCriterion("LMS_Delivery_Staff__id <>", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdGreaterThan(Long value) {
            addCriterion("LMS_Delivery_Staff__id >", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LMS_Delivery_Staff__id >=", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdLessThan(Long value) {
            addCriterion("LMS_Delivery_Staff__id <", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("LMS_Delivery_Staff__id <=", value, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdIn(List<Long> values) {
            addCriterion("LMS_Delivery_Staff__id in", values, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdNotIn(List<Long> values) {
            addCriterion("LMS_Delivery_Staff__id not in", values, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdBetween(Long value1, Long value2) {
            addCriterion("LMS_Delivery_Staff__id between", value1, value2, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andLmsDeliveryStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("LMS_Delivery_Staff__id not between", value1, value2, "lmsDeliveryStaffId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNull() {
            addCriterion("satisfy is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNotNull() {
            addCriterion("satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyEqualTo(String value) {
            addCriterion("satisfy =", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotEqualTo(String value) {
            addCriterion("satisfy <>", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThan(String value) {
            addCriterion("satisfy >", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("satisfy >=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThan(String value) {
            addCriterion("satisfy <", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThanOrEqualTo(String value) {
            addCriterion("satisfy <=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLike(String value) {
            addCriterion("satisfy like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotLike(String value) {
            addCriterion("satisfy not like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyIn(List<String> values) {
            addCriterion("satisfy in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotIn(List<String> values) {
            addCriterion("satisfy not in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyBetween(String value1, String value2) {
            addCriterion("satisfy between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotBetween(String value1, String value2) {
            addCriterion("satisfy not between", value1, value2, "satisfy");
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