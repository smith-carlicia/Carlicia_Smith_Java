package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        ConverterIf month1 = new ConverterIf();
        ConverterIf day1 = new ConverterIf();
        System.out.println(month1.convertMonth(12));
        System.out.println(day1.convertDay(7));

        ConverterSwitch month2 = new ConverterIf();
        ConvertSwitch day2 = new ConverterIf();
        System.out.println(month2.convertMonth(12));
        System.out.println(day2.convertDay(6));
    }
}
