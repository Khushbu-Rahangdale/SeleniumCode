package StringProg;

public class DiffMethod {

	public static void main(String[] args) {
		String name="I m doing Atomation Testing";
		String name1="";
		boolean result =name.contains("Ato");
		System.out.println("is the passed string available in STR = "+result);
		System.out.println(name.contains("do"));
		System.out.println(name.contains("......"));
		System.out.println(name.isEmpty());
		System.out.println(name1.isEmpty());
		System.out.println(name.trim());
		System.out.println("--------------");
		
		String str="Khushbu";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(name.indexOf("t"));
		System.out.println(name.lastIndexOf("A"));
		System.out.println(name.startsWith("I"));
		System.out.println(name.startsWith("Im"));
		System.out.println(name.endsWith("g"));
		System.out.println(str.concat("  ").concat( name));
		System.out.println(str.replace("Khushbu", "rahangdale"));
		System.out.println(str.trim());

	}

}
