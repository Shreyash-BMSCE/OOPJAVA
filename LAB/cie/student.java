package cie;
import java.util.Scanner;
class student 
{
    Scanner s  = new Scanner(System.in);
    String name,usn;
    int sem;
    student(){}
    void input()
    {
        System.out.println("\n Name: ");
        name = s.next();
        System.out.println("\n USN: ");
        usn = s.next();
        System.out.println("\n SEM: ");
        sem = s.nextInt();
    }
    void op()
    {
        System.out.println("\n Name:"+name+"\n USN: "+usn+"\n SEM: "+sem);
    }
}
