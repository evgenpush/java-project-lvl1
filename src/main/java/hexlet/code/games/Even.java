package hexlet.code;

public class Even {
    public static void startGame() {
        final int countRepeat = 3;
        final int range = 100; // range 0..100
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        int remainder;
        String corectAnswer;
        String mainMes = "Answer 'yes' if number even otherwise answer 'no'.";
        String name = Cli.getName();

        for (int i = 0; i < countRepeat; i++) {

            int number = Util.randomNumber(range) + 1;
            questions[i] = String.valueOf(number);
            remainder = number % 2;

            if (remainder == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }

        Engine.play(questions, answers, countRepeat, name, mainMes);
    }
}
