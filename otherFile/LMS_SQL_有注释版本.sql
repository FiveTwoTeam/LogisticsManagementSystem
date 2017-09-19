

--1.LMS_Product_Import(商品入库)
DROP TABLE LMS_Product_Import;
CREATE TABLE LMS_Product_Import (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"import_no" NUMBER(20) NULL ,	--入库单号
"datetime" DATE NULL ,
"LMS_Supplier_id" NUMBER(20) NULL 
);
COMMENT ON TABLE LMS_Product_Import IS '商品入库';
COMMENT ON COLUMN LMS_Product_Import."import_no" IS '入库单号';


--2.LMS_Product_Import_Item(入库商品)
DROP TABLE LMS_Product_Import_Item;
CREATE TABLE LMS_Product_Import_Item (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"expect_count" NUMBER(20) NULL ,		--预期数量
"fact_count" NUMBER(20) NULL,			--实际数量
"description" VARCHAR2(500 BYTE) NULL ,	--商品描述
"LMS_Product_id" NUMBER(20) NULL ,
"LMS_Product_Import_id" NUMBER(20) NULL ,
"LMS_Product_Import_Itemcol" VARCHAR2(255 BYTE) NULL
);
COMMENT ON COLUMN LMS_Product_Import_Item."expect_count" IS '预期数量';
COMMENT ON COLUMN LMS_Product_Import_Item."fact_count" IS '实际数量';
COMMENT ON COLUMN LMS_Product_Import_Item."description" IS '商品描述';


--3.LMS_Receipt(回执信息)
DROP TABLE LMS_Receipt;
CREATE TABLE LMS_Receipt (
"id" NUMBER PRIMARY KEY NOT NULL ,
"total_money" NUMBER(10,2) NULL ,
"gain_date" DATE NULL ,					--领取日期
"miss_date" DATE NULL ,					--丢失日期
"gain_man" VARCHAR2(255 BYTE) NULL ,	--领用人
"miss_man" VARCHAR2(255 BYTE) NULL ,	--遗失人姓名
"order_number" NUMBER(20) NULL ,
"state" NUMBER(1) NULL				--发票状态 0分站已领用 1客户已领用 2已作废
);
COMMENT ON TABLE LMS_Receipt IS '回执信息表';
COMMENT ON COLUMN LMS_Receipt."gain_date" IS '领取日期';
COMMENT ON COLUMN LMS_Receipt."miss_date" IS '丢失日期';
COMMENT ON COLUMN LMS_Receipt."gain_man" IS '领用人';
COMMENT ON COLUMN LMS_Receipt."miss_man" IS '遗失人姓名';
COMMENT ON COLUMN LMS_Receipt."state" IS '发票状态
0分站已领用
1客户已领用
2已作废';



--4.LMS_CenterProduct_Export_Item(中心库房商品)
DROP TABLE LMS_CenterProduct_Export_Item;
CREATE TABLE LMS_CenterProduct_Export_Item (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"count" NUMBER(20) NULL ,
"description" VARCHAR2(255 BYTE) NULL ,
"LMS_Product_Export_id" NUMBER(20) NULL ,
"LMS_Product_id" NUMBER(20) NULL 
);

--5.LMS_Product_Export_Item(商品出库)
DROP TABLE LMS_Product_Export_Item;
CREATE TABLE LMS_Product_Export_Item (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"count" NUMBER(20,2) NULL ,
"price" NUMBER(20,2) NULL ,
"subprice" NUMBER(20,2) NULL ,
"LMS_Product_id" NUMBER(20) NULL ,
"LMS_Product_Export_id" NUMBER(20) NULL 
);

--6.LMS_Repertory(中心库房)
DROP TABLE LMS_Repertory;
CREATE TABLE LMS_Repertory (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"name" VARCHAR2(255 BYTE) NULL ,
"address" VARCHAR2(255 BYTE) NULL ,
"LMS_Admin_id" NUMBER(20) NULL 
);
COMMENT ON TABLE LMS_Repertory IS '中心库房';


