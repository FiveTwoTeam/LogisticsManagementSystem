package lms.model;

import java.math.BigDecimal;
import java.util.List;

public class LmsOrderItem {
    private Long id;

    private BigDecimal lmsOrderId;

    private BigDecimal lmsProductId;

    private BigDecimal count;

    private BigDecimal price;

    private BigDecimal discount;

    private BigDecimal subprice;

    private String productDescription;

    private LmsOrder lmsOrder;

    private List<LmsProduct> productList;

    public List<LmsProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<LmsProduct> productList) {
        this.productList = productList;
    }

    public LmsOrder getLmsOrder() {
        return lmsOrder;
    }

    public void setLmsOrder(LmsOrder lmsOrder) {
        this.lmsOrder = lmsOrder;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLmsOrderId() {
        return lmsOrderId;
    }

    public void setLmsOrderId(BigDecimal lmsOrderId) {
        this.lmsOrderId = lmsOrderId;
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getSubprice() {
        return subprice;
    }

    public void setSubprice(BigDecimal subprice) {
        this.subprice = subprice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"lmsOrderId\":")
                .append(lmsOrderId);
        sb.append(",\"lmsProductId\":")
                .append(lmsProductId);
        sb.append(",\"count\":")
                .append(count);
        sb.append(",\"price\":")
                .append(price);
        sb.append(",\"discount\":")
                .append(discount);
        sb.append(",\"subprice\":")
                .append(subprice);
        sb.append(",\"productDescription\":\"")
                .append(productDescription).append('\"');
        sb.append(",\"lmsOrder\":")
                .append(lmsOrder);
        sb.append(",\"productList\":")
                .append(productList);
        sb.append('}');
        return sb.toString();
    }
}