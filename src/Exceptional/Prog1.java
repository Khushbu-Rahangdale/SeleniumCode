package Exceptional;

public class Prog1 {

	public static void main(String[] args) {
		int a=2,b=0,c=0;
		
		try
		{
			c=a/b;
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
		System.out.println(c);

	}

}
