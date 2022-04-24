package com.chong.jdbcdemo;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class Week08HomeWork {
    private static String sqlStatement;

    public static void main(String[] args) throws Exception {
        Connection con = JDBCUtils.getConnection();
        try {
            insertData(con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.closeResource(con, null, null);
        }
    }

    public static void insertData(Connection con) throws SQLException {
        con.setAutoCommit(false);
        Statement sta = con.createStatement();
        log.info("执行 insertData");
            sqlStatement = "insert into t_order(order_id, user_id)\n" +
                    "values (1, 100),\n" +
                    "       (2, 101),\n" +
                    "       (3, 100),\n" +
                    "       (4, 101),\n" +
                    "       (5, 100),\n" +
                    "       (6, 101),\n" +
                    "       (7, 100),\n" +
                    "       (8, 101),\n" +
                    "       (9, 100),\n" +
                    "       (10, 101),\n" +
                    "       (11, 100),\n" +
                    "       (12, 101),\n" +
                    "       (13, 100),\n" +
                    "       (14, 101),\n" +
                    "       (15, 100),\n" +
                    "       (16, 101),\n" +
                    "       (17, 105),\n" +
                    "       (18, 105),\n" +
                    "       (18, 105),\n" +
                    "       (20, 105)";
            sta.executeUpdate(sqlStatement);
        con.commit();
    }

    public static void updateData(Connection con) throws SQLException {
        con.setAutoCommit(false);
        Statement sta = con.createStatement();
        log.info("执行 updateData user_id = 105");
        sqlStatement = "update t_order set user_id = 110 where user_id = 105";
        sta.executeUpdate(sqlStatement);
        con.commit();
    }


}
