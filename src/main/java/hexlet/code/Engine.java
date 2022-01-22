package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static int play(String[][] questionsAndAnswers, int count, String gameRule) {
        final int quest = 0;
        final int answer = 1;
        String name = Cli.getName();
        System.out.println(gameRule);
        Scanner sc = new Scanner(System.in);
        boolean isBreakGame = false;

        for (int i = 0; i < count; i++) {
            System.out.println("Question: " + questionsAndAnswers[quest][i]);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(questionsAndAnswers[answer][i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. Correct answer was '");
                System.out.println(questionsAndAnswers[answer][i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return -1;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        return 0;
    }
}
