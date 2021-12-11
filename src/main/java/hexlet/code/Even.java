package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void startEvenGame(String name) {
        final int range = 100; // range 0..100
        final int countRepeat = 3;

        boolean breakGame = false;
        Double randomNumber;
        int remainder;
        String answer;
        String corectAnswer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < countRepeat; i++) {
            randomNumber = Math.random() * range + 1;
            System.out.println("Question: " + randomNumber.intValue());
            answer = sc.nextLine();
            remainder = randomNumber.intValue() % 2;

            if (remainder == 0) {
                corectAnswer = "yes";
            } else {
                corectAnswer = "no";
            }

            if (answer.equals(corectAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was");
                System.out.println("'" + corectAnswer + "'.\nLet's try again, " + name + "!");
                i = countRepeat;
                breakGame = true;
            }
        }
        if (!breakGame) {
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
