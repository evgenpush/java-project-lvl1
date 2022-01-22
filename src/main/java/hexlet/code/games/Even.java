package hexlet.code;

public class Even {
    public static void startGame(int repetitionCount) {
        final int range = 100;
        final int amountMas = 2;
        final int quest = 0;
        final int answer = 1;
        String[][] questionsAndAnswers = new String[amountMas][repetitionCount];
        String gameRule = "Answer 'yes' if number even otherwise answer 'no'.";

        for (int i = 0; i < repetitionCount; i++) {
            int randomNumber = Util.getRandomNumber(1, range);
            questionsAndAnswers[quest][i] = getQuestion(randomNumber);
            questionsAndAnswers[answer][i] = getAnswer(randomNumber);
        }

        Engine.play(questionsAndAnswers, repetitionCount, gameRule);
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
