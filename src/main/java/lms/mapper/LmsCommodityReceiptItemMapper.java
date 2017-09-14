package lms.mapper;

import java.util.List;
import lms.model.LmsCommodityReceiptItem;
import lms.model.LmsCommodityReceiptItemExample;
import org.apache.ibatis.annotations.Param;

public interface LmsCommodityReceiptItemMapper {
    int countByExample(LmsCommodityReceiptItemExample example);

    int deleteByExample(LmsCommodityReceiptItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsCommodityReceiptItem record);

    int insertSelective(LmsCommodityReceiptItem record);

    List<LmsCommodityReceiptItem> selectByExample(LmsCommodityReceiptItemExample example);

    LmsCommodityReceiptItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsCommodityReceiptItem record, @Param("example") LmsCommodityReceiptItemExample example);

    int updateByExample(@Param("record") LmsCommodityReceiptItem record, @Param("example") LmsCommodityReceiptItemExample example);

    int updateByPrimaryKeySelective(LmsCommodityReceiptItem record);

    int updateByPrimaryKey(LmsCommodityReceiptItem record);
}