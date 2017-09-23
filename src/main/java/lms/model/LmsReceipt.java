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
        return "LmsReceipt{" +
                "id=" + id +
                ", totalMoney=" + totalMoney +
                ", gainDate=" + gainDate +
                ", missDate=" + missDate +
                ", gainMan='" + gainMan + '\'' +
                ", missMan='" + missMan + '\'' +
                ", orderNumber=" + orderNumber +
                ", state=" + state +
                '}';
    }
}