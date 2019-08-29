import java.util.*;
class time
{
	Scanner s=new Scanner(System.in);
	int hr,min;
	time()
	{
		hr=0;
		min=0;
	}
	time(int h,int m)
	{
		hr=h;
		min=m;
	}
	void setdata()
	{
		System.out.println("Enter the Hours:");
		hr=s.nextInt();
		System.out.println("Enter the Minutes:");
		min=s.nextInt();
	}
	time add(time t)
	{
		time temp=new time();
		temp.hr=t.hr+hr;
		temp.min=t.min+min;
		if(temp.min>=60)
		{
			temp.hr++;
			temp.min-=60;
		}
		return temp;
	}
	void disp()
	{
		System.out.println("Hours:Minutes"+""+hr+":"+min);
	}
}
class timemain
{                                            
	public static void main(String args[])
	{
		time t1=new time();
		time t2=new time(2,40);
		time t3=new time();
		t1.setdata();
		t3=t2.add(t1);
		System.out.println("Data of T1:");
		t1.disp();
		System.out.println("Data of T2:");
		t2.disp();
		System.out.println("Data of T3:");
		t3.disp();
		
	}
}
			
		
			
		
		
		
		
		
			 
