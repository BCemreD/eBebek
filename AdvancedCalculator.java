import java.util.Scanner;

public class AdvancedCalculator 
{//overwritten mod and rectangular methods on a written calculator project.
		static void mod() 
		{
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter sub number: ");
	        int n1 = scan.nextInt();
	        System.out.print("Enter mod number: ");
	        int n2 = scan.nextInt();
	        int mod, result = 0;
	        
	        mod = n1 % n2;
	        System.out.println("Result: " + mod);
	       	    
		}
		
		static void rectangular() 
		{
	        Scanner scan = new Scanner(System.in);//taking values for edges
	        System.out.print("Enter first edge: ");
	        int a = scan.nextInt();
	        System.out.print("Enter second edge: ");
	        int b = scan.nextInt();
	        int perimeter, area, result = 0;
	        //perimeter
	        perimeter = 2 * (a + b);
	        System.out.println("Result: " + perimeter);
	        //area
	        area = a * b;
	        System.out.println("Result: " + area);
	    
		}
	
	   static void add() 
	   {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Amount of variables: ");//decided how many numbers are taken into the operation.
	        int counter = scan.nextInt();
	        int number, result = 0;
	        for (int i = 1; i <= counter; i++) 
	        {
	            System.out.print(i + ". number :");
	            number = scan.nextInt();
	            if (number == 0) 
	            {
	                break;
	            }
	            result += number;
	        }
	        System.out.println("Result : " + result);
	    }
	
	    static void deduct() 
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Amount of variables: ");
	        int counter = scan.nextInt();//decided how many numbers are taken into the operation.
	        int number, result = 0;

	        for (int i = 1; i <= counter; i++) 
	        {
	            System.out.print(i + ". number :");
	            number = scan.nextInt();
	            if (i == 1) 
	            {
	                result += number;
	                continue;
	            }
	            result -= number;
	        }

	        System.out.println("Result : " + result);
	    }
	    
	    static void multiply() 
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Amount of variables: ");
	        int counter = scan.nextInt();//decided how many numbers are taken into the operation.
	        int number, result = 1;

	        for (int i = 1; i <= counter; i++) 
	        {
	            System.out.print(i + ". number :");
	            number = scan.nextInt();

	            if (number == 1)
	                break;

	            if (number == 0) 
	            {
	                result = 0;
	                break;
	            }
	            result *= number;
	        }

	        System.out.println("Result : " + result);
	    }
	    
	    static void divide() 
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Amount of divisors: ");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". number :");
	            number = scan.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("You can't divide by 0.");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("Result : " + result);
	    } 
	    
	    static void power() 
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the sub value: ");
	        int base = scan.nextInt();
	        System.out.print("Enter the sup value: ");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) 
	        {
	            result *= base;
	        }

	        System.out.println("Result : " + result);
	    }
	    
	    static void factorial() 
	    {
	           Scanner scan = new Scanner(System.in);
	            System.out.print("Number :");
	            int n = scan.nextInt();
	            int result = 1;

	            for (int i = 1; i <= n; i++) 
	            {
	                result *= i;
	            }

	            System.out.println("Result : " + result);
	     }
	        
	     public static void main(String[] args) 
	     {
	            Scanner scan = new Scanner(System.in);
	            int select;
	            String menu = "\n1- Add operator"
	                    + "\n2- Deduct operator"
	                    + "\n3- Multiply operator"
	                    + "\n4- Divide operator"
	                    + "\n5- Power operator"
	                    + "\n6- Factorial operator"
	                    + "\n7- Mod "
	                    + "\n8- Rectangular Square and cevre"
	                    + "\n0- Exit";
	            do 
	            {
	                System.out.println(menu);
	                System.out.print("Please choose your operation: ");
	                select = scan.nextInt();
	                switch (select) 
	                {
	                    case 1:
	                        add();
	                        break;
	                    case 2:
	                        deduct();
	                        break;
	                    case 3:
	                        multiply();
	                        break;
	                    case 4:
	                        divide();
	                        break;
	                    case 5:
	                        power();
	                        break;
	                    case 6:
	                        factorial();
	                        break;
	                    case 7:
	                    	mod();
	                    	break;
	                    case 8:
	                    	rectangular();
	                    case 0:
	                        break;
	                    default:
	                        System.out.println("\nInvalid input. Please, try again.");
	                }
	            } 
	            while (select != 0);

	   }

}