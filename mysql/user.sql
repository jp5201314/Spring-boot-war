/*
Navicat MySQL Data Transfer

Source Server         : spring-mvc
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-27 11:07:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2');
INSERT INTO `user` VALUES ('2', '老王');
INSERT INTO `user` VALUES ('3', 'gsdf');
INSERT INTO `user` VALUES ('4', 'gg');
INSERT INTO `user` VALUES ('5', 'java');
INSERT INTO `user` VALUES ('6', 'jp');
