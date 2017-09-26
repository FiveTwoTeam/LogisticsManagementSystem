package lms.service.impl;

import lms.mapper.LmsRepertoryInfoMapper;
import lms.model.LmsRepertoryInfo;
import lms.service.RepertoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RepertoryInfoServiceImpl implements RepertoryInfoService {

    @Autowired
    private LmsRepertoryInfoMapper lmsRepertoryInfoMapper;


    public List<LmsRepertoryInfo> findAll() {
        List<LmsRepertoryInfo> list = lmsRepertoryInfoMapper.findproductAndRepertoryMap();
        return list;
    }

    public void addRepertoryInfo(LmsRepertoryInfo lmsRepertoryInfo) {
        lmsRepertoryInfoMapper.insert(lmsRepertoryInfo);
    }

    public void deleteRepertoryInfo(BigDecimal id) {
        lmsRepertoryInfoMapper.deleteByPrimaryKey(id);
    }

    public void updateRepertoryInfo(LmsRepertoryInfo lmsRepertoryInfo) {
        lmsRepertoryInfoMapper.updateByPrimaryKey(lmsRepertoryInfo);
    }

    public LmsRepertoryInfo findById(BigDecimal id) {
        return lmsRepertoryInfoMapper.selectByPrimaryKey(id);
    }
}
