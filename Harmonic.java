import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// find harmonic numbers
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		int number = inp.nextInt();
		double result = 0.0;
		
		for (double i = 1; i <= number; i++)
		{
			result += (1/i);
		}
		System.out.println(result);
	}

}
