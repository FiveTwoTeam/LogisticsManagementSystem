package lms.model;

import java.util.List;

public class LmsCommodityReceiptItem {
    private Long id;

    private Long count;

    private Long price;

    private Long subprice;

    private Long commodityReceiptId;

    private Long productId;

    private List<LmsCommodityReceipt> commodityReceiptList;

    private List<LmsProduct> productList;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSubprice() {
        return subprice;
    }

    public void setSubprice(Long subprice) {
        this.subprice = subprice;
    }

    public Long getCommodityReceiptId() {
        return commodityReceiptId;
    }

    public void setCommodityReceiptId(Long commodityReceiptId) {
        this.commodityReceiptId = commodityReceiptId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<LmsCommodityReceipt> getCommodityReceiptList() {
        return commodityReceiptList;
    }

    public void setCommodityReceiptList(List<LmsCommodityReceipt> commodityReceiptList) {
        this.commodityReceiptList = commodityReceiptList;
    }

    public List<LmsProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<LmsProduct> productList) {
        this.productList = productList;
    }

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
        sb.append(",\"commodityReceiptId\":")
                .append(commodityReceiptId);
        sb.append(",\"productId\":")
                .append(productId);
        sb.append(",\"commodityReceiptList\":")
                .append(commodityReceiptList);
        sb.append(",\"productList\":")
                .append(productList);
        sb.append('}');
        return sb.toString();
    }
}