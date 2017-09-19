package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsCenterproductExportItem;
import lms.model.LmsCenterproductExportItemExample;
import org.apache.ibatis.annotations.Param;

public interface LmsCenterproductExportItemMapper {
    int countByExample(LmsCenterproductExportItemExample example);

    int deleteByExample(LmsCenterproductExportItemExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsCenterproductExportItem record);

    int insertSelective(LmsCenterproductExportItem record);

    List<LmsCenterproductExportItem> selectByExample(LmsCenterproductExportItemExample example);

    LmsCenterproductExportItem selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsCenterproductExportItem record, @Param("example") LmsCenterproductExportItemExample example);

    int updateByExample(@Param("record") LmsCenterproductExportItem record, @Param("example") LmsCenterproductExportItemExample example);

    int updateByPrimaryKeySelective(LmsCenterproductExportItem record);

    int updateByPrimaryKey(LmsCenterproductExportItem record);

    List<LmsCenterproductExportItem> findProductExportResultMap();

    List<LmsCenterproductExportItem> findProductResultMap();

}