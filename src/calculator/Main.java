package calculator;

import java.util.Scanner;

public class Main  extends Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.computer();
    }

    public static double add(double a) {
        System.out.println("please enter a number :");
        Scanner scanner3 = new Scanner(System.in);
        double b = scanner3.nextDouble();
        return a + b;
    }

    public static double subtract(double a) {
        System.out.println("Please enter a number");
        Scanner scanner3 = new Scanner(System.in);
        double b = scanner3.nextDouble();
        return a - b;
    }

    public static double multiply(double a) {
        System.out.println("Please enter a number");
        Scanner scanner3 = new Scanner(System.in);
        double b = scanner3.nextDouble();
        return a * b;
    }

    public static double divide(double a) {
        System.out.println("Please enter a number");
        Scanner scanner3 = new Scanner(System.in);
        double b = scanner3.nextDouble();
        return a / b;
    }
}




