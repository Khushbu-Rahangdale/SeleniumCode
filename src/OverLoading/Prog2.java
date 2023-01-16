package OverLoading;

public class Prog2 {
	public void add()
	{
		int a=10, b=12, c;
		c=a+b;
		System.out.println("sum =" +c);
	}
	public void add(int a)
	{
		int c;
		c=a+a;
		System.out.println("sum =" +c);
	}
	
	public void add( int a , int b)
	{
		int c;
		c=a+b;
		System.out.println("sum =" +c);
	}
	public void add(double a , double b)
	{
		 double c;
		c=a+b;
		System.out.println("sum =" +c);
	}
	

	public static void main(String[] args) {
		Prog2 x=new Prog2();
		x.add();
		x.add(14, 14);
		x.add(12.5, 13.8);
		x.add(18,14);

	}

}
