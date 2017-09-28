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
public class IndexController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/index")
    public ModelAndView query() {
        ModelAndView mv = new ModelAndView();
        QueryExample qe = null;
        List<LmsAdmin> admins = adminService.findAll(qe);

        mv.addObject("admins", admins);
        mv.setViewName("admin");

        return mv;
    }

}
