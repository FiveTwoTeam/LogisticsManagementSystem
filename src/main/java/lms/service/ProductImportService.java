package lms.service;

import lms.model.LmsProductImport;

import java.math.BigDecimal;
import java.util.List;

public interface ProductImportService {

    List<LmsProductImport>  findAll();
    void addProductImport(LmsProductImport lmsProductImport);
    void deleteProductImport(BigDecimal id);
    void updateProductImport(LmsProductImport lmsProductImport);
    LmsProductImport findById(BigDecimal id);

}
