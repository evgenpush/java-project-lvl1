package hexlet.code;

public class Gcd {
    public static void startGame(int repetitionCount) {
        String gameRule = "Find the greatest common divisor of given numbers.";
        final int range = 100;
        final int quest = 0;
        final int answer = 1;
        final int amountMas = 2;
        String[][] questionsAndAnswers = new String[amountMas][repetitionCount];

        for (int j = 0; j < repetitionCount; j++) {
            int numberOne = Util.getRandomNumber(1, range);
            int numberTwo = Util.getRandomNumber(1, range);
            questionsAndAnswers[quest][j] = getQuestion(numberOne, numberTwo);
            questionsAndAnswers[answer][j] = getAnswer(numberOne, numberTwo);
        }

        Engine.play(questionsAndAnswers, repetitionCount, gameRule);
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