--7.LMS_Repertory_Info(库房)
DROP TABLE LMS_Repertory_Info;
CREATE TABLE LMS_Repertory_Info (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,
"max" NUMBER(20) NULL ,		--最高值
"guard" NUMBER(20) NULL ,	--预警值
"LMS_Repertory_id" NUMBER(20) NULL ,
"LMS_Product_id" NUMBER NULL 
);
COMMENT ON COLUMN LMS_Repertory_Info."max" IS '最高值';
COMMENT ON COLUMN LMS_Repertory_Info."guard" IS '预警值';


--8.LMS_Order(订单)
DROP TABLE LMS_Order;
CREATE TABLE LMS_Order (
"id" NUMBER NOT NULL ,						--订单ID
"total_price" NUMBER(9,2) NULL ,			--总价
"order_number" NUMBER NULL ,				--订单号码
"description" VARCHAR2(255 BYTE) NULL ,		--描述
"type" NUMBER NULL ,						--订单类型(0新订 1异地收费 2退订 3换货 4退货)--
"address" VARCHAR2(100 BYTE) NULL ,			--收货人地址
"LMS_Customer_id" NUMBER NULL ,				--客户ID
"payer" VARCHAR2(45 BYTE) NULL ,			--付款人
"payer_address" VARCHAR2(100 BYTE) NULL ,	--付款人地址
"payer_phone" NUMBER NULL ,					--付款人联系电话
"payer_post_code" NUMBER NULL ,				--付款人邮编
"datetime" DATE NULL ,						--付款时间
"LMS_Admin_id" NUMBER NULL 					--客服ID
);

--9.LMS_Task(任务单)
DROP TABLE LMS_Task;
CREATE TABLE LMS_Task (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"status" NUMBER(1) NULL ,			--任务状态 0 完成 ，1 部分完成 ，2 失败
"datetime" DATE NULL ,
"type" NUMBER(1) NULL ,				--任务类型 1已收款 ，2 货到付款 ，3 送货 ，4 退货，5 换货
"LMS_Order_id" NUMBER(10) NULL ,
"LMS_Customer_id" NUMBER(10) NULL ,
"LMS_Station_id" NUMBER(10) NULL ,
"LMS_Station_Repetory_id" NUMBER(10) NULL ,
"LMS_Delivery_Staff__id" NUMBER(10)  NULL ,
"satisfy" VARCHAR2(45 BYTE) NULL ,	--满意度
"description" VARCHAR2(255 BYTE) NULL 
);



--10.LMS_Order_Product_Back(退货订单表)
DROP TABLE LMS_Order_Product_Back;
CREATE TABLE LMS_Order_Product_Back (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,	--退货订单ID
"reason" VARCHAR2(255 BYTE) NULL ,		--退货原因
"datetime" DATE NULL ,					--退货日期
"count" NUMBER NULL ,					--数量
"LMS_Order_id" NUMBER NULL ,			--订单ID
"LMS_Product_id" NUMBER NULL 			--商品ID
);
COMMENT ON COLUMN LMS_Order_Product_Back."id" IS '退货单ID';
COMMENT ON COLUMN LMS_Order_Product_Back."reason" IS '退货原因';
COMMENT ON COLUMN LMS_Order_Product_Back."datetime" IS '退货日期';
COMMENT ON COLUMN LMS_Order_Product_Back."count" IS '退货数量';
COMMENT ON COLUMN LMS_Order_Product_Back."LMS_Order_id" IS '订单ID';
COMMENT ON COLUMN LMS_Order_Product_Back."LMS_Product_id" IS '商品ID';


--11.LMS_Order_Product_Exchange(换货单表)
DROP TABLE LMS_Order_Product_Exchange;
CREATE TABLE LMS_Order_Product_Exchange (
"id" NUMBER PRIMARY KEY NOT NULL ,		--换货单ID
"reason" VARCHAR2(255 BYTE) NULL ,	 	--换货原因
"datetime" DATE NULL ,					--换货日期
"count" NUMBER NULL ,					--数量
"LMS_Order_id" NUMBER NULL ,			--订单ID
"LMS_Product_id" NUMBER NULL			--商品ID
);
COMMENT ON COLUMN LMS_Order_Product_Exchange."id" IS '换货订单ID';
COMMENT ON COLUMN LMS_Order_Product_Exchange."reason" IS '换货原因';
COMMENT ON COLUMN LMS_Order_Product_Exchange."datetime" IS '换货日期';
COMMENT ON COLUMN LMS_Order_Product_Exchange."count" IS '数量';
COMMENT ON COLUMN LMS_Order_Product_Exchange."LMS_Order_id" IS '订单ID';
COMMENT ON COLUMN LMS_Order_Product_Exchange."LMS_Product_id" IS '商品ID';




