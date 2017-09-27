package lms.web;

import lms.model.LmsReceipt;
import lms.model.LmsTask;
import lms.service.ReceiptService;
import lms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/stationManage")
public class StationManage {

    @Autowired
    private TaskService taskService;

    @Autowired
    private ReceiptService receiptService;

    @RequestMapping("/queryTask")
    public ModelAndView queryTask(){
        ModelAndView mv = new ModelAndView();
        List<LmsTask> list = taskService.findAll();
        mv.addObject("tasks",list);
        mv.setViewName("task_list");
        return mv;
    }

    @RequestMapping("/addTask")
    public String addTask(LmsTask lmsTask) {
        taskService.addTask(lmsTask);
        return "redirect:/stationManage/queryTask";
    }

    @RequestMapping("/updateTask/{id}")
    public ModelAndView updateTask(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsTask lmsTask = taskService.findById(id);
        mv.addObject("tasks", lmsTask);
        mv.setViewName("task_edit");
        return mv;
    }

    @RequestMapping("/updateTaskSub")
    public String updateTaskSub(Long id, Short status, Short type, Long lmsOrderId,
                                Long lmsCustomerId, Long lmsStationId,
                                long lmsStationRepetoryId, Long lmsDeliveryStaffId,
                                String satisfy, String description) {
        LmsTask lmsTask = new LmsTask(id, status, type, lmsOrderId, lmsCustomerId, lmsStationId,
                lmsStationRepetoryId, lmsDeliveryStaffId, satisfy, description);
        taskService.updateTask(lmsTask);
        return "redirect:/stationManage/queryTask";
    }

    @RequestMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
        return "redirect:/stationManage/queryTask";
    }



    @RequestMapping("/queryReceipt")
    public ModelAndView queryReceipt(){
        ModelAndView mv = new ModelAndView();
        List<LmsReceipt> list = receiptService.findAll();
        mv.addObject("receipts",list);
        mv.setViewName("receipt_list");
        return mv;
    }

    @RequestMapping("/addReceipt")
    public String addReceipt(LmsReceipt lmsReceipt) {
        receiptService.addReceipt(lmsReceipt);
        return "redirect:/stationManage/queryReceipt";
    }

    @RequestMapping("/updateReceipt/{id}")
    public ModelAndView updateReceipt(@PathVariable BigDecimal id) {
        ModelAndView mv = new ModelAndView();
        LmsReceipt lmsReceipt = receiptService.findById(id);
        mv.addObject("receipts", lmsReceipt);
        mv.setViewName("receipt_edit");
        return mv;
    }

    @RequestMapping("/updateReceiptSub")
    public String updateReceiptSub(BigDecimal id, BigDecimal totalMoney,  String gainMan, String missMan, BigDecimal orderNumber, Short state) {
        LmsReceipt lmsReceipt = new LmsReceipt( id,  totalMoney,   gainMan,  missMan,  orderNumber,  state);
        receiptService.updateReceipt(lmsReceipt);
        return "redirect:/stationManage/queryReceipt";
    }

    @RequestMapping("/deleteReceipt/{id}")
    public String deleteReceipt(@PathVariable BigDecimal id) {
        receiptService.deleteReceipt(id);
        return "redirect:/stationManage/queryReceipt";
    }
}
