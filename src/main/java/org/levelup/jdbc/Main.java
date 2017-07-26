package org.levelup.jdbc;

import java.sql.SQLException;

/**
 * @author Protsko D.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        JdbcUtils.execute(JdbcUtils.CREATE_TABLE_USER);
    }

}
