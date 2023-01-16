import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
Vector V1=new Vector();
Vector V2=new Vector(500);
Vector V3=new Vector(20,11);
Vector V4=new Vector(V1);
System.out.println(V3);
System.out.println("capacity of v1 ="+V1.capacity());
System.out.println("Capacity of v2 ="+V2.capacity());
System.out.println("capacity of v3 ="+V3.capacity());
for(int i=0;i<20;i++)
	V3.add(i);
System.out.println("capacity of V3 ="+V3.capacity());
V3.add("abc");
V1.add(5);
V1.add(1.2222);
V1.remove(0);
V1.set(0, 1000);
System.out.println(V1);




	}

}
