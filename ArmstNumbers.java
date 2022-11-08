
public class ArmstNumbers {

	 public static void main(String[] args) 
     {//writes Armstrong numbers from 1 to 1000.
        int number,value, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i < 1000; i++)
        {
            number = i;
            while(number > 0)
            {
                value = number % 10;
                sum = sum + (value * value* value);
                number = number / 10;
            }
            if(sum == i)
            {
                System.out.print("\n"+i+" ");
            }
            sum = 0;
        }
    }
}
