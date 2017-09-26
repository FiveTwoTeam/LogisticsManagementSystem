package lms.service;

import lms.model.LmsDeliveryStaff;

import java.util.List;

public interface DeliveryStaffService {
    List<LmsDeliveryStaff> findAll();
    LmsDeliveryStaff findById(long id);
    void deleteDeliveryStaff(long id);
    void addDeliveryStaff(LmsDeliveryStaff lmsDeliveryStaff);
    void updateDeliveryStaff(LmsDeliveryStaff lmsDeliveryStaff);
}
