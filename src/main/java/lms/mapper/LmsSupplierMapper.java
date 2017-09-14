package lms.mapper;

import java.util.List;
import lms.model.LmsSupplier;
import lms.model.LmsSupplierExample;
import org.apache.ibatis.annotations.Param;

public interface LmsSupplierMapper {
    int countByExample(LmsSupplierExample example);

    int deleteByExample(LmsSupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsSupplier record);

    int insertSelective(LmsSupplier record);

    List<LmsSupplier> selectByExample(LmsSupplierExample example);

    LmsSupplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsSupplier record, @Param("example") LmsSupplierExample example);

    int updateByExample(@Param("record") LmsSupplier record, @Param("example") LmsSupplierExample example);

    int updateByPrimaryKeySelective(LmsSupplier record);

    int updateByPrimaryKey(LmsSupplier record);
}