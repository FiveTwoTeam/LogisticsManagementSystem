package lms.web;

import lms.model.LmsAdmin;
import lms.model.QueryExample;
import lms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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

    @RequestMapping("/login")
    public ModelAndView login(String username, String userpassword,
                              String inputCode, HttpSession session) {
        ModelAndView mv = new ModelAndView();
//        //先验证验证码
//        if(!session.getAttribute("numrand").equals(inputCode)){
//            mv.addObject("msg","验证码不正确");
//            mv.setViewName("login");
//            return mv;
//        }

        LmsAdmin loginUser = adminService.login(username, userpassword);
        if(loginUser != null){
            session.setAttribute("user", loginUser);
            mv.setViewName("redirect:/index");
            return mv;
        } else {
            mv.addObject("msg","用户名或密码错误");
            mv.setViewName("login");
            return mv;
        }
    }
}
