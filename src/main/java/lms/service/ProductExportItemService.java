package lms.service;

import lms.model.LmsProductExportItem;

import java.math.BigDecimal;
import java.util.List;

public interface ProductExportItemService {

    List<LmsProductExportItem> findAll();
    void addProductExportItem(LmsProductExportItem lmsProductExportItem);
    void deleteProductExportItem(BigDecimal id);
    void updateProductExportItem(LmsProductExportItem lmsProductExportItem);
    LmsProductExportItem findById(BigDecimal id);

}
