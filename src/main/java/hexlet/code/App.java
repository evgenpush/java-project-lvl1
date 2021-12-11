package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        id = sc.nextInt();
        if (id == 1) {
            System.out.println("\nWelcome to the Brain Games!");
            name = Cli.getName();
        } else if (id == 2) {
            System.out.println("\nWelcome to the Brain Games!");
            name = Cli.getName();
            Even.startEvenGame(name);
        }
    }
}
