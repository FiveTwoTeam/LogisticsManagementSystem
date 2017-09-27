package lms.service.impl;

import lms.mapper.LmsTaskMapper;
import lms.model.LmsOrder;
import lms.model.LmsTask;
import lms.model.LmsTaskExample;
import lms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private  LmsTaskMapper lmsTaskMapper;

    public List<LmsTask> findAll() {
        List<LmsTask> list = lmsTaskMapper.selectByExample(null);
        return list;
    }

    public void addTask(LmsTask lmsTask) {
        lmsTaskMapper.insert(lmsTask);
    }

    public void deleteTask(Long id) {
        lmsTaskMapper.deleteByPrimaryKey(id);
    }

    public void updateTask(LmsTask task) {
        lmsTaskMapper.updateByPrimaryKey(task);
    }

    public LmsTask findById(long id) {
        return lmsTaskMapper.selectByPrimaryKey(id);
    }

    public List<LmsTask> findTaskByExample(LmsOrder lmsOrder) {
        LmsTaskExample example = new LmsTaskExample();
        LmsTaskExample.Criteria criteria = example.createCriteria();
        Long orderId = lmsOrder.getId().longValue();
        criteria.andLmsOrderIdEqualTo(orderId);
        List<LmsTask> list = lmsTaskMapper.selectByExample(example);
        //System.out.println(list);
        return list;
    }
}
