package Seminars;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int i=0;
//		for(int i=0;i<5;i++)
//		{
//			c=a+b;
//			System.out.println(c);
//			a=b;b=c;
//		}
		
		while (i<5)
		{
			c=a+b;
			System.out.println(c);
			a=b;b=c;
			i++;
		}
			
	}

}	


