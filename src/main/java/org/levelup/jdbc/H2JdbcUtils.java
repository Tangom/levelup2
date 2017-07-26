package org.levelup.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Protsko D.
 */
public class H2JdbcUtils {

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            System.out.println("H2");
            return DriverManager.getConnection(
                    "jdbc:h2:mem:posts;INIT=create schema if not exists posts",
                    "sa","");
        } catch (SQLException e) {
            throw new RuntimeException("Couldn't get connection. " +
                    "Error message: "+ e.getMessage());
        }
    }


}
