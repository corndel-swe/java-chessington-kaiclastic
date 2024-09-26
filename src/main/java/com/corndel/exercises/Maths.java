package com.corndel.exercises;

public class Maths {
    public static double PI = 3.14;

    public static double max(double a , double b) {
        return Math.max(a, b);
    }

    public static double round(double x) {
        double decimalPart = x - ((int) x);
        if (decimalPart >= 0.5){
            return (int) x + 1;
        }
        return (int) x;
    }

    public static double floor(double x) {
        return (int) x;
    }

    public static double ceil(double x) {
        return (int) x + 1;
    }

    public static int absolute(int x) {
        if (x<0){
            return x+-x+-x;
        }
        return x ;
    }

}
