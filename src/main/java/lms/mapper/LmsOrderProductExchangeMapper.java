package lms.mapper;

import java.math.BigDecimal;
import java.util.List;
import lms.model.LmsOrderProductExchange;
import lms.model.LmsOrderProductExchangeExample;
import org.apache.ibatis.annotations.Param;

public interface LmsOrderProductExchangeMapper {
    int countByExample(LmsOrderProductExchangeExample example);

    int deleteByExample(LmsOrderProductExchangeExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LmsOrderProductExchange record);

    int insertSelective(LmsOrderProductExchange record);

    List<LmsOrderProductExchange> selectByExample(LmsOrderProductExchangeExample example);

    LmsOrderProductExchange selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LmsOrderProductExchange record, @Param("example") LmsOrderProductExchangeExample example);

    int updateByExample(@Param("record") LmsOrderProductExchange record, @Param("example") LmsOrderProductExchangeExample example);

    int updateByPrimaryKeySelective(LmsOrderProductExchange record);

    int updateByPrimaryKey(LmsOrderProductExchange record);

    List<LmsOrderProductExchange> findorderAndProductMap();
}