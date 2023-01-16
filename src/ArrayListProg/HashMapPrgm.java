package ArrayListProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPrgm {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(1, "khushbu");
		hm.put(2, "kkk");
		hm.put(3, "khushi");
		hm.put(7, "raha");
		//hm.clear();
		//hm.compute(hm, null);
		System.out.println(hm.size());
		System.out.println(hm.replace(3, "khushbu"));
		System.out.println(hm.isEmpty());
		hm.get(3);
		System.out.println(hm);
		System.out.println("_______output of for loop______");
		//System.out.println(hm);
		Set a=hm.entrySet();
		Iterator b=a.iterator();
		for(;b.hasNext();)
		{
			System.out.println(b.next());
		}
		
		
		
		
	}

}
