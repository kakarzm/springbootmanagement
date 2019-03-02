/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.25 : Database - vhr_relforknowledge
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `adjustsalary` */

DROP TABLE IF EXISTS `adjustsalary`;

CREATE TABLE `adjustsalary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `asDate` date DEFAULT NULL COMMENT '调薪日期',
  `beforeSalary` int(11) DEFAULT NULL COMMENT '调前薪资',
  `afterSalary` int(11) DEFAULT NULL COMMENT '调后薪资',
  `reason` varchar(255) DEFAULT NULL COMMENT '调薪原因',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pid` (`eid`),
  CONSTRAINT `adjustsalary_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adjustsalary` */

/*Table structure for table `appraise` */

DROP TABLE IF EXISTS `appraise`;

CREATE TABLE `appraise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `appDate` date DEFAULT NULL COMMENT '考评日期',
  `appResult` varchar(32) DEFAULT NULL COMMENT '考评结果',
  `appContent` varchar(255) DEFAULT NULL COMMENT '考评内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pid` (`eid`),
  CONSTRAINT `appraise_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `appraise` */

/*Table structure for table `college_information` */

DROP TABLE IF EXISTS `college_information`;

CREATE TABLE `college_information` (
  `id` varchar(50) NOT NULL,
  `title` varchar(30) DEFAULT NULL,
  `collegeType` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `createtime` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `college_information` */

insert  into `college_information`(`id`,`title`,`collegeType`,`Address`,`status`,`createtime`) values ('2019030217145488273988','山东大学','本科','山大路','normal','2019-03-01 17:15:00.000000');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '部门名称',
  `parentId` int(11) DEFAULT NULL,
  `depPath` varchar(255) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `isParent` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`name`,`parentId`,`depPath`,`enabled`,`isParent`) values (1,'股东会',-1,'.1',1,1),(4,'董事会',1,'.1.4',1,1),(5,'总办',4,'.1.4.5',1,1),(8,'财务部',5,'.1.4.5.8',1,0),(78,'市场部',5,'.1.4.5.78',1,1),(81,'华北市场部',78,'.1.4.5.78.81',1,1),(82,'华南市场部',78,'.1.4.5.78.82',1,0),(85,'石家庄市场部',81,'.1.4.5.78.81.85',1,0),(86,'西北市场部',78,'.1.4.5.78.86',1,1),(87,'西安市场',86,'.1.4.5.78.86.87',1,1),(89,'莲湖区市场',87,'.1.4.5.78.86.87.89',1,0),(91,'技术部',5,'.1.4.5.91',1,0),(92,'运维部',5,'.1.4.5.92',1,0);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `name` varchar(10) DEFAULT NULL COMMENT '员工姓名',
  `gender` char(4) DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `idCard` char(18) DEFAULT NULL COMMENT '身份证号',
  `wedlock` enum('已婚','未婚','离异') DEFAULT NULL COMMENT '婚姻状况',
  `nationId` int(8) DEFAULT NULL COMMENT '民族',
  `nativePlace` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `politicId` int(8) DEFAULT NULL COMMENT '政治面貌',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(11) DEFAULT NULL COMMENT '电话号码',
  `address` varchar(64) DEFAULT NULL COMMENT '联系地址',
  `departmentId` int(11) DEFAULT NULL COMMENT '所属部门',
  `jobLevelId` int(11) DEFAULT NULL COMMENT '职称ID',
  `posId` int(11) DEFAULT NULL COMMENT '职位ID',
  `engageForm` varchar(8) DEFAULT NULL COMMENT '聘用形式',
  `tiptopDegree` enum('博士','硕士','本科','大专','高中','初中','小学','其他') DEFAULT NULL COMMENT '最高学历',
  `specialty` varchar(32) DEFAULT NULL COMMENT '所属专业',
  `school` varchar(32) DEFAULT NULL COMMENT '毕业院校',
  `beginDate` date DEFAULT NULL COMMENT '入职日期',
  `workState` enum('在职','离职') DEFAULT '在职' COMMENT '在职状态',
  `workID` char(8) DEFAULT NULL COMMENT '工号',
  `contractTerm` double DEFAULT NULL COMMENT '合同期限',
  `conversionTime` date DEFAULT NULL COMMENT '转正日期',
  `notWorkDate` date DEFAULT NULL COMMENT '离职日期',
  `beginContract` date DEFAULT NULL COMMENT '合同起始日期',
  `endContract` date DEFAULT NULL COMMENT '合同终止日期',
  `workAge` int(11) DEFAULT NULL COMMENT '工龄',
  PRIMARY KEY (`id`),
  KEY `departmentId` (`departmentId`),
  KEY `jobId` (`jobLevelId`),
  KEY `dutyId` (`posId`),
  KEY `nationId` (`nationId`),
  KEY `politicId` (`politicId`),
  KEY `workID_key` (`workID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`jobLevelId`) REFERENCES `joblevel` (`id`),
  CONSTRAINT `employee_ibfk_3` FOREIGN KEY (`posId`) REFERENCES `position` (`id`),
  CONSTRAINT `employee_ibfk_4` FOREIGN KEY (`nationId`) REFERENCES `nation` (`id`),
  CONSTRAINT `employee_ibfk_5` FOREIGN KEY (`politicId`) REFERENCES `politicsstatus` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`name`,`gender`,`birthday`,`idCard`,`wedlock`,`nationId`,`nativePlace`,`politicId`,`email`,`phone`,`address`,`departmentId`,`jobLevelId`,`posId`,`engageForm`,`tiptopDegree`,`specialty`,`school`,`beginDate`,`workState`,`workID`,`contractTerm`,`conversionTime`,`notWorkDate`,`beginContract`,`endContract`,`workAge`) values (1,'江南一点雨','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000001',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(2,'陈静','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000002',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(3,'赵琳浩','男','1993-03-04','610122199303041456','未婚',1,'陕西',3,'zhao@qq.com','15698887795','陕西省西安市莲湖区',91,12,33,'劳动合同','博士','电子工程','哈尔滨理工大学','2018-01-01','在职','00000003',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(4,'鹿存亮','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000004',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(5,'姚森','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000005',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(6,'云星','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000006',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(7,'贾旭明','男','1993-11-11','610122199311111234','已婚',1,'广东广州',4,'jiaxuming@qq.com','15644441234','广东省广州市天河区冼村路',78,15,33,'劳务合同','初中','通信工程','西北大学','2018-01-01','在职','00000007',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(8,'张黎明','男','1991-02-01','610144199102014569','已婚',1,'广东',6,'zhangliming@qq.com','18979994478','广东珠海',91,15,33,'劳动合同','高中','考古','清华大学','2018-01-01','在职','00000008',7,'2018-04-01',NULL,'2018-01-01','2025-01-30',NULL),(9,'薛磊','男','1992-07-01','610144199207017895','已婚',1,'陕西西安',13,'xuelei@qq.com','15648887741','西安市雁塔区',92,14,34,'劳动合同','初中','无','华胥中学','2018-01-01','在职','00000009',6,'2018-04-01',NULL,'2018-01-01','2024-01-17',NULL),(10,'张洁','女','1990-10-09','420177199010093652','未婚',1,'海南',5,'zhangjie@qq.com','13695557742','海口市美兰区',92,16,34,'劳动合同','高中','无','海南侨中','2018-01-01','在职','00000010',1,'2018-01-31',NULL,'2018-01-01','2019-01-01',NULL),(11,'江南一点雨2','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000011',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(12,'陈静2','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000012',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(13,'赵琳浩2','男','1993-03-04','610122199303041456','未婚',1,'陕西',3,'zhao@qq.com','15698887795','陕西省西安市莲湖区',91,12,33,'劳动合同','博士','电子工程','哈尔滨理工大学','2018-01-01','在职','00000013',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(14,'鹿存亮2','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000014',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(15,'姚森2','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000015',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(16,'云星2','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000016',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(17,'贾旭明2','男','1993-11-11','610122199311111234','已婚',1,'广东广州',4,'jiaxuming@qq.com','15644441234','广东省广州市天河区冼村路',78,15,33,'劳务合同','初中','通信工程','西北大学','2018-01-01','在职','00000017',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(18,'王一亭','男','1991-02-01','610144199102014569','已婚',1,'广东',6,'zhangliming@qq.com','18979994478','广东珠海',91,15,33,'劳动合同','高中','考古','清华大学','2018-01-01','在职','00000018',7,'2018-04-01',NULL,'2018-01-01','2025-01-30',NULL),(19,'薛磊2','男','1992-07-01','610144199207017895','已婚',1,'陕西西安',13,'xuelei@qq.com','15648887741','西安市雁塔区',92,14,34,'劳动合同','初中','无','华胥中学','2018-01-01','在职','00000019',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(20,'张洁2','女','1990-10-09','420177199010093652','未婚',1,'海南',5,'zhangjie@qq.com','13695557742','海口市美兰区',92,16,34,'劳动合同','高中','无','海南侨中','2018-01-01','在职','00000020',1,'2018-01-31',NULL,'2018-01-01','2019-01-01',NULL),(21,'江南一点雨3','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000021',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(22,'陈静3','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000022',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(24,'鹿存亮3','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000024',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(25,'姚森3','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000025',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(26,'云星3','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000026',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(27,'贾旭明3','男','1993-11-11','610122199311111234','已婚',1,'广东广州',4,'jiaxuming@qq.com','15644441234','广东省广州市天河区冼村路',78,15,33,'劳务合同','初中','通信工程','西北大学','2018-01-01','在职','00000027',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(28,'张黎明3','男','1991-02-01','610144199102014569','已婚',1,'广东',6,'zhangliming@qq.com','18979994478','广东珠海',91,15,33,'劳动合同','高中','考古','清华大学','2018-01-01','在职','00000028',7,'2018-04-01',NULL,'2018-01-01','2025-01-30',NULL),(29,'薛磊3','男','1992-07-01','610144199207017895','已婚',1,'陕西西安',13,'xuelei@qq.com','15648887741','西安市雁塔区',92,14,34,'劳动合同','初中','无','华胥中学','2018-01-01','在职','00000029',6,'2018-04-01',NULL,'2018-01-01','2024-01-17',NULL),(31,'江南一点雨4','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000031',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(32,'陈静4','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000032',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(33,'赵琳浩4','男','1993-03-04','610122199303041456','未婚',1,'陕西',3,'zhao@qq.com','15698887795','陕西省西安市莲湖区',91,12,33,'劳动合同','博士','电子工程','哈尔滨理工大学','2018-01-01','在职','00000033',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(34,'鹿存亮4','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000034',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(35,'姚森4','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000035',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(36,'云星4','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000036',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(37,'贾旭明4','男','1993-11-11','610122199311111234','已婚',1,'广东广州',4,'jiaxuming@qq.com','15644441234','广东省广州市天河区冼村路',78,15,33,'劳务合同','初中','通信工程','西北大学','2018-01-01','在职','00000037',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(38,'张黎明2','男','1991-02-01','610144199102014569','已婚',1,'广东',6,'zhangliming@qq.com','18979994478','广东珠海',91,15,33,'劳动合同','高中','考古','清华大学','2018-01-01','在职','00000038',7,'2018-04-01',NULL,'2018-01-01','2025-01-30',NULL),(39,'薛磊4','男','1992-07-01','610144199207017895','已婚',1,'陕西西安',13,'xuelei@qq.com','15648887741','西安市雁塔区',92,14,34,'劳动合同','初中','无','华胥中学','2018-01-01','在职','00000039',6,'2018-04-01',NULL,'2018-01-01','2024-01-17',NULL),(40,'张洁4','女','1990-10-09','420177199010093652','未婚',1,'海南',5,'zhangjie@qq.com','13695557742','海口市美兰区',92,16,34,'劳动合同','高中','无','海南侨中','2018-01-01','在职','00000040',1,'2018-01-31',NULL,'2018-01-01','2019-01-01',NULL),(41,'江南一点雨5','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000041',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(42,'陈静5','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000042',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(43,'赵琳浩5','男','1993-03-04','610122199303041456','未婚',1,'陕西',3,'zhao@qq.com','15698887795','陕西省西安市莲湖区',91,12,33,'劳动合同','博士','电子工程','哈尔滨理工大学','2018-01-01','在职','00000043',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(44,'鹿存亮5','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000044',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(45,'姚森5','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000045',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(46,'云星5','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000046',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(47,'贾旭明5','男','1993-11-11','610122199311111234','已婚',1,'广东广州',4,'jiaxuming@qq.com','15644441234','广东省广州市天河区冼村路',78,15,33,'劳务合同','初中','通信工程','西北大学','2018-01-01','在职','00000047',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(48,'张黎明5','男','1991-02-01','610144199102014569','已婚',1,'广东',6,'zhangliming@qq.com','18979994478','广东珠海',91,15,33,'劳动合同','高中','考古','清华大学','2018-01-01','在职','00000048',7,'2018-04-01',NULL,'2018-01-01','2025-01-30',NULL),(49,'薛磊5','男','1992-07-01','610144199207017895','已婚',1,'陕西西安',13,'xuelei@qq.com','15648887741','西安市雁塔区',92,14,34,'劳动合同','初中','无','华胥中学','2018-01-01','在职','00000049',6,'2018-04-01',NULL,'2018-01-01','2024-01-17',NULL),(50,'张洁5','女','1990-10-09','420177199010093652','未婚',1,'海南',5,'zhangjie@qq.com','13695557742','海口市美兰区',92,16,34,'劳动合同','高中','无','海南侨中','2018-01-01','在职','00000050',1,'2018-01-31',NULL,'2018-01-01','2019-01-01',NULL),(51,'江南一点雨6','男','1990-01-01','610122199001011256','已婚',1,'陕西',13,'laowang@qq.com','18565558897','深圳市南山区',8,9,29,'劳动合同','本科','信息管理与信息系统','深圳大学','2018-01-01','在职','00000051',1,'2018-04-01',NULL,'2018-01-01','2019-01-01',NULL),(52,'陈静6','女','1989-02-01','421288198902011234','已婚',1,'海南',1,'chenjing@qq.com','18795556693','海南省海口市美兰区',82,12,30,'劳动合同','高中','市场营销','武汉大学','2015-06-09','在职','00000052',3,'2015-09-10',NULL,'2015-06-09','2018-06-08',NULL),(53,'赵琳浩6','男','1993-03-04','610122199303041456','未婚',1,'陕西',3,'zhao@qq.com','15698887795','陕西省西安市莲湖区',91,12,33,'劳动合同','博士','电子工程','哈尔滨理工大学','2018-01-01','在职','00000053',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(54,'鹿存亮6','男','1990-01-03','610122199001031456','已婚',1,'陕西',3,'zhao@qq.com','15612347795','陕西省西安市莲湖区',92,12,34,'劳动合同','高中','电子工程','哈尔滨理工大学','2018-01-01','在职','00000054',3.5,'2018-04-01',NULL,'2018-01-01','2021-07-14',NULL),(55,'姚森6','男','1991-02-05','610122199102058952','已婚',1,'河南',3,'yaosen@qq.com','14785559936','河南洛阳人民大道58号',92,15,34,'劳动合同','初中','室内装修设计','西北大学','2017-01-02','在职','00000055',7,'2017-04-02',NULL,'2017-01-02','2024-01-17',NULL),(56,'云星6','女','1993-01-05','610122199301054789','已婚',1,'陕西西安',1,'yunxing@qq.com','15644442252','陕西西安新城区',92,16,34,'劳务合同','硕士','通信工程','西安电子科技学校','2018-01-01','在职','00000056',5.25,'2018-04-01',NULL,'2018-01-01','2023-04-13',NULL),(61,'柯仁周','男','1991-03-09','710299199103095638','已婚',1,'广东',13,'kerenzhou@qq.com','13678883367','深圳市南山区深圳软件园',91,15,33,'劳动合同','本科','计算机软件','深圳大学','2018-01-15','在职','00000061',3,'2018-04-15',NULL,'2018-01-15','2021-01-20',NULL),(62,'洋洋222','女','1993-07-06','280177199307064729','已婚',1,'湖北',1,'yangyang@qq.com','17898882288','湖北黄石',92,15,34,'劳动合同','本科','软件工程','华中科技大学','2018-01-16','在职','00000062',2,'2018-04-16',NULL,'2018-01-16','2020-01-16',NULL);

/*Table structure for table `employeeec` */

DROP TABLE IF EXISTS `employeeec`;

CREATE TABLE `employeeec` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL COMMENT '员工编号',
  `ecDate` date DEFAULT NULL COMMENT '奖罚日期',
  `ecReason` varchar(255) DEFAULT NULL COMMENT '奖罚原因',
  `ecPoint` int(11) DEFAULT NULL COMMENT '奖罚分',
  `ecType` int(11) DEFAULT NULL COMMENT '奖罚类别，0：奖，1：罚',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pid` (`eid`),
  CONSTRAINT `employeeec_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employeeec` */

/*Table structure for table `employeeremove` */

DROP TABLE IF EXISTS `employeeremove`;

CREATE TABLE `employeeremove` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `afterDepId` int(11) DEFAULT NULL COMMENT '调动后部门',
  `afterJobId` int(11) DEFAULT NULL COMMENT '调动后职位',
  `removeDate` date DEFAULT NULL COMMENT '调动日期',
  `reason` varchar(255) DEFAULT NULL COMMENT '调动原因',
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pid` (`eid`),
  CONSTRAINT `employeeremove_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employeeremove` */

/*Table structure for table `employeetrain` */

DROP TABLE IF EXISTS `employeetrain`;

CREATE TABLE `employeetrain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL COMMENT '员工编号',
  `trainDate` date DEFAULT NULL COMMENT '培训日期',
  `trainContent` varchar(255) DEFAULT NULL COMMENT '培训内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pid` (`eid`),
  CONSTRAINT `employeetrain_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employeetrain` */

/*Table structure for table `hr` */

DROP TABLE IF EXISTS `hr`;

CREATE TABLE `hr` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'hrID',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `phone` char(11) DEFAULT NULL COMMENT '手机号码',
  `telephone` varchar(16) DEFAULT NULL COMMENT '住宅电话',
  `address` varchar(64) DEFAULT NULL COMMENT '联系地址',
  `enabled` tinyint(1) DEFAULT '1',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `userface` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `hr` */

insert  into `hr`(`id`,`name`,`phone`,`telephone`,`address`,`enabled`,`username`,`password`,`userface`,`remark`) values (3,'孙燕姿','18568887789','029-82881234','山东省济南市87号',1,'admin','$2a$10$ySG2lkvjFHY5O0./CPIE1OI8VJsuKYEzOYzqIa7AJR6sEgSzUFOAm','http://bpic.588ku.com/element_pic/01/40/00/64573ce2edc0728.jpg',NULL),(5,'李白','18568123489','029-82123434','海口美兰',1,'libai','$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1514093920321&di=913e88c23f382933ef430024afd9128a&imgtype=0&src=http%3A%2F%2Fp.3761.com%2Fpic%2F9771429316733.jpg',NULL),(10,'韩愈','18568123666','029-82111555','广州番禺',1,'hanyu','$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1514093920321&di=913e88c23f382933ef430024afd9128a&imgtype=0&src=http%3A%2F%2Fp.3761.com%2Fpic%2F9771429316733.jpg',NULL),(12,'曾巩','18568128888','029-82111222','广州越秀',1,'zenggong','$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1514093920321&di=913e88c23f382933ef430024afd9128a&imgtype=0&src=http%3A%2F%2Fp.3761.com%2Fpic%2F9771429316733.jpg',NULL);

/*Table structure for table `hr_role` */

DROP TABLE IF EXISTS `hr_role`;

CREATE TABLE `hr_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hrid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rid` (`rid`),
  KEY `hr_role_ibfk_1` (`hrid`),
  CONSTRAINT `hr_role_ibfk_1` FOREIGN KEY (`hrid`) REFERENCES `hr` (`id`) ON DELETE CASCADE,
  CONSTRAINT `hr_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

/*Data for the table `hr_role` */

insert  into `hr_role`(`id`,`hrid`,`rid`) values (1,3,6),(35,12,4),(36,12,3),(37,12,2),(47,10,3),(48,5,1);

/*Table structure for table `joblevel` */

DROP TABLE IF EXISTS `joblevel`;

CREATE TABLE `joblevel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '职称名称',
  `titleLevel` enum('正高级','副高级','中级','初级','员级') DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `joblevel` */

insert  into `joblevel`(`id`,`name`,`titleLevel`,`createDate`,`enabled`) values (9,'教授','正高级','2018-01-11 21:19:14',1),(10,'副教授','副高级','2018-01-11 21:19:20',1),(12,'助教','初级','2018-01-11 21:35:39',1),(13,'讲师','中级','2018-01-11 22:42:12',1),(14,'初级工程师','初级','2018-01-14 16:18:50',1),(15,'中级工程师','中级','2018-01-14 16:19:00',1),(16,'高级工程师','副高级','2018-01-14 16:19:14',1),(17,'骨灰级工程师','正高级','2018-01-14 16:19:24',1);

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(64) DEFAULT NULL,
  `path` varchar(64) DEFAULT NULL,
  `component` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `iconCls` varchar(64) DEFAULT NULL,
  `keepAlive` tinyint(1) DEFAULT NULL,
  `requireAuth` tinyint(1) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `parentId` (`parentId`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parentId`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

/*Data for the table `menu` */

insert  into `menu`(`id`,`url`,`path`,`component`,`name`,`iconCls`,`keepAlive`,`requireAuth`,`parentId`,`enabled`) values (1,'/',NULL,NULL,'所有',NULL,NULL,NULL,NULL,1),(2,'/','/home','Home','员工资料','el-icon-view',NULL,1,1,1),(3,'/','/home','Home','人事管理','el-icon-tickets',NULL,1,1,1),(4,'/','/home','Home','薪资管理','el-icon-document',NULL,1,1,1),(5,'/','/home','Home','统计管理','el-icon-tickets',NULL,1,1,1),(6,'/','/home','Home','系统管理','el-icon-setting',NULL,1,1,1),(7,'/employee/basic/**','/emp/basic','EmpBasic','基本资料',NULL,NULL,1,2,1),(8,'/employee/advanced/**','/emp/adv','EmpAdv','高级资料',NULL,NULL,1,2,0),(9,'/personnel/emp/**','/per/emp','PerEmp','员工资料',NULL,NULL,1,3,1),(10,'/personnel/ec/**','/per/ec','PerEc','员工奖惩',NULL,NULL,1,3,1),(11,'/personnel/train/**','/per/train','PerTrain','员工培训',NULL,NULL,1,3,1),(12,'/personnel/salary/**','/per/salary','PerSalary','员工调薪',NULL,NULL,1,3,1),(13,'/personnel/remove/**','/per/mv','PerMv','员工调动',NULL,NULL,1,3,1),(14,'/salary/sob/**','/sal/sob','SalSob','工资账套管理',NULL,NULL,1,4,1),(15,'/salary/sobcfg/**','/sal/sobcfg','SalSobCfg','员工账套设置',NULL,NULL,1,4,1),(16,'/salary/table/**','/sal/table','SalTable','工资表管理',NULL,NULL,1,4,1),(17,'/salary/month/**','/sal/month','SalMonth','月末处理',NULL,NULL,1,4,1),(18,'/salary/search/**','/sal/search','SalSearch','工资表查询',NULL,NULL,1,4,1),(19,'/statistics/all/**','/sta/all','StaAll','综合信息统计',NULL,NULL,1,5,1),(20,'/statistics/score/**','/sta/score','StaScore','员工积分统计',NULL,NULL,1,5,1),(21,'/statistics/personnel/**','/sta/pers','StaPers','人事信息统计',NULL,NULL,1,5,1),(22,'/statistics/recored/**','/sta/record','StaRecord','人事记录统计',NULL,NULL,1,5,1),(23,'/system/basic/**','/sys/basic','SysBasic','基础信息设置',NULL,NULL,1,6,1),(24,'/system/cfg/**','/sys/cfg','SysCfg','系统管理',NULL,NULL,1,6,1),(25,'/system/log/**','/sys/log','SysLog','操作日志管理',NULL,NULL,1,6,1),(26,'/system/hr/**','/sys/hr','SysHr','操作员管理',NULL,NULL,1,6,1),(27,'/system/data/**','/sys/data','SysData','备份恢复数据库',NULL,NULL,1,6,1),(28,'/system/init/**','/sys/init','SysInit','初始化数据库',NULL,NULL,1,6,1),(29,'/system/menu/**','/sys/menu','SysMenu','系统菜单',NULL,NULL,1,6,1),(30,'/system/hrlist/**','/sys/hrlist','SysHrList','操作员管理列表',NULL,NULL,1,6,1),(31,'/','/home','Home','培养方案数据管理','el-icon-tickets',NULL,1,1,1),(32,'/management/plan/**','/mgr/plan','MgrPlan','培养方案管理',NULL,NULL,1,31,1),(33,'/basic/company/**','/basic/company','BasicCompany','企业需求',NULL,NULL,1,31,1),(34,'/basic/cetificate/**','/basic/certificate','BasicCertificate','行业证书',NULL,NULL,1,31,1),(35,'/basic/college/**','/basic/college','BasicCollege','学校信息',NULL,NULL,1,31,1),(36,'/basic/major/**','/basic/major','BasicMajor','专业信息',NULL,NULL,1,31,1),(37,'/basic/course/**','/basic/course','BasicCourse','课程信息',NULL,NULL,1,31,1);

/*Table structure for table `menu_role` */

DROP TABLE IF EXISTS `menu_role`;

CREATE TABLE `menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  KEY `rid` (`rid`),
  CONSTRAINT `menu_role_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `menu` (`id`),
  CONSTRAINT `menu_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=397 DEFAULT CHARSET=utf8;

/*Data for the table `menu_role` */

insert  into `menu_role`(`id`,`mid`,`rid`) values (161,7,3),(247,7,4),(248,8,4),(249,11,4),(250,7,2),(251,8,2),(252,9,2),(253,10,2),(254,12,2),(255,13,2),(344,7,6),(345,9,6),(346,10,6),(347,11,6),(348,12,6),(349,13,6),(350,14,6),(351,15,6),(352,16,6),(353,17,6),(354,18,6),(355,19,6),(356,20,6),(357,21,6),(358,22,6),(359,23,6),(360,24,6),(361,25,6),(362,26,6),(363,27,6),(364,28,6),(365,29,6),(366,30,6),(367,7,1),(368,9,1),(369,10,1),(370,11,1),(371,12,1),(372,13,1),(373,14,1),(374,15,1),(375,16,1),(376,17,1),(377,18,1),(378,19,1),(379,20,1),(380,21,1),(381,22,1),(382,23,1),(383,24,1),(384,25,1),(385,26,1),(386,27,1),(387,28,1),(388,29,1),(389,30,1),(390,31,6),(391,32,6),(392,33,6),(393,34,6),(394,35,6),(395,36,6),(396,37,6);

/*Table structure for table `nation` */

DROP TABLE IF EXISTS `nation`;

CREATE TABLE `nation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

/*Data for the table `nation` */

insert  into `nation`(`id`,`name`) values (1,'汉族'),(2,'蒙古族'),(3,'回族'),(4,'藏族'),(5,'维吾尔族'),(6,'苗族'),(7,'彝族'),(8,'壮族'),(9,'布依族'),(10,'朝鲜族'),(11,'满族'),(12,'侗族'),(13,'瑶族'),(14,'白族'),(15,'土家族'),(16,'哈尼族'),(17,'哈萨克族'),(18,'傣族'),(19,'黎族'),(20,'傈僳族'),(21,'佤族'),(22,'畲族'),(23,'高山族'),(24,'拉祜族'),(25,'水族'),(26,'东乡族'),(27,'纳西族'),(28,'景颇族'),(29,'柯尔克孜族'),(30,'土族'),(31,'达斡尔族'),(32,'仫佬族'),(33,'羌族'),(34,'布朗族'),(35,'撒拉族'),(36,'毛难族'),(37,'仡佬族'),(38,'锡伯族'),(39,'阿昌族'),(40,'普米族'),(41,'塔吉克族'),(42,'怒族'),(43,'乌孜别克族'),(44,'俄罗斯族'),(45,'鄂温克族'),(46,'崩龙族'),(47,'保安族'),(48,'裕固族'),(49,'京族'),(50,'塔塔尔族'),(51,'独龙族'),(52,'鄂伦春族'),(53,'赫哲族'),(54,'门巴族'),(55,'珞巴族'),(56,'基诺族');

/*Table structure for table `oplog` */

DROP TABLE IF EXISTS `oplog`;

CREATE TABLE `oplog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addDate` date DEFAULT NULL COMMENT '添加日期',
  `operate` varchar(255) DEFAULT NULL COMMENT '操作内容',
  `hrid` int(11) DEFAULT NULL COMMENT '操作员ID',
  PRIMARY KEY (`id`),
  KEY `hrid` (`hrid`),
  CONSTRAINT `oplog_ibfk_1` FOREIGN KEY (`hrid`) REFERENCES `hr` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oplog` */

/*Table structure for table `plan_basic` */

DROP TABLE IF EXISTS `plan_basic`;

CREATE TABLE `plan_basic` (
  `id` varchar(50) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL COMMENT '培养方案名称',
  `school` varchar(20) DEFAULT NULL COMMENT '所属学校',
  `major` varchar(20) DEFAULT NULL COMMENT '所属专业',
  `status` varchar(10) DEFAULT NULL COMMENT '状态: normal/del',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `plan_basic` */

insert  into `plan_basic`(`id`,`title`,`school`,`major`,`status`,`createtime`) values ('2019011523263088357216','asdf','fdas','asdf','normal','2019-01-15 23:26:30'),('2019011523271002667320','培养方案','山大','计算机','normal','2019-01-15 23:27:10'),('2019011523494937242797','asdfasdf','','','normal','2019-01-15 23:49:49'),('2019011523495401193238','asdfasdf','','','normal','2019-01-15 23:49:54'),('2019011523495697122806','asdfsdfdsa','','','normal','2019-01-15 23:49:56'),('2019011523501598996272','asdf','','','normal','2019-01-15 23:50:15'),('2019011600054655658603','ffff','ddd','aaaa','normal','2019-01-16 00:05:46'),('2019011600212248919314','123','','','normal','2019-01-16 00:21:22');

/*Table structure for table `politicsstatus` */

DROP TABLE IF EXISTS `politicsstatus`;

CREATE TABLE `politicsstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `politicsstatus` */

insert  into `politicsstatus`(`id`,`name`) values (1,'中共党员'),(2,'中共预备党员'),(3,'共青团员'),(4,'民革党员'),(5,'民盟盟员'),(6,'民建会员'),(7,'民进会员'),(8,'农工党党员'),(9,'致公党党员'),(10,'九三学社社员'),(11,'台盟盟员'),(12,'无党派民主人士'),(13,'普通公民');

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '职位',
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

/*Data for the table `position` */

insert  into `position`(`id`,`name`,`createDate`,`enabled`) values (29,'技术总监','2018-01-11 21:13:42',1),(30,'运营总监','2018-01-11 21:13:48',1),(31,'市场总监','2018-01-11 21:13:56',1),(32,'总经理','2018-01-11 21:35:07',1),(33,'研发工程师','2018-01-14 16:07:11',1),(34,'运维工程师','2018-01-14 16:11:41',1);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `nameZh` varchar(64) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`nameZh`) values (1,'ROLE_manager','部门经理'),(2,'ROLE_personnel','人事专员'),(3,'ROLE_recruiter','招聘主管'),(4,'ROLE_train','培训主管'),(5,'ROLE_performance','薪酬绩效主管'),(6,'ROLE_admin','系统管理员'),(13,'ROLE_test2','测试角色2'),(14,'ROLE_test1','测试角色1');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `depId` int(11) DEFAULT NULL,
  `bonus` int(11) DEFAULT NULL COMMENT '奖金',
  `lunchSalary` int(11) DEFAULT NULL COMMENT '午餐补助',
  `trafficSalary` int(11) DEFAULT NULL COMMENT '交通补助',
  `basisSalary` int(11) DEFAULT NULL COMMENT '基本工资',
  `allSalary` int(11) DEFAULT NULL COMMENT '应发工资',
  PRIMARY KEY (`id`),
  KEY `depId` (`depId`),
  KEY `pid` (`eid`),
  CONSTRAINT `salary_ibfk_2` FOREIGN KEY (`depId`) REFERENCES `department` (`id`),
  CONSTRAINT `salary_ibfk_3` FOREIGN KEY (`eid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salary` */

/*Table structure for table `t_entity_course` */

DROP TABLE IF EXISTS `t_entity_course`;

CREATE TABLE `t_entity_course` (
  `course_id` varchar(50) NOT NULL COMMENT '课程ID',
  `course_name` varchar(20) DEFAULT NULL COMMENT '课程名称',
  `english_name` varchar(40) DEFAULT NULL COMMENT '英文名称',
  `course_code` varchar(15) DEFAULT NULL COMMENT '课程代码',
  `course_type_id` varchar(11) DEFAULT NULL COMMENT '课程类别',
  `status` varchar(25) DEFAULT NULL,
  `course_create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_course` */

insert  into `t_entity_course`(`course_id`,`course_name`,`english_name`,`course_code`,`course_type_id`,`status`,`course_create_time`) values ('2019030217142799753257','计算机','C+','007','专业类','normal','2019-03-01 17:14:30'),('2019030217160775864979','阿斯顿发舒服点','asdfasdf','阿斯顿发阿斯顿发','阿斯顿发 ','normal','2019-03-01 17:16:18');

/*Table structure for table `t_entity_course_system` */

DROP TABLE IF EXISTS `t_entity_course_system`;

CREATE TABLE `t_entity_course_system` (
  `course_system_id` int(11) NOT NULL COMMENT 'ID',
  `course_system_ids` int(11) DEFAULT NULL COMMENT '组ID',
  `course_type_id` int(11) DEFAULT NULL COMMENT '课程类别ID',
  `sum_credit` int(11) DEFAULT NULL COMMENT '总学分',
  `sum_period` int(11) DEFAULT NULL COMMENT '总学时',
  `theory_period` int(11) DEFAULT NULL COMMENT '理论学时',
  `practice_period` int(11) DEFAULT NULL COMMENT '实践学时',
  PRIMARY KEY (`course_system_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_course_system` */

/*Table structure for table `t_entity_course_type` */

DROP TABLE IF EXISTS `t_entity_course_type`;

CREATE TABLE `t_entity_course_type` (
  `course_type_id` int(11) NOT NULL COMMENT 'ID',
  `course_type_name` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `preorder_id` int(11) DEFAULT NULL COMMENT '上级类别ID',
  PRIMARY KEY (`course_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_course_type` */

/*Table structure for table `t_entity_credit_ratio` */

DROP TABLE IF EXISTS `t_entity_credit_ratio`;

CREATE TABLE `t_entity_credit_ratio` (
  `credit_ratio_id` int(11) NOT NULL COMMENT 'ID',
  `credit_ratio_ids` int(11) DEFAULT NULL COMMENT '组ID',
  `course_type_id` int(11) DEFAULT NULL COMMENT '课程类别ID',
  `credit` int(11) DEFAULT NULL COMMENT '学分数量',
  PRIMARY KEY (`credit_ratio_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_credit_ratio` */

/*Table structure for table `t_entity_semester` */

DROP TABLE IF EXISTS `t_entity_semester`;

CREATE TABLE `t_entity_semester` (
  `semester_id` int(11) NOT NULL COMMENT 'ID',
  `semester_name` varchar(10) DEFAULT NULL COMMENT '学期名称',
  PRIMARY KEY (`semester_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_semester` */

/*Table structure for table `t_entity_trainingpro` */

DROP TABLE IF EXISTS `t_entity_trainingpro`;

CREATE TABLE `t_entity_trainingpro` (
  `project_id` int(11) NOT NULL COMMENT 'ID',
  `project_name` varchar(40) DEFAULT NULL COMMENT '培养方案名称',
  `school_id` int(11) DEFAULT NULL COMMENT '所属学校ID',
  `profession_id` int(11) DEFAULT NULL COMMENT '所属专业ID',
  `aim_and_need` varchar(2000) DEFAULT NULL COMMENT '培养目标和培养要求',
  `profession_special` varchar(200) DEFAULT NULL COMMENT '专业培养特色',
  `major_course` varchar(100) DEFAULT NULL COMMENT '主干课程',
  `educational_systme` int(11) DEFAULT NULL COMMENT '学制',
  `sum_credit` int(11) DEFAULT NULL COMMENT '总学分',
  `credit_ratio_ids` int(11) DEFAULT NULL COMMENT '学分比例组ID',
  `degree` varchar(10) DEFAULT NULL COMMENT '学位',
  `course_system_ids` int(11) DEFAULT NULL COMMENT '课程体系框架组ID',
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_trainingpro` */

/*Table structure for table `t_entity_week_period` */

DROP TABLE IF EXISTS `t_entity_week_period`;

CREATE TABLE `t_entity_week_period` (
  `week_period_id` int(11) NOT NULL COMMENT 'ID',
  `course_system_id` int(11) DEFAULT NULL COMMENT '课程体系框架ID',
  `semester_id` int(11) DEFAULT NULL COMMENT '学期ID',
  `week_number` int(11) DEFAULT NULL COMMENT '周数',
  `period` int(11) DEFAULT NULL COMMENT '学时数',
  PRIMARY KEY (`week_period_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity_week_period` */

/*Table structure for table `tb_entity_company_need` */

DROP TABLE IF EXISTS `tb_entity_company_need`;

CREATE TABLE `tb_entity_company_need` (
  `company_need_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID 自增',
  `company_need_job_name` varchar(255) NOT NULL COMMENT '职位名称',
  `company_need_description` varchar(255) NOT NULL COMMENT '职位描述',
  `company_need_type` int(11) NOT NULL COMMENT '工作类别 可关联数据字典',
  `company_need_profession` varchar(255) DEFAULT NULL COMMENT '对口专业 json 格式关联 专业表',
  `company_need_name` varchar(255) NOT NULL COMMENT '公司名称',
  `company_need_introduction` varchar(255) NOT NULL COMMENT '公司介绍',
  `company_need_requirement` varchar(255) NOT NULL COMMENT '任职需求',
  `company_need_created` datetime NOT NULL COMMENT '创建日期',
  `company_need_updated` datetime NOT NULL COMMENT '修改日期',
  `company_need_status` int(11) NOT NULL COMMENT '状态 0或1',
  `company_need_backup1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `company_need_backup2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`company_need_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_company_need` */

insert  into `tb_entity_company_need`(`company_need_id`,`company_need_job_name`,`company_need_description`,`company_need_type`,`company_need_profession`,`company_need_name`,`company_need_introduction`,`company_need_requirement`,`company_need_created`,`company_need_updated`,`company_need_status`,`company_need_backup1`,`company_need_backup2`) values (2,'发生水电费','发顺丰',1,'[]','阿斯蒂芬','fdas','阿斯蒂芬','2019-03-02 07:38:58','2019-03-02 07:38:58',1,NULL,NULL),(3,'再下次v','阿斯蒂芬',2,'[]','fdas','阿斯蒂芬','阿斯蒂芬','2019-03-02 07:39:18','2019-03-02 07:39:18',1,NULL,NULL);

/*Table structure for table `tb_entity_discipline` */

DROP TABLE IF EXISTS `tb_entity_discipline`;

CREATE TABLE `tb_entity_discipline` (
  `discipline_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `discipline_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `discipline_code` int(11) DEFAULT NULL COMMENT '代码',
  `discipline_rank` int(11) DEFAULT NULL COMMENT '学科等级',
  `discipline_isFk` int(11) DEFAULT NULL COMMENT '是否可以关联外键',
  `discipline_created` datetime DEFAULT NULL COMMENT '创建时间',
  `discipline_updated` datetime DEFAULT NULL COMMENT '更新时间',
  `discipline_status` int(11) DEFAULT NULL COMMENT '状态',
  `discipline_info_parent_id` int(11) DEFAULT NULL COMMENT '父ID',
  PRIMARY KEY (`discipline_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_discipline` */

/*Table structure for table `tb_entity_industry_certificate` */

DROP TABLE IF EXISTS `tb_entity_industry_certificate`;

CREATE TABLE `tb_entity_industry_certificate` (
  `industry_certificate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID 自增',
  `industry_certificate_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `industry_certificate_course` varchar(255) NOT NULL COMMENT '相关课程 这里用json存贮',
  `industry_certificate_sign` varchar(255) NOT NULL COMMENT '报名要求 具体格式不一定用json存储',
  `industry_certificate_dept` int(11) DEFAULT NULL COMMENT '系别（关联数据字典表）',
  `industry_certificate_profession` int(11) DEFAULT NULL COMMENT '专业（关联专业表或者数据字典表）',
  `industry_certificate_authentication_type` int(11) NOT NULL COMMENT '认证种类 可关联数据字典',
  `industry_certificate_module` varchar(255) NOT NULL COMMENT '等级模块 相当于name',
  `industry_certificate_identification_site` int(11) NOT NULL COMMENT '坚定地点 考证中心/校外 可关联数据字典表',
  `industry_certificate_organization` int(11) NOT NULL COMMENT '颁发机构 关联数据字典表',
  `industry_certificate_url` varchar(255) NOT NULL COMMENT '官方网站',
  `industry_certificate_status` int(11) NOT NULL COMMENT '状态 0或1',
  `industry_certificate_created` datetime NOT NULL COMMENT '创建时间',
  `industry_certificate_updated` datetime NOT NULL COMMENT '更新时间',
  `industry_certificate_backup1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `industry_certificate_backup2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`industry_certificate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_industry_certificate` */

insert  into `tb_entity_industry_certificate`(`industry_certificate_id`,`industry_certificate_name`,`industry_certificate_course`,`industry_certificate_sign`,`industry_certificate_dept`,`industry_certificate_profession`,`industry_certificate_authentication_type`,`industry_certificate_module`,`industry_certificate_identification_site`,`industry_certificate_organization`,`industry_certificate_url`,`industry_certificate_status`,`industry_certificate_created`,`industry_certificate_updated`,`industry_certificate_backup1`,`industry_certificate_backup2`) values (1,'阿斯蒂芬','1,2','阿斯蒂芬',2,1,1,'阿斯蒂芬',1,1,'http://www.baidu.com',1,'2019-03-02 07:51:08','2019-03-02 07:51:08',NULL,NULL);

/*Table structure for table `tb_entity_major` */

DROP TABLE IF EXISTS `tb_entity_major`;

CREATE TABLE `tb_entity_major` (
  `major_id` varchar(50) NOT NULL,
  `major_name` varchar(20) DEFAULT NULL,
  `major_code` varchar(20) DEFAULT NULL,
  `major_created_time` datetime DEFAULT NULL,
  `major_status` varchar(10) DEFAULT NULL,
  `major_url` varchar(50) DEFAULT NULL,
  `major_introduction` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`major_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_major` */

insert  into `tb_entity_major`(`major_id`,`major_name`,`major_code`,`major_created_time`,`major_status`,`major_url`,`major_introduction`) values ('2019030217153716821837','计算机','007','2019-03-01 17:15:45','normal','http://com.com','计算机类'),('2019030217155422858610','阿斯顿发大水发','阿斯顿发斯蒂芬','2019-03-01 17:16:04','','阿斯顿发斯蒂芬','阿斯顿发斯蒂芬');

/*Table structure for table `tb_entity_profession` */

DROP TABLE IF EXISTS `tb_entity_profession`;

CREATE TABLE `tb_entity_profession` (
  `profession_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业ID',
  `profession_name` varchar(255) DEFAULT NULL COMMENT '专业名称',
  `profession_code` int(11) DEFAULT NULL COMMENT '专业代码（学校内的编号）',
  `profession_created` datetime DEFAULT NULL COMMENT '创建时间',
  `profession_updated` datetime DEFAULT NULL COMMENT '修改时间',
  `profession_status` int(11) DEFAULT NULL COMMENT '状态',
  `school_id_fk` int(11) DEFAULT NULL COMMENT '关联学校id 外键',
  `file_ids_fk` varchar(255) DEFAULT NULL COMMENT '伪外键 关联文件id json格式存储',
  `discipline__id_fk` int(11) DEFAULT NULL COMMENT '学科信息ID',
  PRIMARY KEY (`profession_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_profession` */

/*Table structure for table `tb_entity_profession_direction` */

DROP TABLE IF EXISTS `tb_entity_profession_direction`;

CREATE TABLE `tb_entity_profession_direction` (
  `profession_direction_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业方向ID',
  `profession_direction_name` varchar(255) DEFAULT NULL COMMENT '专业方向名称',
  `profession_direction_url` varchar(255) DEFAULT NULL COMMENT '官方地址 绑定专业信息的地址',
  `profession_direction_introduction` text COMMENT '专业方向介绍 这里使用超文本编辑器 存放html代码 或者 markdown',
  `profession_direction_created` datetime DEFAULT NULL COMMENT '创建时间',
  `profession_direction_updated` datetime DEFAULT NULL COMMENT '修改时间',
  `profession_direction_status` int(11) DEFAULT NULL COMMENT '状态',
  `profession_direction_id_fk` int(11) DEFAULT NULL COMMENT '关联专业信息表',
  `file_ids_fk` varchar(255) DEFAULT NULL COMMENT '伪外键 关联文件id json格式存储',
  PRIMARY KEY (`profession_direction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_profession_direction` */

/*Table structure for table `tb_entity_profession_info` */

DROP TABLE IF EXISTS `tb_entity_profession_info`;

CREATE TABLE `tb_entity_profession_info` (
  `profession_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业ID',
  `profession_info_name` varchar(255) DEFAULT NULL COMMENT '专业名称',
  `profession_info_code` int(11) DEFAULT NULL COMMENT '专业代码',
  `profession_info_url` varchar(255) DEFAULT NULL COMMENT '官方地址 绑定专业信息的地址',
  `profession_info_introduction` text COMMENT '专业介绍 这里使用超文本编辑器 存放html代码 或者 markdown',
  `profession_info_created` datetime DEFAULT NULL COMMENT '创建时间',
  `profession_info_updated` datetime DEFAULT NULL COMMENT '修改时间',
  `profession_info_status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`profession_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_profession_info` */

/*Table structure for table `tb_entity_school` */

DROP TABLE IF EXISTS `tb_entity_school`;

CREATE TABLE `tb_entity_school` (
  `school_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学校ID',
  `school_code` int(11) DEFAULT NULL COMMENT '学校代码',
  `school_name` varchar(255) NOT NULL COMMENT '学校名称',
  `school_english_name` varchar(255) NOT NULL COMMENT '学校英文名称',
  `school_url` varchar(255) DEFAULT NULL COMMENT '学校官方网站地址',
  `school_info_id` int(11) NOT NULL COMMENT '学校信息ID 外键 tb_entity_school_info',
  `school_created` datetime NOT NULL COMMENT '创建时间',
  `school_updated` datetime NOT NULL COMMENT '修改时间',
  `school_status` int(11) NOT NULL COMMENT '状态 0/1',
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_school` */

/*Table structure for table `tb_entity_school_info` */

DROP TABLE IF EXISTS `tb_entity_school_info`;

CREATE TABLE `tb_entity_school_info` (
  `school_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学校信息ID',
  `school_info_code` int(11) DEFAULT NULL COMMENT '学校代码',
  `school_info_name` varchar(255) NOT NULL COMMENT '学校名称',
  `school_info_english_name` varchar(255) NOT NULL COMMENT '学校英文名称',
  `school_info_url` varchar(255) DEFAULT NULL COMMENT '学校官方网站地址',
  `school_info_email` varchar(255) DEFAULT NULL COMMENT '学校官方信箱',
  `school_info_email_code` varchar(255) DEFAULT NULL COMMENT '学校邮政编码',
  `school_info_address` varchar(255) DEFAULT NULL COMMENT '学校地址',
  `school_info_address_code` int(11) DEFAULT NULL COMMENT '学校地址代码',
  `school_info_organization_code` varchar(255) DEFAULT NULL COMMENT '组织机构代码证号',
  `school_info_created` datetime NOT NULL COMMENT '创建时间',
  `school_info_updated` datetime NOT NULL COMMENT '修改时间',
  `school_info_status` int(11) NOT NULL COMMENT '状态 0/1',
  PRIMARY KEY (`school_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_entity_school_info` */

/*Table structure for table `tb_util_file` */

DROP TABLE IF EXISTS `tb_util_file`;

CREATE TABLE `tb_util_file` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件ID',
  `file_name` varchar(255) NOT NULL COMMENT '文件名',
  `file_showname` varchar(255) NOT NULL COMMENT '展示名',
  `file_postfix` varchar(255) NOT NULL COMMENT '文件后缀名',
  `file_type` int(11) NOT NULL COMMENT '文件类型 文件/图片/音频',
  `file_size` float NOT NULL COMMENT '文件大小',
  `file_url` varchar(255) NOT NULL COMMENT '下载网络地址 fastdfs',
  `file_created` datetime NOT NULL COMMENT '文件上传时间',
  `file_updated` datetime NOT NULL COMMENT '文件属性修改时间',
  `file_status` datetime NOT NULL COMMENT '文件状态 禁用时候不显示',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_util_file` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
