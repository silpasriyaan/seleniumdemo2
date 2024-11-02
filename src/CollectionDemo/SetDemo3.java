package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
Set<String> set=new HashSet<String>();
set.add("RBG technologies");
set.add("selenium");
set.add("java");
int size=set.size();
System.out.println(size);
set.add("RBG technologies");
set.add("selenium");
set.add("java");
set.add("API testing");
size= set.size();
	}

}
