package hexlet.code;

public class Progression {
    public static void startGame(String name) {
        String mainMes = "What number is missing in the progression?";
        final int countRepeat = 3;
        final int range = 10; // range 0..10
        final int max = 10;
        final int min = 5;
        StringBuffer progression = new StringBuffer();
        int count;
        int firstNum;
        int step;
        int skipNum;
        int corectAnswer = -1;
        String quest = "";
        boolean breakGame = false;
        Engine.startGame(mainMes);
        Double randomNumber;

        for (int i = 0; i < countRepeat; i++) {
            randomNumber = Math.random() * range + 1;
            firstNum = randomNumber.intValue();
            randomNumber = Math.random() * (max - min) + min;
            count = randomNumber.intValue();
            randomNumber = Math.random() * range + 1;
            step = randomNumber.intValue();
            randomNumber = Math.random() * count;
            skipNum = randomNumber.intValue();

            for (int j = 0; j < count; j++) {
                if (skipNum != j) {
                    progression.append(firstNum + step * j);
                    progression.append(" ");
                } else {
                    progression.append(".. ");
                    corectAnswer = firstNum + step * j;
                }
            }
            breakGame = Engine.step(String.valueOf(corectAnswer), progression.toString(), name);
            progression.setLength(0);
            if (breakGame) {
                i = countRepeat;
            }
        }
        Engine.endGame(breakGame, name);
    }
}
