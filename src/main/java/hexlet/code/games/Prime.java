package hexlet.code;

public class Prime {
    public static void startGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int countRepeat = 3;
        final int range = 1000;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String name = Cli.getName();

        for (int j = 0; j < countRepeat; j++) {
            int randomNumber = Util.getRandomNumber(range) + 1;
            questions[j] = getQuestion(randomNumber);
            answers[j] = getAnswer(randomNumber);

        }
        Engine.play(questions, answers, countRepeat, name, gameRule);
    }

    public static String getQuestion(int number) {
        return String.valueOf(number);
    }

    public static String getAnswer(int number) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "no";
                }
            }
            return "yes";
        } else {
            return "no";
        }
    }
}
