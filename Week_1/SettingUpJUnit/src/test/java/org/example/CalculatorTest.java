package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        try {
            calc.divide(10, 0);
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }
}
