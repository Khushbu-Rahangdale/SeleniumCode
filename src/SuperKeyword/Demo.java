package SuperKeyword;

public class Demo {

	public static void main(String[] args) {
		String a="velocity is foundation";
		String rev="";
		char[] achar=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--)
		{
			
			rev=rev+achar[i];
			
			
		}
		System.out.println(rev);
	}
	


}