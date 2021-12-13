package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int exit = 0;
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        id = sc.nextInt();
        if (id == greet) {
            name = Cli.getName();
        } else if (id == even) {
            name = Cli.getName();
            Even.startEvenGame(name);
        } else if (id == calc) {
            name = Cli.getName();
            Calc.startCalcGame(name);
        }
    }
}
