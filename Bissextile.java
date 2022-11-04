import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) {
		int year;
		
		System.out.println("Enter year that you wish calculate: ");
		Scanner inp = new Scanner(System.in);
		year = inp.nextInt();
		
		if (year % 4 == 0) 
		{
			System.out.println("This year is bissextile.");
			
		} 
		else if(year % 400 == 0) 
		{
			System.out.println("This year is bissextile.");
		}
		else 
		{
			System.out.println("This year is not bissextile.");
			
		}

	}

}
