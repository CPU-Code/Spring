
CREATE DATABASE IF NOT EXISTS
    `cpucode`
DEFAULT CHARACTER SET
    utf8;


USE `cpucode`;


/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;


CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) DEFAULT NULL,
  `roleDesc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


/*Data for the table `sys_role` */

insert  into
    `sys_role`(`id`,`roleName`,`roleDesc`)
values
    (1,'院长','负责全面工作'),
    (2,'研究员','课程研发工作'),
    (3,'讲师','授课工作'),
    (4,'助教','协助解决学生的问题');


/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;


CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(80) DEFAULT NULL,
  `phoneNum` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


/*Data for the table `sys_user` */

insert  into
    `sys_user`(`id`,`username`,`email`,`password`,`phoneNum`)
values
    (1,'cpucode','923992029@qq.com','123','888888'),
    (2,'cpu','blog.csdn.net/qq_44226094','123','15022222222'),
    (3,'haha','github.com/CPU-Code','123','19258415625');


/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `userId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`roleId`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `sys_user_role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `sys_user` (`id`),
  CONSTRAINT `sys_user_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Data for the table `sys_user_role` */

insert  into
    `sys_user_role`(`userId`,`roleId`)
values
    (1,1),
    (1,2),
    (2,2),
    (2,3);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
