package lms.mapper;

import java.util.List;
import lms.model.LmsOrder;
import lms.model.LmsOrderExample;
import org.apache.ibatis.annotations.Param;

public interface LmsOrderMapper {
    int countByExample(LmsOrderExample example);

    int deleteByExample(LmsOrderExample example);

    int insert(LmsOrder record);

    int insertSelective(LmsOrder record);

    List<LmsOrder> selectByExample(LmsOrderExample example);

    int updateByExampleSelective(@Param("record") LmsOrder record, @Param("example") LmsOrderExample example);

    int updateByExample(@Param("record") LmsOrder record, @Param("example") LmsOrderExample example);
}