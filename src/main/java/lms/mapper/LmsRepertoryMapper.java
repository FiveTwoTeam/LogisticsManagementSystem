package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsRepertory;
import lms.model.LmsRepertoryExample;
import org.apache.ibatis.annotations.Param;

public interface LmsRepertoryMapper {
    int countByExample(LmsRepertoryExample example);

    int deleteByExample(LmsRepertoryExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsRepertory record);

    int insertSelective(LmsRepertory record);

    List<LmsRepertory> selectByExample(LmsRepertoryExample example);

    LmsRepertory selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsRepertory record, @Param("example") LmsRepertoryExample example);

    int updateByExample(@Param("record") LmsRepertory record, @Param("example") LmsRepertoryExample example);

    int updateByPrimaryKeySelective(LmsRepertory record);

    int updateByPrimaryKey(LmsRepertory record);

    List<LmsRepertory> findadminAndRepertoryResultMap();
}