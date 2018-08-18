package list;
import java.util.ArrayList;
public class ArrayListDemo4 {	
	public static void main(String[] args) {

	ArrayList obj= new ArrayList();
	obj.add(123);
	obj.add("Pankaj");
	obj.add("Kumar");
	obj.add("Gupta");

	for (Object abc:obj){
		System.out.println("values are "+ abc);
		
	}
	
	
	

}}
