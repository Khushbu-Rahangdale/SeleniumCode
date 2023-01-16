package ArrayProg;

public class Prog6_1 {

	public static void main(String[] args) {
		int[][]x= {{1,2,3}, {2,3,5},{5,6,7}};
		int[][]y= {{1,2,3}, {2,3,5},{5,6,7}};

		int[][] multi =new int[3][3];
		int i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[0].length;j++)
			{
				multi[i][j]=x[i][j]*y[i][j];
			}
		}
		System.out.println("matrix");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[0].length;j++)
			{
				System.out.format("%d\t",multi[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
