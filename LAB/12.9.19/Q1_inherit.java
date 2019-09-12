import java.util.*;

class person
{
    Scanner s= new Scanner(System.in);
    int age;
	String name,address;
	person(){}
    void input()
    {
        System.out.println("\nEnter the Name:");
        name=s.next();
        System.out.println("\nEnter the Address:");
        address=s.next();
        
    }
}

class student extends person
{
	int rollno,sem;
	Scanner s= new Scanner(System.in);
	student(){}
    void input()
    {
        System.out.println("\nEnter the RollNo:");
        rollno=s.nextInt();
        System.out.println("\nEnter the Sem:");
        sem=s.nextInt();
        super.input();
        
    }
}

class exam extends student
{
    int n,marks1,marks2;
	float avg;
	exam(){}
    void input()
    {
		Scanner s= new Scanner(System.in);
        System.out.println("\nEnter Marks 1:");
        marks1=s.nextInt();
        System.out.println("\nEnter Marks 2:");
        marks2=s.nextInt();
        super.input();
        
    }
    float calc()
    {
        avg=(marks1+marks2)/2;
        return avg;
    }
    void display()
    {
        System.out.println("\n The topper is:"+name+"\n roll no:"+rollno+"\nsem:"+sem+"\nAddress:"+address);
    }
}

class classmain
{
    public static void main(String xx[])
    {
        Scanner s= new Scanner(System.in);
        int n,k=0;
        System.out.println("\nEnter the no. of students:");
        n=s.nextInt();
        exam s1[]= new exam[n];
        for(int i=0; i<n; i++)
		{
			s1[i]=new exam();
            s1[i].input();
        }
        for(int i=0; i<n; i++)
        {
            if(i==n-1)
            {
                break;
            }
            else if(s1[i].calc() > s1[i+1].calc())
            {
                k=i;
            }
            else
            {
                k=i+1;
            }
        }
        s1[k].display();
    }
}
