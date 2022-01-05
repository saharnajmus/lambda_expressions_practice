package be.intecbrussel;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {
    public BigDecimal parse(String s);
}
