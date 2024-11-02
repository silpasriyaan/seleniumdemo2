package Seminars;

import java.util.HashSet;

//public class DuplicateCharactersInString 
//{
//	public static void main(String[] args)
//	{
//		String  str="This is silpa";
//		char[] ch=str.toCharArray();
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length(); j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					count++;
//					System.out.print(ch[i]+ " ");
//					
//				}
//				//count++;
//			}
//		}
//		System.out.println(count);
//
//
//	//}
public class DuplicateCharactersInString //with only one for loop
{
	public static void main(String[] args) {
		

	String arr[]={"java","c","c++","python","java"};
	HashSet<String> hset=new HashSet<String>();
	
	for(String s:arr)
	{
		System.out.println(hset.add(s));
	}
}
}