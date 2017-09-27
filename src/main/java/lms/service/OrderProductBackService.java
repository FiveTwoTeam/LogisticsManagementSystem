package lms.service;

import lms.model.LmsOrderProductBack;

import java.util.List;

public interface OrderProductBackService {
    List<LmsOrderProductBack> findAll();
    LmsOrderProductBack findById(long id);
    void deleteOrderProductBack(long id);
    void addOrderProductBack(LmsOrderProductBack lmsOrderProductBack);
    void updateOrderProductBack(LmsOrderProductBack lmsOrderProductBack);
}
