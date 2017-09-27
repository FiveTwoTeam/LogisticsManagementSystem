package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmsOrder {
    private BigDecimal id;

    private BigDecimal totalPrice;

    private BigDecimal orderNumber;

    private String description;

    private BigDecimal type;

    private String address;

    private BigDecimal lmsCustomerId;

    private String payer;

    private String payerAddress;

    private BigDecimal payerPhone;

    private BigDecimal payerPostCode;

    private Date datetime;

    private BigDecimal lmsAdminId;

    private LmsCustomer customer;

    private LmsAdmin admin;

    public LmsCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(LmsCustomer customer) {
        this.customer = customer;
    }

    public LmsAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(LmsAdmin admin) {
        this.admin = admin;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLmsCustomerId() {
        return lmsCustomerId;
    }

    public void setLmsCustomerId(BigDecimal lmsCustomerId) {
        this.lmsCustomerId = lmsCustomerId;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public String getPayerAddress() {
        return payerAddress;
    }

    public void setPayerAddress(String payerAddress) {
        this.payerAddress = payerAddress == null ? null : payerAddress.trim();
    }

    public BigDecimal getPayerPhone() {
        return payerPhone;
    }

    public void setPayerPhone(BigDecimal payerPhone) {
        this.payerPhone = payerPhone;
    }

    public BigDecimal getPayerPostCode() {
        return payerPostCode;
    }

    public void setPayerPostCode(BigDecimal payerPostCode) {
        this.payerPostCode = payerPostCode;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getLmsAdminId() {
        return lmsAdminId;
    }

    public void setLmsAdminId(BigDecimal lmsAdminId) {
        this.lmsAdminId = lmsAdminId;
    }

    @Override
    public String toString() {
        return "LmsOrder{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", orderNumber=" + orderNumber +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", address='" + address + '\'' +
                ", lmsCustomerId=" + lmsCustomerId +
                ", payer='" + payer + '\'' +
                ", payerAddress='" + payerAddress + '\'' +
                ", payerPhone=" + payerPhone +
                ", payerPostCode=" + payerPostCode +
                ", datetime=" + datetime +
                ", lmsAdminId=" + lmsAdminId +
                ", customer=" + customer +
                ", admin=" + admin +
                '}';
    }
}