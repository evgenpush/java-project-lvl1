package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}


