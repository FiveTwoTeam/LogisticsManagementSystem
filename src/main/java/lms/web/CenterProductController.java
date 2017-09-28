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
@RequestMapping("/centerProduct")
public class CenterProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private StationService stationService;

    @Autowired
    private ProductExportService productExportService;

    @Autowired
    private ProductImportService productImportService;

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
    public String updateAdminSub(Long id, String name, BigDecimal price, String unit,
                                 BigDecimal lmsSecondCategoryId, BigDecimal discount,
                                 BigDecimal cost, String size, BigDecimal lmsSupplierId, String qualityPeriod, BigDecimal ifBack, BigDecimal ifExchange, String description) {
        LmsProduct lmsProduct = new LmsProduct(id, name, price, unit, lmsSecondCategoryId, discount, cost, size, lmsSupplierId, qualityPeriod, ifBack, ifExchange, description);
        productService.updateProduct(lmsProduct);
        return "redirect:/centerProduct/queryProductList";
    }


    @RequestMapping("/deleteProduct/{id}")
    public String deleteAdmin(@PathVariable long id) {
        productService.deleteProduct(id);
        return "redirect:/centerProduct/queryProductList";
    }


    @RequestMapping("/queryStation")
    public ModelAndView queryStation(){
        ModelAndView mv = new ModelAndView();
        List<LmsStation> list = stationService.findAll();
        mv.addObject("stations",list);
        mv.setViewName("station_list");
        return mv;
    }

    @RequestMapping("/addStation")
    public String addStation(int id, String name, String address, int phone, int lmsAdminId) {
        LmsStation lmsStation = new LmsStation((long) id, name, address, new BigDecimal(phone), (long) lmsAdminId);
        stationService.addStation(lmsStation);
        return "redirect:/centerProduct/queryStation";
    }

    @RequestMapping("/updateStation/{id}")
    public ModelAndView updateStation(@PathVariable long id) {
        ModelAndView mv = new ModelAndView();
        LmsStation lmsStation = stationService.findById(id);
        mv.addObject("station", lmsStation);
        mv.setViewName("station_edit");
        return mv;
    }

    @RequestMapping("/updateStationSub")
    public String updateStationSub(int id, String name, String address, int phone, int lmsAdminId) {
        LmsStation lmsStation = new LmsStation((long) id, name, address, new BigDecimal(phone), (long) lmsAdminId);
        stationService.updateStation(lmsStation);
        return "redirect:/centerProduct/queryStation";
    }


    @RequestMapping("/deleteStation/{id}")
    public String deleteStation(@PathVariable long id) {
        stationService.deleteStation(id);
        return "redirect:/centerProduct/queryStation";
    }


    @RequestMapping("/queryProductExport")
    public ModelAndView queryProductExport(){
        ModelAndView mv = new ModelAndView();
        List<LmsProductExport> list = productExportService.findAll();
        mv.addObject("productExports",list);
        mv.setViewName("product_export_list");
        return mv;
    }

    @RequestMapping("/addProductExport")
    public String addProductExport(LmsProductExport lmsProductExport) {
        productExportService.addProductExport(lmsProductExport);
        return "redirect:/centerProduct/queryProductExport";
    }

    @RequestMapping("/updateProductExport/{id}")
    public ModelAndView updateProductExport(@PathVariable BigDecimal id) {
        ModelAndView mv = new ModelAndView();
        LmsProductExport lmsProductExport = productExportService.findById(id);
        mv.addObject("lmsProductExport", lmsProductExport);
        mv.setViewName("product_export_edit");
        return mv;
    }

    @RequestMapping("/updateProductExportSub")
    public String updateProductExportSub(LmsProductExport lmsProductExport) {
        productExportService.updateProductExport(lmsProductExport);
        return "redirect:/centerProduct/queryProductExport";
    }


    @RequestMapping("/deleteProductExport/{id}")
    public String deleteProductExport(@PathVariable BigDecimal id) {
        productExportService.deleteProductExport(id);
        return "redirect:/centerProduct/queryProductExport";
    }


    @RequestMapping("/queryProductImport")
    public ModelAndView queryProductImport(){
        ModelAndView mv = new ModelAndView();
        List<LmsProductImport> list = productImportService.findAll();
        mv.addObject("productImports",list);
        mv.setViewName("center_product_import_list");
        return mv;
    }

    @RequestMapping("/addProductImport")
    public String addProductImport(LmsProductImport lmsProductImport) {
        productImportService.addProductImport(lmsProductImport);
        return "redirect:/centerProduct/queryProductImport";
    }

    @RequestMapping("/updateProductImport/{id}")
    public ModelAndView updateProductImport(@PathVariable BigDecimal id) {
        ModelAndView mv = new ModelAndView();
        LmsProductImport lmsProductImport = productImportService.findById(id);
        mv.addObject("productImport", lmsProductImport);
        mv.setViewName("center_product_import_edit");
        return mv;
    }

    @RequestMapping("/updateProductImportSub")
    public String updateProductImportSub(int id, int importNo, int lmsSupplierId) {
        LmsProductImport lmsProductImport = new LmsProductImport(new BigDecimal(id),new BigDecimal(importNo)
                ,new BigDecimal(lmsSupplierId));
        System.out.println("--------------");
        productImportService.updateProductImport(lmsProductImport);
        System.out.println("++++++++++++");
        return "redirect:/centerProduct/queryProductImport";
    }

    @RequestMapping("/deleteProductImport/{id}")
    public String deleteProductImport(@PathVariable BigDecimal id) {
        productImportService.deleteProductImport(id);
        return "redirect:/centerProduct/queryProductImport";
    }
}
