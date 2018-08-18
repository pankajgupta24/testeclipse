package CollectionInJava;

public class fib 
{	
	public static void main (String[] args) 
	{	
	int k,a=1,b=1;
	k=0;
	//1 1 2 3 5 8
	System.out.print( "1 1 ");
	while (k<=500)
	{
		k=a+b;
		System.out.print(k+ " ");
		a=b;
		b=k;
	}
	}
}
