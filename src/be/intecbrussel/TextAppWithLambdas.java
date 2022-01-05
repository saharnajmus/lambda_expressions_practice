package be.intecbrussel;

import java.math.BigDecimal;
import java.util.function.Function;

public class TextAppWithLambdas {
    public static void main(String[] args) {
        //String s = "hello world"; problem for lambda
        String c = "e";//can access only effectively constant local variables
        //  c="a"; // not allowed
        TextPrinter tp = new TextPrinter("hey i am learning lambdas");
      /*  System.out.println("words having e");
        tp.printFilteredWords((String s) -> s.contains(c));
        System.out.println("long words");
        tp.printFilteredWords(s -> s.length() > 4);
        System.out.println("by using direct reference to format method ");
        tp.printProcessedWords(s->String.format("<<%s>>",s));
        System.out.println("Static method reference");
        //ClassName::StaticMethodName  (syntax)
        tp.printProcessedWords(s->TextUtil.quote(s));
        System.out.println("using short form of above lambda expression");
        tp.printProcessedWords(TextUtil::quote);*/
     /*   System.out.println("bounded method reference");
        //objectName::methodName  (syntax)
        TextPadder padder = new TextPadder(20);
        // tp.printProcessedWords(s-> padder.pad(s));
        tp.printProcessedWords(padder::pad);
        System.out.println("unbounded method reference");
        //parameterType::methodName (syntax)
        //the execution of code here is not tied to specific object. we use object available via parameter of functional method
        // tp.printProcessedWords(s->s.toUpperCase());
        tp.printProcessedWords(String::toUpperCase);*/
        TextPrinter printer = new TextPrinter("123 456");
        System.out.println("Constructor reference");
        //ClassName::new (syntax)
        // printer.printNumberValues(s-> new BigDecimal(s));
        printer.printNumberValues(BigDecimal::new);
        tp.printProcessedWords(TextUtil::reverse);
        TextScrambler ts = new TextScrambler();
        tp.printProcessedWords(ts::scramble);
        printer.printSum(BigDecimal::new);
        //using default methods of "Function" functional interface
       /* Function<String,String> proc = String::toUpperCase;
        Function<String,String> proc1 = s->s.replace("e","o");
        Function<String,String> proc3= proc1.andThen(proc);
        tp.printProcessedWords(proc3);*/
    }
}
