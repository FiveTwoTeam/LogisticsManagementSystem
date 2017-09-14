package lms.model;

import java.math.BigDecimal;

public class LmsCenterproductExportItem {
    private BigDecimal id;

    private BigDecimal count;

    private String description;

    private BigDecimal lmsProductExportId;

    private BigDecimal lmsProductId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getLmsProductExportId() {
        return lmsProductExportId;
    }

    public void setLmsProductExportId(BigDecimal lmsProductExportId) {
        this.lmsProductExportId = lmsProductExportId;
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
    }
}