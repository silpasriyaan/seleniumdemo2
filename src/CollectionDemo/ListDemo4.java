package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("RBG technoogies");
		list1.add("selenium");
		list1.add("java");
		System.out.println(list1.get(0));
		list1.add("RBG technologies");
		list1.add("selenium");
		list1.add("java");
		list1.add("API testing");
		System.out.println(list1.get(6));
		}

}
