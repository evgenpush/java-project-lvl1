package hexlet.code;

public class Prime {
    public static void startGame(int repetitionCount) {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int range = 1000;
        String[] answers = new String[repetitionCount];
        String[] questions = new String[repetitionCount];
        String name = Cli.getName();

        for (int j = 0; j < repetitionCount; j++) {
            int randomNumber = Util.getRandomNumber(range) + 1;
            questions[j] = getQuestion(randomNumber);
            answers[j] = getAnswer(randomNumber);

        }
        Engine.play(questions, answers, repetitionCount, name, gameRule);
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
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
