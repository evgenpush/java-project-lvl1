package hexlet.code;

public class Progression {
    public static void startGame() {
        String mainMes = "What number is missing in the progression?";
        final int countRepeat = 3;
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
        String name = Cli.getName();

        for (int i = 0; i < countRepeat; i++) {
            firstNum = Util.randomNumber(range) + 1;
            count = Util.randomNumber(max - min) + min;
            step = Util.randomNumber(range) + 1;
            skipNum = Util.randomNumber(count);

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
}
