package lms.service.impl;

import lms.mapper.LmsOrderMapper;
import lms.model.LmsOrder;
import lms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    LmsOrderMapper lmsOrderMapper;

    public List<LmsOrder> findAll() {
        return lmsOrderMapper.findCustomerAndAdminMap();
    }

    public LmsOrder findById(BigDecimal id) {
        return lmsOrderMapper.selectByPrimaryKey(id);
    }

    public void deleteOrder(BigDecimal id) {
        lmsOrderMapper.deleteByPrimaryKey(id);
    }

    public void addOrder(LmsOrder lmsOrder) {
        lmsOrderMapper.insert(lmsOrder);
    }

    public void updateOrder(LmsOrder lmsOrder) {
        lmsOrderMapper.updateByPrimaryKey(lmsOrder);
    }
}
