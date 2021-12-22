package hexlet.code;

public class Even {
    public static void startGame(String name) {
        final int range = 100; // range 0..100
        final int countRepeat = 3;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        boolean breakGame = false;
        Double randomNumber;
        int remainder;
        String corectAnswer;
        String mainMes = "Answer 'yes' if number even otherwise answer 'no'.";
        Engine.startGame(mainMes);

        for (int i = 0; i < countRepeat; i++) {

            randomNumber = Math.random() * range + 1;
            int number = randomNumber.intValue();
            questions[i] = String.valueOf(number);
            remainder = number % 2;

            if (remainder == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }

        breakGame = Engine.step(questions, answers, countRepeat, name);

        Engine.endGame(breakGame, name);
    }
}
