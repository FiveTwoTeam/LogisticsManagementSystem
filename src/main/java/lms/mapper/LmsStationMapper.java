package lms.mapper;

import java.util.List;
import lms.model.LmsStation;
import lms.model.LmsStationExample;
import org.apache.ibatis.annotations.Param;

public interface LmsStationMapper {
    int countByExample(LmsStationExample example);

    int deleteByExample(LmsStationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsStation record);

    int insertSelective(LmsStation record);

    List<LmsStation> selectByExample(LmsStationExample example);

    LmsStation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsStation record, @Param("example") LmsStationExample example);

    int updateByExample(@Param("record") LmsStation record, @Param("example") LmsStationExample example);

    int updateByPrimaryKeySelective(LmsStation record);

    int updateByPrimaryKey(LmsStation record);
}