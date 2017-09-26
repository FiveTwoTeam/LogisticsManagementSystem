package lms.service.impl;

import lms.mapper.LmsCenterproductExportItemMapper;
import lms.model.LmsCenterproductExportItem;
import lms.service.CenterproductExportItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CenterproductExportItemServiceImpl implements CenterproductExportItemService{

    @Autowired
    private LmsCenterproductExportItemMapper centerproductExportItemMapper;

    public List<LmsCenterproductExportItem> findAll() {
        return centerproductExportItemMapper.findProductExportResultMap();
    }

    public LmsCenterproductExportItem findById(BigDecimal id) {
        return centerproductExportItemMapper.selectByPrimaryKey(id);
    }

    public void deleteCenterproductExportItem(BigDecimal id) {
        centerproductExportItemMapper.deleteByPrimaryKey(id);
    }

    public void addCenterproductExportItem(LmsCenterproductExportItem lmsCenterproductExportItem) {
        centerproductExportItemMapper.insert(lmsCenterproductExportItem);
    }

    public void updateCenterproductExportItem(LmsCenterproductExportItem lmsCenterproductExportItem) {
        centerproductExportItemMapper.updateByPrimaryKey(lmsCenterproductExportItem);
    }
}
