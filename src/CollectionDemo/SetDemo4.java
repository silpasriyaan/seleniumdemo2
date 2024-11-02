package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo4 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("1RBG technologies");
		set.add("Selenium");
		set.add("java");
		set.add("Java");

		Iterator<String> setList=set.iterator();
		String firstdata=setList.next();
		System.out.println(firstdata);
		String seconddata=setList.next();
		System.out.println(seconddata);
		String thirddata=setList.next();
		System.out.println(thirddata);
		String fourthdata=setList.next();
		System.out.println(fourthdata);
	}

}
