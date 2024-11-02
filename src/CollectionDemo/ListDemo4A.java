package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class ListDemo4A {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		Object o1=list.get(0);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		Integer i1=list1.get(0);
		//list1.get(0).getting all integer cls fun's
List<Boolean> list2=new ArrayList<Boolean>();
list2.add(true);
Boolean b1=list2.get(0);
//list2.get(0).getting all boolean clas functions
List<String> list3=new ArrayList<String>();
list3.add("RBG technologies");
String s1=list3.get(0);
//list3.get(0).getting all string class functions

	}

}
