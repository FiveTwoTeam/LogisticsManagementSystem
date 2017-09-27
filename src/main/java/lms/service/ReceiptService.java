package lms.service;

import lms.model.LmsReceipt;

import java.math.BigDecimal;
import java.util.List;

public interface ReceiptService {

    List<LmsReceipt> findAll();
    void addReceipt(LmsReceipt lmsReceipt);
    void deleteReceipt(BigDecimal id);
    void updateReceipt(LmsReceipt lmsReceipt);
    LmsReceipt findById(BigDecimal id);

}