--12.LMS_Product(商品表)
DROP TABLE LMS_Product;
CREATE TABLE LMS_Product (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,		--商品ID
"name" VARCHAR2(40 BYTE) NULL ,				--商品名称
"price" NUMBER(10,2) NULL ,					--单价
"unit" VARCHAR2(10 BYTE) NULL ,				--计量单位
"LMS_Second_Category_id" NUMBER NULL , 		--二级分类ID
"discount" NUMBER(5,2) NULL , 				--折扣
"cost" NUMBER(10,2) NULL , 					--成本
"size" VARCHAR2(45 BYTE) NULL ,				 --型号
"LMS_Supplier_id" NUMBER NULL ,				--供应商ID
"quality_period" VARCHAR2(45 BYTE) NULL ,	--质量
"if_back" NUMBER NULL , 					--是否退货
"if_exchange" NUMBER NULL ,					--是否换货
"description" VARCHAR2(255 BYTE) NULL		--描述
);

COMMENT ON COLUMN LMS_Product."id" IS '商品ID';
COMMENT ON COLUMN LMS_Product."name" IS '商品名称';
COMMENT ON COLUMN LMS_Product."price" IS '商品单价';
COMMENT ON COLUMN LMS_Product."unit" IS '计量单位';
COMMENT ON COLUMN LMS_Product."LMS_Second_Category_id" IS '商品二级分类ID';
COMMENT ON COLUMN LMS_Product."discount" IS '折扣';
COMMENT ON COLUMN LMS_Product."cost" IS '成本';
COMMENT ON COLUMN LMS_Product."size" IS '数量';
COMMENT ON COLUMN LMS_Product."LMS_Supplier_id" IS '供应商id';
COMMENT ON COLUMN LMS_Product."quality_period" IS '质量';
COMMENT ON COLUMN LMS_Product."if_back" IS '是否退货';
COMMENT ON COLUMN LMS_Product."if_exchange" IS '是否换货';
COMMENT ON COLUMN LMS_Product."description" IS '商品描述';


--13.LMS_Product_Export(库房出库表)
DROP TABLE LMS_Product_Export;
CREATE TABLE LMS_Product_Export (
"id" NUMBER PRIMARY KEY NOT NULL ,			--库房出库表ID
"transport" VARCHAR2(45 BYTE) NULL ,		--运输公司
"description" VARCHAR2(255 BYTE) NULL , 	--描述
"total_count" NUMBER NULL , 				--总数量
"total_price" NUMBER(9,2) NULL ,			--总价格
"datetime" DATE NULL  						--出库日期
);



--14.LMS_CenterProduct_Export(中心库房退货表)
DROP TABLE LMS_CenterProduct_Export;
CREATE TABLE LMS_CenterProduct_Export (
"id" NUMBER PRIMARY KEY NOT NULL ,	--中心库房退货表ID
"export_no" NUMBER NULL ,			--库房号
"datetime" DATE NULL ,				--时间
"LMS_Supplier_id" NUMBER(10) NULL	--供应商ID
);


--15.LMS_Second_Category(商品二级分类信息表)
DROP TABLE LMS_Second_Category;
CREATE TABLE LMS_Second_Category (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"name" VARCHAR2(45 BYTE) NULL ,
"LMS_First_Category_id" NUMBER(10) NULL ,--商品一级分类id
"description" VARCHAR2(200 BYTE) NULL
);


--16.LMS_Station(分站表)
DROP TABLE LMS_Station;
CREATE TABLE LMS_Station (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"name" VARCHAR2(45 BYTE) NULL ,
"address" VARCHAR2(100 BYTE) NULL ,
"phone" NUMBER(20) NULL ,
"LMS_Admin_id"     NUMBER(10) NULL --分站管理员id  后来添加的，workbench中没有************
);




