package lms.service.impl;

import lms.mapper.LmsSecondCategoryMapper;
import lms.model.LmsSecondCategory;
import lms.service.SecondCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondCategoryServiceImpl implements SecondCategoryService {

    @Autowired
    private  LmsSecondCategoryMapper lmsSecondCategoryMapper;


    public List<LmsSecondCategory> findAll() {
        List<LmsSecondCategory> list = lmsSecondCategoryMapper.findsecondCategoryMap();
        return list;
    }

    public void addSecondCategory(LmsSecondCategory lmsSecondCategory) {
        lmsSecondCategoryMapper.insert(lmsSecondCategory);
    }

    public void deleteSecondCategory(Long id) {
        lmsSecondCategoryMapper.deleteByPrimaryKey(id);
    }

    public void updateSecondCategory(LmsSecondCategory lmsSecondCategory) {
        lmsSecondCategoryMapper.updateByPrimaryKey(lmsSecondCategory);
    }

    public LmsSecondCategory findById(long id) {
        return lmsSecondCategoryMapper.selectByPrimaryKey(id);
    }
}
