package com.bridgelabz.core;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than 31");
        int n = sc.nextInt();
        int pow = 1;

        for(int i=1;i<=n;i++){
            pow*=2;
            System.out.print(pow+"\t");
        }

    }
}
