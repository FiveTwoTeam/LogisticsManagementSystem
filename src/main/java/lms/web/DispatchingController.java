package lms.web;

import lms.model.LmsProduct;
import lms.model.QueryExample;
import lms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Dispatching")
public class DispatchingController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/queryProduct")
    public ModelAndView queryProduct(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsProduct> list = productService.findAll();
        mv.addObject("products", list);
        mv.setViewName("dispatching_product_list");
        return mv;
    }


    @RequestMapping("/addProduct")
    public String addProduct(LmsProduct product) {
        productService.addProduct(product);
        return "redirect:/queryProduct";
    }

    @RequestMapping("/updateProduct/{id}")
    public ModelAndView updateProduct(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsProduct product = productService.findById(id);
       // System.out.println("here is updateProduct:"+ product);
        mv.addObject("products", product);

        mv.setViewName("dispatching_product_edit");
        System.out.println(product.toString());
        return mv;
    }

    @RequestMapping("/updateProductSub")
    public String updateProductSub(LmsProduct product) {
        productService.updateProduct(product);
        return "redirect:/queryProduct";
    }


    @RequestMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
        System.out.println(id);
        return "redirect:/Dispatching/queryProduct";//Dispatching
    }
}
