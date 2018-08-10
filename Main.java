package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionToBase CTB = new ConnectionToBase();
        reader reader = new reader();
        reader.read(args[0], args[1], args[2]);
        new Calculator().calculate();
        Scanner scanner = new Scanner(System.in);
        CTB.writeToBase(args[0], args[1], args[2], Calculator.result);
    }
}