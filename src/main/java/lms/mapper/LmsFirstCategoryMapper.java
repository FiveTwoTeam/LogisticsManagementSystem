package lms.mapper;

import java.util.List;
import lms.model.LmsFirstCategory;
import lms.model.LmsFirstCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface LmsFirstCategoryMapper {
    int countByExample(LmsFirstCategoryExample example);

    int deleteByExample(LmsFirstCategoryExample example);

    int insert(LmsFirstCategory record);

    int insertSelective(LmsFirstCategory record);

    List<LmsFirstCategory> selectByExample(LmsFirstCategoryExample example);

    int updateByExampleSelective(@Param("record") LmsFirstCategory record, @Param("example") LmsFirstCategoryExample example);

    int updateByExample(@Param("record") LmsFirstCategory record, @Param("example") LmsFirstCategoryExample example);
}