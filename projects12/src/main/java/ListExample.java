import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> name=new ArrayList<String>();
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add(null);
		myList.add("Janki");
		myList.add('V');
		myList.add("100");
		myList.add(null);
		myList.add(30);
		myList.add(40);
		myList.add("Alice");
		myList.add('v');
		myList.add(200);
		//to get the size
		System.out.println("Size of Array List : "+myList.size());
		//to remove an element based on index
		myList.remove(1);
		System.out.println("After removing index value at position 1 "+myList);//[100, Janki, V, 100, null, 30, 40, Alice, v, 200]
		//for adding to a specific position
		myList.add(2, "Ram");
		System.out.println("After adding to index position 2 "+myList);//[100, Janki, Ram, V, 100, null, 30, 40, Alice, v, 200]
		//modify
		myList.set(10, "New Value");
		System.out.println("After modification"+myList);
		//Accessing value at specific position
		System.out.println(myList.get(5));
		//check whether the elemet is there
		System.out.println("contains "+myList.contains("Janki"));
		//Removing all Elements
//		myList.removeAll(myList);
//		System.out.println(myList);
		//reding data
		//for loop
		/*for(int i=0;i<=myList.size()-1;i++) {
			System.out.println(myList.get(i));
		}*/
		//Enhanced for loop
		/*for(Object l:myList) {
			System.out.println(l);
		}*/
		
	//iterator
		Iterator it=myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	
	

}
