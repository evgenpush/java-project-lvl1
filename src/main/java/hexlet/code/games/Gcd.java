package hexlet.code;

public class Gcd {
    public static void startGcdGame(String name) {
        String mainMes = "Find the greatest common divisor of given numbers.";
        int numberOne;
        int numberTwo;
        boolean breakGame = false;
        Double randomNumber;
        int divisor = 1;
        final int range = 100;
        final int countRepeat = 3;
        Engine.startGame(mainMes);

        for (int j = 0; j < countRepeat; j++) {
            randomNumber = Math.random() * range + 1;
            numberOne = randomNumber.intValue();
            randomNumber = Math.random() * range + 1;
            numberTwo = randomNumber.intValue();
            String quest = String.valueOf(numberOne) + " " + String.valueOf(numberTwo);

            for (int i = numberOne; i > 0; i--) {
                if (numberOne % i == 0) {
                    if (numberTwo % i == 0) {
                        divisor = i;
                        i = 1;
                    }
                }
            }

            breakGame = Engine.step(String.valueOf(divisor), quest, name);
            if (breakGame) {
                j = countRepeat;
            }
        }
        Engine.endGame(breakGame, name);
    }
}
