package CollectionInJava;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		
		ArrayList obj= new ArrayList();
		
		obj.add(2052);
		obj.add("Pankaj");
		obj.add("Kumar");
		obj.add("Gupta");
		obj.add(1989);
		obj.add("Ballia");
		
		
		
		int size=obj.size();
		
		for ( int i=0;i<size;i++)
		{
			System.out.println("output value stored in ArrayList is " +obj.get(i));
		}
		

	}

}
