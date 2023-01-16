package ArrayProg;

public class Prog6 {

	public static void main(String[] args) {
		String movieChar[][]=new String[2][2];
		
		movieChar[0][0]="tiger";
		movieChar[0][1]="salman";
		movieChar[1][0]="sarukh";
		movieChar[1][1]="akshay";
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(movieChar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
