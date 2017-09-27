package lms.mapper;

import java.util.List;
import lms.model.LmsStationRepetoryItem;
import lms.model.LmsStationRepetoryItemExample;
import org.apache.ibatis.annotations.Param;

public interface LmsStationRepetoryItemMapper {
    int countByExample(LmsStationRepetoryItemExample example);

    int deleteByExample(LmsStationRepetoryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsStationRepetoryItem record);

    int insertSelective(LmsStationRepetoryItem record);

    List<LmsStationRepetoryItem> selectByExample(LmsStationRepetoryItemExample example);

    LmsStationRepetoryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsStationRepetoryItem record, @Param("example") LmsStationRepetoryItemExample example);

    int updateByExample(@Param("record") LmsStationRepetoryItem record, @Param("example") LmsStationRepetoryItemExample example);

    int updateByPrimaryKeySelective(LmsStationRepetoryItem record);

    int updateByPrimaryKey(LmsStationRepetoryItem record);
}