package com.bridgelabz.core;

public class DefaultValues {
    private int num1;
    private double num2;
    private float num3;
    private byte num4;
    private short num5;
    private long num6;
    private char character;
    private boolean isTrue;

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println("Default value of int : "+defaultValues.num1);
        System.out.println("Default value of double : "+defaultValues.num2);
        System.out.println("Default value of float : "+defaultValues.num3);
        System.out.println("Default value of byte : "+defaultValues.num4);
        System.out.println("Default value of short : "+defaultValues.num5);
        System.out.println("Default value of long : "+defaultValues.num6);
        System.out.println("Default value of char : "+defaultValues.character);
        System.out.println("Default value of boolean : "+defaultValues.isTrue);
    }
}
