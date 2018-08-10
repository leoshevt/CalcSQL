package com.company;

import java.sql.*;

public class ConnectionToBase {
    private static final String SQL_INSERT = "INSERT INTO calc"
            + " VALUES(?, ?, ?, ?)";

    ConnectionToBase() {
    }

    void writeToBase(String firstargs, String secondargs, String operator, String result) throws SQLException, ClassNotFoundException {
        String username = "root";
        String pass = "";
        String URL = "jdbc:mysql://localhost:3306/calc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection(URL, username, pass)) {
            //System.out.println("We are connected");
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, firstargs);
            statement.setString(2, secondargs);
            statement.setString(3, operator);
            statement.setString(4, result);
            statement.executeUpdate();
            System.out.println("data added to the table");
        }
    }


}
