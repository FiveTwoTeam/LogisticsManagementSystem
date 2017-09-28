package lms.service.impl;

import lms.mapper.LmsStationRepetoryMapper;
import lms.model.LmsStationRepetory;
import lms.service.StationRepetoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationRepetoryServiceImpl implements StationRepetoryService {

    @Autowired
    private  LmsStationRepetoryMapper lmsStationRepetoryMapper;

    public List<LmsStationRepetory> findAll() {
        List<LmsStationRepetory> list = lmsStationRepetoryMapper.findstationRepetoryResultMap();
        return list;
    }

    public void addStationRepetory(LmsStationRepetory lmsStationRepetory) {
        lmsStationRepetoryMapper.insert(lmsStationRepetory);
    }

    public void deleteStationRepetory(Long id) {
        lmsStationRepetoryMapper.deleteByPrimaryKey(id);
    }

    public void updateStationRepetory(LmsStationRepetory lmsStationRepetory) {
        lmsStationRepetoryMapper.updateByPrimaryKey(lmsStationRepetory);
    }

    public LmsStationRepetory findById(long id) {
        return lmsStationRepetoryMapper.selectByPrimaryKey(id);
    }
}
