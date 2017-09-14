package lms.model;

import java.math.BigDecimal;

public class LmsProductExportItem {
    private BigDecimal id;

    private BigDecimal count;

    private BigDecimal price;

    private BigDecimal subprice;

    private BigDecimal lmsProductId;

    private BigDecimal lmsProductExportId;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSubprice() {
        return subprice;
    }

    public void setSubprice(BigDecimal subprice) {
        this.subprice = subprice;
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
    }

    public BigDecimal getLmsProductExportId() {
        return lmsProductExportId;
    }

    public void setLmsProductExportId(BigDecimal lmsProductExportId) {
        this.lmsProductExportId = lmsProductExportId;
    }
}