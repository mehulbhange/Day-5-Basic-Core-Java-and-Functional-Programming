package com.bridgelabz.core;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println("Euclidean distance : "+Math.sqrt((x*x)+(y*y)));

    }
}
