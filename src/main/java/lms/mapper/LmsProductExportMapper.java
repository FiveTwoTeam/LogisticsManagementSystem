package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsProductExport;
import lms.model.LmsProductExportExample;
import org.apache.ibatis.annotations.Param;

public interface LmsProductExportMapper {
    int countByExample(LmsProductExportExample example);

    int deleteByExample(LmsProductExportExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsProductExport record);

    int insertSelective(LmsProductExport record);

    List<LmsProductExport> selectByExample(LmsProductExportExample example);

    LmsProductExport selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsProductExport record, @Param("example") LmsProductExportExample example);

    int updateByExample(@Param("record") LmsProductExport record, @Param("example") LmsProductExportExample example);

    int updateByPrimaryKeySelective(LmsProductExport record);

    int updateByPrimaryKey(LmsProductExport record);
}