package hexlet.code;

public class Even {
    public static void startGame(int repetitionCount) {
        final int range = 100;
        String[] answers = new String[repetitionCount];
        String[] questions = new String[repetitionCount];
        String gameRule = "Answer 'yes' if number even otherwise answer 'no'.";
        String name = Cli.getName();

        for (int i = 0; i < repetitionCount; i++) {
            int randomNumber = Util.getRandomNumber(range) + 1;
            questions[i] = getQuestion(randomNumber);
            answers[i] = getAnswer(randomNumber);
        }

        Engine.play(questions, answers, repetitionCount, name, gameRule);
    }

    public static String getQuestion(int randomNumber) {
        return String.valueOf(randomNumber);
    }

    public static String getAnswer(int randomNumber) {
        if (isEvenNumber(randomNumber)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean isEvenNumber(int number) {
        int remainder = number % 2;
        return remainder == 0;
    }
}
