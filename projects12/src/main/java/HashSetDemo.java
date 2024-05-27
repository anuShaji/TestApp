import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ways of declaration
HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet<String> myset=new HashSet<String>();

//adding elements
myset.add(100);
myset.add(100);
myset.add("Hello");
myset.add(null);
myset.add(null);
myset.add('s');
//printing hash set
System.out.println(myset);
//removing element
myset.remove("Hello");
System.out.println("After Removing"+myset);
//Inserting specific element not possible
//access specific elements-->not possible
//we can convert the set to array list and do this
//convert hashset to arrayList
ArrayList al=new ArrayList(myset);//created array list object and passed set object
System.out.println(al);
System.out.println(al.get(2));

//Read all the elements using looping statements---We can't use normal for loop becuase there is no indexing
/*for (Object o:myset) {
	System.out.println(o);
}*/
//using iterator
Iterator <Object> it=myset.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

//clearing all the elements
myset.clear();
System.out.println(myset);
//size
System.out.println(myset.size());
	}

}
