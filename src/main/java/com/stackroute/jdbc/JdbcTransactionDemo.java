package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    public class JdbcTransactionDemo {
        public void getTransactionDetails() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Root@123");
                connection.setAutoCommit(false);

                Statement stmt = connection.createStatement();
                stmt.executeUpdate("insert into employeetbl values(6,'abhi','m')");
                stmt.executeUpdate("insert into employeetbl values(7,'uday','m')");

                connection.commit();
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
