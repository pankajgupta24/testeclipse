package list;
import java.util.ArrayList;
public class ArrayListDemo2 {	
	public static void main(String[] args) {

	ArrayList obj= new ArrayList();
	obj.add(123);
	obj.add("Pankaj");
	obj.add("Kumar");
	obj.add("Gupta");
	int size= obj.size();
	for (int i=0; i<size; i++){
		System.out.println(obj.get(i));
		
	}
	
	
	

}}
