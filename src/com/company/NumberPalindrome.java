package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        if(number < 0) { number *= -1;}
        int reverse = 0;
        int storage = number;
         while (storage > 0) {
            int lastDigit = storage % 10;
            reverse = (reverse * 10) + lastDigit;
            storage /= 10;
        }
         return (number == reverse);
    }
}
