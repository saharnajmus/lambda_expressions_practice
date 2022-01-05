package be.intecbrussel;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NewTextApp {
    public static void main(String[] args) {
        NewTextPrinter ntp = new NewTextPrinter("Hello this is an example of Standard functional interface ");
        Predicate<String> condition1 = s -> s.contains("e");
        Predicate<String> condition2 = s -> s.contains("a");
        Predicate<String> condition = condition1.and(condition2);
        ntp.printFilteredWords(condition);

        Function<String, String> proc1 = String::toUpperCase;
        Function<String, String> proc2 = Auxiliary::reverseString;
        Function<String, String> proc3 = proc1.andThen(proc2);
        ntp.printProcessedWords(proc3);
        Consumer<String> printer = System.out::append;

        NewTextPrinter ntp1 = new NewTextPrinter(" hello this is a second constructor", printer);

    }
}
class Auxiliary {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

}