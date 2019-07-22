package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void resultSetMetadata() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql", "root", "Root@123");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from employeetbl");
            ResultSet rs = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            System.out.println("Total columns: " + resultSetMetaData.getColumnCount());
            System.out.println("Column Name of 1st column: " + resultSetMetaData.getColumnName(1));
            System.out.println("Column Type Name of 1st column: " + resultSetMetaData.getColumnTypeName(1));

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
