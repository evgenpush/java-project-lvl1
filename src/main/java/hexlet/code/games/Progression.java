package hexlet.code;

public class Progression {
    public static void startGame() {
        String gameRule = "What number is missing in the progression?";
        final int range = 10;
        final int max = 10;
        final int min = 5;

        final int quest = 0;
        final int answer = 1;
        final int amountMas = 2;
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_REPET][amountMas];

        for (int i = 0; i < Engine.NUMBER_OF_REPET; i++) {
            int firstNumber = Util.getRandomNumber(1, range);
            int count = Util.getRandomNumber(min, max);
            int step = Util.getRandomNumber(1, range);
            int skipNumber = Util.getRandomNumber(0, count);

            questionsAndAnswers[i][answer] = getAnswer(firstNumber, step, skipNumber);
            questionsAndAnswers[i][quest] = getQuestion(firstNumber, step, skipNumber, count);
        }
        Engine.play(questionsAndAnswers, gameRule);
    }

    public static String getQuestion(int firstNumber, int step, int skipNumber, int count) {
        StringBuffer progression = new StringBuffer();
        for (int j = 0; j < count; j++) {
            if (skipNumber != j) {
                progression.append(firstNumber + step * j);
                progression.append(" ");
            } else {
                progression.append(".. ");
            }
        }
        return progression.toString();
    }

    public static String getAnswer(int firstNumber, int step, int skipNumber) {
        int corectAnswer = firstNumber + step * skipNumber;
        return String.valueOf(corectAnswer);
    }
}
