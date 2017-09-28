package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmsOrderProductExchange {
    private BigDecimal id;

    private String reason;

    private Date datetime;

    private BigDecimal count;

    private BigDecimal lmsOrderId;

    private BigDecimal lmsProductId;

    private LmsOrder lmsOrder;

    private List<LmsProduct> productList;

    public LmsOrder getLmsOrder() {
        return lmsOrder;
    }

    public void setLmsOrder(LmsOrder lmsOrder) {
        this.lmsOrder = lmsOrder;
    }

    public List<LmsProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<LmsProduct> productList) {
        this.productList = productList;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getLmsOrderId() {
        return lmsOrderId;
    }

    public void setLmsOrderId(BigDecimal lmsOrderId) {
        this.lmsOrderId = lmsOrderId;
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"reason\":\"")
                .append(reason).append('\"');
        sb.append(",\"datetime\":\"")
                .append(datetime).append('\"');
        sb.append(",\"count\":")
                .append(count);
        sb.append(",\"lmsOrderId\":")
                .append(lmsOrderId);
        sb.append(",\"lmsProductId\":")
                .append(lmsProductId);
        sb.append(",\"lmsOrder\":")
                .append(lmsOrder);
        sb.append(",\"productList\":")
                .append(productList);
        sb.append('}');
        return sb.toString();
    }
}