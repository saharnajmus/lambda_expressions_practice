package be.intecbrussel;

import java.util.function.Function;

public class TextScrambler {

    public String scramble(String s) {
        return s.replace("e", "£")
                .replace("a", "@")
                .replace("o", "0");
    }
}