package hexlet.code;

public class Even {
    public static void startGame() {
        final int countRepeat = 3;
        final int range = 100; // range 0..100
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String gameRule = "Answer 'yes' if number even otherwise answer 'no'.";
        String name = Cli.getName();

        for (int i = 0; i < countRepeat; i++) {
            int randomNumber = Util.getRandomNumber(range) + 1;
            questions[i] = getQuestion(randomNumber);
            answers[i] = getAnswer(randomNumber);
        }

        Engine.play(questions, answers, countRepeat, name, gameRule);
    }

    public static String getQuestion(int randomNumber) {
        return String.valueOf(randomNumber);
    }

    public static String getAnswer(int randomNumber) {
        int remainder = randomNumber % 2;
        if (remainder == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
