package lms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LmsProductImport {
    private BigDecimal id;

    private BigDecimal importNo;

    private Date datetime;

    private BigDecimal lmsSupplierId;

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

    @Override
    public String toString() {
        return "LmsProductImport{" +
                "id=" + id +
                ", importNo=" + importNo +
                ", datetime=" + datetime +
                ", lmsSupplierId=" + lmsSupplierId +
                ", lmsSupplierList=" + lmsSupplierList +
                '}';
    }
}