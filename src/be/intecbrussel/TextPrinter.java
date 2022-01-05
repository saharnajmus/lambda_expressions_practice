package be.intecbrussel;

import java.math.BigDecimal;
import java.time.Period;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
    private String sentence;
    private BigDecimal sum = BigDecimal.ZERO;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String w : sentence.split(" ")) {
            if (filter.isValid(w)) {
                System.out.println(w);
            }
        }
    }

    public void printProcessedWords(WordProcessor processor) {
        for (String w : sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    // here we are using our own defined interface
    public void printNumberValues(NumberParser parser) {
        for (String w : sentence.split(" ")) {
            System.out.format("%f", parser.parse(w));
        }
    }

    public void printSum(NumberParser parser) {
        for (String w : sentence.split(" ")) {
            sum = sum.add(parser.parse(w));
        }
        System.out.println(sum.doubleValue());

    }
}
