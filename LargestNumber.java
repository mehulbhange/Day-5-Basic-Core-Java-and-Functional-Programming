package com.bridgelabz.core;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        int num3 = 30;

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }

    }
}
