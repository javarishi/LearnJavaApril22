package com.h2kinfosys.learnJava.day011;

import java.sql.*;

public class SimpleJDBCConnection {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        Connection conn = null;
        String query = "Select * from Actor";
        try {
            // 1. Driver
           // Driver mysqlDriver = new Driver();
            // 2. DriverManager
            //DriverManager.registerDriver(mysqlDriver);
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Connection
            conn = DriverManager.getConnection(url, "root", "password");
            // 4. Statement
            Statement stat = conn.createStatement();
            // 5. ResultSet
            ResultSet rs = stat.executeQuery(query);
            if(rs != null) {
                System.out.println("You are awesome!");
            }
            // 6. SQL Exception
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(conn != null) conn.close();
        }
    }
}
