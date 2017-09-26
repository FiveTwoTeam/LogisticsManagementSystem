package lms.service;

import lms.model.LmsCenterproductExport;

import java.math.BigDecimal;
import java.util.List;

public interface CenterproductExportService {

    List<LmsCenterproductExport> findAll();
    LmsCenterproductExport findById(BigDecimal id);
    void deleteCenterproductExport(BigDecimal id);
    void addCenterproductExport(LmsCenterproductExport lmsCenterproductExport);
    void updateCenterproductExport(LmsCenterproductExport lmsCenterproductExport);
}
