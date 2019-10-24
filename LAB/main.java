import cie.internal;
import see.external;
import java.util.Scanner;
class lifeisover
{
    public static void main(String xx[])
    {
        Scanner s = new Scanner(System.in);
        int marks[] = new int[5];
        int n;
        System.out.println("\n Enter the no. of students:");
        n = s.nextInt();
        internal ob2[] = new internal[n];
        external ob1[] = new external[n];
        for(int i=0;i<n;i++)
        {
            ob1[i] = new ob1();
            ob1[i].input();
            for(int i=0;i<n;i++)
            {
                marks[i] = (ob1[i].see_marks[i])/2 + ob2[i].cie_marks[i];
                System.out.println("\n AVG marks are:" + marks[i]);
            }

        }

    }
}