/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.25 : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo`;

/*Table structure for table `order_detail` */

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `detail_id` varchar(32) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '商品单价',
  `product_quantity` int(11) NOT NULL COMMENT '商品数量',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '商品图片',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`detail_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单详情表';

/*Data for the table `order_detail` */

insert  into `order_detail`(`detail_id`,`order_id`,`product_id`,`product_name`,`product_price`,`product_quantity`,`product_icon`,`create_time`) values ('123456','1232457','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-09 19:09:59'),('1528550976711891529','1528550976288278577','123457','猪肉','13.50',1,'http://xxxx.jpg','2018-06-09 21:29:36'),('1528551420523701313','1528551420077261427','123456','米饭','3.50',20,'http://xxxx.jpg','2018-06-09 21:37:00'),('1528551420560542384','1528551420077261427','123457','猪肉','13.50',20,'http://xxxx.jpg','2018-06-09 21:37:00'),('1528567256972410899','1528567256596679399','123456','米饭','3.50',20,'http://xxxx.jpg','2018-06-10 02:00:57'),('1528567257038728332','1528567256596679399','123457','猪肉','13.50',20,'http://xxxx.jpg','2018-06-10 02:00:57'),('1528567611673430696','1528567558709217255','123456','米饭','3.50',21,'http://xxxx.jpg','2018-06-10 02:07:04'),('1528567827118238739','1528567823793330643','123456','米饭','3.50',21,'http://xxxx.jpg','2018-06-10 02:10:27'),('1528568250844874326','1528568250772812293','123456','米饭','3.50',21,'http://xxxx.jpg','2018-06-10 02:17:30'),('1528597123769198210','1528597123682698937','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 10:18:44'),('1528597123905891240','1528597123682698937','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 10:18:44'),('1528597123928299665','1528597123682698937','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 10:18:44'),('1528597458657441319','1528597458646619370','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 10:24:18'),('1528597458695997797','1528597458646619370','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 10:24:18'),('1528597458727306750','1528597458646619370','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 10:24:18'),('1528597896228543307','1528597896211793442','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 10:31:36'),('1528597896260558997','1528597896211793442','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 10:31:36'),('1528597896279905387','1528597896211793442','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 10:31:36'),('1528608013775724790','1528608013765692486','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 13:20:13'),('1528608013787905126','1528608013765692486','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 13:20:13'),('1528608013799648794','1528608013765692486','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 13:20:13'),('1528608099572701570','1528608099538818299','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 13:21:39'),('1528608099589736231','1528608099538818299','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 13:21:39'),('1528608099598889972','1528608099538818299','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 13:21:39'),('1528610189405446126','1528610188699835274','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 13:56:29'),('1528610189521630932','1528610188699835274','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 13:56:30'),('1528610189530925777','1528610188699835274','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 13:56:30'),('1528622345533161423','1528622345480683338','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 17:19:05'),('1528622345546657285','1528622345480683338','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 17:19:05'),('1528622345552697788','1528622345480683338','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 17:19:05'),('1528622768069962321','1528622768026101715','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 17:26:08'),('1528622768083623194','1528622768026101715','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 17:26:08'),('1528622768091257630','1528622768026101715','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 17:26:08'),('1528622841426964017','1528622841408887757','123456','米饭','3.50',5,'http://xxxx.jpg','2018-06-10 17:27:21'),('1528622841438756096','1528622841408887757','123457','猪肉','13.50',5,'http://xxxx.jpg','2018-06-10 17:27:21'),('1528622841445288698','1528622841408887757','12344455','三生三世','2.50',5,'http://xxxx.jpg','2018-06-10 17:27:21');

/*Table structure for table `order_master` */

DROP TABLE IF EXISTS `order_master`;

