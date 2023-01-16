package SuperKeyword;

public class Prog_C extends Prog_P  {
	int a=200;
	public void show()
	{
		//super.show();
		System.out.println("child class="+a);
		super.show();
	}
	public void display()
	{
		System.out.println("display="+a);
		System.out.println("parent="+super.a);
	}
	
	
	

}
