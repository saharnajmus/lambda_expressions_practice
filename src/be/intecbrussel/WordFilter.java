package be.intecbrussel;

@FunctionalInterface //may have only one abstract method but may have multiple default and static methods
public interface WordFilter {
    public boolean isValid(String s);

    public default void defaultMethod() {
        System.out.println("hey i am a default method of functional interface ");
    }

    public static void staticMethod() {
        System.out.println("hey i am a static of functional interface");
    }

}
