package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {

    public void batch() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql", "root", "Root@123");
        Statement statement = connection.createStatement();
        statement.addBatch("INSERT INTO employeetbl VALUES ('4','Susmitha','f')");
        statement.addBatch("INSERT INTO employeetbl VALUES ('5','Susmi','f')");

        statement.executeBatch();
        connection.close();

    }
}
