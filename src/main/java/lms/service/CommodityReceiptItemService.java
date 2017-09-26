package lms.service;

import lms.model.LmsCommodityReceiptItem;

import java.util.List;

public interface CommodityReceiptItemService {
    List<LmsCommodityReceiptItem> findAll();
    LmsCommodityReceiptItem findById(long id);
    void deleteCommodityReceiptItem(long id);
    void addCommodityReceiptItem(LmsCommodityReceiptItem lmsCommodityReceiptItem);
    void updateCommodityReceiptItem(LmsCommodityReceiptItem lmsCommodityReceiptItem);
}
