package lms.service;

import lms.model.LmsStation;

import java.util.List;

public interface StationService {

    List<LmsStation>  findAll();
    void addStation(LmsStation lmsStation);
    void deleteStation(Long id);
    void updateStation(LmsStation lmsStation);
    LmsStation findById(long id);

}
