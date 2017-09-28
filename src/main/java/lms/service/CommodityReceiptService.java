package lms.service;

import lms.model.LmsCommodityReceipt;

import java.math.BigDecimal;
import java.util.List;

public interface CommodityReceiptService {
    List<LmsCommodityReceipt> findAll();
    LmsCommodityReceipt findById(BigDecimal id);
    void deleteCommodityReceipt(BigDecimal id);
    void addCommodityReceipt(LmsCommodityReceipt lmsCommodityReceipt);
    void updateCommodityReceipt(LmsCommodityReceipt lmsCommodityReceipt);
}
