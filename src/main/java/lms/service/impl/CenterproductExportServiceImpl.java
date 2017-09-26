package lms.service.impl;

import lms.mapper.LmsCenterproductExportMapper;
import lms.model.LmsCenterproductExport;
import lms.service.CenterproductExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CenterproductExportServiceImpl implements CenterproductExportService {
    @Autowired
    LmsCenterproductExportMapper centerproductExportMapper;

    public List<LmsCenterproductExport> findAll() {
        return centerproductExportMapper.findSupplierResultMap();
    }

    public LmsCenterproductExport findById(BigDecimal id) {
        return centerproductExportMapper.selectByPrimaryKey(id);
    }

    public void deleteCenterproductExport(BigDecimal id) {
        centerproductExportMapper.deleteByPrimaryKey(id);
    }

    public void addCenterproductExport(LmsCenterproductExport lmsCenterproductExport) {
        centerproductExportMapper.insert(lmsCenterproductExport);
    }

    public void updateCenterproductExport(LmsCenterproductExport lmsCenterproductExport) {
        centerproductExportMapper.updateByPrimaryKey(lmsCenterproductExport);
    }
}
