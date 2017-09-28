package lms.service.impl;

import lms.mapper.LmsOrderProductBackMapper;
import lms.model.LmsOrderProductBack;
import lms.service.OrderProductBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductBackServiceImpl implements OrderProductBackService {
    @Autowired
    LmsOrderProductBackMapper lmsOrderProductBackMapper;

    public List<LmsOrderProductBack> findAll() {
        return lmsOrderProductBackMapper.selectByExample(null);
    }

    public LmsOrderProductBack findById(long id) {
        return lmsOrderProductBackMapper.selectByPrimaryKey(id);
    }

    public void deleteOrderProductBack(long id) {
        lmsOrderProductBackMapper.deleteByPrimaryKey(id);
    }

    public void addOrderProductBack(LmsOrderProductBack lmsOrderProductBack) {
        lmsOrderProductBackMapper.insert(lmsOrderProductBack);
    }

    public void updateOrderProductBack(LmsOrderProductBack lmsOrderProductBack) {
        lmsOrderProductBackMapper.updateByPrimaryKey(lmsOrderProductBack);
    }
}
