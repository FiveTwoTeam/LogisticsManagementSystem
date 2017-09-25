package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmsProductImport {
    private BigDecimal id;

    private BigDecimal importNo;

    private Date datetime;

    private BigDecimal lmsSupplierId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"importNo\":")
                .append(importNo);
        sb.append(",\"datetime\":\"")
                .append(datetime).append('\"');
        sb.append(",\"lmsSupplierId\":")
                .append(lmsSupplierId);
        sb.append(",\"lmsSupplierList\":")
                .append(lmsSupplierList);
        sb.append('}');
        return sb.toString();
    }

    private List<LmsSupplier> lmsSupplierList;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getImportNo() {
        return importNo;
    }

    public void setImportNo(BigDecimal importNo) {
        this.importNo = importNo;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getLmsSupplierId() {
        return lmsSupplierId;
    }

    public void setLmsSupplierId(BigDecimal lmsSupplierId) {
        this.lmsSupplierId = lmsSupplierId;
    }

    public List<LmsSupplier> getLmsSupplierList() {
        return lmsSupplierList;
    }

    public void setLmsSupplierList(List<LmsSupplier> lmsSupplierList) {
        this.lmsSupplierList = lmsSupplierList;
    }

}