import java.util.*;

abstract class Shape
{
    double x;
    abstract void printArea();
}

class Rectangle extends Shape
{
    double y;
    Rectangle(double a,double b)
    {
        x=a;
        y=b;
    }
    
    void printArea()
    {
        System.out.println(" Rectangle::");
        System.out.println("Area:"+(double)(x*y));
    }
}

class Triangle extends Shape
{
    double y;
    Triangle(double a,double b)
    {
        x=a;
        y=b;
    }
    void printArea()
    {
        System.out.println("Triangle::");
        System.out.println("Area:"+(double)(0.5*x*y));
    }
}

class Circle extends Shape
{
    Circle(double a)
    {
        x=a;
    }
    
    void printArea()
    {
        System.out.println(" Circle::");
        System.out.println("Area:"+(double)(3.14*x*x));
    }
}

class shapemain
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double a,b;
        int ch;
        while(true)
        {
            System.out.println("\n Enter the Choice: 1.Rectangle  2.Triangle  3.Circle 4.Exit");
            ch = s.nextInt();
            switch(ch)
            {
                case 1: System.out.println(" Enter the parameters: ");
                        a = s.nextDouble();
                        b = s.nextDouble(); 
                        Rectangle ob1 = new Rectangle(a,b);
                        ob1.printArea();
                        break;
                case 2: System.out.println("Enter the parameters: ");
                        a = s.nextDouble();
                        b = s.nextDouble();
                        Triangle ob2 = new Triangle(a,b);
                        ob2.printArea();
                        break;
                case 3: System.out.println(" Enter the parameter: ");
                        a = s.nextDouble();
                        Circle ob3 = new Circle(a);
                        ob3.printArea();
                        break;
                case 4: System.exit(0);
                        break;
                


            }
        }
    }
}
