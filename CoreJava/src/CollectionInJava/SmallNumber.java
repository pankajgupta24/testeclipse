package CollectionInJava;
public class SmallNumber {
	public static void main (String args []) {
		
		int abc[][]={{5,4,6},{3,9,7},{2,4,1}};
		int min = abc[0][0];
		
		for (int i =0; i<3; i++) {
			
			for (int j =0; j<3; j++){
				
				if (abc[i][j]< min){
					min= abc[i][j];
					
				}
			}
		}
		System.out.println(min);
		
	}
}
