package lms.service;

import lms.model.LmsProduct;

import java.util.List;

public interface ProductService {
    List<LmsProduct> findAll();
    LmsProduct findById(long id);
    void deleteProduct(long id);
    void addProduct(LmsProduct lmsProduct);
    void updateProduct(LmsProduct lmsProduct);
}
