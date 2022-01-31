package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_REPET = 3;

    public static int play(String[][] questionsAndAnswers, String gameRule) {
        final int quest = 0;
        final int answer = 1;
        String name = Cli.getName();
        System.out.println(gameRule);
        Scanner sc = new Scanner(System.in);
        boolean isBreakGame = false;

        for (int i = 0; i < Engine.NUMBER_OF_REPET; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][quest]);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(questionsAndAnswers[i][answer])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. Correct answer was '");
                System.out.println(questionsAndAnswers[i][answer] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return -1;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        return 0;
    }
}
