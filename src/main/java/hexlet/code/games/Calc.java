package hexlet.code;

public class Calc {
    private static final int PLUS = 0;
    private static final int MINUS = 1;
    private static final int MULTIPLY = 2;

    public static void startGame() {
        final int countRepeat = 3;
        final int range = 10;
        final int rangeOperation = 3;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String gameRule = "What is the result of the expression?";
        String name = Cli.getName();

        for (int i = 0; i < countRepeat; i++) {

            int numberOne = Util.getRandomNumber(range) + 1;
            int numberTwo = Util.getRandomNumber(range) + 1;
            int operation = Util.getRandomNumber(rangeOperation);

            answers[i] = getAnswer(operation, numberOne, numberTwo);
            questions[i] = getQuestion(operation, numberOne, numberTwo);
        }

        Engine.play(questions, answers, countRepeat, name, gameRule);
    }

    public static String getAnswer(int operation, int numberOne, int numberTwo) {
        int corectAnswer = -1;

        if (operation == PLUS) {
            corectAnswer = numberOne + numberTwo;
        } else if (operation == MINUS) {
            corectAnswer = numberOne - numberTwo;
        } else if (operation == MULTIPLY) {
            corectAnswer = numberOne * numberTwo;
        }
        return String.valueOf(corectAnswer);
    }

    public static String getQuestion(int operation, int numberOne, int numberTwo) {
        String question = "";

        if (operation == PLUS) {
            question = String.valueOf(numberOne) + " + " + String.valueOf(numberTwo);
        } else if (operation == MINUS) {
            question = String.valueOf(numberOne) + " - " + String.valueOf(numberTwo);
        } else if (operation == MULTIPLY) {
            question = String.valueOf(numberOne) + " * " + String.valueOf(numberTwo);
        }
        return question;
    }
}
