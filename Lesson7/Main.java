package Lesson7;

import java.util.Date;

import java.util.Scanner;


public class Main {
    public int fact(int x) {
        if (x == 1 || x == 0) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public void printHello(int n) {
        System.out.println("Hello");
        if (n > 1) {
            printHello(n - 1);
        }
    }

    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Main t = new Main();
        System.out.println(t.fact(4));
        t.printHello(5);
        System.out.println();
        System.out.println(t.fib(7));

        Date date = new Date();
        System.out.println(date.toLocaleString());
        long time = date.getTime();
        time += 60000;
        date.setTime(time);
        System.out.println(date.toLocaleString());
    }
}
