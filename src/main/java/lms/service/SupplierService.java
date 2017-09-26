package lms.service;

import lms.model.LmsSupplier;

public interface SupplierService {

    void addSupplier(LmsSupplier lmsSupplier);
    void deleteSupplier(Long id);
    void updateSupplier(LmsSupplier supplier);
    LmsSupplier findById(long id);

}
