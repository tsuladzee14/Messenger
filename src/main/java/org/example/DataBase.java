package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private String url = "jdbc:mysql://localhost:3306/messenger";
    private String user;
    private String password;

    public DataBase(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
