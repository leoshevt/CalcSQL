package com.company;

import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionToBase CTB = new ConnectionToBase();
        System.out.println("Welcome to calculator");
        System.out.println("To start working, press enter and write: number, number, operator");
        System.out.println("If you want exit, write: exit");
        new Reader().choise();
    }
}
