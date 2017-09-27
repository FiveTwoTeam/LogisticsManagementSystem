/*
Navicat Oracle Data Transfer
Oracle Client Version : 11.2.0.1.0

Source Server         : localhost
Source Server Version : 110200
Source Host           : localhost:1521
Source Schema         : SCOTT

Target Server Type    : ORACLE
Target Server Version : 110200
File Encoding         : 65001

Date: 2017-09-21 13:53:52
*/


-- ----------------------------
-- Table structure for LMS_REPERTORY_INFO
-- ----------------------------
DROP TABLE "SCOTT"."LMS_REPERTORY_INFO";
CREATE TABLE "SCOTT"."LMS_REPERTORY_INFO" (
"id" NUMBER(20) NOT NULL ,
"max" NUMBER(20) NULL ,
"guard" NUMBER(20) NULL ,
"LMS_Repertory_id" NUMBER(20) NULL ,
"LMS_Product_id" NUMBER NULL ,
"count" NUMBER NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SCOTT"."LMS_REPERTORY_INFO"."max" IS '最高值';
COMMENT ON COLUMN "SCOTT"."LMS_REPERTORY_INFO"."guard" IS '预警值';

-- ----------------------------
-- Records of LMS_REPERTORY_INFO
-- ----------------------------
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('1501', '100', '80', '1401', '701', '90');
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('1502', '200', '150', '1401', '702', '180');
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('1503', '300', '250', '1401', '703', '170');
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('4', '500', '400', '7', '4', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('5', '80', '70', '6', '5', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('6', '1000', '900', '5', '6', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('7', '1500', '1400', '4', '7', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('8', '400', '450', '3', '8', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('9', '600', '550', '2', '9', null);
INSERT INTO "SCOTT"."LMS_REPERTORY_INFO" VALUES ('10', '300', '250', '1', '10', null);

-- ----------------------------
-- Indexes structure for table LMS_REPERTORY_INFO
-- ----------------------------

-- ----------------------------
-- Checks structure for table LMS_REPERTORY_INFO
-- ----------------------------
ALTER TABLE "SCOTT"."LMS_REPERTORY_INFO" ADD CHECK ("id" IS NOT NULL);
ALTER TABLE "SCOTT"."LMS_REPERTORY_INFO" ADD CHECK ("id" IS NOT NULL);
ALTER TABLE "SCOTT"."LMS_REPERTORY_INFO" ADD CHECK ("id" IS NOT NULL);
ALTER TABLE "SCOTT"."LMS_REPERTORY_INFO" ADD CHECK ("id" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table LMS_REPERTORY_INFO
-- ----------------------------
ALTER TABLE "SCOTT"."LMS_REPERTORY_INFO" ADD PRIMARY KEY ("id");
