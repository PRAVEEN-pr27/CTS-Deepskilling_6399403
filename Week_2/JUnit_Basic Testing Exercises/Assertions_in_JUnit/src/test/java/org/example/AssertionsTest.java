package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void validateMathAndObjectConditions() {
        // Check if the addition result matches the expected value
        int result = 2 + 3;
        assertEquals("Expected result of 2 + 3 is 5", 5, result);

        // Verify a true condition
        boolean isPositive = 10 > 0;
        assertTrue("10 should be greater than 0", isPositive);

        // Verify a false condition
        boolean isNegative = 2 < 1;
        assertFalse("2 is not less than 1", isNegative);

        // Check for null reference
        String text = null;
        assertNull("Text should be null", text);

        // Ensure an object is not null
        Object obj = new Object();
        assertNotNull("Object should not be null", obj);
    }
}
