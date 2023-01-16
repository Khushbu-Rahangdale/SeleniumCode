package StringProg;

public class EqualProg {

	public static void main(String[] args) {
		String name="khushbu";
		String name1="khushbu";
		String name2="Khushbu";
		if(name.equals(name1))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		if(name.equals(name2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.contains("k"));
		System.out.println(name.endsWith("u"));
		System.out.println(name.substring(3));
		System.out.println(name.trim());
		System.out.println(name.replace("khushbu", "rahangdale"));
	

	}

}
