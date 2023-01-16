package ThisKeyword;

public class Prog2_C extends  Prog2_P {
	public Prog2_C()
	{
		this(12);
		System.out.println("zero parameter");
		
	}

	public Prog2_C(int a)
	{
		this(12.2);
				System.out.println("a="+a);
				
	}
	public Prog2_C(double a)
	{
		
		System.out.println("a="+a);
			}
	public static void main(String[] args) {
		Prog2_C x=new Prog2_C();
	}
}
