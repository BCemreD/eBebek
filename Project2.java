import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) 
	{
		// monitor the powers of 4 and 5 from the given number.
		int number;
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		number = inp.nextInt();
		
		
		System.out.println("Powers of number four are " );
		for (int i = 1; i <= number; i*=4) 
		{
		System.out.println( i);
		}
		
		System.out.println(" ");
		System.out.println("Powers of number five are " );
		for (int j = 1; j <= number; j*=5) 
		{
			System.out.println(j);
		}
	}
}
