package hexlet.code;

public class Gcd {
    public static void startGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";
        final int countRepeat = 3;
        final int range = 100;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String name = Cli.getName();

        for (int j = 0; j < countRepeat; j++) {
            int numberOne = Util.getRandomNumber(range) + 1;
            int numberTwo = Util.getRandomNumber(range) + 1;
            questions[j] = getQuestion(numberOne, numberTwo);
            answers[j] = getAnswer(numberOne, numberTwo);
        }

        Engine.play(questions, answers, countRepeat, name, gameRule);
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
