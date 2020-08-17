import java.util.*;

interface Arithmetic
{
int operation(int a,int b);
}


public class Calculator{
	
 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 
     Arithmetic add = (int a,int b) -> {return a+b;};
     System.out.println("Addition = "+ add.operation(x,y));

     Arithmetic difference =(int a,int b) ->{return a-b;};
     System.out.println("Subtraction = "+ difference.operation(x,y));

     Arithmetic product =(int a,int b) ->{return a*b;};
     System.out.println("Product = "+ product.operation(x,y));

     Arithmetic safeDivison =(int a,int b) ->{if (b==0) return 0 ;return a/b;};
     System.out.println("Divison = "+safeDivison.operation(x,y));
    }
}
