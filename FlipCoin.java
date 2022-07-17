package com.bridgelabz.core;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int head = 0;
        int tail = 0;

        System.out.println("Enter number of times to flip coin");
        int num = sc.nextInt();
        if(num<1){
            System.out.println("Enter number greater than 0");
            return;
        }
        int cnt = num;
        while(num > 0){
            double random = Math.random();
            if(random < 0.5){
                tail++;
            }else{
                head++;
            }
            num--;
        }

        System.out.println("Head percentage : " + ( ((double)head/cnt))*100 );
        System.out.println("Head percentage : " + ( ((double)tail/cnt))*100 );
    }
}
