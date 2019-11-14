import java.util.*;

class bmsce implements Runnable
{
    Thread t;
    bmsce()
    {
        t = new thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("BMSCE");
                t.sleep(10000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured!!");
        }
    }
}

class cse implements Runnable
{
    Thread t;
    cse()
    {
        t = new thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("CSE");
                t.sleep(2000);    //sleep needs try catch
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured!!!");
        }
    }
}

class Thread_me
{
    public static void main(String xx[])
    {
        bmsce obj1 = new bmsce();
        cse obj2 = new cse();
        Syste.out.println("\n PRESS CTRL+C TO EXIT !!!!");
        try
        {
            obj1.t.join();
            obj2.t.join();
        }
        catch(InterruptedException ie)
        {
            System.out.println("Exception occured!!!")
        }
    }
}