--17.LMS_Station_Repetory(分站库房表)
DROP TABLE LMS_Station_Repetory;
CREATE TABLE LMS_Station_Repetory (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"name" VARCHAR2(45 BYTE) NULL ,
"address" VARCHAR2(45 BYTE) NULL ,
"phone"         NUMBER(20), 		 -- 后来添加的，workbench中没有
"LMS_Admin_id"  NUMBER(10)  NULL 	 --分站库房管理员id   后来添加的，workbench中没有**********
);


--18.LMS_Station_Repetory_Item(分站库房条目表)
--分站库房条目表:
--主要存放分站库房存放最大值、预警值；
--同时，可连接商品表定位商品属于哪一个库房
DROP TABLE LMS_Station_Repetory_Item;
CREATE TABLE LMS_Station_Repetory_Item (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"count" NUMBER(10) NULL ,
"max" NUMBER(10) NULL ,	 							--最大值
"guard" NUMBER(10) NULL ,							--预警值
"status" NUMBER(1) NULL , 							--商品状态  0 可分配 ,1已分配 ,2 退回
"LMS_Product_id" NUMBER(10)   NULL 	--商品id
);



--19.LMS_Supplier(供应商表)
DROP TABLE LMS_Supplier;
CREATE TABLE LMS_Supplier (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,
"name" VARCHAR2(45 BYTE) NULL ,
"address" VARCHAR2(100 BYTE) NULL ,
"contact_man" VARCHAR2(45 BYTE) NULL ,	--联系人姓名
"phone" NUMBER(20) NULL ,
"bank" VARCHAR2(45 BYTE) NULL ,			--开户行
"bank_account" NUMBER(20) NULL ,		--银行账户
"fax" VARCHAR2(50 BYTE) NULL ,			--传真
"post_code" NUMBER(10) NULL ,			--邮编
"legal_man" VARCHAR2(45 BYTE) NULL ,	--法人
"description" VARCHAR2(500 BYTE) NULL 
);


--20.LMS_Order_Back(退订单表)
DROP TABLE LMS_Order_Back;
CREATE TABLE LMS_Order_Back (
"id" NUMBER(20) PRIMARY KEY NOT NULL ,	--退订单ID
"reason" VARCHAR2(255 BYTE) NULL ,		--退订原因
"datetime" DATE NULL ,					--退订日期
"LMS_Order_id" NUMBER(20) NULL 			--订单ID
);
COMMENT ON COLUMN LMS_Order_Back."id" IS '库房退货ID';
COMMENT ON COLUMN LMS_Order_Back."reason" IS '退货原因';
COMMENT ON COLUMN LMS_Order_Back."datetime" IS '退货时间';
COMMENT ON COLUMN LMS_Order_Back."LMS_Order_id" IS '订单ID';


--21.LMS_Order_Item(订单项目单表)
DROP TABLE LMS_Order_Item;
CREATE TABLE LMS_Order_Item (
"id" NUMBER(10) PRIMARY KEY NOT NULL ,			--订单项目ID
"LMS_Order_id" NUMBER NULL ,					--订单ID
"LMS_Product_id" NUMBER NULL ,					--商品ID
"count" NUMBER NULL ,							--数量
"price" NUMBER(7,2) NULL ,						--单价
"discount" NUMBER(3,2) NULL ,					--折扣
"subprice" NUMBER(9,2) NULL ,					--小计
"product_description" VARCHAR2(200 BYTE) NULL 	--商品描述
);
COMMENT ON COLUMN LMS_Order_Item."id" IS '订单项目表ID';
COMMENT ON COLUMN LMS_Order_Item."LMS_Order_id" IS '订单ID';
COMMENT ON COLUMN LMS_Order_Item."LMS_Product_id" IS '商品ID';
COMMENT ON COLUMN LMS_Order_Item."count" IS '数量';
COMMENT ON COLUMN LMS_Order_Item."price" IS '单价';
COMMENT ON COLUMN LMS_Order_Item."discount" IS '折扣';
COMMENT ON COLUMN LMS_Order_Item."subprice" IS '小计';
COMMENT ON COLUMN LMS_Order_Item."product_description" IS '商品信息描述';


