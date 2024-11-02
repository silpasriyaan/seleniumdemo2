package Seminars;

public class ArmStrongNumber
{
	 public static void main(String[] args) {
	        
	        int number = 153;
	        int originalNumber, x=3, result = 0;
	        originalNumber = number;
	        int a=0;

	      while (originalNumber != 0) {
	            x = originalNumber % 10;
	            a=a+(x*x*x);
	            originalNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}


