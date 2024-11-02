package Seminars;     

public class PalindromeOfNumbers
{
	public static void main(String[] args)
	{
	
		int n=1234;
		int r=0;
		int sum=0;
		int temp=n;//1221
		
		while(n>0)
		{
			r=n%10;//1221%10=1
			sum=(sum*10)+r;
			n=n/10;// 1221/10=122
		}
		
		System.out.println(sum);
		if(temp==sum)
		{
		System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}
}


