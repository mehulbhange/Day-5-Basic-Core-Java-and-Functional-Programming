package com.bridgelabz.core;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0){
            sum += num;
            num--;
        }
        System.out.println("Sum : "+sum);

    }
}
