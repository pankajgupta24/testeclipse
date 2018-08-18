package intProgram;
public class Fibo {
public static void main (String args[]){
		
		int number= 7;
		int sum;
		int num1=0;
		int num2=1;
		for (int i=0;i<number;i++){
			
			System.out.print(num1 + " ");
			
			sum = num1+num2;
			num1= num2;
			num2= sum;
		}
		
	}

}
