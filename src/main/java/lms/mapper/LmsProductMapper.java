package lms.mapper;

import java.util.List;
import lms.model.LmsProduct;
import lms.model.LmsProductExample;
import org.apache.ibatis.annotations.Param;

public interface LmsProductMapper {
    int countByExample(LmsProductExample example);

    int deleteByExample(LmsProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsProduct record);

    int insertSelective(LmsProduct record);

    List<LmsProduct> selectByExample(LmsProductExample example);

    LmsProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsProduct record, @Param("example") LmsProductExample example);

    int updateByExample(@Param("record") LmsProduct record, @Param("example") LmsProductExample example);

    int updateByPrimaryKeySelective(LmsProduct record);

    int updateByPrimaryKey(LmsProduct record);

    List<LmsProduct> findSecondCategoryAndSupplierMap();
}