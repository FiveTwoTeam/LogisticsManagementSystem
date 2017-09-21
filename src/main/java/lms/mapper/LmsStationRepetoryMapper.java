package lms.mapper;

import lms.model.LmsStationRepetory;
import lms.model.LmsStationRepetoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LmsStationRepetoryMapper {
    int countByExample(LmsStationRepetoryExample example);

    int deleteByExample(LmsStationRepetoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsStationRepetory record);

    int insertSelective(LmsStationRepetory record);

    List<LmsStationRepetory> selectByExample(LmsStationRepetoryExample example);

    LmsStationRepetory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsStationRepetory record, @Param("example") LmsStationRepetoryExample example);

    int updateByExample(@Param("record") LmsStationRepetory record, @Param("example") LmsStationRepetoryExample example);

    int updateByPrimaryKeySelective(LmsStationRepetory record);

    int updateByPrimaryKey(LmsStationRepetory record);

    List<LmsStationRepetory> findstationRepetoryResultMap();
}