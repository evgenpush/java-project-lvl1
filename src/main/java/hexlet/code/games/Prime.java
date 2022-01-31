package hexlet.code;

public class Prime {
    public static void startGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int range = 1000;
        final int quest = 0;
        final int answer = 1;
        final int amountMas = 2;
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_REPET][amountMas];

        for (int j = 0; j < Engine.NUMBER_OF_REPET; j++) {
            int randomNumber = Util.getRandomNumber(1, range);
            questionsAndAnswers[j][quest] = getQuestion(randomNumber);
            questionsAndAnswers[j][answer] = getAnswer(randomNumber);

        }
        Engine.play(questionsAndAnswers, gameRule);
    }

    public static String getQuestion(int number) {
        return String.valueOf(number);
    }

    public static String getAnswer(int number) {
        if (isPrimeNumber(number)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
