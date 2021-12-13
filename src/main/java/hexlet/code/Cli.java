package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
