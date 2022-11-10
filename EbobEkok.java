import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// EBOB EKOK
		Scanner inp= new Scanner(System.in);
		
		int n1,n2,ebob=1,ekok=1;
		
		System.out.println("Enter first number: ");
		n1= inp.nextInt();
		System.out.println("Enter second number: ");
		n2 = inp.nextInt();
		
				
		//EBOB = n1/ 1...x... , n2/ 1...x...
		
		if (n1 < n2) 
		{	int i= 1;
			while(i <= n1 && i <= n2)
			{ 	
				if (n1 % i == 0 && n2 % i == 0)
				ebob=i;
				i++;
			}
			System.out.println("EBOB " +ebob);
		}
		else 
		{	int i= 1;
			while(i <= n1 && ebob <= n2)
			{ 	i++;
				if (n1 % i == 0 && n2 % i == 0) 
				ebob=i;				
			}
			System.out.println("EBOB " + ebob);
		}
		
		System.out.println("-------");
		
		//EKOK = ...x... /n1 , ...x... /n2
		ekok= (n1 > n2) ? n1 : n2;
		 
        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.println( "EKOK " + ekok);
                break;
            }
            ++ekok;
        }				
	}
}
