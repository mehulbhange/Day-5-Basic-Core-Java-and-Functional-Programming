package com.bridgelabz.core;

public class VowelConsonant {
    public static void main(String[] args) {
        char input = 'U';

        if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u'
            || input=='A' || input=='E' || input=='I' || input=='O' || input=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
