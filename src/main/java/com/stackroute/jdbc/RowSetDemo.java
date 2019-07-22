package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import com.sun.rowset.JdbcRowSetImpl;
public class RowSetDemo {
    public void rowSetDemo1() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //Creating and Executing RowSet


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Root@123");
            JdbcRowSet rowSet = new JdbcRowSetImpl(connection);
            // rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/msql");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from employeetbl");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.print("  Id: " + rowSet.getString(1));
                System.out.print("  Name: " + rowSet.getString(2));
                System.out.println("  Age: " + rowSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}


