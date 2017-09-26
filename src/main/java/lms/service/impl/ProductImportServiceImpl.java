package lms.service.impl;

import lms.mapper.LmsProductImportMapper;
import lms.model.LmsProductImport;
import lms.service.ProductImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductImportServiceImpl implements ProductImportService {

    @Autowired
    private LmsProductImportMapper lmsProductImportMapper;


    public List<LmsProductImport> findAll() {
        List<LmsProductImport> list = lmsProductImportMapper.findproductImportResultMap();
        return list;
    }

    public void addProductImport(LmsProductImport lmsProductImport) {
        lmsProductImportMapper.insert(lmsProductImport);
    }

    public void deleteProductImport(BigDecimal id) {
        lmsProductImportMapper.deleteByPrimaryKey(id);
    }

    public void updateProductImport(LmsProductImport lmsProductImport) {
        lmsProductImportMapper.updateByPrimaryKey(lmsProductImport);
    }

    public LmsProductImport findById(BigDecimal id) {
        return lmsProductImportMapper.selectByPrimaryKey(id);
    }
}
