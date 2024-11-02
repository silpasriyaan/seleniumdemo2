package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo3 {   //Duplicates ni lekka cheyyadhu only one time ye isthundhi

	public static void main(String[] args) {
Map<String,String> map= new Hashtable<String,String>();
map.put("name", "RBGtechnologies");
map.put("Selenium", "java");
map.put("API testing", "Rest Assured");
int size=map.size();
System.out.println(size);
map.put("name", "RBG technologies");
map.put("Selenium", "java");
map.put("API testing", "Rest Assured");
map.put("DB testing", "MY SQL");
size=map.size();
System.out.println(size);
}

}
