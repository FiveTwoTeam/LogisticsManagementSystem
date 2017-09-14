package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsCenterproductExport;
import lms.model.LmsCenterproductExportExample;
import org.apache.ibatis.annotations.Param;

public interface LmsCenterproductExportMapper {
    int countByExample(LmsCenterproductExportExample example);

    int deleteByExample(LmsCenterproductExportExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsCenterproductExport record);

    int insertSelective(LmsCenterproductExport record);

    List<LmsCenterproductExport> selectByExample(LmsCenterproductExportExample example);

    LmsCenterproductExport selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsCenterproductExport record, @Param("example") LmsCenterproductExportExample example);

    int updateByExample(@Param("record") LmsCenterproductExport record, @Param("example") LmsCenterproductExportExample example);

    int updateByPrimaryKeySelective(LmsCenterproductExport record);

    int updateByPrimaryKey(LmsCenterproductExport record);
}