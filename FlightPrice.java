import java.util.Scanner;

public class FlightPrice {

	public static void main(String[] args) {

		int km, age,flightType;

		Scanner inp = new Scanner (System.in);
				
		System.out.println("Enter the distance as km: ");
		km = inp.nextInt();
		
		//calculate the price w/o discount.
		double perKM = 0.10;
		double firstPrice= perKM * km, totalPrice;
		System.out.println("Price without discount is " + firstPrice);
		
		System.out.println("Enter your age: ");
		age = inp.nextInt();
		System.out.println("Enter the number of your flight preference: \n1) One way \n2) Return ");
		flightType = inp.nextInt();
		
		//if customer is younger than 12 y.o.
		if (age < 12) 
		{
			if (flightType == 1) 
			{
				System.out.println("You should pay " +  (float)(totalPrice= firstPrice - (firstPrice * 0.5)) + " TL");
				//used float type to take more comprehensible result.
			} 
			else if(flightType == 2) 
			{
				System.out.println("You should pay " +  (float)(totalPrice= firstPrice -( firstPrice - (firstPrice * 0.5)*0.2)) + " TL");
			}	
			else 
			{
				System.out.println("Please chose the flight type");
			}
		}
		
		// if customer between 12 and 24 y.o.
		else if (age >= 12 && age < 25)
		{
			if (flightType == 1) 
			{
				System.out.println("You should pay " +  (float)(totalPrice= firstPrice - (firstPrice * 0.1)) + " TL");
			} 
			else if(flightType == 2) 
			{
				System.out.println("You should pay " +  (float)(totalPrice = firstPrice -( firstPrice - (firstPrice * 0.1)*0.2)) + " TL");
			}
			else 
			{
				System.out.println("Please chose the flight type");
			}
		}
		
		//if customer is older than 65 y.o.
		else if (age > 64) 
		{
			if (flightType == 1) 
			{
				System.out.println("You should pay " +  (float)(totalPrice= firstPrice - (firstPrice * 0.3)) + " TL");
			} 
			else if(flightType == 2) 
			{
				System.out.println("You should pay " +  (float)(totalPrice = firstPrice -( firstPrice - (firstPrice * 0.3)*0.2)) + " TL");
			}
			else 
			{
				System.out.println("Please chose the flight type");
			}
		}
	}

}
