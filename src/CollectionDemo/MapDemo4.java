package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo4 {   //Duplicates ni lekka cheyyadhu only one time ye isthundhi

	public static void main(String[] args) {
Map<String,String> map= new Hashtable<String,String>();
map.put("name", "RBGtechnologies");
map.put("Selenium", "java");
map.put("API testing", "Rest Assured");
String data=map.get("API testing");
System.out.println(data);
map.put("name", "RBG technologies");
map.put("Selenium", "java");
map.put("API testing", "Post Man");
map.put("DB testing", "MY SQL");
data=map.get("API testing");
System.out.println(data);
}

}
