package lms.model;

import java.math.BigDecimal;

public class LmsProduct {
    private Long id;

    private String name;

    private BigDecimal price;

    private String unit;

    private BigDecimal lmsSecondCategoryId;

    private BigDecimal discount;

    private BigDecimal cost;

    private String size;

    private BigDecimal lmsSupplierId;

    private String qualityPeriod;

    private BigDecimal ifBack;

    private BigDecimal ifExchange;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getLmsSecondCategoryId() {
        return lmsSecondCategoryId;
    }

    public void setLmsSecondCategoryId(BigDecimal lmsSecondCategoryId) {
        this.lmsSecondCategoryId = lmsSecondCategoryId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public BigDecimal getLmsSupplierId() {
        return lmsSupplierId;
    }

    public void setLmsSupplierId(BigDecimal lmsSupplierId) {
        this.lmsSupplierId = lmsSupplierId;
    }

    public String getQualityPeriod() {
        return qualityPeriod;
    }

    public void setQualityPeriod(String qualityPeriod) {
        this.qualityPeriod = qualityPeriod == null ? null : qualityPeriod.trim();
    }

    public BigDecimal getIfBack() {
        return ifBack;
    }

    public void setIfBack(BigDecimal ifBack) {
        this.ifBack = ifBack;
    }

    public BigDecimal getIfExchange() {
        return ifExchange;
    }

    public void setIfExchange(BigDecimal ifExchange) {
        this.ifExchange = ifExchange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}