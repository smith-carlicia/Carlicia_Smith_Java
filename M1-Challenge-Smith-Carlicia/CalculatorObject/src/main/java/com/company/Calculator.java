package com.company;

public class Calculator {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        class Calculator{

            public int add (int a, int b) {
                return a + b;
            }

            public int subtract (int a, int b) {
                return a - b;
            }

            public int multiply (int a, int b) {
                return a * b;
            }

            public int divide (int a, int b) {
                return a/b;
            }
        }

    }
}
