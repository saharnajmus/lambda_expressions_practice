package be.intecbrussel;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NewTextPrinter {
    private String sentence;
    private BigDecimal sum = BigDecimal.ZERO;

    public NewTextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public NewTextPrinter(String sentence, Consumer<String> printer) {
        for (String w : sentence.split(" ")) {
            printer.accept(w);


        }
    }

    public void printFilteredWords(Predicate<String> filter) {
        for (String w : sentence.split(" ")) {
            if (filter.test(w)) {
                System.out.println(w);
            }
        }
    }

    public void printProcessedWords(Function<String, String> processor) {
        for (String w : sentence.split(" ")) {
            System.out.println(processor.apply(w));
        }
    }

    public void printNumberValues(Function<String, BigDecimal> parser) {
        for (String w : sentence.split(" ")) {
            System.out.format("%f", parser.apply(w));

        }
    }
}
