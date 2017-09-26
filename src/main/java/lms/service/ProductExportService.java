package lms.service;

import lms.model.LmsProductExport;

import java.math.BigDecimal;

public interface ProductExportService {

   // List<LmsProductExport> findAll();
    void addProductExport(LmsProductExport lmsProductExport);
    void deleteProductExport(BigDecimal id);
    void updateProductExport(LmsProductExport lmsProductExport);
    LmsProductExport findById(BigDecimal id);

}
