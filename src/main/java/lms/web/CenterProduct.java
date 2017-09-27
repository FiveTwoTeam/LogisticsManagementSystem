package lms.web;

import lms.model.LmsProduct;
import lms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/centerProduct")
public class CenterProduct {
    @Autowired
    private ProductService productService;

    @RequestMapping("/queryProductList")
    public ModelAndView queryProductList(){
        ModelAndView mv = new ModelAndView();
        List<LmsProduct> list = productService.findAll();
        mv.addObject("products",list);
        mv.setViewName("product_list");
        return mv;
    }

    @RequestMapping("/addProduct")
    public String addProduct(LmsProduct lmsProduct) {
        productService.addProduct(lmsProduct);
        return "redirect:/centerProduct/queryProductList";
    }

    @RequestMapping("/updateProduct/{id}")
    public ModelAndView updateAdmin(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsProduct product = productService.findById(id);
        mv.addObject("product", product);
        mv.setViewName("product_edit");
        return mv;
    }

    @RequestMapping("/updateProductSub")
    public String updateAdminSub(LmsProduct admin) {
        productService.updateProduct(admin);
        return "redirect:/centerProduct/queryProductList";
    }


    @RequestMapping("/deleteProduct/{id}")
    public String deleteAdmin(@PathVariable long id) {
        productService.deleteProduct(id);
        return "redirect:/centerProduct/queryProductList";
    }
}
