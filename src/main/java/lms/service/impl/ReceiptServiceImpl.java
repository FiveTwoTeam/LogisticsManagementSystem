package lms.service.impl;

import lms.mapper.LmsReceiptMapper;
import lms.model.LmsReceipt;
import lms.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private LmsReceiptMapper lmsReceiptMapper;

    public List<LmsReceipt> findAll(){
        return lmsReceiptMapper.selectByExample(null);
    }

    public void addReceipt(LmsReceipt lmsReceipt) {
        lmsReceiptMapper.insert(lmsReceipt);
    }

    public void deleteReceipt(BigDecimal id) {
        lmsReceiptMapper.deleteByPrimaryKey(id);
    }

    public void updateReceipt(LmsReceipt lmsReceipt) {
        lmsReceiptMapper.updateByPrimaryKey(lmsReceipt);
    }

    public LmsReceipt findById(BigDecimal id) {
        return lmsReceiptMapper.selectByPrimaryKey(id);
    }
}
