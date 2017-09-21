package lms.model;

import java.util.List;

public class LmsStationRepetoryItem {
    private Long id;

    private Long count;

    private Long max;

    private Long guard;

    private Short status;

    private Long lmsProductId;

    private Long lmsStationRepertoryId;

    private LmsProduct lmsProduct;

    private List<LmsStationRepetory> lmsStationRepetoryList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Long getGuard() {
        return guard;
    }

    public void setGuard(Long guard) {
        this.guard = guard;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(Long lmsProductId) {
        this.lmsProductId = lmsProductId;
    }

    public Long getLmsStationRepertoryId() {
        return lmsStationRepertoryId;
    }

    public void setLmsStationRepertoryId(Long lmsStationRepertoryId) {
        this.lmsStationRepertoryId = lmsStationRepertoryId;
    }

    public LmsProduct getLmsProduct() {
        return lmsProduct;
    }

    public void setLmsProduct(LmsProduct lmsProduct) {
        this.lmsProduct = lmsProduct;
    }

    public List<LmsStationRepetory> getLmsStationRepetoryList() {
        return lmsStationRepetoryList;
    }

    public void setLmsStationRepetoryList(List<LmsStationRepetory> lmsStationRepetoryList) {
        this.lmsStationRepetoryList = lmsStationRepetoryList;
    }

    @Override
    public String toString() {
        return "LmsStationRepetoryItem{" +
                "id=" + id +
                ", count=" + count +
                ", max=" + max +
                ", guard=" + guard +
                ", status=" + status +
                ", lmsProductId=" + lmsProductId +
                ", lmsStationRepertoryId=" + lmsStationRepertoryId +
                ", lmsProduct=" + lmsProduct +
                ", lmsStationRepetoryList=" + lmsStationRepetoryList +
                '}';
    }
}