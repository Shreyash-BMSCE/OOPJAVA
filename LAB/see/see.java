package see;
import cie.internal;
import java.util.Scanner;
public class external extends internal 
{
    Scanner s = new Scanner(System.in);
    public int see_marks[] = new int[5];
    public void input()
    {
        super.input();
        System.out.println("\n Enter marks for SEE out of 100:");
        for(int i=0;i<5;i++)
        {
            System.out.println("\n Subject "+(i+1)+":");
            see_marks[i] = s.nextInt();  
        }
        void op()
        {
            super.op();
        }
    }
}
