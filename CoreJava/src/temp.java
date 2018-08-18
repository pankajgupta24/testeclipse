
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given= "MADAM";
		String REV= "";
			int len= REV.length();
		for (int i=len; i>0;i--){
			
			REV= REV+ given.charAt(i);
			System.out.println(REV);
		}
		

	}

}
