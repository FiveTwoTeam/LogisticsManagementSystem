package lms.service.impl;

import lms.mapper.LmsOrderBackMapper;
import lms.model.LmsOrderBack;
import lms.service.OrderBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderBackServiceImpl implements OrderBackService {
    @Autowired
    LmsOrderBackMapper lmsOrderBackMapper;

    public List<LmsOrderBack> findAll() {
        return lmsOrderBackMapper.findOrderDetailMap();
    }

    public LmsOrderBack findById(BigDecimal id) {
        return lmsOrderBackMapper.selectByPrimaryKey(id);
    }

    public void deleteOrderBack(BigDecimal id) {
        lmsOrderBackMapper.deleteByPrimaryKey(id);
    }

    public void addOrderBack(LmsOrderBack lmsOrderBack) {
        lmsOrderBackMapper.insert(lmsOrderBack);
    }

    public void updateOrderBack(LmsOrderBack lmsOrderBack) {
        lmsOrderBackMapper.updateByPrimaryKey(lmsOrderBack);
    }
}
