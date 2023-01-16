package ArrayListProg;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
		Vector v=new Vector();
		Vector v1= new Vector(200);
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v1.capacity());
		for(int i=0;i<=50;i++)
			v1.add(i);
		System.out.println(v1);
		//v1.add(77);
		System.out.println(v1.add(77));
		System.out.println(v1.capacity());
		System.out.println(v.indexOf(10));
		System.out.println(v1.indexOf(6));
		System.out.println(v1.contains(5));
		
		
	
	}

}
;
