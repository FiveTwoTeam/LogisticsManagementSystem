package lms.service.impl;

import lms.mapper.LmsProductExportMapper;
import lms.model.LmsProductExport;
import lms.service.ProductExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductExportServiceImpl implements ProductExportService {

    @Autowired
    private LmsProductExportMapper lmsProductExportMapper;


    public List<LmsProductExport> findAll() {
        return lmsProductExportMapper.selectByExample(null);
    }

    public void addProductExport(LmsProductExport lmsProductExport) {
        lmsProductExportMapper.insert(lmsProductExport);
    }

    public void deleteProductExport(BigDecimal id) {
        lmsProductExportMapper.deleteByPrimaryKey(id);
    }

    public void updateProductExport(LmsProductExport lmsProductExport) {
        lmsProductExportMapper.updateByPrimaryKey(lmsProductExport);
    }

    public LmsProductExport findById(BigDecimal id) {
        return lmsProductExportMapper.selectByPrimaryKey(id);
    }
}
