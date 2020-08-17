import java.util.*;

public class Circle
{

    private  double radius;
    private  String color;
    
    public Circle()
    {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r)
    {
        radius = r;
        color = "red";
    }

    public double getRadius()
    {
        return radius;
    }

    public double Area()
    {
        return radius*radius*Math.PI;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        System.out.println("Radius :"+ c1.getRadius() + "\nArea:" + c1.Area());
        System.out.println("Enter radius");
        double r=sc.nextDouble();


        Circle c2 = new Circle(r);
        System.out.println("Radius:"+ c2.getRadius() + "\nArea" + c2.Area());
    }
}

