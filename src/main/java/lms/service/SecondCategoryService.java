package lms.service;

import lms.model.LmsSecondCategory;

import java.util.List;

public interface SecondCategoryService {

    List<LmsSecondCategory>  findAll();
    void addSecondCategory(LmsSecondCategory lmsSecondCategory);
    void deleteSecondCategory(Long id);
    void updateSecondCategory(LmsSecondCategory lmsSecondCategory);
    LmsSecondCategory findById(long id);

}
