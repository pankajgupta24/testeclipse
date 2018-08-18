package intProgram;

public class LoopPro2 
{

	public static void main(String[] args) 
	{
		int i;
		int j;
		for (i=1;i<=12;i+=2) 
		{
			for (j=1;j<+i;j+=2) 
			{
				System.out.print("*");	
			}
			System.out.println("*");
		}
	}
}
