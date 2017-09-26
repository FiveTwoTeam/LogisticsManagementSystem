package lms.service.impl;

import lms.mapper.LmsStationMapper;
import lms.model.LmsStation;
import lms.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private  LmsStationMapper lmsStationMapper;


    public List<LmsStation> findAll() {
        List<LmsStation> list = lmsStationMapper.findstationResultMap();
        return list;
    }

    public void addStation(LmsStation lmsStation) {
        lmsStationMapper.insert(lmsStation);
    }

    public void deleteStation(Long id) {
        lmsStationMapper.deleteByPrimaryKey(id);
    }

    public void updateStation(LmsStation lmsStation) {
        lmsStationMapper.updateByPrimaryKey(lmsStation);
    }

    public LmsStation findById(long id) {
        return lmsStationMapper.selectByPrimaryKey(id);
    }
}
