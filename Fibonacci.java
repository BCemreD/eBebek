import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the amount of numbers to write serie.");
		int a = in.nextInt(); //how many steps you want 
		int n1 = 0, n2 = 1, sum= n1 +n2;
		
		for (int i = 1; i <= a; i++) //fibonacci numbers are occured from sum of former 2 numbers
		{   System.out.println(n1);
		    
		    sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
			
		}

		
	}

}
