package CollectionInJava;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		
		ArrayList obj= new ArrayList();
		
		obj.add(2052);
		obj.add("Pankaj");
		obj.add("Kumar");
		obj.add("Gupta");
		obj.add(1989);
		obj.add("Ballia");
		
		
		for (Object abc:obj)
		{
			System.out.println("output values stored inside arrylist is "+ abc);
		}
		
		

	}

}
