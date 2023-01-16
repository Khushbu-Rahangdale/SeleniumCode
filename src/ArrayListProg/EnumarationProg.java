package ArrayListProg;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationProg {

	public static void main(String[] args) {
		Vector vec=new Vector();
		vec.add("aa");
		vec.add("b");
		vec.add("c");
		System.out.println(vec);
		Enumeration e=vec.elements();
		while(e.hasMoreElements())
		{
			int value= (int) e.nextElement();
			
		}

	}

}
