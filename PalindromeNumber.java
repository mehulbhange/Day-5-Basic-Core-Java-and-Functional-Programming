package com.bridgelabz.core;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;

        PalindromeNumber palindromeNumber = new PalindromeNumber();

        if (palindromeNumber.isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    boolean isPalindrome(int num){
        int actualNum = num;
        int reverse = 0;

        while (num > 0){
            int tmp = num%10;
            reverse = (reverse*10) + tmp;
            num /= 10;
        }

        if (actualNum == reverse)
            return true;
        else
            return false;
    }
}
