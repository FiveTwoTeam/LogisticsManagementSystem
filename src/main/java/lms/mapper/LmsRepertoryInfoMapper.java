package lms.mapper;

import lms.model.LmsRepertoryInfo;
import lms.model.LmsRepertoryInfoExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface LmsRepertoryInfoMapper {
    int countByExample(LmsRepertoryInfoExample example);

    int deleteByExample(LmsRepertoryInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsRepertoryInfo record);

    int insertSelective(LmsRepertoryInfo record);

    List<LmsRepertoryInfo> selectByExample(LmsRepertoryInfoExample example);

    LmsRepertoryInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsRepertoryInfo record, @Param("example") LmsRepertoryInfoExample example);

    int updateByExample(@Param("record") LmsRepertoryInfo record, @Param("example") LmsRepertoryInfoExample example);

    int updateByPrimaryKeySelective(LmsRepertoryInfo record);

    int updateByPrimaryKey(LmsRepertoryInfo record);

    List<LmsRepertoryInfo> findproductAndRepertoryMap();
}