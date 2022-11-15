import java.util.Scanner;

public class RecursivePrime {

	static boolean isPrime(int p)
	{
		 if (p <= 1)//least prime number is 2
	            return false;
	  
	        // Check from 2 to n-1
	        for (int i = 2; i < p/2; i++) //if a number can be divided any number except 1 or itself, it isn't prime.
	            if (p % i == 0)
	                return false;
	  
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter number: ");
		int n = inp.nextInt();
		System.out.println("Prime number is checked as " + isPrime(n));//using isPrime function and replacing n with p

	}

}
