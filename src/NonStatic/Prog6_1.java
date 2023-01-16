package NonStatic;

public class Prog6_1 {

	public Prog6_1(int a, int b) {
		int c=0;
		c=a*b;
		System.out.println("multiplication="+c);
		

	}
	public Prog6_1()
	{
		System.out.println("this is non parameter programme");
	}
	public static void m3() {
		System.out.println("this is static method");
		
	}
	public static void sum(int num1,int num2) {
		int num3=0;
		num3=num1+num2;
		System.out.println("addition=" + num3);
		
	}
	public static void main(String[] args) {
		Prog6_1 x = new Prog6_1(5,8);
		Prog6_1 y= new Prog6_1();
		m3();
		sum(5,9);
	}

}
