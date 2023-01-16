package StarPrgm;

public class Prog4 {

	public static void main(String[] args) {
		int star=3, space = 0;
		for(int row=0;row<=3;row++)
		{
			for(int i=0;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(star==2)
			{
			
			space++;
			star=star-2;
			}
			else
			{
				space--;
				star++;
			}
			
		}
	}

}
