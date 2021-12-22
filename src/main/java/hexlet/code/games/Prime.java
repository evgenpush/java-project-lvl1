package hexlet.code;

public class Prime {
    public static void startGame(String name) {
        String mainMes = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int range = 1000;
        final int countRepeat = 3;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        int num;
        Double randomNumber;
        boolean breakGame = false;

        Engine.startGame(mainMes);

        for (int j = 0; j < countRepeat; j++) {
            randomNumber = Math.random() * range + 1;
            num = randomNumber.intValue();
            questions[j] = String.valueOf(num);
            answers[j] = "yes";
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    answers[j] = "no";
                    i = num;
                }
            }
        }

        breakGame = Engine.step(questions, answers, countRepeat, name);
        Engine.endGame(breakGame, name);
    }
}
