package lms.service.impl;

import lms.mapper.LmsProductExportItemMapper;
import lms.model.LmsProductExportItem;
import lms.service.ProductExportItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductExportItemServiceImpl implements ProductExportItemService {

    @Autowired
    private LmsProductExportItemMapper lmsProductExportItemMapper;


    public List<LmsProductExportItem> findAll() {
        List<LmsProductExportItem> list = lmsProductExportItemMapper.findproductAndProductExportMap();
        return list;
    }

    public void addProductExportItem(LmsProductExportItem lmsProductExportItem) {
        lmsProductExportItemMapper.insert(lmsProductExportItem);
    }

    public void deleteProductExportItem(BigDecimal id) {
        lmsProductExportItemMapper.deleteByPrimaryKey(id);
    }

    public void updateProductExportItem(LmsProductExportItem lmsProductExportItem) {
        lmsProductExportItemMapper.updateByPrimaryKey(lmsProductExportItem);
    }

    public LmsProductExportItem findById(BigDecimal id) {
        return lmsProductExportItemMapper.selectByPrimaryKey(id);
    }
}
