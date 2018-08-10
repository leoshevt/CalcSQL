package com.company;

public class Calculator {

    static String result;

    void calculate() {
        if (Reader.operator.equals("+")) {
            result = Integer.toString(Reader.firstarg + Reader.secondarg);
            System.out.println(result);

        }
        if (Reader.operator.equals("-")) {
            result = Integer.toString(Reader.firstarg - Reader.secondarg);
            System.out.println(result);
        }
        if (Reader.operator.equals("*")) {
            result = Integer.toString(Reader.firstarg * Reader.secondarg);
            System.out.println(result);
        }
        if (Reader.operator.equals(":")) {
            if (Reader.secondarg == 0) {
                throw new ArithmeticException();
            }
            result = Integer.toString(Reader.firstarg / Reader.secondarg);
            System.out.println(result);
        }


    }

}
