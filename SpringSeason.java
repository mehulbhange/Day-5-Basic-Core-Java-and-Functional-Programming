package com.bridgelabz.core;


public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if(month == 3){
            if(day >= 20 && day <= 31){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else if(month == 4){
            if(day >= 1 && day <= 30){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else if(month == 5){
            if(day >= 1 && day <= 31){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else if(month == 6){
            if(day >= 1 && day <= 20){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            System.out.println("False");
        }

    }
}
