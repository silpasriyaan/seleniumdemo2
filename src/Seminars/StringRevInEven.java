package Seminars;

public class StringRevInEven
{
		public static void main(String[] args)
		{
			String s="this is selenium class";		
			String[] s1=s.split(" ");

			for(int i=0;i<s1.length;i++)
			{
				if(i%2!=0)
				{			
					String s2=s1[i];
					String r="";
					//System.out.println(s2);
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

