package lms.model;

import java.math.BigDecimal;
import java.util.Date;

public class LmsCenterproductExport {
    private BigDecimal id;

    private BigDecimal exportNo;

    private Date datetime;

    private Long lmsSupplierId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getExportNo() {
        return exportNo;
    }

    public void setExportNo(BigDecimal exportNo) {
        this.exportNo = exportNo;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Long getLmsSupplierId() {
        return lmsSupplierId;
    }

    public void setLmsSupplierId(Long lmsSupplierId) {
        this.lmsSupplierId = lmsSupplierId;
    }
}