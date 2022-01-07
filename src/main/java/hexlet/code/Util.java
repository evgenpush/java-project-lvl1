package hexlet.code;

public class Util {
    public static int getRandomNumber(int range) {
        Double number = Math.random() * range;
        return number.intValue();
    }
}
