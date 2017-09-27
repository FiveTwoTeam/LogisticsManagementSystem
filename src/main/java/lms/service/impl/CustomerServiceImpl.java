package lms.service.impl;

import lms.mapper.LmsCustomerMapper;
import lms.model.LmsCustomer;
import lms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    LmsCustomerMapper lmsCustomerMapper;
    public List<LmsCustomer> findAll() {
        return lmsCustomerMapper.selectByExample(null);
    }

    public LmsCustomer findById(long id) {
        return lmsCustomerMapper.selectByPrimaryKey(id);
    }

    public void deleteCustomer(long id) {
        lmsCustomerMapper.deleteByPrimaryKey(id);
    }

    public void addCustomer(LmsCustomer lmsCustomer) {
        lmsCustomerMapper.insert(lmsCustomer);
    }

    public void updateCustomer(LmsCustomer lmsCustomer) {
        lmsCustomerMapper.updateByPrimaryKey(lmsCustomer);
    }
}
