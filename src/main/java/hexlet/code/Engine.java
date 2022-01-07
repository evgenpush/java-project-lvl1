package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(String gameRule) {
        System.out.println(gameRule);
    }

    public static void play(String[] questions, String[] answers, int count, String name, String gameRule) {
        startGame(gameRule);
        Scanner sc = new Scanner(System.in);
        boolean isBreakGame = false;

        for (int i = 0; i < count; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (answer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i] + "'.");
                isBreakGame = true;
                i = count;
            }
        }
        endGame(isBreakGame, name);
    }

    public static void endGame(Boolean isBreakGame, String name) {
        if (isBreakGame) {
            System.out.println("Let's try again, " + name + "!");

        } else {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
