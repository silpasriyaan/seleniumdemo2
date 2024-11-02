package Seminars;

import java.util.ArrayList;
import java.util.List;
 
public class PalindromesUsingArrayList {
    // Function to check if a number is a palindrome
    static boolean isPalindrome(int num) {
        // Convert integer to string and compare it with its reverse to check for palindrome
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
 
    // Function to find palindromes in a given range
    static List<Integer> palindromeRange(int start, int end) {
        // Create a list of numbers in the specified range
        List<Integer> nums = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            nums.add(i);
        }
 
        // List to store palindromes found in the range
        List<Integer> palindromes = new ArrayList<>();
        for (int x : nums) {
            // Check if the number is a palindrome and add it to the palindromes list
            if (isPalindrome(x)) {
                palindromes.add(x);
            }
        }
 
        return palindromes;
    }
 
    // Main method
    public static void main(String[] args) {
        int start = 100;
        int end = 2000;
 
        // Find palindromes in the given range and print the result
        List<Integer> result = palindromeRange(start, end);
        System.out.println(result);
    }
}