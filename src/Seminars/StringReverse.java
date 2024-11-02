package Seminars;
public class StringReverse 
{
	public static void main(String[] args)
	{
		String originalString="silpa";
		System.out.println("original string is :"+originalString );
		String reversedString="";
//		for(int i=0;i<originalString.length();i++)
//		{
//			reversedString=originalString.charAt(i)+reversedString;
//		
//		}
		
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reversedString=reversedString+originalString.charAt(i);	
		}
		System.out.println("reversedString is: "+ reversedString );
	}
		
}