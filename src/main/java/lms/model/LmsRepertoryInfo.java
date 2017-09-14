package lms.model;

import java.math.BigDecimal;

public class LmsRepertoryInfo {
    private BigDecimal id;

    private BigDecimal max;

    private BigDecimal guard;

    private BigDecimal lmsRepertoryId;

    private BigDecimal lmsProductId;

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
}