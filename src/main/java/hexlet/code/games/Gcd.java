package hexlet.code;

public class Gcd {
    public static void startGame(String name) {
        String mainMes = "Find the greatest common divisor of given numbers.";
        int numberOne;
        int numberTwo;
        boolean breakGame = false;
        Double randomNumber;
        int divisor = 1;
        final int range = 100;
        final int countRepeat = 3;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        Engine.startGame(mainMes);

        for (int j = 0; j < countRepeat; j++) {
            randomNumber = Math.random() * range + 1;
            numberOne = randomNumber.intValue();
            randomNumber = Math.random() * range + 1;
            numberTwo = randomNumber.intValue();
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

        breakGame = Engine.step(questions, answers, countRepeat, name);

        Engine.endGame(breakGame, name);
    }
}
