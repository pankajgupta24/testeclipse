package CollectionInJava;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		obj.add(2052);
		obj.add("Pankaj");
		obj.add("Kumar");
		obj.add("Gupta");
		obj.add(1989);
		obj.add("Ballia");
		Iterator<String> itr=obj.iterator();
		while (itr.hasNext())
		{
			Object value= itr.next();
		 System.out.println("output values are " + value);	
		}
		
		

	}

}
