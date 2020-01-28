package test;

import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    /**
     * calculate the maximum number when all values are positive and no values is null
     */
    @Test
    void getMax() {
        Calculator c = new Calculator(5, 8, 4);
        Integer max = c.getMax();
        assertEquals(max, 8);
    }

    /**
     * calculate the maximum when one or more values are negatives
     */
    @Test
    void getMaxWithNegative() {
        Calculator c = new Calculator(-5, -8, 4);
        Integer max = c.getMax();
        assertEquals(max, 4);
    }


    /**
     * test with the values of A null
     */
    @Test
    void getMaxWithANull() {
        Calculator c = new Calculator(null, 2, 6);
        Integer max = c.getMax();
        assertEquals(max, 6);
    }

    /**
     * test with the values of B null
     */
    @Test
    void getMaxWithBNull() {
        Calculator c = new Calculator(9, null, 10);
        Integer max = c.getMax();
        assertEquals(max, 10);
    }

    /**
     * test with the value of C null
     */
    @Test
    void getMaxWithCNull() {
        Calculator c = new Calculator(4, 2, null);
        Integer max = c.getMax();
        assertEquals(max, 4);
    }

    /**
     * check if the A values is even when the values of a is positive and not null
     * and a is even
     */
    @Test
    void isAEven() {
        Calculator c1 = new Calculator(6, 7, 9);
        Boolean even = c1.isAEven();
        assertTrue(even);
    }

    /**
     * check if the A values is even when the values of a is positive and not null
     * and a is not even
     */
    @Test
    void isANotEven() {
        Calculator c1 = new Calculator(7, 7, 9);
        Boolean even = c1.isAEven();
        assertFalse(even);
    }

    /**
     * test what is the result if the values of a is null
     * if the value of A is null the result must be false;
     */
    @Test
    void isAEvenWithANull() {
        Calculator c1 = new Calculator(null, 7, 9);
        Boolean even = c1.isAEven();
        assertFalse(even);
    }

    /**
     * test if a is negative and it is even
     */
    @Test
    void isAEvenWithANegative() {
        Calculator c1 = new Calculator(-6, 7, 9);
        Boolean even = c1.isAEven();
        assertTrue(even);
    }

    /**
     * test with all the values and no value is null
     */
    @Test
    void getMin() {
        Calculator numbers = new Calculator(-4, 5, 9);
        Integer min = numbers.getMin();
        assertEquals(min, -4);
    }

    /**
     * one of the values is null
     */
    @Test
    void getMinWithNullValue() {
        Calculator numbers = new Calculator(9, 5, null);
        Integer min = numbers.getMin();
        assertEquals(min, 5);
    }

    /**
     * check if a is positive with a positive value
     */
    @Test
    void isAPositive() {
        Calculator numbers = new Calculator(6, 5, 6);
        Boolean pos = numbers.isAPositive();
        assertTrue(pos);
    }

    /**
     * check if a is negative with a negative values
     */
    @Test
    void isANegative() {
        Calculator numbers = new Calculator(-6, 5, 6);
        Boolean pos = numbers.isAPositive();
        assertFalse(pos);
    }

    /**
     * check if a is null, the return should be false
     */
    @Test
    void isANull() {
        Calculator numbers = new Calculator(null, 5, 6);
        Boolean pos = numbers.isAPositive();
        assertFalse(pos);
    }

    /**
     * check the average number when all the values are inserted
     */
    @Test
    void getAverage(){
        Calculator numbers = new Calculator(2,2,2);
        Double avg = numbers.getAverage();
        assertEquals(avg, 2 );
    }

    /**
     * check the average when one of the value is null
     */
    @Test
    void getAverageWithOneNull() {
        Calculator numbers = new Calculator(null, 2, 2);
        Double avg = numbers.getAverage();
        assertEquals(avg, 2);
    }
}