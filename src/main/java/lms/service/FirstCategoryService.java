package lms.service;

import lms.model.LmsFirstCategory;

import java.util.List;

public interface FirstCategoryService {
    List<LmsFirstCategory> findAll();
    LmsFirstCategory findById(long id);
    void deleteFirstCategory(long id);
    void addFirstCategory(LmsFirstCategory lmsFirstCategory);
    void updateFirstCategory(LmsFirstCategory lmsFirstCategory);
}
