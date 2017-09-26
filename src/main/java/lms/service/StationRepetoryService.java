package lms.service;

import lms.model.LmsStationRepetory;

import java.util.List;

public interface StationRepetoryService {

    List<LmsStationRepetory>  findAll();
    void addStationRepetory(LmsStationRepetory lmsStationRepetory);
    void deleteStationRepetory(Long id);
    void updateStationRepetory(LmsStationRepetory lmsStationRepetory);
    LmsStationRepetory findById(long id);

}
