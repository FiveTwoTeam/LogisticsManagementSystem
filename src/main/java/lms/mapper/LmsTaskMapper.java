package lms.mapper;

import lms.model.LmsTask;
import lms.model.LmsTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LmsTaskMapper {
    int countByExample(LmsTaskExample example);

    int deleteByExample(LmsTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsTask record);

    int insertSelective(LmsTask record);

    List<LmsTask> selectByExample(LmsTaskExample example);

    LmsTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsTask record, @Param("example") LmsTaskExample example);

    int updateByExample(@Param("record") LmsTask record, @Param("example") LmsTaskExample example);

    int updateByPrimaryKeySelective(LmsTask record);

    int updateByPrimaryKey(LmsTask record);

    List<LmsTask> findtaskMap();
}