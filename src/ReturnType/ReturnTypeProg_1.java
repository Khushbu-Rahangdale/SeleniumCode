package ReturnType;



public class ReturnTypeProg_1 {
	
	public static void m1() {
		System.out.println("This is method m1");
	}
	public void m2()
	{
		System.out.println("This is m2 method");
		
	}
	public static int m3()
	{
		return 12;
	}
	public static int sum(int num1,int num2)
	{
		return num1+num2;
	}
	public static String m4()
	{
		String khushbu = null;
		return khushbu;
		
	}

	public static  void main(String[] args) {
		ReturnTypeProg_1 a=new ReturnTypeProg_1();
		
		a.m2();
		m1();
		int out=30;
		int mf=m3();
		int foutput=mf*out;
		System.out.println(foutput);
		sum(40,10);
		
		
		

	}


}