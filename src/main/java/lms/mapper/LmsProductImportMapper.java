package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsProductImport;
import lms.model.LmsProductImportExample;
import org.apache.ibatis.annotations.Param;

public interface LmsProductImportMapper {
    int countByExample(LmsProductImportExample example);

    int deleteByExample(LmsProductImportExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsProductImport record);

    int insertSelective(LmsProductImport record);

    List<LmsProductImport> selectByExample(LmsProductImportExample example);

    LmsProductImport selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsProductImport record, @Param("example") LmsProductImportExample example);

    int updateByExample(@Param("record") LmsProductImport record, @Param("example") LmsProductImportExample example);

    int updateByPrimaryKeySelective(LmsProductImport record);

    int updateByPrimaryKey(LmsProductImport record);
}