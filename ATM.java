import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
    	
        String name = null, password = null;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        //turn the system entirely
        while (right > 0) 
        {
        	//asking for auth.
            System.out.print("Name :");
            name = inp.nextLine();
            System.out.print("Password : ");
            password = inp.nextLine();

            //checking auth.
            while (name.equals("Cemre") && password.equals("Test123")) 
            {
                System.out.println("\nWelcome Main Page!");
               
                     //asking for target action
                    System.out.println("1-Paying" + "\n2-Withdrawal" + "\n3-Balance" + "\n4-Exit");
                    System.out.print("Please select the option : ");
                    
                   //turn the choice
                    select = inp.nextInt();
                    int price;
                    switch (select) 
                    {
						case 1:
						
							System.out.print("Amount : ");
						    price = inp.nextInt();
							balance += price;
						
						break;
						case 2:
						
							System.out.print("Amount : ");
	                        price = inp.nextInt();
	                        //checking if balance is sufficient
	                        if (price > balance) 
	                        {
	                            System.out.println("Insufficient balance.");
	                        } 
	                        else 
	                        {
	                            balance -= price;
	                        }
						
						break;
						case 3:
						
							System.out.println("Your balance : " + balance);
						
						break;
						case 4:
							
							System.out.println("See you again! ");
						
						break;
						default:
						System.out.println("Invalid input");
						break;
					}
                }
               
            //taking action against auth. problems.
            while(!name.equals("Cemre") || !password.equals("Test123"))
            {
            right--;
            System.out.println("\nWrong name or password. Try again." + right);
            if(right ==0)
            {
            	System.out.println("\nYour account is blocked. Please, contact with bank.");
            }break;
            	
           }    
        }	
               
     }    
 }
      
    


