import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		
		//combination calculating nr1! / (nr2! * (nr1 - nr2)!)
		
		int n, r, totaln = 1, totalr = 1, total = 1;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		n = inp.nextInt();
		System.out.println("Enter the second number: ");
		r = inp.nextInt();
		
		//factorial of the first number
		for (int i = 1; i <= n; i++) 
		{
			totaln = i * totaln;	
		}
		System.out.println("First factorial is " + totaln);
		
		//fact. of secon number
		for (int j = 1; j <= r; j++) 
		{
			totalr = j * totalr;			
		}
		System.out.println("\nSecond factorial is " + totalr);
		
		//factorial of first number deduct second number and multiply with second number(Accroding to combination rule).
		for (int k = 1; k <= n - r; k++) 
		{
			total = k * total;
		}
		
		System.out.println("\nCombination is " + totaln/(total * totalr));
	}

}
