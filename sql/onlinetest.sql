/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : onlinetest

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-03-22 22:42:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for factory_c
-- ----------------------------
DROP TABLE IF EXISTS `factory_c`;
CREATE TABLE `factory_c` (
  `FACTORY_ID` varchar(255) NOT NULL,
  `FULL_NAME` varchar(255) DEFAULT NULL,
  `FACTORY_NAME` varchar(255) DEFAULT NULL,
  `CONTRACTOR` varchar(255) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  `MOBILE` varchar(255) DEFAULT NULL,
  `FAX` varchar(255) DEFAULT NULL,
  `CNOTE` varchar(255) DEFAULT NULL,
  `ORDER_NO` int(100) DEFAULT NULL,
  `STATE` int(100) DEFAULT NULL,
  PRIMARY KEY (`FACTORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of factory_c
-- ----------------------------

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `courseid` int(100) NOT NULL AUTO_INCREMENT,
  `coursename` varchar(255) DEFAULT NULL,
  `coursestate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES ('2', 'TOEFL', '0');
INSERT INTO `t_course` VALUES ('3', 'GRE', '0');
INSERT INTO `t_course` VALUES ('4', 'GMAT', '0');
INSERT INTO `t_course` VALUES ('5', 'TEST', '0');

-- ----------------------------
-- Table structure for t_errorbook
-- ----------------------------
DROP TABLE IF EXISTS `t_errorbook`;
CREATE TABLE `t_errorbook` (
  `bookid` int(100) NOT NULL AUTO_INCREMENT,
  `userid` varchar(255) DEFAULT NULL,
  `courseid` varchar(255) DEFAULT NULL,
  `gradeid` varchar(255) DEFAULT NULL,
  `typeid` varchar(255) DEFAULT NULL,
  `uanswer` varchar(255) DEFAULT NULL,
  `questionid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_errorbook
-- ----------------------------
INSERT INTO `t_errorbook` VALUES ('1', 'wang', null, null, null, null, '1');
INSERT INTO `t_errorbook` VALUES ('2', 'wang', '2', '1', '1', 'C', '1');
INSERT INTO `t_errorbook` VALUES ('3', 'wang', '2', '2', '4', '1', '3');

-- ----------------------------
-- Table structure for t_grade
-- ----------------------------
DROP TABLE IF EXISTS `t_grade`;
CREATE TABLE `t_grade` (
  `gradeid` int(100) NOT NULL AUTO_INCREMENT,
  `gradename` varchar(255) DEFAULT NULL,
  `courseid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gradeid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_grade
-- ----------------------------
INSERT INTO `t_grade` VALUES ('1', '新高一', '1,2,3,4');
INSERT INTO `t_grade` VALUES ('2', 'first', '1');

-- ----------------------------
-- Table structure for t_paper
-- ----------------------------
DROP TABLE IF EXISTS `t_paper`;
CREATE TABLE `t_paper` (
  `paperid` varchar(255) NOT NULL DEFAULT '',
  `papername` varchar(255) DEFAULT NULL,
  `courseid` varchar(255) DEFAULT NULL,
  `gradeid` varchar(255) DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `questionid` varchar(255) DEFAULT NULL,
  `begintime` varchar(255) DEFAULT NULL,
  `endtime` varchar(255) DEFAULT NULL,
  `allowtime` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  `paperstate` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_paper
-- ----------------------------
INSERT INTO `t_paper` VALUES ('1', '1', '5', '2', 'wang', '1', '2016-05-11 10:06:13', '2018-03-22 10:31:23', '20', '0', '2');
INSERT INTO `t_paper` VALUES ('2', '2', '2', '2', 'wang', '3', '2016-05-11 10:06:13', '2022-05-11 10:06:13', '20', null, '0');
INSERT INTO `t_paper` VALUES ('3', '3', '2', '2', null, '3', '2016-05-11 10:06:13', '2022-05-11 10:06:13', '20', null, '0');
INSERT INTO `t_paper` VALUES ('3', '3', '2', '2', 'wang', '3', '2018-03-22 10:35:24', '2018-03-22 10:35:37', '20', '0', '2');

-- ----------------------------
-- Table structure for t_question
-- ----------------------------
DROP TABLE IF EXISTS `t_question`;
CREATE TABLE `t_question` (
  `questionid` int(100) NOT NULL AUTO_INCREMENT,
  `quesname` varchar(255) DEFAULT NULL,
  `optiona` varchar(255) DEFAULT NULL,
  `optionb` varchar(255) DEFAULT NULL,
  `optionc` varchar(255) DEFAULT NULL,
  `optiond` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `useranswer` varchar(255) DEFAULT NULL,
  `courseid` varchar(255) DEFAULT NULL,
  `typeid` varchar(255) DEFAULT NULL,
  `gradeid` varchar(255) DEFAULT NULL,
  `difficulty` int(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `answerdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`questionid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question
-- ----------------------------
INSERT INTO `t_question` VALUES ('1', '1+1=？', '1', '2', '3', '4', '2', null, '2', '1', '1', '0', '', '');
INSERT INTO `t_question` VALUES ('2', '3-2=?', '1', '2', '3', '4', 'A', null, '2', '2', '2', '1', '', '');
INSERT INTO `t_question` VALUES ('3', '1*1', '1', '2', '3', '4', 'a', null, '2', '4', '2', '0', '', '');

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `typeid` int(100) NOT NULL AUTO_INCREMENT,
  `typename` varchar(255) DEFAULT NULL,
  `score` int(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', '听力', '30', 'TOEFL');
INSERT INTO `t_type` VALUES ('2', '阅读', '30', 'TOEFL');
INSERT INTO `t_type` VALUES ('3', '写作', '30', 'TOEFL');
INSERT INTO `t_type` VALUES ('4', '口语', '30', 'TOEFL');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userpwd` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `usertype` int(100) DEFAULT NULL,
  `userstate` int(100) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2', 'a', '0cc175b9c0f1b6a831c399e269772661', '2', '0', '1', null, null, null, null);
INSERT INTO `t_user` VALUES ('admin', 'admin', '96e79218965eb72c92a549dd5a330112', '2', '2', '1', null, null, null, null);
INSERT INTO `t_user` VALUES ('t1', 't1', 'e10adc3949ba59abbe56e057f20f883e', '1', '1', '1', 'teacher1@qq.com', '13512341234', '学校', '测试');
INSERT INTO `t_user` VALUES ('wang', 'wang', '96e79218965eb72c92a549dd5a330112', '2', '0', '1', '123@qq.com', null, '123', null);
