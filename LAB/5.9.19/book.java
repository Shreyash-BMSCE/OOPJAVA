//Class book - 4 members: name, author , price, no. of pages. Include a constructor
// to set the values for the members include methods to set and get details 
// of the object. Include two string methods that display complete details of 
//the book. WAP to create and create a book objects

import java.util.*;
class book
{
	Scanner s = new Scanner(System.in);
	String name,author;
	int price,pages;
	book()
	{
		price = 100;
		pages = 500;
		name = "The Power of Six";
		author = "Pittacus Lore";
	}
	void setdata()
	{
		System.out.println("\n ---Enter the Book data---");
		System.out.println("\n Enter the Name: ");
		name = s.next();
		System.out.println("\n Enter the Author's Name: ");
		author = s.next();
		System.out.println("\n Enter the Price:");
		price = s.nextInt();
		System.out.println("\n Enter the Pages:");
		pages = s.nextInt();
	}
	public String toString()
	{
		return("\n NAME:"+name+"\nAUTHOR:"+author+"\nPAGES:"+pages+"\nPRICE:"+price); 
    }
}

class bookmain
{
	public static void main(String xx[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter the number of books:");
		int n = s.nextInt();
		book b1[] = new book[n];
		for(int i=0; i<n; i++)
		{
			b1[i] = new book();
			b1[i].setdata();
			System.out.println(b1[i]);

		}
	}
}	 
