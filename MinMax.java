import java.util.Scanner; 
  
 public class MinMax { 

	 public static void main(String[] args) { 
     
     Scanner inp = new Scanner(System.in); 
         
     int a /*amount*/, n, min = 0, max = 0; 
     
     System.out.print("Enter the amount of numbers you want to compare: "); 
     
     if (true)
     { 
       a = inp.nextInt(); //to decide how many numbers will be compared
      
       for (int i = 1; i <= a; i++) 
       {               
         System.out.print("Number " + i + ": "); 
         
          if (true) 
          { 
        	  n = inp.nextInt(); 
        	  if (i == 1) 
        	  { 
                 max = n; 
                 min = n; 
               } 
        	  else 
        	  { 
                  if (n > max) 
                  { 
                      max = n; 
                                 
                  } 
                  else if (n < min) 
                  { 
                      min = n; 
                  } 
               } 
           } 
        } 
          System.out.println("Min number Is: " + min); 
          System.out.println("Max number Is: " + max); 
      } 
           
   }  
}


