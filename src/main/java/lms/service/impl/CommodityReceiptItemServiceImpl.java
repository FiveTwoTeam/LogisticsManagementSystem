package lms.service.impl;

import lms.mapper.LmsCommodityReceiptItemMapper;
import lms.model.LmsCommodityReceiptItem;
import lms.service.CommodityReceiptItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityReceiptItemServiceImpl implements CommodityReceiptItemService {

    @Autowired
    LmsCommodityReceiptItemMapper lmsCommodityReceiptItemMapper;

    public List<LmsCommodityReceiptItem> findAll() {
        return lmsCommodityReceiptItemMapper.findProductAndReceiptMap();
    }

    public LmsCommodityReceiptItem findById(long id) {
        return lmsCommodityReceiptItemMapper.selectByPrimaryKey(id);
    }

    public void deleteCommodityReceiptItem(long id) {
        lmsCommodityReceiptItemMapper.deleteByPrimaryKey(id);
    }

    public void addCommodityReceiptItem(LmsCommodityReceiptItem lmsCommodityReceiptItem) {
        lmsCommodityReceiptItemMapper.insert(lmsCommodityReceiptItem);
    }

    public void updateCommodityReceiptItem(LmsCommodityReceiptItem lmsCommodityReceiptItem) {
        lmsCommodityReceiptItemMapper.updateByPrimaryKey(lmsCommodityReceiptItem);
    }
}
