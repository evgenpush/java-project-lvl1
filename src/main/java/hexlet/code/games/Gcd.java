package hexlet.code;

public class Gcd {
    public static void startGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";
        final int range = 100;
        final int quest = 0;
        final int answer = 1;
        final int amountMas = 2;
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_REPET][amountMas];

        for (int j = 0; j < Engine.NUMBER_OF_REPET; j++) {
            int numberOne = Util.getRandomNumber(1, range);
            int numberTwo = Util.getRandomNumber(1, range);
            questionsAndAnswers[j][quest] = getQuestion(numberOne, numberTwo);
            questionsAndAnswers[j][answer] = getAnswer(numberOne, numberTwo);
        }

        Engine.play(questionsAndAnswers, gameRule);
    }

    public static String getQuestion(int numberOne, int numberTwo) {
        return String.valueOf(numberOne) + " " + String.valueOf(numberTwo);
    }

    public static String getAnswer(int numberOne, int numberTwo) {
        int divisor = 1;
        for (int i = numberOne; i > 0; i--) {
            if (numberOne % i == 0) {
                if (numberTwo % i == 0) {
                    divisor = i;
                    i = 1;
                }
            }
        }
        return String.valueOf(divisor);
    }
}
