package lms.service;

import lms.model.LmsOrderProductExchange;

import java.math.BigDecimal;
import java.util.List;

public interface OrderProductExchangeService {
    List<LmsOrderProductExchange> findAll();
    LmsOrderProductExchange findById(BigDecimal id);
    void deleteOrderProductExchange(BigDecimal id);
    void addOrderProductExchange(LmsOrderProductExchange lmsOrderProductExchange);
    void updateOrderProductExchange(LmsOrderProductExchange lmsOrderProductExchange);
}
