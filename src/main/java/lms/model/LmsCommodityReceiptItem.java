package lms.model;

public class LmsCommodityReceiptItem {
    private Long id;

    private Long count;

    private Long price;

    private Long subprice;

    private Long commodityReceiptId;

    private Long productId;

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
}