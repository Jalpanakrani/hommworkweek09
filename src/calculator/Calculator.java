package calculator;
import java.util.*;

import static calculator.Main.*;

public class Calculator {
    public void computer() {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        while (true) {

            //Scanner scanner 2 = new Scanner(System.in)
            System.out.println("The operations you can enter are : Add(+) reduce (-) multiply(*) divide9/)");
            String str = scanner.nextLine();

            switch (str) {
                case "+":
                    a = add(a);
                    System.out.println("=" + a);
                    break;
                case "-":
                    a = subtract(a);
                    System.out.println("=" + a);
                    break;
                case "*":
                    a = multiply(a);
                    System.out.println("=" + a);
                    break;
                case "/":

                    if (a == 0) {

                        System.out.println("The divisor can not be zero, please re-enter ");
                        break;
                    }
                    a = divide(a);
                    System.out.println("=" + a);
                    break;

                default:
                    System.out.println("Wrong character input :");
            }
        }

    }}