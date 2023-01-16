package Inheritance;

public class Prog3_2 extends Prog3_1{
	public void cube()
	{
		int base=10 , power=6, result=1;
		for(base=8; power>0; power--)
		{
			result=result*base;
			
		}
		System.out.println(+result);

	}

}
