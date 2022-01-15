package hexlet.code;

public class Progression {
    public static void startGame(int repetitionCount) {
        String gameRule = "What number is missing in the progression?";
        final int range = 10;
        final int max = 10;
        final int min = 5;

        String[] answers = new String[repetitionCount];
        String[] questions = new String[repetitionCount];
        String name = Cli.getName();

        for (int i = 0; i < repetitionCount; i++) {
            int firstNumber = Util.getRandomNumber(range) + 1;
            int count = Util.getRandomNumber(max - min) + min;
            int step = Util.getRandomNumber(range) + 1;
            int skipNumber = Util.getRandomNumber(count);

            answers[i] = getAnswer(firstNumber, step, skipNumber);
            questions[i] = getQuestion(firstNumber, step, skipNumber, count);
        }
        Engine.play(questions, answers, repetitionCount, name, gameRule);
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
