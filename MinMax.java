package com.bridgelabz.core;

public class MinMax {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int min, max;

        int[] arr = new int[4];
        arr[0] = a+b*c;
        arr[1] =  c+a/b;
        arr[2] =  a%b+c;
        arr[3] = a*b+c;

        min = max = arr[0];

        for (int i=0;i<4;i++){
            if(arr[i] > max){
                max = arr[i];
            }if(arr[i] <= min){
                min = arr[i];
            }
        }

        System.out.println("Min : "+ min );
        System.out.println("Max : "+ max);
    }
}
