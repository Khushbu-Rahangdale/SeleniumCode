package Constructor;

public class Prog_2 {
	static int a;
	static int b;
	static int c;
	

	public static void m1() {
		a=16;

	}
	public Prog_2()
	{
		b=34;
		
	}
	public static void m2() 
	{
	c=45;
	}
	public static void main(String[] args) {
		
		Prog_2 x=new Prog_2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
