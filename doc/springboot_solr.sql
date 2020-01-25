/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : springboot_solr

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2020-01-24 03:36:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33326 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('1', 'tycoding', '123@qq.com', '8989723', 'sdhsh90');
INSERT INTO `info` VALUES ('2', 'tumo', 'tycoding@163.com', '8989723', 'tumo');
INSERT INTO `info` VALUES ('3', '涂陌', '123@163.com', '8989723', 'tycodingss');
INSERT INTO `info` VALUES ('4', '往吝', '992987642@qq.com', '992987642', '123456');
