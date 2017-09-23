package lms.model;

import java.math.BigDecimal;
import java.util.Date;

public class LmsProductExport {
    private BigDecimal id;

    private String transport;

    private String description;

    private BigDecimal totalCount;

    private BigDecimal totalPrice;

    private Date datetime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "LmsProductExport{" +
                "id=" + id +
                ", transport='" + transport + '\'' +
                ", description='" + description + '\'' +
                ", totalCount=" + totalCount +
                ", totalPrice=" + totalPrice +
                ", datetime=" + datetime +
                '}';
    }
}