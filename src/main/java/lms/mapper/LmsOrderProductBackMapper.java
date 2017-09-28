package lms.mapper;

import java.util.List;
import lms.model.LmsOrderProductBack;
import lms.model.LmsOrderProductBackExample;
import org.apache.ibatis.annotations.Param;

public interface LmsOrderProductBackMapper {
    int countByExample(LmsOrderProductBackExample example);

    int deleteByExample(LmsOrderProductBackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsOrderProductBack record);

    int insertSelective(LmsOrderProductBack record);

    List<LmsOrderProductBack> selectByExample(LmsOrderProductBackExample example);

    LmsOrderProductBack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsOrderProductBack record, @Param("example") LmsOrderProductBackExample example);

    int updateByExample(@Param("record") LmsOrderProductBack record, @Param("example") LmsOrderProductBackExample example);

    int updateByPrimaryKeySelective(LmsOrderProductBack record);

    int updateByPrimaryKey(LmsOrderProductBack record);

    List<LmsOrderProductBack> findorderAndProductMap();
}