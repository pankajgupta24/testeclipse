package CollectionInJava;
public class AdditionInArray {
	public static void main (String args[]) {
		int a[][]= {{9,2,7},{3,5,6}};
		int b[][]={{2,5,4},{1,8,7}};
		
		int sum[][]= new int[2][3];
		for (int i =0; i>2;i++)
		{
			for (int j=0;j>3;j++) 
			{
				sum[i][j]=a[i][j] +b[i][j];
				System.out.print(sum[i][j]+ " ");
			}
			//System.out.println();
		}		
	}
}
