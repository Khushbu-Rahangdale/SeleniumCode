package ArrayProg;

import java.util.Arrays;

public class Prog4 {

	public static void main(String[] args) {
		String	days[]	=	new	String[7];
		days[0]	=	"R";
		days[1]	=	"I";
		days[2]	=	"A";
		days[3]	=	"N";
		days[4]	=	"B";
		days[5] =   "O";
		for(int	i=0;i<days.length;i++)
		System.out.println(days[i]);
//		System.out.println("-----------");
//		System.out.println("-----------");
//		System.out.println("Reverse	order1");
//		for(int	i=days.length-1;i>=0;i--)			//5	:- 0	1	2	3	4
//		System.out.println(days[i]);
//		System.out.println("-----------");
//		System.out.println("-----------");
		Arrays.sort(days);
		
	}

}
