package lms.mapper;

import lms.model.LmsProductExportItem;
import lms.model.LmsProductExportItemExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface LmsProductExportItemMapper {
    int countByExample(LmsProductExportItemExample example);

    int deleteByExample(LmsProductExportItemExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsProductExportItem record);

    int insertSelective(LmsProductExportItem record);

    List<LmsProductExportItem> selectByExample(LmsProductExportItemExample example);

    LmsProductExportItem selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsProductExportItem record, @Param("example") LmsProductExportItemExample example);

    int updateByExample(@Param("record") LmsProductExportItem record, @Param("example") LmsProductExportItemExample example);

    int updateByPrimaryKeySelective(LmsProductExportItem record);

    int updateByPrimaryKey(LmsProductExportItem record);

    List<LmsProductExportItem> findproductAndProductExportMap();
}