package lms.service;

import lms.model.LmsProductImportItem;

import java.math.BigDecimal;
import java.util.List;

public interface ProductImportItemService {

    List<LmsProductImportItem> findAll();
    void addProductImportItem(LmsProductImportItem lmsProductImportItem);
    void deleteProductImportItem(BigDecimal id);
    void updateProductImportItem(LmsProductImportItem lmsProductImportItem);
    LmsProductImportItem findById(BigDecimal id);

}
