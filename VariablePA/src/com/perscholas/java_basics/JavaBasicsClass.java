package com.perscholas.java_basics;

public class JavaBasicsClass {
    static void main(String[] args) {
        int s = 16;
        int t = 17;
        int sum = s + t;
        System.out.println("Sum is : " + sum);

        double u = 3.4;
        double o = 4.5;
        double result = u + o;
        System.out.println("Result is : " + result);

        int n = 7;
        double h = 9.7;
        double results = n + h;
        System.out.println("Results is : " + results);

        double num1 = 25.5;
        double num2 = 4.2;
        double end = num1 / num2;
        System.out.println("Result is : " + end);
        int endResult = (int) end;
        System.out.println("Integer result is : " + endResult);

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println("y / x = " + q);
        double casted = (double) y/x;
        System.out.println("Casted : " + casted);

        final double TAX_RATE = .07;
        double price = 100;
        double taxAmount = price * TAX_RATE;
        System.out.println("Tax amount: " + taxAmount);


        double coffee = 1.00;
        double tea = .50;
        double espresso = 2.00;
        final double SALES_TAX = .07;
        double subtotal = (coffee * 3) + (tea * 4) + (espresso * 2);
        double totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale: $%.2f%n", totalSale);





    }
}
