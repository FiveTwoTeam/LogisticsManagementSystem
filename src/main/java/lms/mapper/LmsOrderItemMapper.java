package lms.mapper;

import java.util.List;
import lms.model.LmsOrderItem;
import lms.model.LmsOrderItemExample;
import org.apache.ibatis.annotations.Param;

public interface LmsOrderItemMapper {
    int countByExample(LmsOrderItemExample example);

    int deleteByExample(LmsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsOrderItem record);

    int insertSelective(LmsOrderItem record);

    List<LmsOrderItem> selectByExample(LmsOrderItemExample example);

    LmsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsOrderItem record, @Param("example") LmsOrderItemExample example);

    int updateByExample(@Param("record") LmsOrderItem record, @Param("example") LmsOrderItemExample example);

    int updateByPrimaryKeySelective(LmsOrderItem record);

    int updateByPrimaryKey(LmsOrderItem record);
}