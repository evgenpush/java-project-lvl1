package hexlet.code;

public class Prime {
    public static void startGame() {
        String mainMes = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int countRepeat = 3;
        final int range = 1000;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        int num;
        String name = Cli.getName();

        for (int j = 0; j < countRepeat; j++) {
            num = Util.randomNumber(range) + 1;
            questions[j] = String.valueOf(num);
            answers[j] = "yes";
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    answers[j] = "no";
                    i = num;
                }
            }
        }
        Engine.play(questions, answers, countRepeat, name, mainMes);
    }
}
