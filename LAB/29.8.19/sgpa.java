import java.util.*;
class sgpa
{
	Scanner s= new Scanner(System.in);
	int n,tot_marks,grade,tot_credit;
	int marks[]=new int[10];
	int credit[]=new int[10];
	String name,usn;
	float sgpa;
	sgpa() 
	{
		tot_marks=0;
		tot_credit=0;
	}
	void setdata()
	{
		System.out.println("Enter the Name:");
		name = s.next();
		System.out.println("Enter the USN:");
		usn = s.next();
		System.out.println("Enter the number of subjects:");
		n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Marks of Subject"+""+(i+1));
			marks[i]=s.nextInt();
			System.out.println("Enter the Credits:");
			credit[i]=s.nextInt();
			if(marks[i]>=90 && marks[i]<=100)
				grade=10;
			else if(marks[i]>=75)
				grade=9;
			else if(marks[i]>=60)
				grade=8;
			else if(marks[i]>=50)
				grade=7;
			else if(marks[i]>=45)
				grade=5;
			else if(marks[i]>=40)
				grade=4;
			else
				grade=0;
			
			tot_marks+=grade*credit[i];
			tot_credit+=credit[i];
		}
		sgpa = (float)tot_marks/tot_credit;
	}
	void disp()
	{
		System.out.println("\n\nSTUDENT INFO:"+"\nNAME:"+name+"\nUSN:"+usn+"\nSGPA:"+sgpa);
	}
}
class sgpamain
{
	public static void main(String arg[])
	{
		sgpa s1 = new sgpa();
		s1.setdata();
		s1.disp();
	}
}
		
		
				

			
			
			
		
	
	
	
