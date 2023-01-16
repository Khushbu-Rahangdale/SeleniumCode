package TypesOfVariable;

public class Prog1 {
	static int a=10;
	int b=11;
	static int c=13; 
	public void display()
	{
		//int c=13;
		
		System.out.println(a+"   "+b+"   "+c);
		
		a++;
		b++;
		c++;
	}
	

	public static void main(String[] args) {
		Prog1 x=new Prog1();
		x.display();
		Prog1 y=new Prog1();
		y.display();
		Prog1 z=new Prog1();
		z.display();
		

	}

}
