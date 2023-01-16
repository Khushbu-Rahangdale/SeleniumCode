package Exceptional;

public class Prog2 {

	public static void main(String[] args) {
		try {
			System.out.println("statement 1");
		//	System.out.println("statement 2 ="+(10/0));
			System.out.println("statement 3");
			//we can execute the prgm without catch block 
			//in try catch block if finally block is present
			//but cant execute finally block without try block
			
		}
		catch(Exception z)
		{
			//System.out.println("statement 2 ="+(10/0));
			System.out.println("statement 4");
			System.out.println();
		}
		finally {
			System.out.println("statement 2 ="+(10/0));
			System.out.println("statement 5");
		}
		System.out.println("statement 6");

	}

}
