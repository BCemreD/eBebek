import java.util.Scanner;

public class ChineseHoroscope {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your birth year: ");
		year = input.nextInt();
		
		if (year % 12 == 0)
		{
			System.out.println("Your Chinese zodiac sign is monkey.");
		}
		else if (year % 12 == 1)
		{
			System.out.println("Your Chinese zodiac sign is rooster");
		}
		else if (year % 12 == 2)
		{
			System.out.println("Your Chinese zodiac sign is dog");
		}
		else if (year % 12 == 3)
		{
			System.out.println("Your Chinese zodiac sign is pig");
		}
		else if (year % 12 == 4)
		{
			System.out.println("Your Chinese zodiac sign is rat");
		}
		else if (year % 12 == 5)
		{
			System.out.println("Your Chinese zodiac sign is ox");
		}
		else if (year % 12 == 6)
		{
			System.out.println("Your Chinese zodiac sign is tiger");
		}
		else if (year % 12 == 7)
		{
			System.out.println("Your Chinese zodiac sign is rabbit");
		}
		else if (year % 12 == 8)
		{
			System.out.println("Your Chinese zodiac sign is dragon");
		}
		else if (year % 12 == 9)
		{
			System.out.println("Your Chinese zodiac sign is snake");
		}
		else if (year % 12 == 10)
		{
			System.out.println("Your Chinese zodiac sign is horse");
		}
		else
		{
			System.out.println("Your Chinese zodiac sign is goat");
		}

	}

}
