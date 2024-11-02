package Seminars;

public class RemovinChars 
{

	public static void main(String[] args)
	{
		String s1="This is venkat programs";
		String s2=" ";
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i')
			{
			continue;
			
		}
			System.out.println(ch[i] + " ");
		}

	}

}
