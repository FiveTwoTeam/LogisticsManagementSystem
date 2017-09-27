package lms.model;

import java.math.BigDecimal;
import java.util.Date;

public class LmsReceipt {
    private BigDecimal id;

    private BigDecimal totalMoney;

    private Date gainDate;

    private Date missDate;

    private String gainMan;

    private String missMan;

    private BigDecimal orderNumber;

    private Short state;

    public LmsReceipt() {
    }

    public LmsReceipt(BigDecimal id, BigDecimal totalMoney,  String gainMan, String missMan, BigDecimal orderNumber, Short state) {
        this.id = id;
        this.totalMoney = totalMoney;
        this.gainDate = gainDate;
        this.missDate = missDate;
        this.gainMan = gainMan;
        this.missMan = missMan;
        this.orderNumber = orderNumber;
        this.state = state;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getGainDate() {
        return gainDate;
    }

    public void setGainDate(Date gainDate) {
        this.gainDate = gainDate;
    }

    public Date getMissDate() {
        return missDate;
    }

    public void setMissDate(Date missDate) {
        this.missDate = missDate;
    }

    public String getGainMan() {
        return gainMan;
    }

    public void setGainMan(String gainMan) {
        this.gainMan = gainMan == null ? null : gainMan.trim();
    }

    public String getMissMan() {
        return missMan;
    }

    public void setMissMan(String missMan) {
        this.missMan = missMan == null ? null : missMan.trim();
    }

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"totalMoney\":")
                .append(totalMoney);
        sb.append(",\"gainDate\":\"")
                .append(gainDate).append('\"');
        sb.append(",\"missDate\":\"")
                .append(missDate).append('\"');
        sb.append(",\"gainMan\":\"")
                .append(gainMan).append('\"');
        sb.append(",\"missMan\":\"")
                .append(missMan).append('\"');
        sb.append(",\"orderNumber\":")
                .append(orderNumber);
        sb.append(",\"state\":")
                .append(state);
        sb.append('}');
        return sb.toString();
    }
}