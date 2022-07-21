package com.bridgelabz.core;


import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        double num = sc.nextDouble();

        if(num < 0){
            System.out.println("Enter number greater than 0");
        }else{
            System.out.println("Harmonic number : "+ harmonicValue(num));
        }
    }

    public static double harmonicValue(double n)
    {
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

        for (int i = 1; i <= n; i++)
        {
            val = val + (1.0/i);
        }
        return val;
    }

}
