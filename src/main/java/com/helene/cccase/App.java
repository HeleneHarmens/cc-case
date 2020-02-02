package com.helene.cccase;

/**
 * CC CASE
 * @author Helene Harmens
 * 28.01.2020
 */

public class App {

    static int maxInterations =5;

    public static void main( String[] args ) {

        printPalindrome(12321);
        printPalindrome(67677777);
        printPalindrome(125581237);

    }

    // PALINDROME METHODS
    static void printPalindrome(int num) {
        System.out.println("_________PALINDROME CHECK_________ \nInput: " + num);
        System.out.println("Palindrome: " + palindromeCheck(num));
        System.out.println("__________________________________\n");
    }

    static long palindromeCheck(long input) {
        if (isPalindrome(input)) {
            return input;
        }

        int count = 0;
        long tmp = input;

        for (int i=0; i < maxInterations; i++){
            count++;

            long reversed = reverse(Long.toString(tmp));

            System.out.printf("%d: %d + %d = ", count, tmp, reversed);

            tmp += reversed;

            System.out.print(tmp + "\n");

            if (isPalindrome(tmp)) {
                return tmp;
            }
        }

        System.out.printf("%d can't become a Palindrome after %d iterations\n", input, count);
        return -1;
    }

    static boolean isPalindrome(long input) {
        String inStr = Long.toString(input);
        long rev = reverse(inStr);

        if (input == rev){
            return true;
        }

        return false;
    }

    static long reverse(String num) {
        String reversed = new StringBuilder(num).reverse().toString();
        return Long.parseLong(reversed);
    }


}
