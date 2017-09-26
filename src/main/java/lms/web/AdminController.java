package lms.web;

import lms.model.LmsAdmin;
import lms.model.QueryExample;
import lms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/queryAdmin")
    public ModelAndView query(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsAdmin> list = adminService.findAll(qe);
        mv.addObject("admins", list);
        mv.setViewName("admin_list");
        return mv;
    }


    @RequestMapping("/addAdmin")
    public String addAdmin(LmsAdmin lmsAdmin) {
        adminService.addAdmin(lmsAdmin);
        return "redirect:/queryAdmin";
    }

    @RequestMapping("/updateAdmin/{id}")
    public ModelAndView updateAdmin(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsAdmin admin = adminService.findById(id);
        mv.addObject("admins", admin);

        mv.setViewName("admin_edit");
        System.out.println(admin.toString());
        return mv;
    }

    @RequestMapping("/updateAdminSub")
    public String updateAdminSub(LmsAdmin admin) {
        adminService.updateAdmin(admin);
        return "redirect:/queryAdmin";
    }


    @RequestMapping("/deleteAdmin/{id}")
    public String deleteAdmin(@PathVariable long id) {
        adminService.deleteAdmin(id);
        return "redirect:/queryAdmin";
    }



//
//    @RequestMapping("/login")
//    public ModelAndView login(String username, String userpassword,
//                              String inputCode, HttpSession session) {
//        ModelAndView mv = new ModelAndView();
////        //先验证验证码
////        if(!session.getAttribute("numrand").equals(inputCode)){
////            mv.addObject("msg","验证码不正确");
////            mv.setViewName("login");
////            return mv;
////        }
//
//        LmsAdmin loginUser = adminService.login(username, userpassword);
//        if(loginUser != null){
//            session.setAttribute("user", loginUser);
//            mv.setViewName("redirect:/index");
//            return mv;
//        } else {
//            mv.addObject("msg","用户名或密码错误");
//            mv.setViewName("login");
//            return mv;
//        }
//    }
}
