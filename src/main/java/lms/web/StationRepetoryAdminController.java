package lms.web;

import lms.model.LmsProductExport;
import lms.model.QueryExample;
import lms.service.ProductExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/StationRepetoryAdmin")
public class StationRepetoryAdminController {

    @Autowired
    private ProductExportService productExportService;

//
//    @RequestMapping("/queryProductExport")
//    public ModelAndView queryOrder(){
//        ModelAndView mv = new ModelAndView();
//        List<LmsProductExport> list = productExportService.findAll();
//        System.out.println("queryOrder,LmsProductExport list:");
//        System.out.println(list);
//        mv.addObject("productExports", list);
//        mv.setViewName("product_export_list");
//        return mv;
//    }

//    @RequestMapping("/produt_export_add")
//    public String addAdmin(LmsOrder lmsOrder) {
//        productExportService
//        return "redirect:/queryAdmin";
//    }

    @RequestMapping("/queryProductExport")
    public ModelAndView queryProductExport(QueryExample qe) {
        ModelAndView mv = new ModelAndView();
        List<LmsProductExport> list = productExportService.findAll();
        mv.addObject("productExports", list);
        mv.setViewName("product_export_list");
        return mv;
    }


    @RequestMapping("/addProductExport")
    public String addProductExport(LmsProductExport productExport) {
        productExportService.addProductExport(productExport);
        return "redirect:/queryProductExport";
    }

    @RequestMapping("/updateProductExport/{id}")
    public ModelAndView updateProductExport(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsProductExport productExport = productExportService.findById(new BigDecimal(id));
        mv.addObject("productExports", productExport);

        mv.setViewName("product_export_edit");
        System.out.println(productExport.toString());
        return mv;
    }

    @RequestMapping("/updateProductExportSub")
    public String updateProductExportSub(LmsProductExport productExport) {
        productExportService.updateProductExport(productExport);
        return "redirect:/StationRepetoryAdmin/queryProductExport";
    }


    @RequestMapping("/deleteProductExport/{id}")
    public String deleteProductExport(@PathVariable long id) {
        productExportService.deleteProductExport(new BigDecimal(id));
        System.out.println("deleteProductExport,id:"+id);
        return "redirect:/StationRepetoryAdmin/queryProductExport";
    }
}
