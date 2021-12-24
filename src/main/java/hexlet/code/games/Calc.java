package hexlet.code;

public class Calc {
    public static void startGame(String name, int countRepeat) {
        final int range = 10; // range 0..10
        final int rangeOperation = 3;
        int corectAnswer = -1;
        int numberOne;
        int numberTwo;
        int operation;
        String quest = "";
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String mainMes = "What is the result of the expression?";

        for (int i = 0; i < countRepeat; i++) {

            numberOne = randomNumber(range + 1).intValue();
            numberTwo = randomNumber(range + 1).intValue();
            operation = randomNumber(rangeOperation).intValue();

            if (operation == 0) {
                corectAnswer = numberOne + numberTwo;
                questions[i] = String.valueOf(numberOne) + " + " + String.valueOf(numberTwo);
            } else if (operation == 1) {
                corectAnswer = numberOne - numberTwo;
                questions[i] = String.valueOf(numberOne) + " - " + String.valueOf(numberTwo);
            } else if (operation == 2) {
                corectAnswer = numberOne * numberTwo;
                questions[i] = String.valueOf(numberOne) + " * " + String.valueOf(numberTwo);
            }
            answers[i] = String.valueOf(corectAnswer);
        }

        Engine.play(questions, answers, countRepeat, name, mainMes);
    }

    public static Double randomNumber(int range) {
        return Math.random() * range;
    }
}
