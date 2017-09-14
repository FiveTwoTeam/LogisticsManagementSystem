package lms.mapper;

import java.util.List;
import lms.model.LmsAdmin;
import lms.model.LmsAdminExample;
import org.apache.ibatis.annotations.Param;

public interface LmsAdminMapper {
    int countByExample(LmsAdminExample example);

    int deleteByExample(LmsAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsAdmin record);

    int insertSelective(LmsAdmin record);

    List<LmsAdmin> selectByExample(LmsAdminExample example);

    LmsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsAdmin record, @Param("example") LmsAdminExample example);

    int updateByExample(@Param("record") LmsAdmin record, @Param("example") LmsAdminExample example);

    int updateByPrimaryKeySelective(LmsAdmin record);

    int updateByPrimaryKey(LmsAdmin record);
}