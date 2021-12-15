package hexlet.code;

public class Prime {
    public static void startGame(String name) {
        String mainMes = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int range = 1000;
        final int count = 3;
        String answer = "yes";
        int num;
        Double randomNumber;
        boolean breakGame = false;

        Engine.startGame(mainMes);

        for (int j = 0; j < count; j++) {
            randomNumber = Math.random() * range + 1;
            num = randomNumber.intValue();
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    answer = "no";
                    i = num;
                }
            }
            breakGame = Engine.step(answer, String.valueOf(num), name);
            if (breakGame) {
                j = count;
            }
        }
        Engine.endGame(breakGame, name);
    }
}
