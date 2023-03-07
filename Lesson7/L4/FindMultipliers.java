package JavaHW.Lesson7.L4;

import java.util.Scanner;

public class FindMultipliers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int value = keyboard.nextInt();

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if (i * j == value) {
                    System.out.println(i + "*" + j + "=" + value);
                }
            }
        }
    }
}