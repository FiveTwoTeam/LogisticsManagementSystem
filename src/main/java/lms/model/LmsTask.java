package lms.model;

import java.util.Date;
import java.util.List;

public class LmsTask {
    private Long id;

    private Short status;

    private Date datetime;

    private Short type;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"status\":")
                .append(status);
        sb.append(",\"datetime\":\"")
                .append(datetime).append('\"');
        sb.append(",\"type\":")
                .append(type);
        sb.append(",\"lmsOrderId\":")
                .append(lmsOrderId);
        sb.append(",\"lmsCustomerId\":")
                .append(lmsCustomerId);
        sb.append(",\"lmsStationId\":")
                .append(lmsStationId);
        sb.append(",\"lmsStationRepetoryId\":")
                .append(lmsStationRepetoryId);
        sb.append(",\"lmsDeliveryStaffId\":")
                .append(lmsDeliveryStaffId);
        sb.append(",\"satisfy\":\"")
                .append(satisfy).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"lmsOrderList\":")
                .append(lmsOrderList);
        sb.append(",\"lmsStationRepetoryList\":")
                .append(lmsStationRepetoryList);
        sb.append(",\"lmsCustomer\":")
                .append(lmsCustomer);
        sb.append(",\"lmsStation\":")
                .append(lmsStation);
        sb.append(",\"lmsDeliveryStaff\":")
                .append(lmsDeliveryStaff);
        sb.append('}');
        return sb.toString();
    }

    private Long lmsOrderId;

    private Long lmsCustomerId;

    private Long lmsStationId;

    private Long lmsStationRepetoryId;

    private Long lmsDeliveryStaffId;

    private String satisfy;

    private String description;

    private List<LmsOrder> lmsOrderList;

    private List<LmsStationRepetory> lmsStationRepetoryList;

    private LmsCustomer lmsCustomer;

    public List<LmsStationRepetory> getLmsStationRepetoryList() {
        return lmsStationRepetoryList;
    }

    public void setLmsStationRepetoryList(List<LmsStationRepetory> lmsStationRepetoryList) {
        this.lmsStationRepetoryList = lmsStationRepetoryList;
    }

    public LmsCustomer getLmsCustomer() {
        return lmsCustomer;
    }

    public void setLmsCustomer(LmsCustomer lmsCustomer) {
        this.lmsCustomer = lmsCustomer;
    }

    public LmsStation getLmsStation() {
        return lmsStation;
    }

    public void setLmsStation(LmsStation lmsStation) {
        this.lmsStation = lmsStation;
    }

    public LmsDeliveryStaff getLmsDeliveryStaff() {
        return lmsDeliveryStaff;
    }

    public void setLmsDeliveryStaff(LmsDeliveryStaff lmsDeliveryStaff) {
        this.lmsDeliveryStaff = lmsDeliveryStaff;
    }

    private LmsStation lmsStation;

    private LmsDeliveryStaff lmsDeliveryStaff;

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

    public List<LmsOrder> getLmsOrderList() {
        return lmsOrderList;
    }

    public void setLmsOrderList(List<LmsOrder> lmsOrderList) {
        this.lmsOrderList = lmsOrderList;
    }

}