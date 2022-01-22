package hexlet.code;

public class Calc {
    private static final int PLUS = 0;
    private static final int MINUS = 1;
    private static final int MULTIPLY = 2;

    public static void startGame(int repetitionCount) {

        final int range = 10;
        final int rangeOperation = 3;
        final int quest = 0;
        final int answer = 1;
        final int amountMas = 2;
        String[][] questionsAndAnswers = new String[amountMas][repetitionCount];
        String gameRule = "What is the result of the expression?";


        for (int i = 0; i < repetitionCount; i++) {

            int numberOne = Util.getRandomNumber(1, range);
            int numberTwo = Util.getRandomNumber(1, range);
            int operation = Util.getRandomNumber(0, rangeOperation);

            questionsAndAnswers[answer][i] = getAnswer(operation, numberOne, numberTwo);
            questionsAndAnswers[quest][i] = getQuestion(operation, numberOne, numberTwo);
        }

        Engine.play(questionsAndAnswers, repetitionCount, gameRule);
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
