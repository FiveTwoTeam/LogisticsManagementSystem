package lms.mapper;

import java.util.List;
import lms.model.LmsDeliveryStaff;
import lms.model.LmsDeliveryStaffExample;
import org.apache.ibatis.annotations.Param;

public interface LmsDeliveryStaffMapper {
    int countByExample(LmsDeliveryStaffExample example);

    int deleteByExample(LmsDeliveryStaffExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LmsDeliveryStaff record);

    int insertSelective(LmsDeliveryStaff record);

    List<LmsDeliveryStaff> selectByExample(LmsDeliveryStaffExample example);

    LmsDeliveryStaff selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LmsDeliveryStaff record, @Param("example") LmsDeliveryStaffExample example);

    int updateByExample(@Param("record") LmsDeliveryStaff record, @Param("example") LmsDeliveryStaffExample example);

    int updateByPrimaryKeySelective(LmsDeliveryStaff record);

    int updateByPrimaryKey(LmsDeliveryStaff record);

    List<LmsDeliveryStaff> findStationResultMap();
}