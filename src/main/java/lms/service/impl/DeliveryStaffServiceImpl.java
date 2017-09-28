package lms.service.impl;

import lms.mapper.LmsDeliveryStaffMapper;
import lms.model.LmsDeliveryStaff;
import lms.service.DeliveryStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryStaffServiceImpl implements DeliveryStaffService {
    @Autowired
    LmsDeliveryStaffMapper lmsDeliveryStaffMapper;

    public List<LmsDeliveryStaff> findAll() {
        return lmsDeliveryStaffMapper.findStationResultMap();
    }

    public LmsDeliveryStaff findById(long id) {
        return lmsDeliveryStaffMapper.selectByPrimaryKey(id);
    }

    public void deleteDeliveryStaff(long id) {
        lmsDeliveryStaffMapper.deleteByPrimaryKey(id);
    }

    public void addDeliveryStaff(LmsDeliveryStaff lmsDeliveryStaff) {
        lmsDeliveryStaffMapper.insert(lmsDeliveryStaff);
    }

    public void updateDeliveryStaff(LmsDeliveryStaff lmsDeliveryStaff) {
        lmsDeliveryStaffMapper.updateByPrimaryKey(lmsDeliveryStaff);
    }
}
