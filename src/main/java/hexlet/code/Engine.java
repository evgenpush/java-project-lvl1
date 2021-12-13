package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(String mainMes) {
        System.out.println(mainMes);
    }

    public static boolean step(String corectAnswer, String quest, String name) {
        String answer;
        boolean breakGame = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + quest);
        System.out.print("Your answer: ");
        answer = sc.nextLine();

        if (answer.equals(corectAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + corectAnswer + "'.");
            breakGame = true;
        }

        return breakGame;
    }

    public static void endGame(Boolean breakGame, String name) {
        if (breakGame) {
            System.out.println("Let's try again, " + name + "!");

        } else {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
