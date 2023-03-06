package edu.goit.functions.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;


    @BeforeEach
    void beforeEach() {
        sumCalculator = new SumCalculator();
    }


    @Test
    void sumTestOne() {
        int expected = 1;
        int actual = sumCalculator.sum(1);
        assertEquals(expected,actual);
    }

    @Test
    void sumTestThree() {
        int expected = 6;
        int actual = sumCalculator.sum(3);
        assertEquals(expected,actual);
    }
    @Test
    void sumTestZero() {
        assertThrows(IllegalAccessException.class, () -> sumCalculator.sum(0));
    }

}