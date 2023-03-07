package JavaHW.Lesson7.L4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter first number.");
        int num1 = input.nextInt();

        System.out.println("Please, enter second number.");
        int num2 = input.nextInt();

        System.out.println("choose the required operation: sum, average, or comparison.");
        String operation = input.next();

        switch (operation) {
            case "sum": int sum = num1 + num2;
                System.out.println("Sum is " + sum);
                break;
            case "average": int average = (num1 + num2) / 2;
                System.out.println("Average is " + average);
                break;
            case "comparison":
                if (num1 > num2) {
                    System.out.println(num1 + " is greater than " + num2);
                } else if (num1 < num2) {
                    System.out.println(num1 + " is less than " + num2);
                } else {
                    System.out.println(num1 + " is equal to " + num2);
                }
                break;
            default:
                System.out.println("Error. Try again.");
        }
    }
}
