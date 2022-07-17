package com.bridgelabz.core;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=2;i<num;i++){
            boolean prime=true;
            if(num%i==0){
                for(int j=2;j<i;j++){
                    if(i%j==0) {
                        prime = false;
                        break;
                    }
                }
                if(prime)
                    System.out.println(i+"\t");
            }
        }

    }
}
