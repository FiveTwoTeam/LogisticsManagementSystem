package lms.mapper;

import java.math.BigDecimal;
import java.util.List;

import lms.model.LmsCommodityReceipt;
import lms.model.LmsCommodityReceiptExample;
import org.apache.ibatis.annotations.Param;

public interface LmsCommodityReceiptMapper {
    int countByExample(LmsCommodityReceiptExample example);

    int deleteByExample(LmsCommodityReceiptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsCommodityReceipt record);

    int insertSelective(LmsCommodityReceipt record);

    List<LmsCommodityReceipt> selectByExample(LmsCommodityReceiptExample example);

    LmsCommodityReceipt selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsCommodityReceipt record, @Param("example") LmsCommodityReceiptExample example);

    int updateByExample(@Param("record") LmsCommodityReceipt record, @Param("example") LmsCommodityReceiptExample example);

    int updateByPrimaryKeySelective(LmsCommodityReceipt record);

    int updateByPrimaryKey(LmsCommodityReceipt record);

    List<LmsCommodityReceipt> findAllResultMap();
}