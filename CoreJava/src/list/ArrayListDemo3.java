package list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {	
	public static void main(String[] args) {

	ArrayList obj= new ArrayList();
	obj.add(123);
	obj.add("Pankaj");
	obj.add("Kumar");
	obj.add("Gupta");

	Iterator itr = obj.iterator();
	
	while (itr.hasNext()){
		
		Object value=itr.next();
		
		System.out.println("values are "+ value);
		
	}
	
	
	

}}
