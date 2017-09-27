package lms.service.impl;

import lms.mapper.LmsProductMapper;
import lms.model.LmsProduct;
import lms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    LmsProductMapper lmsProductMapper;

    public List<LmsProduct> findAll() {
        return lmsProductMapper.findSecondCategoryAndSupplierMap();
    }

    public LmsProduct findById(long id) {
        return lmsProductMapper.selectByPrimaryKey(id);
    }

    public void deleteProduct(long id) {
        lmsProductMapper.deleteByPrimaryKey(id);
    }

    public void addProduct(LmsProduct lmsProduct) {
        lmsProductMapper.insert(lmsProduct);
    }

    public void updateProduct(LmsProduct lmsProduct) {
        lmsProductMapper.updateByPrimaryKey(lmsProduct);
    }
}
