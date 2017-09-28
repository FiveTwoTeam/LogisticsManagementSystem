package lms.service;

import lms.model.LmsRepertoryInfo;

import java.math.BigDecimal;
import java.util.List;

public interface RepertoryInfoService {

    List<LmsRepertoryInfo>  findAll();
    void addRepertoryInfo(LmsRepertoryInfo lmsRepertoryInfo);
    void deleteRepertoryInfo(BigDecimal id);
    void updateRepertoryInfo(LmsRepertoryInfo lmsRepertoryInfo);
    LmsRepertoryInfo findById(BigDecimal id);

}
