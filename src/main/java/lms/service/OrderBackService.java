package lms.service;

import lms.model.LmsOrderBack;

import java.math.BigDecimal;
import java.util.List;

public interface OrderBackService {
    List<LmsOrderBack> findAll();
    LmsOrderBack findById(BigDecimal id);
    void deleteOrderBack(BigDecimal id);
    void addOrderBack(LmsOrderBack lmsOrderBack);
    void updateOrderBack(LmsOrderBack lmsOrderBack);
}
