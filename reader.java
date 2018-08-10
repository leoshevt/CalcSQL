package com.company;

public class reader {
    public static int firstarg;
    public static int secondarg;
    public static String operator;

    public reader() {
    }

    void read(String a, String b, String c) {
        this.firstarg = Integer.parseInt(a);
        this.secondarg = Integer.parseInt(b);
        this.operator = c;
    }


}
