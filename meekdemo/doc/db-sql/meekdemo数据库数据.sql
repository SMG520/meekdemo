
DROP TABLE IF EXISTS `sys_article`;

CREATE TABLE `sys_article` (
  `article_id` varchar(36) NOT NULL,
  `article_title` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `user_id` varchar(36) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `sys_user`(`user_id`,`user_name`) values ('674cf84a-5dc9-45c5-8934-451db17a4774','hellomeek');

