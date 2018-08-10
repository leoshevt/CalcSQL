package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Reader {
    public static int firstarg;
    public static int secondarg;
    public static String operator;

    public Reader() {
    }

    void read() {
        this.firstarg = new Scanner(System.in).nextInt();
        this.secondarg = new Scanner(System.in).nextInt();
        this.operator = new Scanner(System.in).nextLine();
    }
    void choise() throws SQLException, ClassNotFoundException {
        String choise = new Scanner(System.in).nextLine();
        switch (choise){
            case "exit": break;
            default:{Reader reader = new Reader();
                reader.read();
                new Calculator().calculate();
                new ConnectionToBase().writeToBase(Integer.toString(Reader.firstarg), Integer.toString(Reader.secondarg), Reader.operator, Calculator.result);}
        }
    }


}
