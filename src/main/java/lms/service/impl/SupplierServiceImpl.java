package lms.service.impl;

import lms.mapper.LmsSupplierMapper;
import lms.model.LmsSupplier;
import lms.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private  LmsSupplierMapper lmsSupplierMapper;

    public void addSupplier(LmsSupplier lmsSupplier) {
        lmsSupplierMapper.insert(lmsSupplier);
    }

    public void deleteSupplier(Long id) {
        lmsSupplierMapper.deleteByPrimaryKey(id);
    }

    public void updateSupplier(LmsSupplier lmsSupplier) {
        lmsSupplierMapper.updateByPrimaryKey(lmsSupplier);
    }

    public LmsSupplier findById(long id) {
        return lmsSupplierMapper.selectByPrimaryKey(id);
    }
}
