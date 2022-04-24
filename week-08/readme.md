# Week08 作业题目

1.（选做）分析前面作业设计的表，是否可以做垂直拆分。
2.（必做）设计对前面的订单表数据进行水平分库分表，拆分 2 个库，每个库 16 张表。并在新结构在演示常见的增删改查操作。代码、sql 和配置文件，上传到 Github。
3.（选做）模拟 1000 万的订单单表数据，迁移到上面作业 2 的分库分表中。
4.（选做）重新搭建一套 4 个库各 64 个表的分库分表，将作业 2 中的数据迁移到新分库。

5.（选做）列举常见的分布式事务，简单分析其使用场景和优缺点。
6.（必做）基于 hmily TCC 或 ShardingSphere 的 Atomikos XA 实现一个简单的分布式事务应用 demo（二选一），提交到 Github。
7.（选做）基于 ShardingSphere narayana XA 实现一个简单的分布式事务 demo。
8.（选做）基于 seata 框架实现 TCC 或 AT 模式的分布式事务 demo。
9.（选做☆）设计实现一个简单的 XA 分布式事务框架 demo，只需要能管理和调用 2 个 MySQL 的本地事务即可，不需要考虑全局事务的持久化和恢复、高可用等。
10.（选做☆）设计实现一个 TCC 分布式事务框架的简单 Demo，需要实现事务管理器，不需要实现全局事务的持久化和恢复、高可用等。
11.（选做☆）设计实现一个 AT 分布式事务框架的简单 Demo，仅需要支持根据主键 id 进行的单个删改操作的 SQL 或插入操作的事务。


# ------------------------笔记-------------------------------

1. 下载apache-shardingsphere-proxy

https://shardingsphere.apache.org/document/current/en/downloads/

创建数据库以及对应的表

2. 修改apache-shardingsphere-proxy配置文件，生成数映射规则

编辑%SHARDING_PROXY_HOME%\conf\config-xxx.yaml。详情请参见配置手册。
编辑%SHARDING_PROXY_HOME%\conf\server.yaml。详情请参见配置手册。

3. 启动apache-shardingsphere-proxy\bin

默认端口为3307，也可以在启动命令后指定（空格+端口号）

###################
#
# If you want to connect to MySQL, you should manually copy MySQL driver to lib directory.
#
###################


服务应用数据库的连接串修改为apache-shardingsphere-proxy对应的逻辑连接串
