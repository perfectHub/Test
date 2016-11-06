/*
Navicat MySQL Data Transfer

Source Server         : centos
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : cent

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-11-06 20:33:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `id` int(11) NOT NULL auto_increment COMMENT '主键ID',
  `username` varchar(100) collate utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(100) collate utf8_bin NOT NULL COMMENT '密码',
  `nickname` varchar(100) collate utf8_bin default NULL COMMENT '昵称',
  `email` varchar(200) collate utf8_bin default NULL,
  `phone` varchar(200) collate utf8_bin default NULL,
  `user_type` char(1) collate utf8_bin default NULL,
  `login_ip` varchar(100) collate utf8_bin default NULL,
  `login_date` datetime default NULL,
  `login_flag` varchar(64) collate utf8_bin default NULL,
  `create_by` varchar(64) collate utf8_bin default NULL,
  `create_date` datetime default NULL,
  `update_by` varchar(64) collate utf8_bin default NULL,
  `update_date` datetime default NULL,
  `remarks` varchar(255) collate utf8_bin default NULL,
  `del_flag` char(1) collate utf8_bin NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
