package lms.service.impl;

import lms.mapper.LmsCommodityReceiptMapper;
import lms.model.LmsCommodityReceipt;
import lms.service.CommodityReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CommodityReceiptServiceImpl implements CommodityReceiptService {
    @Autowired
    LmsCommodityReceiptMapper lmsCommodityReceiptMapper;

    public List<LmsCommodityReceipt> findAll() {
        return lmsCommodityReceiptMapper.findAllResultMap();
    }

    public LmsCommodityReceipt findById(BigDecimal id) {
        return lmsCommodityReceiptMapper.selectByPrimaryKey(id);
    }

    public void deleteCommodityReceipt(BigDecimal id) {
        lmsCommodityReceiptMapper.deleteByPrimaryKey(id);
    }

    public void addCommodityReceipt(LmsCommodityReceipt lmsCommodityReceipt) {
        lmsCommodityReceiptMapper.insert(lmsCommodityReceipt);
    }

    public void updateCommodityReceipt(LmsCommodityReceipt lmsCommodityReceipt) {
        lmsCommodityReceiptMapper.updateByPrimaryKey(lmsCommodityReceipt);
    }
}
