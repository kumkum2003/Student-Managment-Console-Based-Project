import java.util.*;
interface Student_Management
{
	void name(String name);
	void enterMarks(int p, int c, int m);
	void showMarks();
	void showResult();
}

class Prof
{
	int p,c,m;
	String name;
	void name(String name)
	{
		this.name=name;
	}
	void enterMarks(int p, int c, int m)
	{
		this.p=p;
		this.c=c;
		this.m=m;
	}
}
class Manage extends Prof implements Student_Management
{
	public void name(String name)
	{
		super.name(name);
	}
	public void enterMarks(int p, int c, int m)
	{
		super.enterMarks(p,c,m);
	}
	public void showMarks()
	{
		
		System.out.println("Name of student is: "+name);
		System.out.println("\nMarks are:\n");
		System.out.println("Physics:"+p);
		System.out.println("Chemistry:"+c);
		System.out.println("Maths:"+m);
		
	}
	public void showResult()
	{
		int m1=((p+c+m)*100)/300;
		if(m1>85&&m1<100)
		{
			System.out.println("A\n");
		}
		else if(m1>70&&m1<85)
		{
			System.out.println("B\n");
		}
		else if(m1>50&&m1<70)
		{
			System.out.println("C\n");
		}
		else if(m1>30&&m1<50)
		{
			System.out.println("D\n");
		}
		else if(m1>0&&m1<30)
		{
			System.out.println("Fail\n");
		}
		else 
		{
			System.out.println("Invalid \n");
		}
	}
}
class STM
{
public static void main(String ar[])
{
	int p,c,m;
	String n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter P C M marks: ");
	p=sc.nextInt();
	c=sc.nextInt();
	m=sc.nextInt();
	n=sc.next();
	Manage ma= new Manage();
	ma.name(n);
	ma.enterMarks(p,c,m);
	ma.showMarks();
	ma.showResult();
}
}

