package lms.service;

import lms.model.LmsCenterproductExportItem;

import java.math.BigDecimal;
import java.util.List;

public interface CenterproductExportItemService {
    List<LmsCenterproductExportItem> findAll();
    LmsCenterproductExportItem findById(BigDecimal id);
    void deleteCenterproductExportItem(BigDecimal id);
    void addCenterproductExportItem(LmsCenterproductExportItem lmsCenterproductExportItem);
    void updateCenterproductExportItem(LmsCenterproductExportItem lmsCenterproductExportItem);
}
