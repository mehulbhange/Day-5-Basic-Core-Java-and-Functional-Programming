package com.bridgelabz.core;

public class StaticDemo {
    static int num;
    static void method(){
        System.out.println("This is static method");
    }
    static {
        num = 50;
        System.out.println("This is static block");
    }
    public static void main(String[] args) {
        System.out.println("Num : "+ StaticDemo.num);
        StaticDemo.method();
    }
}
