package lms.service;

import lms.model.LmsReceipt;

import java.math.BigDecimal;

public interface ReceiptService {

   // List<LmsReceipt>  findAll();
    void addReceipt(LmsReceipt lmsReceipt);
    void deleteReceipt(BigDecimal id);
    void updateReceipt(LmsReceipt lmsReceipt);
    LmsReceipt findById(BigDecimal id);

}
