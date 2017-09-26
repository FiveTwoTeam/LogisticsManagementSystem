package lms.mapper;

import java.util.List;
import lms.model.LmsFirstCategory;
import lms.model.LmsFirstCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface LmsFirstCategoryMapper {
    int countByExample(LmsFirstCategoryExample example);

    int deleteByExample(LmsFirstCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsFirstCategory record);

    int insertSelective(LmsFirstCategory record);

    List<LmsFirstCategory> selectByExample(LmsFirstCategoryExample example);

    LmsFirstCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsFirstCategory record, @Param("example") LmsFirstCategoryExample example);

    int updateByExample(@Param("record") LmsFirstCategory record, @Param("example") LmsFirstCategoryExample example);

    int updateByPrimaryKeySelective(LmsFirstCategory record);

    int updateByPrimaryKey(LmsFirstCategory record);

}