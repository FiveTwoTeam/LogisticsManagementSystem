package lms.web;

import lms.model.LmsOrder;
import lms.model.LmsTask;
import lms.service.OrderService;
import lms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/DispatchAdmin")
public class DispatchAdminController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private TaskService taskService;

    @RequestMapping("/queryOrder")
    public ModelAndView queryOrder(){
        ModelAndView mv = new ModelAndView();
        List<LmsOrder> list = orderService.findAll();
        System.out.println("list:");
        System.out.println(list);
        mv.addObject("orders", list);
        mv.setViewName("order_list");
        return mv;
    }


//    @RequestMapping("/addOrder")
//    public String addAdmin(LmsOrder lmsOrder) {
//        orderService.addOrder(lmsOrder);
//        return "redirect:/queryAdmin";
//    }


    @RequestMapping("/updateOrder/{id}")   //选择分站，生成任务单及调拨单
    public ModelAndView updateOrder(@PathVariable BigDecimal id) {
        ModelAndView mv = new ModelAndView();
        System.out.println("updateorder ,order id:"+id);
        LmsOrder lmsOrder = orderService.findById(id);
      //  mv.addObject("tasks", lmsOrder);
        List<LmsTask> list = taskService.findTaskByExample(lmsOrder);
       // System.out.println("controller list:"+list);
        System.out.println("uo ,controller list.get(0):"+list.get(0));
        mv.addObject("tasks",list.get(0));

        mv.setViewName("dispatch_show_task_edit");
      //  System.out.println(lmsOrder.toString());
        return mv;
    }

    @RequestMapping("/updateTaskSub")
    public String updateAdminSub(LmsTask lmsTask) {
        System.out.println("updateAdminSub here");
        taskService.updateTask(lmsTask);
        System.out.println("updateAdminSub:"+lmsTask);
        return "redirect:/queryTask";
    }

    @RequestMapping("/queryTask")
    public ModelAndView queryTask(){
        System.out.println("here is queryTask");
        ModelAndView mv = new ModelAndView();
        List<LmsTask> list = taskService.findAll();

        System.out.println("list:"+list);
        mv.addObject("tasks", list);
        mv.setViewName("dispatch_show_task_list");
        return mv;
    }
}
