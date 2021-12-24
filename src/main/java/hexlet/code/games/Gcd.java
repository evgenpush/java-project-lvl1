package hexlet.code;

public class Gcd {
    public static void startGame(String name, int countRepeat) {
        String mainMes = "Find the greatest common divisor of given numbers.";
        int numberOne;
        int numberTwo;
        int divisor = 1;
        final int range = 100;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];

        for (int j = 0; j < countRepeat; j++) {
            numberOne = randomNumber(range + 1).intValue();
            numberTwo = randomNumber(range + 1).intValue();
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

    public static Double randomNumber(int range) {
        return Math.random() * range;
    }
}
