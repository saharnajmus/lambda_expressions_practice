package be.intecbrussel;

public interface TextUtil {
    public static String quote(String s) {
        return String.format("<<%s>>", s);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
