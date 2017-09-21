package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmcCommodityReceipt;
import lms.model.LmcCommodityReceiptExample;
import org.apache.ibatis.annotations.Param;

public interface LmcCommodityReceiptMapper {
    int countByExample(LmcCommodityReceiptExample example);

    int deleteByExample(LmcCommodityReceiptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmcCommodityReceipt record);

    int insertSelective(LmcCommodityReceipt record);

    List<LmcCommodityReceipt> selectByExample(LmcCommodityReceiptExample example);

    LmcCommodityReceipt selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmcCommodityReceipt record, @Param("example") LmcCommodityReceiptExample example);

    int updateByExample(@Param("record") LmcCommodityReceipt record, @Param("example") LmcCommodityReceiptExample example);

    int updateByPrimaryKeySelective(LmcCommodityReceipt record);

    int updateByPrimaryKey(LmcCommodityReceipt record);
}