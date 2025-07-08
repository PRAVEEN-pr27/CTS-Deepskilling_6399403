package org.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AaaPatternTest {

    private int numberA;
    private int numberB;

    @Before
    public void setup() {
        numberA = 10;
        numberB = 5;
    }

    @After
    public void teardown() {
        // Just a placeholder
    }

    @Test
    public void testAddition() {
        int result = numberA + numberB;
        assertEquals(15, result);
    }
}
