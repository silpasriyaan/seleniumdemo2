package Seminars;

public class StringReverseInEven
{
	public static void main(String[] args)
	{
		String s="this is selenium class";		
		String[] s1=s.split(" ");
System.out.println(s1);
		for(int i=0;i<s1.length;i++)
		{
			if(i%2!=0)
			{			
				String s2=s1[i];
				String r="";
				for(int j=0;j<s2.length();j++)
				{
					r=s2.charAt(j)+r;				
				}
				System.out.println(r);
			}

			else
			{
				System.out.println(s1[i]);
			}	
		}
	}	
}