package JavaHW;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// solution using ternary operator:
//        System.out.println("Please, enter an integer.");
//        String a = in.nextInt()%2==0 ? "Entered number is even" : "Entered number is odd";
//        System.out.println(a);
        try {
            System.out.println("Please, enter an integer.");
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Entered number is even");
            } else {
                System.out.println("Entered number is odd");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
