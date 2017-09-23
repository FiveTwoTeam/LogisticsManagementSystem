import lms.mapper.*;
import lms.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestCustomer {
    @Autowired
    LmsAdminMapper lmsAdminMapper;

    @Autowired
    LmsCommodityReceiptMapper commodityReceiptMapper;

    @Test
    public void fun(){

        List<LmsAdmin> adminList=lmsAdminMapper.selectByExample(null);
        System.out.println(adminList);

    }

    @Test
    public void findLmsCommodityReceipt(){

        List<LmsCommodityReceipt> adminList=commodityReceiptMapper.findAllResultMap();
        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(adminList);
        for (LmsCommodityReceipt list:
                adminList) {
            System.out.println(list.toString());
        }
    }


    @Autowired
    LmsCenterproductExportMapper centerproductExportMapper;
    @Test
    public void findLmsCenterproductExportMapper(){

        List<LmsCenterproductExport>  list=centerproductExportMapper.findSupplierResultMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsCenterproductExport list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getLmsSuppliers().get(0).toString());
        }
    }

    @Autowired
    LmsCenterproductExportItemMapper centerproductExportItemMapper;
    @Test
    public void findLmsCenterproductExportItemMapper(){
        List<LmsCenterproductExportItem>  list=centerproductExportItemMapper.findProductExportResultMap();
        System.out.println(list);
        for (LmsCenterproductExportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getProductExportList().get(0).toString());
        }

        System.out.println("---------------------");
        List<LmsCenterproductExportItem>  list2=centerproductExportItemMapper.findProductResultMap();
        System.out.println(list);
        for (LmsCenterproductExportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getProductList().get(0).toString());
        }
    }

    @Autowired
    LmsCommodityReceiptItemMapper commodityReceiptItemMapper;
    @Test
    public void findLmsCommodityReceiptItemMapper(){
        List<LmsCommodityReceiptItem>  list=commodityReceiptItemMapper.findProductAndReceiptMap();
        System.out.println(list);
        for (LmsCommodityReceiptItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getCommodityReceiptList().get(0).toString());
            System.out.println(list1.getProductList().get(0).toString());
        }
    }


    @Autowired
    LmsDeliveryStaffMapper deliveryStaffMapper;
    @Test
    public void findLmsDeliveryStaffMapper(){

        List<LmsDeliveryStaff>  list=deliveryStaffMapper.findStationResultMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsDeliveryStaff list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getStationList().get(0).toString());
        }
    }


    @Autowired
    LmsOrderMapper orderMapper;
    @Test
    public void findLmsOrderMapper(){

        List<LmsOrder>  list=orderMapper.findCustomerAndAdminMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsOrder list1:
                list) {
            System.out.println(list1.toString());
        }
    }


    @Autowired
    LmsOrderBackMapper orderBackMapper;
    @Test
    public void findLmsOrderBackMapper(){

        List<LmsOrderBack>  list=orderBackMapper.findOrderDetailMap();
        System.out.println(list);
        for (LmsOrderBack list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getLmsorder().toString());
        }

    }

    @Autowired
    LmsOrderItemMapper orderItemMapper;
    @Test
    public void findLmsOrderItemMapper(){

        List<LmsOrderItem>  list=orderItemMapper.findorderAndProductMap();
        System.out.println(list);
        for (LmsOrderItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getProductList().get(0).toString());
        }

    }

    @Autowired
    LmsTaskMapper lmsTaskMapper;
    @Test
    public void findTask(){

        List<LmsTask>  list=lmsTaskMapper.findtaskMap();
        System.out.println(list);
        for (LmsTask list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getLmsOrderList().get(0).toString());
        }
    }

    @Autowired
    LmsStationRepetoryItemMapper lmsStationRepetoryItemMapper;
    @Test
    public void findLmsStationRepetoryItemMapper(){

        List<LmsStationRepetoryItem>  list=lmsStationRepetoryItemMapper.findproductAndStationRepetoryMap();
        System.out.println(list);
        for (LmsStationRepetoryItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getLmsStationRepetoryList().get(0).toString());
        }
    }

    @Autowired
    LmsStationRepetoryMapper lmsStationRepetoryMapper;
    @Test
    public void findLmsStationRepetoryMapper(){

        List<LmsStationRepetory>  list=lmsStationRepetoryMapper.findstationRepetoryResultMap();
        System.out.println(list);
        for (LmsStationRepetory list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getLmsAdminList().get(0).toString());
        }
    }


    @Autowired
    LmsSecondCategoryMapper lmsSecondCategoryMapper;
    @Test
    public void findLmsSecondCategoryMapper(){

        List<LmsSecondCategory>  list=lmsSecondCategoryMapper.findsecondCategoryMap();
        System.out.println(list);
        for (LmsSecondCategory list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getLmsFirstCategory().toString());
        }
    }

    @Autowired
    LmsOrderProductBackMapper orderProductBackMapper;
    @Test
    public void findLmsOrderProductBackMapper(){

        List<LmsOrderProductBack>  list=orderProductBackMapper.findorderAndProductMap();
        System.out.println(list);
        for (LmsOrderProductBack list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getProductList().get(0).toString());
        }
    }

    @Autowired
    LmsOrderProductExchangeMapper orderProductExchangeMapper;
    @Test
    public void findLmsOrderProductExchangeMapper(){

        List<LmsOrderProductExchange>  list=orderProductExchangeMapper.findorderAndProductMap();
        System.out.println(list);
        for (LmsOrderProductExchange list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getProductList().get(0).toString());
        }
    }


    @Autowired
    LmsProductMapper  productMapper;
    @Test
    public void findLmsProductMapper(){

        List<LmsProduct>  list=productMapper.findSecondCategoryAndSupplierMap();
        System.out.println(list);
        for (LmsProduct list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("-------");
            System.out.println(list1.getSupplierList().get(0).toString());
            System.out.println(list1.getLmsSecondCategory().toString());
        }
    }

    @Autowired
    LmsRepertoryMapper  lmsRepertoryMapper;
    @Test
    public void findLmsRepertoryMapper(){

        List<LmsRepertory>  list=lmsRepertoryMapper.findadminAndRepertoryResultMap();
        System.out.println("list: "+list);
        System.out.println("-------");
        System.out.println("each list:");
        for (LmsRepertory list1:
                list) {
            System.out.println(list1.toString());
           // System.out.println("");
            System.out.println(list1.getLmsAdminList().get(0).toString());
            System.out.println("-------");
        }
    }


    @Autowired
    LmsRepertoryInfoMapper  lmsRepertoryInfoMapper;
    @Test
    public void findLmsRepertoryInfoMapper(){

        List<LmsRepertoryInfo>  list=lmsRepertoryInfoMapper.findproductAndRepertoryMap();
        System.out.println("list: "+list);
        System.out.println("-------");
        System.out.println("each list:");
        for (LmsRepertoryInfo list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("property: "+list1.getLmsProduct().toString());
            System.out.println("-------");
        }
    }


    @Autowired
    LmsProductImportItemMapper  lmsProductImportItemMapper;
    @Test
    public void findLmsProductImportItemMapper(){

        List<LmsProductImportItem> list=lmsProductImportItemMapper.findproductAndProductImportMap();
        System.out.println("list: "+list);
        System.out.println("-------");
        System.out.println("each list:");
        for (LmsProductImportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("property: "+list1.getLmsProductImport().toString());
            System.out.println("-------");
        }
    }


    @Autowired
    LmsProductImportMapper  lmsProductImportMapper;
    @Test
    public void findLmsProductImportMapper(){

        List<LmsProductImport> list=lmsProductImportMapper.findproductImportResultMap();
        System.out.println("list: "+list);
        System.out.println("-------");
        System.out.println("each list:");
        for (LmsProductImport list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("property: "+list1.getLmsSupplierList().toString());
            System.out.println("-------");
        }
    }


    @Autowired
    LmsProductExportItemMapper  lmsProductExportItemMapper;
    @Test
    public void findLmsProductExportItemMapper(){

        List<LmsProductExportItem> list=lmsProductExportItemMapper.findproductAndProductExportMap();
        System.out.println("list: "+list);
        System.out.println("-------");
        System.out.println("each list:");
        for (LmsProductExportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println("property: "+list1.getLmsProductExport().toString());
            System.out.println("-------");
        }
    }
}
