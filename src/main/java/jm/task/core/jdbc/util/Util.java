package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/jdbc";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Kata2023!!";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            //загрузка драйвера
            Class.forName(DB_DRIVER);
            //установка соединения
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
