package org.campus02.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class SqliteConnection {
    private Connection connection = null;

    public SqliteConnection(String dbName) throws SQLException{
        connection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
    }

    public void executeStatement(String sqlStatement) throws SQLException{
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);  // set timeout to 30 sec.
        statement.executeUpdate(sqlStatement);
    }
}
