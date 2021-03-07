
drop table if exists `account`;

create table `account`(
    `id` int not null auto_increment,
    `name` varchar(100) default null,
    `money` double(7, 2),
    primary key(`id`)
)engine=InnoDB auto_increment=3 charset=utf8;

insert into
    `account`
values
    ('1', 'cpu', '5000'),
    ('2', 'cpuCode', '5000');