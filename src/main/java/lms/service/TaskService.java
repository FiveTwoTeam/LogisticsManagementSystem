package lms.service;

import lms.model.LmsOrder;
import lms.model.LmsTask;

import java.util.List;

public interface TaskService {

    List<LmsTask>  findAll();
    void addTask(LmsTask lmsTask);
    void deleteTask(Long id);
    void updateTask(LmsTask task);
    LmsTask findById(long id);
    List<LmsTask> findTaskByExample(LmsOrder lmsOrder);

}
