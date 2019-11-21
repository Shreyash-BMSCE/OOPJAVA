import java.util.*;

class Thread1 extends Thread    
{
    int num;
    Thread1(int n)
    {
        num=n;
        this.start();
    }
    public void run()
    {
        try
        {
            if(num<=5)
            {
                Thread1 t = new Thread1(num+1);
                this.sleep(10000/num);
                System.out.println("Hello from Thread" + num);
            }
        }
        catch(Exception e)
        {
            System.out.println("Caught exeption e");
        }
    }
}

class kita
{
    public static void main(String xx[])
    {
        try
        {
            Thread1 t = new Thread1(1);
        }
        catch(Exception e)
        {
            System.out.println("Caught exeption e");
        }
    }
}
