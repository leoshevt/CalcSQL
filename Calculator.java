package com.company;

public class Calculator {
    reader reader = new reader();
    static String result;

    void calculate() {
        if (reader.operator.equals("+")) {
            result = Integer.toString(reader.firstarg + reader.secondarg);
            System.out.println(result);

        }
        if (reader.operator.equals("-")) {
            result = Integer.toString(reader.firstarg - reader.secondarg);
            System.out.println(result);
        }
        if (reader.operator.equals("*")) {
            result = Integer.toString(reader.firstarg * reader.secondarg);
            System.out.println(result);
        }
        if (reader.operator.equals(":")) {
            if (reader.secondarg == 0) {
                throw new ArithmeticException();
            }
            result = Integer.toString(reader.firstarg / reader.secondarg);
            System.out.println(result);
        }


    }

}
