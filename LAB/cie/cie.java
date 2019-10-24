
package cie;
import java.util.Scanner;
public class internal extends student
{
    public int cie_marks[] = new int[5];
    void input()
    {
        super.input();
        System.out.println("\n Enter marks for CIE out of 50:");
        for(int i=0;i<5;i++)
        {
            System.out.println("\n Subject "+(i+1)+":");
            cie_marks[i] = s.nextInt();  
        }
    }
    void op()
    {
        super.op();
    }
}








