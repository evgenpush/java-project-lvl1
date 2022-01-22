package hexlet.code;

public class Util {
    public static int getRandomNumber(int min, int max) {
        Double number = Math.random() * (max - min) + min;
        return number.intValue();
    }
}
