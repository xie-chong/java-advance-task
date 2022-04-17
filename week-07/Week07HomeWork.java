package com.chong.jdbcdemo;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class Week07HomeWork {
    private static String sqlStatement;

    public static void main(String[] args) throws Exception {
        Connection con = JDBCUtils.getConnection();
        try {
//            methtod1(con);
            methtod2(con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.closeResource(con, null, null);
        }
    }

    public static void methtod1(Connection con) throws SQLException {
        con.setAutoCommit(false);
        Statement sta = con.createStatement();
        log.info("执行 methtod1");
        long max = 1_000_000;
        while (max > 0) {
            long id = max;
            sqlStatement = "INSERT INTO goods_order (id, order_id, user_id, price, goods_number) " +
                    "VALUES(" + id + "," + id + ",'test' " + ",100," + id + ")";
            sta.executeUpdate(sqlStatement);
            max--;
        }
        con.commit();
    }

    public static void methtod2(Connection con) throws SQLException {
        log.info("执行 methtod2");
        long max = 1_000_000;
        long times = 1000;
        while (times > 0) {
            con.setAutoCommit(false);
            Statement sta = con.createStatement();
            for (int i = 1; i < +1000; i++) {
                long id = max - times * 1000 - i;
                String sql = "INSERT INTO goods_order (id, order_id, user_id, price, goods_number) " +
                        "VALUES(" + id + "," + id + ",'test' " + ",100," + id + ")";
                sta.addBatch(sql);
            }
            sta.executeBatch();
            con.commit();
            times--;
        }
    }
}