CREATE TABLE `order_master` (
  `order_id` varchar(32) NOT NULL,
  `buyer_name` varchar(32) NOT NULL COMMENT '买家名字',
  `buyer_phone` varchar(32) NOT NULL COMMENT '买家电话',
  `buyer_address` varchar(128) NOT NULL COMMENT '买家地址',
  `buyer_openid` varchar(64) NOT NULL COMMENT '买家微信openid',
  `order_amount` decimal(8,2) NOT NULL COMMENT '订单总金额',
  `order_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '订单状态',
  `pay_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '订单支付状态',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`order_id`),
  KEY `idx_buyer_openid` (`buyer_openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `order_master` */

insert  into `order_master`(`order_id`,`buyer_name`,`buyer_phone`,`buyer_address`,`buyer_openid`,`order_amount`,`order_status`,`pay_status`,`create_time`) values ('1232456','张三6666','12345678901','四川成都','zhangsan','400.50',0,0,'2018-06-09 18:45:27'),('1232457','张三','12345678901','四川成都','zhangsan','400.50',0,0,'2018-06-09 18:48:32'),('1528550976288278577','李四','12345678900','四川成都','lisi111','13.50',0,1,'2018-06-09 21:29:36'),('1528551420077261427','王五','12345678900','四川成都','wangwu111','340.00',2,0,'2018-06-09 21:37:00'),('1528567256596679399','王五','12345678900','四川成都','wangwu111','340.00',0,0,'2018-06-10 02:00:57'),('1528567558709217255','李四','12345678900','四川成都','lisi11111','73.50',0,0,'2018-06-10 02:07:04'),('1528567823793330643','李四','12345678900','四川成都','lisi11111','73.50',2,0,'2018-06-10 02:10:27'),('1528568250772812293','李四','12345678900','四川成都','lisi11111','73.50',0,0,'2018-06-10 02:17:31'),('1528597123682698937','李四','12345678900','四川成都','lisi11111','97.50',2,0,'2018-06-10 10:18:44'),('1528597458646619370','李四','12345678900','四川成都','lisi11111','97.50',2,0,'2018-06-10 10:24:18'),('1528597896211793442','李四','12345678900','四川成都','lisi11111','97.50',2,0,'2018-06-10 10:31:36'),('1528608013765692486','李四','12345678900','四川成都','lisi11111','97.50',2,0,'2018-06-10 13:20:13'),('1528608099538818299','李四','12345678900','四川成都','lisi11111','97.50',0,0,'2018-06-10 13:21:39'),('1528610188699835274','李四','12345678900','四川成都','lisi11111','97.50',0,0,'2018-06-10 13:56:30'),('1528622345480683338','李四','12345678900','四川成都','lisi11111','97.50',0,0,'2018-06-10 17:19:05'),('1528622768026101715','李四','12345678900','四川成都','lisi11111','97.50',0,0,'2018-06-10 17:26:08'),('1528622841408887757','李四','12345678900','四川成都','lisi11111','97.50',0,0,'2018-06-10 17:27:21');

/*Table structure for table `product_category` */

DROP TABLE IF EXISTS `product_category`;

CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) NOT NULL COMMENT '类目名字',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='类目表';

/*Data for the table `product_category` */

insert  into `product_category`(`category_id`,`category_name`,`category_type`,`create_time`) values (1,'热销榜',1,'2018-05-28 22:53:02'),(2,'女生最爱112',2,'2018-05-28 23:08:49'),(3,'男生最爱',4,'2018-05-28 23:26:37');

/*Table structure for table `product_info` */

DROP TABLE IF EXISTS `product_info`;

CREATE TABLE `product_info` (
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '商品单价',
  `product_stock` int(11) NOT NULL COMMENT '库存',
  `product_description` varchar(64) DEFAULT NULL COMMENT '描述',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '小图',
  `product_status` int(11) NOT NULL DEFAULT '0' COMMENT '状态：正常0，下架1.',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

/*Data for the table `product_info` */

insert  into `product_info`(`product_id`,`product_name`,`product_price`,`product_stock`,`product_description`,`product_icon`,`product_status`,`category_type`,`create_time`) values ('12344455','三生三世','2.50',5,'555','http://xxxx.jpg',0,2,'2018-06-09 12:08:33'),('123456','米饭','3.50',13,'米饭很好吃','http://xxxx.jpg',0,1,'2018-05-29 23:36:49'),('123457','猪肉','13.50',53,'猪肉很好吃','http://xxxx.jpg',0,2,'2018-05-30 00:20:56');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
