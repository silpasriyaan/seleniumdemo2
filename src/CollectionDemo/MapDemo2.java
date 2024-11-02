package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,String> map1=new Hashtable<String,String>();
		map1.put("name", "RBG technologies");
		Map<String,Integer> map2=new Hashtable<String,Integer>();
		map2.put("phone",96666);
		Map<Integer,Boolean> map3=new Hashtable<Integer,Boolean>();
		map3.put(98888, true);
	}

}
