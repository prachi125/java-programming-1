import java.util.*;
public class Generic {

	public static void genericMethod()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        
         try
            {
        	    int n;
                n=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("only enter Integer value");
 
            }
        double res=(2*n)/3;
       System.out.println("2/3 of number:"+ res); 
	}
    public static void main(String[] args) {
        
    	genericMethod() ;
    }
}
