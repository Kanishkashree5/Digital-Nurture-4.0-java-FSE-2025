// File: src/test/java/com/example/CalculatorTest.java
package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    @Test
    public void testAdd() {
        calculator calc = new calculator();
        int result = calc.add(3, 4);
        assertEquals(7, result);
    }
}
