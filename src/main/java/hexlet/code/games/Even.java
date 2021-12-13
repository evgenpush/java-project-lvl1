package hexlet.code;

public class Even {
    public static void startEvenGame(String name) {
        final int range = 100; // range 0..100
        final int countRepeat = 3;

        boolean breakGame = false;
        Double randomNumber;
        int remainder;
        String corectAnswer;
        String mainMes = "Answer 'yes' if number even otherwise answer 'no'.";
        Engine.startGame(mainMes);

        for (int i = 0; i < countRepeat; i++) {

            randomNumber = Math.random() * range + 1;
            int number = randomNumber.intValue();
            remainder = number % 2;

            if (remainder == 0) {
                corectAnswer = "yes";
            } else {
                corectAnswer = "no";
            }

            breakGame = Engine.step(corectAnswer, String.valueOf(number), name);
            if (breakGame) {
                i = countRepeat;
            }
        }
        Engine.endGame(breakGame, name);
    }
}
