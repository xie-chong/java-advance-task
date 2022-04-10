create table test_db.user
(
    user_id      bigint primary key,
    name         varchar(20) default '' null,
    age          tinyint unsigned default 0 null,
    gender       enum ('男', '女', '中性', '保密') default '保密' null,
    phone        int(11),
    province     varchar(20),
    home_address varchar(50),
    is_delete    bit         default b'0' null
);


create table test_db.goods
(
    goods_id   bigint primary key,
    goods_name varchar(20) default '' null,
    price      bigint
);

create table test_db.goods_order
(
    id           bigint primary key,
    order_id     bigint,
    user_id      bigint not null,
    price        bigint,
    goods_number bigint
);