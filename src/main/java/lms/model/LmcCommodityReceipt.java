package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmcCommodityReceipt {
    private BigDecimal id;

    private Long taskNumber;

    private Long cuntomerId;

    private String address;

    private Date datetime;

    private String command;

    private Long ifReceipt;

    private Long stationId;

    private BigDecimal totalPrice;

    private Long type;

    private String description;

    private String feedback;

    private String signature;

    private LmsCustomer customer;

    private List<LmsStation> stations;

    public List<LmsStation> getStations() {
        return stations;
    }

    public void setStations(List<LmsStation> stations) {
        this.stations = stations;
    }

    public LmsCustomer getCustomers() {
        return customer;
    }

    public void setCustomers(LmsCustomer customers) {
        this.customer = customers;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Long taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Long getCuntomerId() {
        return cuntomerId;
    }

    public void setCuntomerId(Long cuntomerId) {
        this.cuntomerId = cuntomerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Long getIfReceipt() {
        return ifReceipt;
    }

    public void setIfReceipt(Long ifReceipt) {
        this.ifReceipt = ifReceipt;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }


    @Override
    public String toString() {
        return "LmcCommodityReceipt{" +
                "id=" + id +
                ", taskNumber=" + taskNumber +
                ", cuntomerId=" + cuntomerId +
                ", address='" + address + '\'' +
                ", datetime=" + datetime +
                ", command='" + command + '\'' +
                ", ifReceipt=" + ifReceipt +
                ", stationId=" + stationId +
                ", totalPrice=" + totalPrice +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", feedback='" + feedback + '\'' +
                ", signature='" + signature + '\'' +
                ", customer=" + customer +
                ", stations=" + stations +
                '}';
    }
}