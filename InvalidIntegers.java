package com.bridgelabz.core;

public class InvalidIntegers {
    public static void main(String[] args) {
        int len = args.length;
        int sum = 0;
        int invalidInt = 0;

        for (int i=0;i<len;i++){
            try {
                int temp = Integer.parseInt(args[i]);
                sum += temp;
            }catch (Exception ex){
                invalidInt++;
            }
        }

        System.out.println("Sum : "+ sum);
        System.out.println("Invalid Integers : "+ invalidInt);
    }
}
