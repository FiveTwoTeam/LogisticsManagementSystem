package lms.service;

import lms.model.LmsRepertory;

import java.math.BigDecimal;
import java.util.List;

public interface RepertoryService {

    List<LmsRepertory>  findAll();
    void addRepertory(LmsRepertory lmsRepertory);
    void deleteRepertory(BigDecimal id);
    void updateRepertory(LmsRepertory lmsRepertory);
    LmsRepertory findById(BigDecimal id);

}
