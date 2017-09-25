package lms.model;

import java.math.BigDecimal;

public class LmsProductExportItem {
    private BigDecimal id;

    private BigDecimal count;

    private BigDecimal price;

    private BigDecimal subprice;

    private BigDecimal lmsProductId;

    private BigDecimal lmsProductExportId;

    private LmsProduct lmsProduct;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"count\":")
                .append(count);
        sb.append(",\"price\":")
                .append(price);
        sb.append(",\"subprice\":")
                .append(subprice);
        sb.append(",\"lmsProductId\":")
                .append(lmsProductId);
        sb.append(",\"lmsProductExportId\":")
                .append(lmsProductExportId);
        sb.append(",\"lmsProduct\":")
                .append(lmsProduct);
        sb.append(",\"lmsProductExport\":")
                .append(lmsProductExport);
        sb.append('}');
        return sb.toString();
    }

    private LmsProductExport lmsProductExport;

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

    public LmsProduct getLmsProduct() {
        return lmsProduct;
    }

    public void setLmsProduct(LmsProduct lmsProduct) {
        this.lmsProduct = lmsProduct;
    }

    public LmsProductExport getLmsProductExport() {
        return lmsProductExport;
    }

    public void setLmsProductExport(LmsProductExport lmsProductExport) {
        this.lmsProductExport = lmsProductExport;
    }

}