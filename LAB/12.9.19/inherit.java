import java.util.*;

class person
{
    Scanner s= new Scanner;
    int age;
    string name,address;
    void input()
    {
        system.out.println("\nEnter the Name:");
        name=s.next();
        system.out.println("\nEnter the Address:");
        address=s.next();
        //this.name=name;
        // this.address=address;
    }
}

class student extend person
{
    int rollno,sem;
    void input()
    {
        system.out.println("\nEnter the RollNo:");
        rollno=s.nextInt();
        system.out.println("\nEnter the Sem:");
        sem=s.nextInt();
        super input();
        //this.rollno=rollno;
        //this.sem=sem;
        //super(name,address);
    }
}

class exam extend student
{
    int n,marks1,marks2;
    float avg;
    void input()
    {
        system.out.println("\nEnter Marks 1:");
        marks1=s.nextInt();
        system.out.println("\nEnter Marks 2:");
        marks2=s.nextInt();
        super input();
        //this.marks1=marks1;
        //this.marks2=marks2;
        //super(rollno,sem,name,address);
    }
    void calc()
    {
        avg=(marks1+marks2)/2;
    }
    void display()
    {
        system.out.println("\n The topper is:"+name+"\n roll no:"+rollno+"\nsem:"+sem+"\nAddress:"+address);
    }
}

class classmain
{
    public static void main(string xx[])
    {
        Scanner s=new Scanner;
        int n;
        system.out.println("\nEnter the no. of students:");
        n=s.nextInt();
        exam s1[]= new exam[n];
        for(int i=0; i<n; i++)
		{
			
			
		}

    }
}
