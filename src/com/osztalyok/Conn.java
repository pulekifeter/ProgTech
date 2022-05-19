package com.osztalyok;

import java.sql.*;

public class Conn {
    final String DB_URL = "jdbc:mysql://localhost/konyvtar_db?";

    final String USERNAME = "root";

    final String PASSWORD ="";


    public Connection Con() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        return conn;
    }
}
