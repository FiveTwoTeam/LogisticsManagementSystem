package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsOrderBack;
import lms.model.LmsOrderBackExample;
import org.apache.ibatis.annotations.Param;

public interface LmsOrderBackMapper {
    int countByExample(LmsOrderBackExample example);

    int deleteByExample(LmsOrderBackExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsOrderBack record);

    int insertSelective(LmsOrderBack record);

    List<LmsOrderBack> selectByExample(LmsOrderBackExample example);

    LmsOrderBack selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsOrderBack record, @Param("example") LmsOrderBackExample example);

    int updateByExample(@Param("record") LmsOrderBack record, @Param("example") LmsOrderBackExample example);

    int updateByPrimaryKeySelective(LmsOrderBack record);

    int updateByPrimaryKey(LmsOrderBack record);
}