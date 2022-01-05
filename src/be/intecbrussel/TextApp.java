package be.intecbrussel;

import java.util.function.Predicate;

public class TextApp {
    public static void main(String[] args) {
        String s = "this is a String"; //ok for anonymous nested class
        TextPrinter textPrinter = new TextPrinter("hey! I am learning lambdas");
        System.out.println("*****words containing e*****");
        textPrinter.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });

    }
}
