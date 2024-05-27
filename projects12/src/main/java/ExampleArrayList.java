import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> obj1=new ArrayList<Integer>();
obj1.add(1);
obj1.add(2);
obj1.add(3);
obj1.add(4);
obj1.add(5);
obj1.add(29);
obj1.add(30);
System.out.println(obj1);
Iterator i=obj1.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
obj1.remove(4);
System.out.println(obj1);
System.out.println(obj1.get(4));
System.out.println(obj1.size());
System.out.println(obj1.contains(30));
obj1.removeAll(obj1);
System.out.println(obj1);
	}

}
