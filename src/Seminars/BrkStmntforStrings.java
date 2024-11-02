package Seminars;

public class BrkStmntforStrings {

	public static void main(String[] args) {
		int i;
		for(i=1; i<22;i++)
		{
			if(i%3 ==0	)
			{
				continue;
				//break;
			}
			//System.out.print(i+" ");
//			if(i==14)
//			{
//				break;
//			}
			System.out.print(i+" ");
		}
		
	}

}


//List<Value> list = new ArrayList<Value>(map.values());
//
//// or you may use 
//List<Value> list = new ArrayList<Value>();
//for (Map.Entry<String, String> entry : map.entrySet())
//{
//list.add(entry.getValue());    
//}
//
//
//List<Value> list = new ArrayList<Value>(map.values());
//
//Map<Key,Value> map;
