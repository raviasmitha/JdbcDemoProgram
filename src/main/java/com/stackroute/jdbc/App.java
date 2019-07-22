package com.stackroute.jdbc;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        /*JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
        jdbcBatchDemo.batch();
*/
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.getTransactionDetails();
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("ashu","f");
        System.out.println("rowset demo");
        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.rowSetDemo1();
        System.out.println("resultset metadata demo");
        ResultSetMetadataDemo resultSetMetadataDemo = new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSetMetadata();
        System.out.println("database metadata demo");
        DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
        databaseMetadataDemo.databaseMetadata();

    }
}
