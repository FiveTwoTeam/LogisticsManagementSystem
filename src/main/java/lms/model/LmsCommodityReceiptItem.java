package lms.model;

import java.util.List;

public class LmsCommodityReceiptItem {
    private Long id;

    private Long count;

    private Long price;

    private Long subprice;

    private Long commodityReceiptId;

    private Long productId;

    private List<LmcCommodityReceipt> commodityReceiptList;

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

    public List<LmcCommodityReceipt> getCommodityReceiptList() {
        return commodityReceiptList;
    }

    public void setCommodityReceiptList(List<LmcCommodityReceipt> commodityReceiptList) {
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
        return "LmsCommodityReceiptItem{" +
                "id=" + id +
                ", count=" + count +
                ", price=" + price +
                ", subprice=" + subprice +
                ", commodityReceiptId=" + commodityReceiptId +
                ", productId=" + productId +
                ", commodityReceiptList=" + commodityReceiptList +
                ", productList=" + productList +
                '}';
    }
}