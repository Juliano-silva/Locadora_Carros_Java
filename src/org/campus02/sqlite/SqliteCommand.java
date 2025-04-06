package org.campus02.sqlite;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class SqliteCommand {
    public static void main(String[] args) {
        try{
            SqliteConnection client = new SqliteConnection("myDB.sqlite");

            client.executeStatement("");

        }catch (SQLException ex) {
            System.out.println("Ups! Something went wrong:" + ex.getMessage());
        }
    }
}
