package app;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;
    static double k;
    static int l;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        k = divide(a, b);
        System.out.println(k);
        l = subtraction(a, b);
        System.out.println(l);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }
}

