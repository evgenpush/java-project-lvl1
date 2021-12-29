package hexlet.code;

public class Gcd {
    public static void startGame() {
        String mainMes = "Find the greatest common divisor of given numbers.";
        int numberOne;
        int numberTwo;
        int divisor = 1;
        final int countRepeat = 3;
        final int range = 100;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String name = Cli.getName();

        for (int j = 0; j < countRepeat; j++) {
            numberOne = Util.randomNumber(range + 1);
            numberTwo = Util.randomNumber(range + 1);
            questions[j] = String.valueOf(numberOne) + " " + String.valueOf(numberTwo);

            for (int i = numberOne; i > 0; i--) {
                if (numberOne % i == 0) {
                    if (numberTwo % i == 0) {
                        divisor = i;
                        i = 1;
                    }
                }
            }
            answers[j] = String.valueOf(divisor);
        }

        Engine.play(questions, answers, countRepeat, name, mainMes);
    }
}
