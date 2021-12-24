package hexlet.code;

public class Progression {
    public static void startGame(String name, int countRepeat) {
        String mainMes = "What number is missing in the progression?";
        final int range = 10; // range 0..10
        final int max = 10;
        final int min = 5;
        StringBuffer progression = new StringBuffer();
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        int count;
        int firstNum;
        int step;
        int skipNum;
        int corectAnswer = -1;
        String quest = "";

        for (int i = 0; i < countRepeat; i++) {
            firstNum = randomNumber(range + 1).intValue();
            count = randomNumber(max - min).intValue() + min;
            step = randomNumber(range + 1).intValue();
            skipNum = randomNumber(count).intValue();

            for (int j = 0; j < count; j++) {
                if (skipNum != j) {
                    progression.append(firstNum + step * j);
                    progression.append(" ");
                } else {
                    progression.append(".. ");
                    corectAnswer = firstNum + step * j;
                    answers[i] = String.valueOf(corectAnswer);
                }
            }
            questions[i] = progression.toString();
            progression.setLength(0);
        }
        Engine.play(questions, answers, countRepeat, name, mainMes);
    }

    public static Double randomNumber(int range) {
        return Math.random() * range;
    }
}
