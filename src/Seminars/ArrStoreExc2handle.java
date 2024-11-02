package Seminars;

public class ArrStoreExc2handle {

	public static void main(String[] args) {
		
		try
		{
		
		//Since Double class extends Number class only Double type numbers can be stored in this Array
		Number[] a=new Double[2];
		
		a[0]=2;
		}
		
		//a[0]=2.00f ;----- Float ichinna error throw chesthundhi
//		a[0]=new Number() {
//			
//			@Override
//			public long longValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int intValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public float floatValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public double doubleValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};			
			catch(ArrayStoreException e)
		{
System.out.println("Array Store Exception found:" +e);
				//e.printStackTrace();
		}
	}
		}
	


