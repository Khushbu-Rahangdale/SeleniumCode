package StarPrgm;

public class Prog5 {

	public static void main(String[] args) {
		//***
		// **
		//  *
		int star=3,space=0;
		for(int row=0;row<=3;row++)
		{
			for(int i=0;i<=star;i++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=space;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
