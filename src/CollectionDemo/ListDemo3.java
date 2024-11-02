package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("RBG tecnologies");
		list1.add("selenium");
		list1.add("java");
		int size=list1.size();
		System.out.println(size);
		list1.add("RBG tecnologies");
		list1.add("selenium");
		list1.add("java");
		
		System.out.println(size);
	}

}
