package ThisKeyword;

public class Prog2_P {
	
	public Prog2_P()
	{
		
		System.out.println("zero parametric");
		
	}
	public Prog2_P(int a)
	{
		
		System.out.println("paramrtric="+a);
	}
	public Prog2_P(double a)
	{
		
		System.out.println("paramrtric="+a);
		
	}
	public void m1(int a,int b) 
	{
		
		int c=0;
		c=a+b;	
		System.out.println("parametric="+c);
	}
	
	public static void main(String[] args) {
		Prog2_P x=new Prog2_P();
		
	}

}

