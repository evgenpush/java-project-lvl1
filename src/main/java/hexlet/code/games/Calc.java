package hexlet.code;

public class Calc {
    public static void startGame() {
        final int countRepeat = 3;
        final int range = 10; // range 0..10
        final int rangeOperation = 3;
        final int plus = 0;
        final int minus = 1;
        final int umnozh = 2;
        int corectAnswer = -1;
        int numberOne;
        int numberTwo;
        int operation;
        String quest = "";
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];
        String mainMes = "What is the result of the expression?";
        String name = Cli.getName();

        for (int i = 0; i < countRepeat; i++) {

            numberOne = Util.randomNumber(range + 1);
            numberTwo = Util.randomNumber(range + 1);
            operation = Util.randomNumber(rangeOperation);

            if (operation == plus) {
                corectAnswer = numberOne + numberTwo;
                questions[i] = String.valueOf(numberOne) + " + " + String.valueOf(numberTwo);
            } else if (operation == minus) {
                corectAnswer = numberOne - numberTwo;
                questions[i] = String.valueOf(numberOne) + " - " + String.valueOf(numberTwo);
            } else if (operation == umnozh) {
                corectAnswer = numberOne * numberTwo;
                questions[i] = String.valueOf(numberOne) + " * " + String.valueOf(numberTwo);
            }
            answers[i] = String.valueOf(corectAnswer);
        }

        Engine.play(questions, answers, countRepeat, name, mainMes);
    }
}
