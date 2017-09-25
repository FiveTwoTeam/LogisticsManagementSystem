package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmsCommodityReceipt {
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

    public LmsCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(LmsCustomer customer) {
        this.customer = customer;
    }

    public List<LmsStation> getStations() {
        return stations;
    }

    public void setStations(List<LmsStation> stations) {
        this.stations = stations;
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
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"taskNumber\":")
                .append(taskNumber);
        sb.append(",\"cuntomerId\":")
                .append(cuntomerId);
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append(",\"datetime\":\"")
                .append(datetime).append('\"');
        sb.append(",\"command\":\"")
                .append(command).append('\"');
        sb.append(",\"ifReceipt\":")
                .append(ifReceipt);
        sb.append(",\"stationId\":")
                .append(stationId);
        sb.append(",\"totalPrice\":")
                .append(totalPrice);
        sb.append(",\"type\":")
                .append(type);
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"feedback\":\"")
                .append(feedback).append('\"');
        sb.append(",\"signature\":\"")
                .append(signature).append('\"');
        sb.append(",\"customer\":")
                .append(customer);
        sb.append(",\"stations\":")
                .append(stations);
        sb.append('}');
        return sb.toString();
    }
}