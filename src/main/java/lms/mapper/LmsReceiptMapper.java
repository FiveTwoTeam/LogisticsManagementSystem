package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsReceipt;
import lms.model.LmsReceiptExample;
import org.apache.ibatis.annotations.Param;

public interface LmsReceiptMapper {
    int countByExample(LmsReceiptExample example);

    int deleteByExample(LmsReceiptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsReceipt record);

    int insertSelective(LmsReceipt record);

    List<LmsReceipt> selectByExample(LmsReceiptExample example);

    LmsReceipt selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsReceipt record, @Param("example") LmsReceiptExample example);

    int updateByExample(@Param("record") LmsReceipt record, @Param("example") LmsReceiptExample example);

    int updateByPrimaryKeySelective(LmsReceipt record);

    int updateByPrimaryKey(LmsReceipt record);
}