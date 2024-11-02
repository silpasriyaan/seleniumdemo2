package Seminars;

public class ArmStrong 
{

    public static void main(String[] args)
    {
        int number = 153; // Example number to check

        if(isArmstrong(number)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

public static Boolean isArmstrong(int number)
{
    int originalNumber, remainder, result = 0, n = 0;
    originalNumber = number;
    
    // Count number of digits
    for (originalNumber = number; originalNumber != 0; originalNumber /= 10) 
    {
        n++;
    }
    
    originalNumber = number;
    
    // Calculate sum of nth power of digits
   while (originalNumber != 0) 
    {
        remainder = originalNumber % 10;//153%10=3
        result += Math.pow(remainder,n);
        originalNumber /= 10;
    }
    
    // Check if number is equal to the sum of nth power of digits
    if (result == number) 
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
