package lms.service.impl;

import lms.mapper.LmsOrderItemMapper;
import lms.model.LmsOrderItem;
import lms.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    LmsOrderItemMapper lmsOrderItemMapper;

    public List<LmsOrderItem> findAll() {
        return lmsOrderItemMapper.findorderAndProductMap();
    }

    public LmsOrderItem findById(long id) {
        return lmsOrderItemMapper.selectByPrimaryKey(id);
    }

    public void deleteOrderItem(long id) {
        lmsOrderItemMapper.deleteByPrimaryKey(id);
    }

    public void addOrderItem(LmsOrderItem lmsOrderItem) {
        lmsOrderItemMapper.insert(lmsOrderItem);
    }

    public void updateOrderItem(LmsOrderItem lmsOrderItem) {
        lmsOrderItemMapper.updateByPrimaryKey(lmsOrderItem);
    }
}
