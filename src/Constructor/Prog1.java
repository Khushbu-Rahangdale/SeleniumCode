package Constructor;

public class Prog1 {
	static int a;
	static int b;
	static int c;

	public static void m1() {
		b=26;	
	}
	public Prog1 () {
		a=40;
		
	}
	public static void m2() {
		c=55;
		
	}
	public static void main(String[] args) {
		Prog1 z=new Prog1();
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("----------------------");
		m1();
		System.out.println("A="+a);
		System.out.println("A="+b);
		System.out.println("---------------------");
		m2();
		System.out.println("A="+c);
		System.out.println("A="+a);
		
	}

}
