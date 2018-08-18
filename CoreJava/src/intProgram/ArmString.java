package intProgram;
public class ArmString {
	public static void main (String args[]) {
		int num= 370;
		int number, temp, total=0;
		number= num;
		while (number!=0){
			temp= number%10;
			total = total + temp*temp*temp;
			number= number/10;		}
		if (total ==num)
			System.out.println("given number "+num +" is armstrong");
		else 
			System.out.println("not armstrong");
	}
}
