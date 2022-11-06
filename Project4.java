import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		// exponential numbers = n1 * n1 * n1 ... n2 times
		
		int n1, n2;
		
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Enter radix  number: ");
		n1 = inp.nextInt();
		
		System.out.println("\nEnter exponential number: ");
		n2 = inp.nextInt();
		
		int total = 1;
		
		
		for (int i = 0; i < n2; i++) 
		{
			total *= n1; 
		}	
		
		System.out.println("\nResult is " + total);
		
	}

}
