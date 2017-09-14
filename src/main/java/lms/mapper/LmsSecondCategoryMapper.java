package lms.mapper;

import java.util.List;
import lms.model.LmsSecondCategory;
import lms.model.LmsSecondCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface LmsSecondCategoryMapper {
    int countByExample(LmsSecondCategoryExample example);

    int deleteByExample(LmsSecondCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsSecondCategory record);

    int insertSelective(LmsSecondCategory record);

    List<LmsSecondCategory> selectByExample(LmsSecondCategoryExample example);

    LmsSecondCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsSecondCategory record, @Param("example") LmsSecondCategoryExample example);

    int updateByExample(@Param("record") LmsSecondCategory record, @Param("example") LmsSecondCategoryExample example);

    int updateByPrimaryKeySelective(LmsSecondCategory record);

    int updateByPrimaryKey(LmsSecondCategory record);
}