--22.LMS_Commodity_Receipt (商品收据）
DROP TABLE LMC_COMMODITY_RECEIPT;
CREATE TABLE LMC_COMMODITY_RECEIPT (
"ID" NUMBER(20) PRIMARY KEY NOT NULL ,
"TASK_NUMBER" NUMBER(10) NULL ,			--任务号
"CUNTOMER_ID" NUMBER(10) NULL ,
"ADDRESS" VARCHAR2(100 BYTE) NULL ,		--收件人地址
"DATETIME" DATE NULL ,					--签收时间
"COMMAND" VARCHAR2(100 BYTE) NULL ,		--送货要求
"IF_RECEIPT" NUMBER(10) NULL ,			--是否签收
"STATION_ID" NUMBER(10) NULL ,			--分站编号
"TOTAL_PRICE" NUMBER(9,2) NULL ,		--总价
"TYPE" NUMBER(10) NULL , 				--任务类型
"DESCRIPTION" VARCHAR2(500 BYTE) NULL ,	--描述
"FEEDBACK" VARCHAR2(200 BYTE) NULL ,	--客户反馈
"SIGNATURE" VARCHAR2(50 BYTE) NULL 		--签名
);


--23.LMS_Admin(管理员表）
DROP TABLE LMS_ADMIN;
CREATE TABLE LMS_ADMIN (
"ID" NUMBER(10) PRIMARY KEY NOT NULL ,
"USERNAME" VARCHAR2(20 BYTE) NULL ,
"PASSWORD" VARCHAR2(20 BYTE) NULL ,
"MAIL" VARCHAR2(20 BYTE) NULL ,
"PHONE" NUMBER(20) NULL ,
--0超级管理员,1客服,2调度中心管理员,
--3分站,4中心库房,5分站库房,6配送中心,7财务中心
"RIGHT" NUMBER(10) DEFAULT 1  NULL 
);


--24.LMS_Commodity_Receipt_Item（商品收据细目）
DROP TABLE LMS_COMMODITY_RECEIPT_ITEM;
CREATE TABLE LMS_COMMODITY_RECEIPT_ITEM (
"ID" NUMBER(10) PRIMARY KEY NOT NULL ,
"COUNT" NUMBER(10) NULL ,					--数量
"PRICE" NUMBER(10) NULL ,
"SUBPRICE" NUMBER(10) NULL ,
"COMMODITY_RECEIPT_ID" NUMBER(10) NULL ,	--商品收据编号
"PRODUCT_ID" NUMBER(10) NULL 
);



--25.LMS_Customer(客户信息表)
DROP TABLE LMS_CUSTOMER;
CREATE TABLE LMS_CUSTOMER (
"ID" NUMBER(10) PRIMARY KEY NOT NULL ,
"NAME" VARCHAR2(20 BYTE) NULL ,
"IDENTITY_ID" VARCHAR2(20 BYTE) NULL ,
"WORK_UNIT" VARCHAR2(20 BYTE) NULL ,	--工作单位
"PHONE_EXT" VARCHAR2(20 BYTE) NULL ,	--座机
"MOBILE_PHONE" VARCHAR2(20 BYTE) NULL ,	--手机
"ADDRESS" VARCHAR2(50 BYTE) NULL ,		--家庭地址
"POST_CODE" NUMBER(10) NULL ,			--邮编
"MAIL" VARCHAR2(50 BYTE) NULL ,			--邮件
"STATUS" NUMBER(10) NULL 				--状态（1正常，0已删除）
);



--26.LMS_Delivery_Staff（配送员表）
DROP TABLE LMS_DELIVERY_STAFF;
CREATE TABLE LMS_DELIVERY_STAFF (
"ID" NUMBER(10) PRIMARY KEY NOT NULL ,
"NAME" VARCHAR2(20 BYTE) NULL ,
"PHONE" NUMBER(20) NULL ,
"STATION_ID" NUMBER(10) NULL 	--分站编号
);


--27.LMS_First_Category(一级菜单）
DROP TABLE LMS_FIRST_CATEGORY;
CREATE TABLE LMS_FIRST_CATEGORY (
"ID" NUMBER(10) NULL ,
"NAME" VARCHAR2(20 BYTE) NULL ,
"DESCRIPTION" VARCHAR2(200 BYTE) NULL 	--描述
);
