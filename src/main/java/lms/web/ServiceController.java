package lms.web;

import lms.model.*;
import lms.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private RepertoryService repertoryService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderBackService orderBackService;
    @Autowired
    private OrderProductBackService orderProductBackService;
    @Autowired
    private OrderProductExchangeService orderProductExchangeService;


    @RequestMapping("/queryCustom")
    public ModelAndView queryCustom(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsCustomer> list = customerService.findAll();
        mv.addObject("customs", list);
        mv.setViewName("custom_list");
        return mv;
    }


    @RequestMapping("/addCustom")
    public String addCustom(LmsCustomer lmsCustomer) {
        System.out.println(11);
        customerService.addCustomer(lmsCustomer);
        System.out.println(22);
        return "redirect:/service/queryCustom";
    }

    @RequestMapping("/updateCustom/{id}")
    public ModelAndView updateCustom(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsCustomer customer = customerService.findById(id);
        mv.addObject("customs", customer);

        mv.setViewName("custom_edit");
        System.out.println(customer.toString());
        return mv;
    }

    @RequestMapping("/updateCustomSub")
    public String updateCustomerSub(LmsCustomer customer) {
        customerService.updateCustomer(customer);
        return "redirect:/service/queryCustom";
    }


    @RequestMapping("/deleteCustom/{id}")
    public String deleteCustomer(@PathVariable long id) {
        customerService.deleteCustomer(id);
        return "redirect:/service/queryCustom";
    }

    @RequestMapping("/queryRepertory")
    public ModelAndView queryRepertory(QueryExample qe) {
       ModelAndView mv = new ModelAndView();
        List<LmsRepertory> list = repertoryService.findAll();
        mv.addObject("repertorys", list);
        mv.setViewName("repertory_list");
        return mv;
    }


    @RequestMapping("/addRepertory")
    public String addRepertory(LmsRepertory lmsRepertory) {
        repertoryService.addRepertory(lmsRepertory);
        return "redirect:/service/queryRepertory";
    }

    @RequestMapping("/updateRepertory/{id}")
    public ModelAndView updateRepertory(@PathVariable int id) {
        ModelAndView mv = new ModelAndView();
        BigDecimal Bid = new BigDecimal(id);
        LmsRepertory repertory = repertoryService.findById( Bid);
        mv.addObject("repertorys", repertory);

        mv.setViewName("repertory_edit");
        System.out.println(repertory.toString());
        return mv;
    }

    @RequestMapping("/updateRepertorySub")
    public String updateRepertorySub(LmsRepertory Repertory) {
        repertoryService.updateRepertory(Repertory);
        return "redirect:/service/queryRepertory";
    }


    @RequestMapping("/deleteRepertory/{id}")
    public String deleteRepertory(@PathVariable long id) {
        repertoryService.deleteRepertory(new BigDecimal(id));
        return "redirect:/service/queryRepertory";
    }


    @RequestMapping("/queryOrder")
    public ModelAndView queryOrder(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsOrder> list = orderService.findAll();
        mv.addObject("orders", list);
        mv.setViewName("service_order_list");
        return mv;
    }


    @RequestMapping("/addOrder")
    public String addOrder(LmsOrder lmsOrder) {
        orderService.addOrder(lmsOrder);
        return "redirect:/service/queryOrder";
    }

    @RequestMapping("/updateOrder/{id}")
    public ModelAndView updateOrder(@PathVariable int id) {
        ModelAndView mv = new ModelAndView();
        LmsOrder order = orderService.findById(new BigDecimal(id));
        mv.addObject("orders", order);
        mv.setViewName("service_order_edit");
        return mv;
    }

    @RequestMapping("/updateOrderSub")
    public String updateOrderSub(LmsOrder order) {
        System.out.println("here is updateOrderSub");
        orderService.updateOrder(order);
        System.out.println(111);
        return "redirect:/service/queryOrder";
    }


    @RequestMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable long id) {
        orderService.deleteOrder(new BigDecimal(id));
        return "redirect:/service/queryOrder";
    }



    @RequestMapping("/queryOrderBack")
    public ModelAndView queryOrderBack(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsOrderBack> list = orderBackService.findAll();
        mv.addObject("orderBacks", list);
        mv.setViewName("order_back");
        return mv;
    }


    @RequestMapping("/queryOrderProductBack")
    public ModelAndView queryOrderProductBack(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        System.out.println(11111);
        List<LmsOrderProductBack> list = orderProductBackService.findAll();
        System.out.println(2222);
        mv.addObject("orderProductBacks", list);
        mv.setViewName("order_product_back");
        return mv;
    }

    @RequestMapping("/queryProductExchange")
    public ModelAndView queryOrderProductExchange(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsOrderProductExchange> list = orderProductExchangeService.findAll();
        mv.addObject("orderProductExchanges", list);
        mv.setViewName("order_product_exchange");
        return mv;
    }

}
