import java.util.*;
class book
{
	String name;
	String author;
	double priceofbook;
	int numberofpages;
	
	book()
	{
		name="2 more things";
		author="SUMAN";
		price=1500;
		pages=350;
	}
	
	void setdata()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input book details");
		System.out.println("Enter name of the book");
		name=s1.next();
		System.out.println("Enter name of the author");
		author=s1.next();
		System.out.println("Enter price of the book");
		priceofbook=s1.nextInt();
		System.out.println("Enter the no. of pages");
		numberofpages=s1.nextInt();	
		
	}
	public String toString()
	{
		return("\nName:"+name+"\nAuthor:"+author+"\nPrice:"+priceofbook+"\nPages:"+numberofpages+"\n");
	}
	
	
	

}
class bookmain
{
	public static void main(String argX[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of objects");
		int n=s.nextInt();
		book b[]=new book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new book();
			b[i].setdata();
			System.out.println(b[i]);
		}
	}
}
