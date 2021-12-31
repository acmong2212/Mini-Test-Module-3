package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
    public static Connection getConnection() {
        String jdbcURL = "jdbc:mysql://localhost:3306/thi-thu-qlhv";
        String jdbcUsername = "root";
        String jdbcPassword = "12345678";

        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
