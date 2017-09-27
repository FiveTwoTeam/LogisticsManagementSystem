package lms.service;

import lms.model.LmsOrder;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    List<LmsOrder> findAll();
    LmsOrder findById(BigDecimal id);
    void deleteOrder(BigDecimal id);
    void addOrder(LmsOrder lmsOrder);
    void updateOrder(LmsOrder lmsOrder);
}
