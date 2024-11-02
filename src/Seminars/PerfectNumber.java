package Seminars;

public class PerfectNumber 
{
    public static void main(String[] args) 
    {
        int number = 28; // You can change this to any number you want to check
        if (isPerfectNumber(number))
        {
            System.out.println(number + " is a perfect number.");
        } else 
        {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }

        int sum = 0;
        // Find all divisors and add them
        for (int i = 1; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                sum+= i;
            }
        }

        return sum == number;
    }
}