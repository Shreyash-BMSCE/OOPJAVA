import java.util.*;
class Sgpa
{
	public static void main(String xx[])
	{
		Scanner a1  = new Scanner(System.in);
		double sgpa = 0;
		int total_credits = 0;
		
		System.out.println("Enter the number of subjects:");
		int n = a1.nextInt();
		
		double marks[] = new double[n];	
		int credits[] = new int[n];
		int grades[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the marks in subjects:"+i);
			marks[i] = a1.nextInt();
			System.out.println("Enter the number of credits:");
			credits[i] = a1.nextInt();
			if(marks[i]>90)
				grades[i]=10;
			else if(marks[i]>75)
				grades[i]=9;
			else if(marks[i]>65)
				grades[i]=8;
			else if(marks[i]>55)
				grades[i]=7;
			else if(marks[i]>=40)
				grades[i]=6;
			else 
				grades[i]=0;
			
			sgpa += grades[i]*credits[i];
			total_credits+= credits[i];
		}
		sgpa /= (double)total_credits;
		System.out.println("Your SGPA is :"+sgpa);
	}
}
	
