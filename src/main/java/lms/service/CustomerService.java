package lms.service;

import lms.model.LmsCustomer;

import java.util.List;

public interface CustomerService {
    List<LmsCustomer> findAll();
    LmsCustomer findById(long id);
    void deleteCustomer(long id);
    void addCustomer(LmsCustomer lmsCustomer);
    void updateCustomer(LmsCustomer lmsCustomer);
}
