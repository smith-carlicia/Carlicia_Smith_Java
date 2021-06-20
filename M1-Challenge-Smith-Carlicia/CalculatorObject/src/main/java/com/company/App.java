package com.company;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CalculatorObject calc = new CalculatorObject();

        System.out.println("20 + 20" + calc.add(20,20));
        System.out.println("60 - 10" + calc.subtract(60, 10));
        System.out.println("6 * 8 " + calc.multiply(6, 8));
        System.out.println(" 14 / 2" + calc.divide(14, 2));

        System.out.println("2.3 + 2.5" + calc.add(2.3, 2.5));
        System.out.println("1.4 - 2.8" + calc.subtract(1.4, 2.8));
        System.out.println("6.6 * 8.1 " + calc.multiply(6.6, 8.1));
        System.out.println(" 5.7 / 3.1" + calc.divide(5.7, 3.1));
    }
}
