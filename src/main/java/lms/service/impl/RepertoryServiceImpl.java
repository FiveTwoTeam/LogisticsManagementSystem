package lms.service.impl;

import lms.mapper.LmsRepertoryMapper;
import lms.model.LmsRepertory;
import lms.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RepertoryServiceImpl implements RepertoryService {

    @Autowired
    private LmsRepertoryMapper lmsRepertoryMapper;


    public List<LmsRepertory> findAll() {
        List<LmsRepertory> list = lmsRepertoryMapper.findadminAndRepertoryResultMap();
        return list;
    }

    public void addRepertory(LmsRepertory lmsRepertory) {
        lmsRepertoryMapper.insert(lmsRepertory);
    }

    public void deleteRepertory(BigDecimal id) {
        lmsRepertoryMapper.deleteByPrimaryKey(id);
    }

    public void updateRepertory(LmsRepertory lmsRepertory) {
        lmsRepertoryMapper.updateByPrimaryKey(lmsRepertory);
    }

    public LmsRepertory findById(BigDecimal id) {
        return lmsRepertoryMapper.selectByPrimaryKey(id);
    }
}
