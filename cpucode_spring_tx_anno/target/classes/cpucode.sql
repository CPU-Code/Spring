create table acount (
    name varchar(20),   -- 名字
    money double        -- 钱
);

-- 修改数据
update
    acount
set
    money = 4000
where
    name = "cpu";


-- 插入数据
insert into
    acount
values
    ("cpuCode", 4000);


delete from
    acount
where
      money = 2222;