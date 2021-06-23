package com.company;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    private CalculatorObject calc = new CalculatorObject();




    @Test
    public void returnsSumOfPositiveIntegers() {
        assertEquals(40 , calc.add(20,20));
    }

    @Test
    public void returnsSumOfTwoNegativeIntegers() {
        assertEquals(-2, calc.add(-1, -1));
    }

    @Test
    public void returnsDifferenceOfTwoPositiveIntegers() {
        assertEquals(50 , calc.subtract(60,10));
    }

    @Test
    public void returnsDifferenceOfTwoNegativeIntegers() {
        assertEquals(-4, calc.subtract(-9, -5));
    }

    @Test
    public void returnsProductOfTwoPositiveIntegers() {
        assertEquals(48 , calc.multiply(6,8));
    }

    @Test
    public void returnsProductOfTwoNegativeIntegers() {
        assertEquals(45 , calc.multiply(-5,-9));
    }

    @Test
    public void returnsQuotientOfTwoPositiveIntegers() {
        assertEquals(7, calc.divide(14,2));
    }
    @Test
    public void returnsQuotientOfTwoNegativeIntegers() {
        assertEquals(2 , calc.divide(-30,-15));
    }






    @Test
    public void returnsSumOfTwoPositiveDoubles() {
        assertEquals(4.8, calc.add(2.5, 2.3));
    }

    @Test
    public void returnsSumOfTwoNegativeDoubles() {
        assertEquals(-2.7, calc.add(-8.5, -5.8));
    }

    @Test
    public void returnsDifferenceOfTwoPositiveDoubles() {
        assertEquals(3.2, calc.subtract(8.9, 5.7), 4);
    }

    @Test
    public void returnsDifferenceOfTwoNegativeDoubles() {
        assertEquals(-3.9, calc.subtract(-7.7, -3.8));
    }

    @Test
    public void returnsProductOfTwoPositiveDoubles() {
        assertEquals(53.46 , calc.multiply(6.6, 8.1));
    }
    @Test
    public void returnsproductOfTwoNegativeDoubles() {
        assertEquals(22.72 , calc.multiply(-7.1,-3.2));
    }

    @Test
    public void returnsQuotientOfTwoPositiveDoubles() {
        assertEquals(1.83, calc.divide(5.7,3.1));
    }
    @Test
    public void returnsQuotientOfTwoNegativeDoubles() {
        assertEquals(-1.87 , calc.divide(-18.2,-9.7));
    }

}
