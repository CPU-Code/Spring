
DROP DATABASE IF EXISTS `cpucode`;

CREATE DATABASE IF NOT EXISTS `cpucode`;

USE `cpucode`;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(50) DEFAULT NULL,
    `password` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO
	`user`(`id`, `username`, `password`)
VALUES
	(1, 'cpu', '123'),
	(2, 'cpuCode', '12345');