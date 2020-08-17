public class Complex {
       int real;
       int img;
       public Complex(int r, int i){
             real = r;
             img = i;
}

public static Complex addition(Complex a, Complex b)
    {
        return new Complex((a.real+b.real),(a.img+b.img));
    }
    
public static Complex difference(Complex a, Complex b)
    {
        return new Complex((a.real-b.real),(a.img- b.img));
    }
    
public static void main(String[] args)
{
Complex n1= new Complex(5,9);
Complex n2= new Complex(2,15);
Complex add = Complex.addition(n1,n2);
Complex sub = Complex.difference(n1,n2);
System.out.println("addition: "+add.real+"+"+add.img+"i");
System.out.println("addition: "+sub.real+"+"+sub.img+"i");

}
}
