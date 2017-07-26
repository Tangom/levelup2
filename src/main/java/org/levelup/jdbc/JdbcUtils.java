package org.levelup.jdbc;

import java.sql.*;

/**
 * @author Protsko D.
 */
public class JdbcUtils {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't register driver. " +
                    "Error message: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            System.out.println("MySQL");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/posts?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException("Couldn't get connection. " +
                    "Error message: "+ e.getMessage());
        }
    }

    public static final String CREATE_TABLE_USER =
            "CREATE TABLE IF NOT EXISTS USER (" +
                    "USER_ID INT PRIMARY KEY AUTO_INCREMENT," +
                    "LOGIN VARCHAR(20) UNIQUE NOT NULL," +
                    "NAME VARCHAR(30) NOT NULL," +
                    "LAST_NAME VARCHAR(30) NOT NULL" +
            ")";

    public static void execute(String sql) {
        // try-with-resource
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement()) {
            System.out.println("Changed rows = " +
                    statement.executeUpdate(sql));
            ResultSet rs =
                    statement.executeQuery("select * from user");
            while (rs.next()) {

                int userId = rs.getInt("USER_ID");
                String login = rs.getString("LOGIN");
                String name = rs.getString("NAME");
                String lastName = rs.getString("LAST_NAME");

                System.out.println("Id = " + userId + ", login = " +
                        login + ", name = " + name + ", " +
                        "lastName = " + lastName);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
