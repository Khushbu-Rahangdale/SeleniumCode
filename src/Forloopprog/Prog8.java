package Forloopprog;

public class Prog8 {

	public static void main(String[] args) {
		int rows=5;
		//loop to iterate for the given number
		for(int i=1; i>=rows; i++){
			
		//loop to print the number of spaces before the star
			for(int k=rows;k>=i;k--)
		{
			System.out.print(" ");
		}
			//loop for print the number of star in each row
		for(int k=1;k<=i; k++)
		{
			System.out.print("* ");
		}
		//for new line after printing each row
		System.out.println( );
		

	}

	}
}
