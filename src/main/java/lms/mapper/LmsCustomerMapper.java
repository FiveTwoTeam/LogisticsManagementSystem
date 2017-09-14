package lms.mapper;

import java.util.List;
import lms.model.LmsCustomer;
import lms.model.LmsCustomerExample;
import org.apache.ibatis.annotations.Param;

public interface LmsCustomerMapper {
    int countByExample(LmsCustomerExample example);

    int deleteByExample(LmsCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsCustomer record);

    int insertSelective(LmsCustomer record);

    List<LmsCustomer> selectByExample(LmsCustomerExample example);

    LmsCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsCustomer record, @Param("example") LmsCustomerExample example);

    int updateByExample(@Param("record") LmsCustomer record, @Param("example") LmsCustomerExample example);

    int updateByPrimaryKeySelective(LmsCustomer record);

    int updateByPrimaryKey(LmsCustomer record);
}