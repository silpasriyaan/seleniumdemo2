package Seminars;

import java.util.ArrayList;

public class OutofMemor 
{
public static void main(String[] args) 
{
	ArrayList<Object> list=new ArrayList<Object>();
	while(true)
	{
		Object o=new Object();
		list.add(1000000000);
	}
	
//	Integer[] OutofMemoryArray=new Integer[Integer.MAX_VALUE]---- 1Gb default
}
}
