
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(50) DEFAULT NULL,
	`password` VARCHAR(50) DEFAULT NULL,
	`birthday` VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=3 CHARSET=utf8;


INSERT
	`user`(`id`, `username`, `password`, `birthday`)
VALUES
	('1', 'cpu', '111', '2020-12-25'),
	('2', 'cpucode', '123', '2020-1-24');



DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders`(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `ordertime` VARCHAR(255) DEFAULT NULL,
    `total` DOUBLE DEFAULT NULL,
    `uid` INT(11) DEFAULT NULL,
    PRIMARY KEY(`id`),
    KEY `uid` (`uid`),
    CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT
	`orders`
VALUES
	('1', '2020-2-20', '3000', '1'),
	('2', '2020-5-24', '2000', '1'),
	('3', '2020-4-13', '4000', '2');



