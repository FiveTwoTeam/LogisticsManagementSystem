package lms.service.impl;

import lms.mapper.LmsProductImportItemMapper;
import lms.model.LmsProductImportItem;
import lms.service.ProductImportItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductImportItemServiceImpl implements ProductImportItemService {

    @Autowired
    private LmsProductImportItemMapper lmsProductImportItemMapper;


    public List<LmsProductImportItem> findAll() {
        return lmsProductImportItemMapper.selectByExample(null);
    }

    public void addProductImportItem(LmsProductImportItem lmsProductImportItem) {
        lmsProductImportItemMapper.insert(lmsProductImportItem);
    }

    public void deleteProductImportItem(BigDecimal id) {
        lmsProductImportItemMapper.deleteByPrimaryKey(id);
    }

    public void updateProductImportItem(LmsProductImportItem lmsProductImportItem) {
        lmsProductImportItemMapper.updateByPrimaryKey(lmsProductImportItem);
    }

    public LmsProductImportItem findById(BigDecimal id) {
        return lmsProductImportItemMapper.selectByPrimaryKey(id);
    }
}
