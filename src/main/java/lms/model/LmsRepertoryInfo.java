package lms.model;

import java.math.BigDecimal;

public class LmsRepertoryInfo {
    private BigDecimal id;

    private BigDecimal max;

    private BigDecimal guard;

    private BigDecimal lmsRepertoryId;

    private BigDecimal lmsProductId;

    private LmsProduct lmsProduct;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"max\":")
                .append(max);
        sb.append(",\"guard\":")
                .append(guard);
        sb.append(",\"lmsRepertoryId\":")
                .append(lmsRepertoryId);
        sb.append(",\"lmsProductId\":")
                .append(lmsProductId);
        sb.append(",\"lmsProduct\":")
                .append(lmsProduct);
        sb.append(",\"lmsRepertory\":")
                .append(lmsRepertory);
        sb.append(",\"count\":")
                .append(count);
        sb.append('}');
        return sb.toString();
    }

    private LmsRepertory lmsRepertory;

    private BigDecimal count;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getGuard() {
        return guard;
    }

    public void setGuard(BigDecimal guard) {
        this.guard = guard;
    }

    public BigDecimal getLmsRepertoryId() {
        return lmsRepertoryId;
    }

    public void setLmsRepertoryId(BigDecimal lmsRepertoryId) {
        this.lmsRepertoryId = lmsRepertoryId;
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public LmsProduct getLmsProduct() {
        return lmsProduct;
    }

    public void setLmsProduct(LmsProduct lmsProduct) {
        this.lmsProduct = lmsProduct;
    }

    public LmsRepertory getLmsRepertory() {
        return lmsRepertory;
    }

    public void setLmsRepertory(LmsRepertory lmsRepertory) {
        this.lmsRepertory = lmsRepertory;
    }


}