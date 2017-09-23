package lms.mapper;

import lms.model.LmsProductImportItem;
import lms.model.LmsProductImportItemExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface LmsProductImportItemMapper {
    int countByExample(LmsProductImportItemExample example);

    int deleteByExample(LmsProductImportItemExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsProductImportItem record);

    int insertSelective(LmsProductImportItem record);

    List<LmsProductImportItem> selectByExample(LmsProductImportItemExample example);

    LmsProductImportItem selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsProductImportItem record, @Param("example") LmsProductImportItemExample example);

    int updateByExample(@Param("record") LmsProductImportItem record, @Param("example") LmsProductImportItemExample example);

    int updateByPrimaryKeySelective(LmsProductImportItem record);

    int updateByPrimaryKey(LmsProductImportItem record);

    List<LmsProductImportItem> findproductAndProductImportMap();
}