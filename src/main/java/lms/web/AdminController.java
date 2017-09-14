package lms.web;

import lms.model.LmsAdmin;
import lms.model.QueryExample;
import lms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/query")
    public ModelAndView query(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsAdmin> list = adminService.findAll(qe);
        mv.addObject("itemList", list);
        mv.setViewName("list");

        return mv;
    }
}
