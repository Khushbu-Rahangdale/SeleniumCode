package ArrayListProg;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
		TreeSet Tset=new TreeSet();
		Tset.add("aaa");
		Tset.add("bbb");
		Tset.add("ccc");
		Tset.add("ddd");
		Tset.add("eee");
		
		System.out.println(Tset.contains("aaa"));
		System.out.println(Tset.clone());
		System.out.println(Tset.first());
		System.out.println(Tset.pollFirst());
		System.out.println(Tset.lower("ccc"));
		System.out.println(Tset.size());
		System.out.println(Tset.descendingSet());
		
//		
//		Iterator a=Tset.iterator();
//		
//		while(a.hasNext())
//		{
//			
//			System.out.println(a.next());
//			a.remove();
//		}
//		System.out.println("using forech cursor");
//		
//		for(Object s:Tset)
//		{
//			System.out.println(s);
//		}
		
		
	}

}
