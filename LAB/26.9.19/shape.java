import java.util.*;

abstract class Shape
{
    int x;
   /* Shape(int a, int b)
    {
        x=a;
        b=y;
    }
    Shape(int a)
    {
        x=a;
    } */
    abstract void printArea();
}

class Rectangle extends Shape
{
    int y;
    Rectangle(int a,int b)
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
    int y;
    Triangle(int a,int b)
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
    Circle(int a)
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
        int a,b,ch;
        while(true)
        {
            System.out.println("\n Enter the Choice: 1.Rectangle  2.Triangle  3.Circle 4.Exit");
            ch = s.nextInt();
            switch(ch)
            {
                case 1: System.out.println(" Enter the parameters: ");
                        a = s.nextInt();
                        b = s.nextInt(); 
                        Rectangle ob1 = new Rectangle(a,b);
                        ob1.printArea();
                        break;
                case 2: System.out.println("Enter the parameters: ");
                        a = s.nextInt();
                        b = s.nextInt();
                        Triangle ob2 = new Triangle(a,b);
                        ob2.printArea();
                        break;
                case 3: System.out.println(" Enter the parameter: ");
                        a = s.nextInt();
                        Circle ob3 = new Circle(a);
                        ob3.printArea();
                        break;
                case 4: System.exit(0);
                        break;
                


            }
        }
    }
}
