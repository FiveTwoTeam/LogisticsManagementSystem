package lms.service;

import lms.model.LmsStationRepetoryItem;

import java.util.List;

public interface StationRepetoryItemService {

    List<LmsStationRepetoryItem>  findAll();
    void addStationRepetoryItem(LmsStationRepetoryItem lmsStationRepetoryItem);
    void deleteStationRepetoryItem(Long id);
    void updateStationRepetoryItem(LmsStationRepetoryItem lmsStationRepetoryItem);
    LmsStationRepetoryItem findById(long id);

}
