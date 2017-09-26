package lms.service;

import lms.model.LmsOrderItem;

import java.util.List;

public interface OrderItemService {
    List<LmsOrderItem> findAll();
    LmsOrderItem findById(long id);
    void deleteOrderItem(long id);
    void addOrderItem(LmsOrderItem lmsOrderItem);
    void updateOrderItem(LmsOrderItem lmsOrderItem);
}
