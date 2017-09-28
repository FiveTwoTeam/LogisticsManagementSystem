package lms.service.impl;

import lms.mapper.LmsFirstCategoryMapper;
import lms.model.LmsFirstCategory;
import lms.model.LmsFirstCategoryExample;
import lms.service.FirstCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstCategoryServiceImpl implements FirstCategoryService {
    @Autowired
    LmsFirstCategoryMapper lmsFirstCategoryMapper;

    public List<LmsFirstCategory> findAll() {
        return lmsFirstCategoryMapper.selectByExample(null);
    }

    public LmsFirstCategory findById(long id) {
        return lmsFirstCategoryMapper.selectByPrimaryKey(id);
    }

    public void deleteFirstCategory(long id) {
        lmsFirstCategoryMapper.deleteByPrimaryKey(id);
    }

    public void addFirstCategory(LmsFirstCategory lmsFirstCategory) {
        lmsFirstCategoryMapper.insert(lmsFirstCategory);
    }

    public void updateFirstCategory(LmsFirstCategory lmsFirstCategory) {
        lmsFirstCategoryMapper.updateByPrimaryKey(lmsFirstCategory);
    }
}
