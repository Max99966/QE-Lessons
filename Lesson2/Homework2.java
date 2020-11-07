package Lesson2;

import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //This is a random thing that I decided to do.
//        System.out.println("Please enter your age.");
//        int age = input.nextInt();
//        if (age == 0 || age >= 100){
//            do {
//                System.out.println("Please enter a valid age.");
//                age = input.nextInt();
//            } while (age == 0 || age >= 100);
//        }
//        System.out.println("Please enter your name.");
//        String name = input.next();
//        System.out.println("Please enter your surname");
//        String surname = input.next();
//        System.out.println("Here are your entered information: ");
//        System.out.println("Name: " + name);
//        System.out.println("Surname: " + surname);
//        System.out.println("Age: " + age);
        //Task 1
        int[] twoArray = new int[2];
        twoArray[0] = 9;
        twoArray[1] = 6;

        //Task 2
        int[] thousandArray = new int[1001];
        for (int i = 1; i < 1001; i++) {
            thousandArray[i] = i;
        }

        //Task 3
        int[] oddArray = new int[21];
        int k = 0;
        for (int i = -20; i < 20; i++) {
            if (i % 2 != 0) {
                oddArray[k] = i;
                k++;
            }
        }

        //Task 4
        System.out.println("This is Task 4");
        int[] fiveArray = new int[5];
        fiveArray[0] = 5;
        fiveArray[1] = 6;
        fiveArray[2] = 10;
        fiveArray[3] = 15;
        fiveArray[4] = 16;
        for (int i = 0; i < 5; i++) {
            if (fiveArray[i] % 5 == 0) {
                System.out.println(fiveArray[i]);
            }
        }

        //Task 5
        System.out.println("This is Task 5");
        double[] doubleArray = new double[5];
        doubleArray[0] = 1.5;
        doubleArray[1] = 467.22;
        doubleArray[2] = 24.1;
        doubleArray[3] = 25.4;
        doubleArray[4] = 468.2;
        for (int i = 0; i < 5; i++) {
            if (doubleArray[i] > 24.12 && doubleArray[i] < 467.23) {
                System.out.println(doubleArray[i]);
            }
        }

        //Task 6
        System.out.println("This is Task 6");
        int[] countArray = new int[10];
        countArray[0] = 2;
        countArray[1] = 3;
        countArray[2] = 4;
        countArray[3] = 18;
        countArray[4] = 25;
        countArray[5] = 30;
        countArray[6] = 200;
        countArray[7] = 199;
        countArray[8] = 52890;
        countArray[9] = 16789;
        int n = 0;
        for (int i = 0; i < 10; i++) {
            if (countArray[i] % 2 == 0) {
                n++;
            }
        }
        System.out.println("The amount of numbers that are divided by two: " + n);

        //Task 7
        System.out.println("This is Task 7:");
        System.out.println("Please enter a Number in the range of [1 , 20]");
        int N = input.nextInt();
        if (N <= 0 || N > 21) {
            do {
                System.out.println("Please enter a Number in the range of [1 , 20]");
                N = input.nextInt();
            } while (N <= 0 || N > 21);
        }
        int[] multipleArray = new int[10];
        int j = 0;
        for (int i = 1; i < 11; i++) {
            multipleArray[j] = N * i;
            System.out.println(N + "x" + i + "=" + multipleArray[j]);
            j++;
        }
    }
}
