import java.util.*;
public class Rectangle
{
    int w,h;
    public void display()
    {
        System.out.println("Width: "+ this.w +"   Height: "+ this.h);
    }
}

class RectangleArea extends Rectangle
{
    public void read_input()
    {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h= sc.nextInt();

    }
    public void display()
    {
    	super.display();
        System.out.println("Area: "+w*h);
        
    }
}

 class Main {

    public static void main(String[] args) {

        RectangleArea A=new RectangleArea();
        A.read_input();
        A.display(); 
    }
}
