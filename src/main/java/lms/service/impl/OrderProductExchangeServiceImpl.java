package lms.service.impl;

import lms.mapper.LmsOrderProductBackMapper;
import lms.mapper.LmsOrderProductExchangeMapper;
import lms.model.LmsOrderProductExchange;
import lms.service.OrderProductExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderProductExchangeServiceImpl implements OrderProductExchangeService {
    @Autowired
    LmsOrderProductExchangeMapper lmsOrderProductExchangeMapper;

    public List<LmsOrderProductExchange> findAll() {
        return lmsOrderProductExchangeMapper.findorderAndProductMap();
    }

    public LmsOrderProductExchange findById(BigDecimal id) {
        return lmsOrderProductExchangeMapper.selectByPrimaryKey(id);
    }

    public void deleteOrderProductExchange(BigDecimal id) {
        lmsOrderProductExchangeMapper.deleteByPrimaryKey(id);
    }

    public void addOrderProductExchange(LmsOrderProductExchange lmsOrderProductExchange) {
        lmsOrderProductExchangeMapper.insert(lmsOrderProductExchange);
    }

    public void updateOrderProductExchange(LmsOrderProductExchange lmsOrderProductExchange) {
        lmsOrderProductExchangeMapper.updateByPrimaryKey(lmsOrderProductExchange);
    }
}
