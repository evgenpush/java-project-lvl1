package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(String mainMes) {
        System.out.println(mainMes);
    }

    public static boolean step(String[] questions, String[] answers, int count, String name) {
        String answer;
        Scanner sc = new Scanner(System.in);
        boolean breakGame =false;
        for (int i = 0; i < count; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            answer = sc.nextLine();

            if (answer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i] + "'.");
                breakGame = true;
                i = count;
            }
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
