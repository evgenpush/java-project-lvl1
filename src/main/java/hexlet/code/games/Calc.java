package hexlet.code;

public class Calc {
    public static void startGame(String name) {
        final int countRepeat = 3;
        final int range = 10; // range 0..10
        final int rangeOperation = 3;
        int corectAnswer = -1;
        String quest = "";
        boolean breakGame = false;
        String[] answers = new String[countRepeat];
        String[] questions = new String[countRepeat];

        String mainMes = "What is the result of the expression?";
        Engine.startGame(mainMes);
        Double randomNumber;
        for (int i = 0; i < countRepeat; i++) {

            randomNumber = Math.random() * range + 1;
            int numberOne = randomNumber.intValue();
            randomNumber = Math.random() * range + 1;
            int numberTwo = randomNumber.intValue();
            randomNumber = Math.random() * rangeOperation;
            int operation = randomNumber.intValue();

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

        breakGame = Engine.step(questions, answers, countRepeat, name);
        Engine.endGame(breakGame, name);
    }
}
