package JavaHW;

import java.util.Scanner;

public class HelloLocalisation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, choose your preferred language. Type 'En' if it`s English, " +
                " 'Ru' if it`s Russian and 'Tr' if it`s Turkish");

        String language = scanner.nextLine();
        switch (language) {
            case "En": System.out.println("Hello, dear customer!");
            break;
            case "Ru": System.out.println("Привет, дорогой клиент!");
            break;
            case "Tr": System.out.println("Merhaba sevgili müşteri!");
            break;
            default:
                System.out.println("Unfortunately, this language is not supported");

        }


    }
}
