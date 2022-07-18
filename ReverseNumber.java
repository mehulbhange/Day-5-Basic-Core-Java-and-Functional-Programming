package com.bridgelabz.core;


public class ReverseNumber {
    public static void main(String[] args) {
        int num = 98765;
        int reverse = 0;

        while (num > 0){
            int lastDigit = num % 10;
            reverse = (reverse*10) + lastDigit;
            num = num/10;
        }

        System.out.println("Reverse number : "+ reverse);
    }
}
