SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` int(10) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父编号',
  `parent_ids` varchar(20) DEFAULT NULL,
  `permission` varchar(50) DEFAULT NULL COMMENT '权限字符串',
  `resource_type` varchar(20) DEFAULT NULL COMMENT '资源类型',
  `url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` varchar(10) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `permission_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  KEY `pk_permission_id` (`permission_id`),
  KEY `FK9q28ewrhntqeipl1t04kh1be7` (`role_id`),
  CONSTRAINT `FK9q28ewrhntqeipl1t04kh1be7` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `FKomxrs8a388bknvhjokh440waq` FOREIGN KEY (`permission_id`) REFERENCES `sys_permission` (`id`),
  CONSTRAINT `pk_1role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `pk_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `sys_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `role_id` bigint(20) NOT NULL DEFAULT '0',
  `uid` bigint(20) NOT NULL,
  KEY `FKgkmyslkrfeyn9ukmolvek8b8f` (`uid`),
  KEY `FKhh52n8vd4ny9ff4x9fb8v65qx` (`role_id`),
  CONSTRAINT `FKgkmyslkrfeyn9ukmolvek8b8f` FOREIGN KEY (`uid`) REFERENCES `user_info` (`uid`),
  CONSTRAINT `FKhh52n8vd4ny9ff4x9fb8v65qx` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `pk_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `pk_uid` FOREIGN KEY (`uid`) REFERENCES `user_info` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL COMMENT '登录名',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `password` varchar(500) DEFAULT NULL COMMENT '密码',
  `salt` varchar(500) DEFAULT '',
  `state` int(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (1,0,'用户管理',0,'0/','userInfo:view','menu','userInfo/userList');
INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (2,0,'用户添加',1,'0/1','userInfo:add','button','userInfo/userAdd');
INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (3,0,'用户删除',1,'0/1','userInfo:del','button','userInfo/userDel');
INSERT INTO `sys_role` (`id`,`available`,`description`,`role`) VALUES (1,'0','管理员','admin');
INSERT INTO `sys_role` (`id`,`available`,`description`,`role`) VALUES (2,'0','VIP会员','vip');INSERT INTO `sys_role_permission` VALUES ('1', '1');
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,1);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,2);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,3);
INSERT INTO `sys_user_role` (`role_id`,`uid`) VALUES (1,1);
INSERT INTO `user_info` (`uid`,`username`,`name`,`password`,`salt`,`state`) VALUES ('1', 'admin', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', 0);


