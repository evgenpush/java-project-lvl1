package hexlet.code;

public class Util {
    public static int randomNumber(int range) {
        Double number = Math.random() * range;
        return number.intValue();
    }
}
