package lms.service.impl;

import lms.mapper.LmsStationRepetoryItemMapper;
import lms.model.LmsStationRepetoryItem;
import lms.service.StationRepetoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationRepetoryItemServiceImpl implements StationRepetoryItemService {

    @Autowired
    private  LmsStationRepetoryItemMapper lmsStationRepetoryItemMapper;


    public List<LmsStationRepetoryItem> findAll() {

        List<LmsStationRepetoryItem> list = lmsStationRepetoryItemMapper.findproductAndStationRepetoryMap();
        return list;
    }

    public void addStationRepetoryItem(LmsStationRepetoryItem lmsStationRepetoryItem) {
        lmsStationRepetoryItemMapper.insert(lmsStationRepetoryItem);
    }

    public void deleteStationRepetoryItem(Long id) {
        lmsStationRepetoryItemMapper.deleteByPrimaryKey(id);
    }

    public void updateStationRepetoryItem(LmsStationRepetoryItem lmsStationRepetoryItem) {
        lmsStationRepetoryItemMapper.updateByPrimaryKey(lmsStationRepetoryItem);
    }

    public LmsStationRepetoryItem findById(long id) {
        return lmsStationRepetoryItemMapper.selectByPrimaryKey(id);
    }
}
