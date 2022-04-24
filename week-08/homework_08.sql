## 分库分表

CREATE SCHEMA demo_ds_0;
CREATE SCHEMA demo_ds_1;

CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_0
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_1
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_2
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_3
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_4
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_5
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_6
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_7
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_8
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_9
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_10
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_11
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_12
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_13
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_14
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_15
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
#######
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_0
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_1
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_2
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_3
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_4
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_5
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_6
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_7
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_8
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_9
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_10
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_11
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_12
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_13
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_14
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_15
(
    order_id BIGINT NOT NULL AUTO_INCREMENT primary key,
    user_id    INT    NOT NULL
);


###

# insert into t_order(order_id, user_id)
# values (1, 100),
#        (2, 101),
#        (3, 100),
#        (4, 101),
#        (5, 100),
#        (6, 101),
#        (7, 100),
#        (8, 101),
#        (9, 100),
#        (10, 101),
#        (11, 100),
#        (12, 101),
#        (13, 100),
#        (14, 101),
#        (15, 100),
#        (16, 101),
#        (17, 105),
#        (18, 105),
#        (18, 105),
#        (20, 105);
#
# update t_order set user_id = 110 where user_id = 105


