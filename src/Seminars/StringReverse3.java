package Seminars;

public class StringReverse3 {  
    // Method to reverse a string  
    public static String reverseString(String input) {  
        int length = input.length(); // Get the length of the input string  
        String reversedString = ""; // Initialize an empty string to hold the reversed string  
        int index = length - 1; // Set the index to the last character of the input string  
        // Iterate through the characters in reverse order  
        while (index >= 0) {  
            reversedString += input.charAt(index); // Append the current character to the reversedString  
            index--; // Move to the previous character  
        }  
        return reversedString; // Return the reversed string  
    }  
    public static void main(String[] args) {  
        String input = "Hello, World!"; // Sample input string  
        String reversed = reverseString(input); // Call the reverseString method to get the reversed string  
        // Print the original and reversed strings  
        System.out.println("Original string: " + input);  
        System.out.println("Reversed string: " + reversed);  
}
}