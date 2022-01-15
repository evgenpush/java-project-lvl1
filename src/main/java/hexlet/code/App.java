package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int repetitionCount = 3;
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        final int exit = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int id = sc.nextInt();
        if (id == greet) {
            Cli.getName();
        } else if (id == even) {
            Even.startGame(repetitionCount);
        } else if (id == calc) {
            Calc.startGame(repetitionCount);
        } else if (id == gcd) {
            Gcd.startGame(repetitionCount);
        } else if (id == progression) {
            Progression.startGame(repetitionCount);
        } else if (id == prime) {
            Prime.startGame(repetitionCount);
        }
    }
}
