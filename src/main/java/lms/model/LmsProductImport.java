package lms.model;

import java.math.BigDecimal;
import java.util.Date;

public class LmsProductImport {
    private BigDecimal id;

    private BigDecimal importNo;

    private Date datetime;

    private BigDecimal lmsSupplierId;

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
}