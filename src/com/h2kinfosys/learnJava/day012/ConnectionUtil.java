package com.h2kinfosys.learnJava.day012;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static String url = "jdbc:mysql://localhost:3306/sakila";

    public static Connection getConnection() throws Exception{
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,info);
    }


    public static void closeConnection(Connection conn){
        if (conn!= null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Closing attempt error : Please ignore");
            }
        }
    }
}
