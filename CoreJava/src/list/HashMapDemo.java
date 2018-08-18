package list;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hs= new HashMap<Integer,String>();
		hs.put(100,"Pankaj" );
		hs.put(101, "Kumar");
		hs.put(102, "Kumar");
		
		System.out.println(hs);
		hs.remove(101);
		System.out.println(hs);
		
		for (Map.Entry<Integer, String> data: hs.entrySet()){
			System.out.println(data.getKey()+"___________" +data.getValue());
			
		}
		
	}

}
