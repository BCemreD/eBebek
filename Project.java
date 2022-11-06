import java.util.Scanner;

public class Project {
	
	/**user can enter numbers as much as (s)he wants until odd number is entered. Then the numbers that are even 
	 and can be divided by 4 will be summed.*/

	public static void main(String[] args) {
		
		int number, total=0;
		
		Scanner in = new Scanner (System.in);
		
		do {
			System.out.println("Enter number: ");
			number = in.nextInt();
			
	// if (number % 2 ==0 && number % 4 == 0) **/ we can write like this but divisible by 2 and 4 means that it is divisible by 4 because 4 divisibles are even numbers 
			
			if (number % 4 == 0)
			{
				total += number;
				
			}
			
		} while (number % 2 == 0);
		
		System.out.println("Sum:" + total);

	}

}
