package Seminars;

public class RemoveDupsAndCountRemaining 
{

	public static void main(String[] args) 
	{

		String s1="silpa sriyaan";
		char[] ch=s1.toCharArray();
		int count=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			for(int j=1;j<s1.length();j++)
//			{
//				if(ch[i]==ch[j])
//				{
//						count++;
//					continue;
//					
//				}
//		//count++;
//			}
//			System.out.println("ch[i] :" + ch[i]);	
//		}
		int totlength = s1.length();
		String replaceStr = s1.replace("s", "");
		int newlength = replaceStr.length();
	//System.out.println(totlength-newlength);
		System.out.println(newlength);
	}
	

}
