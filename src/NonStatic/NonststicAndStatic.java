package NonStatic;

public class NonststicAndStatic {

	public static void method01() {
		System.out.println("This is Static programme");
		System.out.println("-----------------------");
		}
	public static void add(int num1,int num2) {
		int num3=0;
		num3=num1+num2;
		System.out.println("addition="+num3);
		System.out.println("--------------------");
	}
				
	public void method02() {
		System.out.println("This is non static method");
		System.out.println("--------------------------");
	}
	public  void multiply(int a,int b) {
		int c=0;
		c=a*b;
		System.out.println("multiplication = "+ c);
	}
	public static void main(String[] args) {
		method01();
		add(5,6);
		NonststicAndStatic z = new NonststicAndStatic();
		z.method02();
		z.multiply(6,8);
	}

}
