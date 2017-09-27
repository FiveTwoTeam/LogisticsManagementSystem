package lms.model;

import java.util.Date;

public class LmsTask {
    private Long id;

    private Short status;

    private Date datetime;

    private Short type;

    private Long lmsOrderId;

    private Long lmsCustomerId;

    private Long lmsStationId;

    private Long lmsStationRepetoryId;

    private Long lmsDeliveryStaffId;

    private String satisfy;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getLmsOrderId() {
        return lmsOrderId;
    }

    public void setLmsOrderId(Long lmsOrderId) {
        this.lmsOrderId = lmsOrderId;
    }

    public Long getLmsCustomerId() {
        return lmsCustomerId;
    }

    public void setLmsCustomerId(Long lmsCustomerId) {
        this.lmsCustomerId = lmsCustomerId;
    }

    public Long getLmsStationId() {
        return lmsStationId;
    }

    public void setLmsStationId(Long lmsStationId) {
        this.lmsStationId = lmsStationId;
    }

    public Long getLmsStationRepetoryId() {
        return lmsStationRepetoryId;
    }

    public void setLmsStationRepetoryId(Long lmsStationRepetoryId) {
        this.lmsStationRepetoryId = lmsStationRepetoryId;
    }

    public Long getLmsDeliveryStaffId() {
        return lmsDeliveryStaffId;
    }

    public void setLmsDeliveryStaffId(Long lmsDeliveryStaffId) {
        this.lmsDeliveryStaffId = lmsDeliveryStaffId;
    }

    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy == null ? null : satisfy.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}